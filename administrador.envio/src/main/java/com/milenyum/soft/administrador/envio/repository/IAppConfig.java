package com.milenyum.soft.administrador.envio.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "administrador.destinatario" , url = "http://localhost:9001")
public interface IAppConfig {

    @GetMapping("/traer/destinatario/{dni}")
    public String getDestinatario(@PathVariable List<String> dniLista);
}
