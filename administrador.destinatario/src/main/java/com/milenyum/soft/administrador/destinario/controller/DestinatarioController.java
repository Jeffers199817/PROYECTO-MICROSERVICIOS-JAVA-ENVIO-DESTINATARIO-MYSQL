package com.milenyum.soft.administrador.destinario.controller;

import com.milenyum.soft.administrador.destinario.modelo.Destinatario;
import com.milenyum.soft.administrador.destinario.service.IDestinatarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinatario")
public class DestinatarioController {

    @Autowired
    private IDestinatarioService destinatarioService;

    @PostMapping("/crear")
    public String crearDestinatario(@RequestBody Destinatario destinatario) {
        destinatarioService.crearDestinatario(destinatario);
        return "Destinatario creado correctamente";

    }

    @GetMapping("/obtener/{idDestinatario}")
    public Destinatario obtenerDestinatario(@PathVariable Long idDestinatario) {
        return destinatarioService.obtenerDestinatario(idDestinatario);
    }
    @GetMapping("/listar")
    public List<Destinatario> listarDestinatarios() {
        return destinatarioService.listarDestinatarios();
    }

    @DeleteMapping("/eliminar/{idDestinatario}")
    public String eliminarDestinatario(@PathVariable Long idDestinatario) {
        destinatarioService.eliminarDestinatario(idDestinatario);
        return "Destinatario eliminado correctamente";
    }

    @PutMapping("/actualizar")
    public Destinatario actualizarDestinatario(@RequestBody Destinatario destinatario) {
        return destinatarioService.actualizarDestinatario(destinatario);
    }


}
