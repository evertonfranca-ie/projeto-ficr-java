package com.innovationtag.api.Repository;

import com.innovationtag.api.Models.Treinamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinamentoRepository extends JpaRepository<Treinamento, Integer> {
    
}
