package com.milenyum.soft.administrador.destinario.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "administrador.envio" , url = "http://localhost:9002")
public interface IAppConfig {

    @GetMapping("/envio")
    public String getEnvio();


}
