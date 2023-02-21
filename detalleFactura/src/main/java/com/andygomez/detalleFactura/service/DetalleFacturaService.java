package com.andygomez.detalleFactura.service;

import com.andygomez.detalleFactura.model.DetalleFactura;

import java.util.List;
import java.util.Optional;


public interface DetalleFacturaService {


    DetalleFactura saveDetalleFactura(DetalleFactura detalleFactura);
    List<DetalleFactura> getAllDetalleFactura();
    Optional<DetalleFactura> findByIdDetalleFactura(Long id);
    DetalleFactura getDetalleFacturaById(Long id);
    DetalleFactura updateDetalleFactura(DetalleFactura detalleFactura, Long id);
    void deleteDetalleFactura(Long id);


}
