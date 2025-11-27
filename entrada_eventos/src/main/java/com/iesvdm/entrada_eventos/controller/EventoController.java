package com.iesvdm.entrada_eventos.controller;

import com.iesvdm.entrada_eventos.dto.PostPaso2DTO;
import com.iesvdm.entrada_eventos.model.ComprarEntrada;
import com.iesvdm.entrada_eventos.model.Evento;
import com.iesvdm.entrada_eventos.service.EventoService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/eventos")
@SessionAttributes({"evento", "compraEntrada"})
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping("/comprar/paso1")
    public String comprarPaso1(Model model, Evento evento, ComprarEntrada compraEntrada) {

        var eventos = eventoService.getAll();

        model.addAttribute("eventos", eventos);
        model.addAttribute("eventoGet", evento);
        model.addAttribute("numeroEntradas", compraEntrada !=  null ? compraEntrada.getCantidadEntradas() : null);

        return "paso1";

    }

    @PostMapping("/comprar/paso2")
    public String comprarPaso1Post(@ModelAttribute PostPaso2DTO postPaso2DTO, HttpSession httpSession, Model model) {

        log.info("postPaso2DTO recibido: {}", postPaso2DTO);

        var eventoBds = eventoService.findById(postPaso2DTO.getId());

        httpSession.setAttribute("evento", eventoBds); // Guardar el evento en la sesión -- Lo machaco

       // httpSession.setAttribute("compraEntrada", ComprarEntrada.builder()
        //        .cantidadEntradas(postPaso2DTO.getCantidadEntradas())
       //         .build()
//);

        ComprarEntrada compraEntrada = ComprarEntrada.builder()
                .cantidadEntradas(postPaso2DTO.getCantidadEntradas())
                .build();

        model.addAttribute("evento", eventoBds);
        model.addAttribute("compraEntrada", compraEntrada);

        return "paso2";

    }



}
