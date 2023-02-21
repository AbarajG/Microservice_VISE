package com.andygomez.encabezadoFactura.controller;

import com.andygomez.encabezadoFactura.model.Encabezado;
import com.andygomez.encabezadoFactura.service.EncabezadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/encabezado")
public class EncabezadoController {

    private final EncabezadoService service;

    @GetMapping("/all")
    public ResponseEntity<List<Encabezado>> getAllEncabezados(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional> findById(@PathVariable UUID id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Encabezado> saveEncabezado(@RequestBody Encabezado encabezado){
        return new ResponseEntity<>(service.saveEncabezado(encabezado), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Encabezado> updateEncabezado(@PathVariable UUID id, @RequestBody Encabezado encabezado){
        return new ResponseEntity<>(service.updateEncabezado(encabezado, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEncabezado(@PathVariable UUID id){
        service.deleteEncabezadoById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
