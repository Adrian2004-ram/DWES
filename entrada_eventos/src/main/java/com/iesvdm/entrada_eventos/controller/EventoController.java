package com.iesvdm.entrada_eventos.controller;

import com.iesvdm.entrada_eventos.service.EventoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@Slf4j
@RequestMapping("/eventos")
@SessionAttributes("evento")
public class EventoController {

    private EventoService eventoService;

    @GetMapping("/comprar/paso1")
    public String comprarPaso1(){

        return "paso1";

    }

}
