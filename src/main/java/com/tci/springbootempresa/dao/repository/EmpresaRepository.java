package com.tci.springbootempresa.dao.repository;

import com.tci.springbootempresa.dao.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

    @Query(value = "SELECT * FROM empresa ORDER BY 1 DESC LIMIT 3", nativeQuery = true)
    List<Empresa> obtenerUltimasTresEmpresas();
}
