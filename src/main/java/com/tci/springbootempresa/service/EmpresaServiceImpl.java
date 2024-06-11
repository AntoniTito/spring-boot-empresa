package com.tci.springbootempresa.service;

import com.tci.springbootempresa.dao.entity.Empresa;
import com.tci.springbootempresa.dao.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService{

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public Empresa saveEmpresa(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    @Override
    public List<Empresa> ListaEmpresas(){

        return empresaRepository.findAll();
    }

    @Override
    public List<Empresa> obtenerUltimasTresEmpresas(){

        return empresaRepository.obtenerUltimasTresEmpresas();
    }
}
