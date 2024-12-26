package com.milenyum.soft.administrador.envio.repository;

import com.milenyum.soft.administrador.envio.modelo.Destinatario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "administrador.destinatario" , url = "http://localhost:9001")
public interface IAppConfig {

    @PostMapping("api/destinatario/traer/destinatarios/econtrados")
    public List<Destinatario> getDestinatario(@RequestBody List<String> dniLista);
}
