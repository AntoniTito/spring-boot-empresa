package com.tci.springbootempresa.controller;

import com.tci.springbootempresa.dao.entity.Empresa;
import com.tci.springbootempresa.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {


    @Autowired
    private EmpresaService empresaService;

    @PostMapping
    public ResponseEntity<?> guardarEmpresa(@RequestBody Empresa empresa){
        return new ResponseEntity<>(
                empresaService.saveEmpresa(empresa),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/ultimos3")
    public ResponseEntity<?> obtenerUltimasTresEmpresas(){
        return ResponseEntity.ok(empresaService.obtenerUltimasTresEmpresas());
    }

}
