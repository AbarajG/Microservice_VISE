package com.andygomez.encabezadoFactura.service;

import com.andygomez.encabezadoFactura.model.Encabezado;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EncabezadoService {


    List<Encabezado> findAll();
    Optional<Encabezado> findById(UUID id);
    Encabezado saveEncabezado(Encabezado encabezado);
    Encabezado updateEncabezado(Encabezado encabezado, UUID id);

    void deleteEncabezadoById(UUID id);
}
