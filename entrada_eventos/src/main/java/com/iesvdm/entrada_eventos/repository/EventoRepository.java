package com.iesvdm.entrada_eventos.repository;

import com.iesvdm.entrada_eventos.model.Evento;
import com.iesvdm.entrada_eventos.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventoRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Evento> getEventoService() {

        String sql = """
            SELECT id, nombre, fecha, lugar, aforo FROM eventos
        """;



    }

}
