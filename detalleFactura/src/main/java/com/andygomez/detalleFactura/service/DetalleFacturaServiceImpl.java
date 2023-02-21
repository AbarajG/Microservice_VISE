package com.andygomez.detalleFactura.service;

import com.andygomez.detalleFactura.model.DetalleFactura;
import com.andygomez.detalleFactura.repository.DetalleFacturaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DetalleFacturaServiceImpl implements DetalleFacturaService{

    private final DetalleFacturaRepository repository;

    @Override
    public DetalleFactura saveDetalleFactura(DetalleFactura detalleFactura) {
        return repository.save(detalleFactura);
    }

    @Override
    public List<DetalleFactura> getAllDetalleFactura() {
        return repository.findAll();
    }

    @Override
    public Optional<DetalleFactura> findByIdDetalleFactura(Long id) {
        return repository.findById(id);
    }

    @Override
    public DetalleFactura getDetalleFacturaById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario inexistente"));
    }


    @Override
    public DetalleFactura updateDetalleFactura(DetalleFactura detalleFactura, Long id) {
        DetalleFactura newDetalles = repository.findById(id).orElseThrow(()->
                new RuntimeException("Usuario inexistente"));

        newDetalles.setId(detalleFactura.getId());
        newDetalles.setNombreProducto(detalleFactura.getNombreProducto());
        newDetalles.setDescripcionProducto(detalleFactura.getDescripcionProducto());
        repository.save(newDetalles);
        return newDetalles;
    }

    @Override
    public void deleteDetalleFactura(Long id) {
        DetalleFactura newDetalles = repository.findById(id).orElseThrow(()->
                new RuntimeException("Usuario inexistente"));
        repository.deleteById(id);
    }
}
