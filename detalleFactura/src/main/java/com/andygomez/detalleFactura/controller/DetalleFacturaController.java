package com.andygomez.detalleFactura.controller;

import com.andygomez.detalleFactura.model.DetalleFactura;
import com.andygomez.detalleFactura.service.DetalleFacturaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/detalleFactura")
public class DetalleFacturaController {

    private final DetalleFacturaService service;

    @PostMapping
    public ResponseEntity<DetalleFactura> saveDetalleFactura(@RequestBody DetalleFactura detalleFactura){
        return new ResponseEntity(service.saveDetalleFactura(detalleFactura), HttpStatus.CREATED);
    }

    @GetMapping
    public List<DetalleFactura> getAllDetalleFactura(){
        return service.getAllDetalleFactura();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional> getDetalleFacturaById(@PathVariable("id")Long id){
        return new ResponseEntity<Optional>(service.findByIdDetalleFactura(id), HttpStatus.OK);
    }


    @PutMapping("{id}")
    public ResponseEntity<DetalleFactura> updateEmpleado(@PathVariable("id") long id,
                                                   @RequestBody DetalleFactura detalleFactura){
        return new ResponseEntity<DetalleFactura>(service.updateDetalleFactura(detalleFactura, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmpleado(@PathVariable("id") long id){
        service.deleteDetalleFactura(id);
        return new ResponseEntity<String>("Factura eliminado",HttpStatus.OK);
    }
}
