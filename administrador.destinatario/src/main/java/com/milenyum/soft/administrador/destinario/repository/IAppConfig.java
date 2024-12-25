package com.milenyum.soft.administrador.destinario.repository;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "administrador.envio" , url = "http://localhost:9002")
public interface IAppConfig {

    @


}
