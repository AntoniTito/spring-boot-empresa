package com.tci.springbootempresa.service;

import com.tci.springbootempresa.dao.entity.Empresa;

import java.util.List;

public interface EmpresaService {
    Empresa saveEmpresa(Empresa empresa);

    List<Empresa> ListaEmpresas();

    List<Empresa> obtenerUltimasTresEmpresas();
}
