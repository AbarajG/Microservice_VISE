package com.andygomez.encabezadoFactura.repository;

import com.andygomez.encabezadoFactura.model.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EncabezadoRepository extends JpaRepository<Encabezado, UUID> {
}
