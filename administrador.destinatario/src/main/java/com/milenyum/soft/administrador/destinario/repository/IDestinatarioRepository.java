package com.milenyum.soft.administrador.destinario.repository;

import com.milenyum.soft.administrador.destinario.modelo.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinatarioRepository extends JpaRepository<Destinatario, Long> {
}
