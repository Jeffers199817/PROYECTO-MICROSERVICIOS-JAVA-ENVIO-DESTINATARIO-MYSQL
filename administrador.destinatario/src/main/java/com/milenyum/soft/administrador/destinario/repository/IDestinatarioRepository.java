package com.milenyum.soft.administrador.destinario.repository;

import com.milenyum.soft.administrador.destinario.modelo.Destinatario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDestinatarioRepository extends JpaRepository<Destinatario, Long> {

@Query("SELECT d FROM Destinatario d WHERE d.dniDestinatario = :dni")
public Destinatario getDestinatarioDni(@Param("dni") String dni);


}
