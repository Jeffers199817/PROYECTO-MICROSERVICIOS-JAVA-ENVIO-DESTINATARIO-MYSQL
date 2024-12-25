package com.milenyum.soft.administrador.envio.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEnvio;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaDeCreacion;
    private String estadoDeProcesamiento;
    private String descripcionDelEnvio;
    @ElementCollection
    private List<String> listaDestinatarios;
}
