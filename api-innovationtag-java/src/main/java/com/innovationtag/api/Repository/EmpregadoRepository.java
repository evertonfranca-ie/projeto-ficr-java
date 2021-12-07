package com.innovationtag.api.Repository;

import com.innovationtag.api.Models.Empregado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregadoRepository extends JpaRepository<Empregado, Integer>{
    
}
