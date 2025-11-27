package com.iesvdm.entrada_eventos.service;

import com.iesvdm.entrada_eventos.model.Evento;
import com.iesvdm.entrada_eventos.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> getAll() {
        return eventoRepository.getEventoList();
    }

    public Evento findById(int id) {
        return eventoRepository.getEventoById(id);
    }


}
