package com.milenyum.soft.administrador.envio.repository;

import com.milenyum.soft.administrador.envio.modelo.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnvioRespository extends JpaRepository<Envio, Long> {
}
