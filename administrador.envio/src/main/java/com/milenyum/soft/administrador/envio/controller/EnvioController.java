package com.milenyum.soft.administrador.envio.controller;

import com.milenyum.soft.administrador.envio.modelo.Envio;
import com.milenyum.soft.administrador.envio.service.IEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envio")
public class EnvioController {

    @Autowired
    private IEnvioService envioService;

    @PostMapping("/crear")
    public String crearEnvio(Envio envio) {
        envioService.crearEnvio(envio);
        return "Envio creado correctamente";
    }

    @DeleteMapping("/eliminar/{idEnvio}")
    public String eliminarEnvio(Long idEnvio) {
        envioService.eliminarEnvio(idEnvio);
        return "Envio eliminado correctamente";
    }
    @GetMapping("/listar")
    public List<Envio> listarEnvios() {
        return envioService.listarEnvios();
    }
    @GetMapping("/obtener/{idEnvio}")
    public Envio obtenerEnvio(Long idEnvio) {
        return envioService.obtenerEnvio(idEnvio);
    }
    @PutMapping("/actualizar")
    public Envio actualizarEnvio(@RequestBody  Envio envio) {
        return envioService.actualizarEnvio(envio);
    }

}
