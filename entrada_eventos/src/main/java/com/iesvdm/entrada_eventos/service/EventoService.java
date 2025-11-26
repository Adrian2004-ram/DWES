package com.iesvdm.entrada_eventos.service;

import com.iesvdm.entrada_eventos.repository.EventoRepository;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    private EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

}
