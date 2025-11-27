package com.iesvdm.entrada_eventos;

import com.iesvdm.entrada_eventos.model.Evento;
import com.iesvdm.entrada_eventos.repository.EventoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EntradaEventosApplicationTests {

    @Autowired
    EventoRepository eventoRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void listaEventos() {
        // Prueba adicional para verificar la configuración del contexto

        List<Evento> evetos = eventoRepository.getEventoList();

        System.out.println("Eventos encontrados: ");

        evetos.forEach(System.out::println);

    }

    @Test
    void buscarPorId() {

        Evento evento = eventoRepository.getEventoById(1);

        System.out.println("Evento encontrado: " + evento);

    }

}
