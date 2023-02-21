package com.andygomez.encabezadoFactura.service;

import com.andygomez.encabezadoFactura.model.Encabezado;
import com.andygomez.encabezadoFactura.repository.EncabezadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EncabezadoServiceImpl implements EncabezadoService{

    private final EncabezadoRepository repository;

    @Override
    public List<Encabezado> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Encabezado> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public Encabezado saveEncabezado(Encabezado encabezado) {
        return repository.save(encabezado);
    }

    @Override
    public Encabezado updateEncabezado(Encabezado encabezado, UUID id) {
        Encabezado newEncabezado = new Encabezado();
        newEncabezado.setId(encabezado.getId());
        return newEncabezado;
    }

    @Override
    public void deleteEncabezadoById(UUID id) {
        repository.deleteById(id);
    }

}
