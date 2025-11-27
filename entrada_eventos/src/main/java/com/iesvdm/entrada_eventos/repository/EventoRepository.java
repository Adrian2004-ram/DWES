package com.iesvdm.entrada_eventos.repository;

import com.iesvdm.entrada_eventos.model.Evento;
import com.iesvdm.entrada_eventos.service.EventoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.ZoneId;
import java.util.List;

@Repository
@Slf4j
public class EventoRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Evento> getEventoList() {

        String sql = """
            SELECT * FROM eventos
        """;

        List<Evento> eventos = jdbcTemplate.query(
            sql,
            (rs, rowNum) -> Evento.builder()
                .id(rs.getInt("id"))
                .nombre(rs.getString("nombre"))
                .descripcion(rs.getString("descripcion"))
                .fechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime())
                //.fechaHora(rs.getObject("fecha_hora", LocalDateTime.class))
                .lugar(rs.getString("lugar"))
                .precioBase(rs.getBigDecimal("precio_base"))
                .recargoGrada(rs.getBigDecimal("recargo_grada"))
                .recargoVip(rs.getBigDecimal("recargo_vip"))
                .build()
        );

        log.info("Devueltos {} eventos desde BBDD", eventos);

        return  eventos;

    }

    /**
     *
     * @param id
     * @return
     * @throws org.springframework.dao.EmptyResultDataAccessException si no encuentra el evento
     */
    public Evento getEventoById(int id) {

        return jdbcTemplate.queryForObject("""
            SELECT * FROM eventos WHERE id = ?
            """, (rs, rowNum) -> Evento.builder()
                .id(rs.getInt("id"))
                .nombre(rs.getString("nombre"))
                .descripcion(rs.getString("descripcion"))
                .fechaHora(rs.getTimestamp("fecha_hora").toLocalDateTime())
                //.fechaHora(rs.getObject("fecha_hora", LocalDateTime.class))
                .lugar(rs.getString("lugar"))
                .precioBase(rs.getBigDecimal("precio_base"))
                .recargoGrada(rs.getBigDecimal("recargo_grada"))
                .recargoVip(rs.getBigDecimal("recargo_vip"))
                .build()
            , id
        );

    }


}
