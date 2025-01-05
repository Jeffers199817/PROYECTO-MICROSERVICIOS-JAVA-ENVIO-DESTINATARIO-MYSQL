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
    public String crearEnvio(@RequestBody Envio envio) {

        return envioService.crearEnvio(envio);
    }

    @DeleteMapping("/eliminar/{idEnvio}")
    public String eliminarEnvio(@PathVariable Long idEnvio) {
        envioService.eliminarEnvio(idEnvio);
        return "Envio eliminado correctamente";
    }
    @GetMapping("/listar")
    public List<Envio> listarEnvios() {
        return envioService.listarEnvios();
    }
    @GetMapping("/obtener/{idEnvio}")
    public Envio obtenerEnvio(@PathVariable  Long idEnvio) {
        System.out.println("Se obtuvo el sigueinte dato");
        return envioService.obtenerEnvio(idEnvio);
    }
    @PutMapping("/actualizar")
    public Envio actualizarEnvio(@RequestBody  Envio envio) {
        return envioService.actualizarEnvio(envio);
    }

}
