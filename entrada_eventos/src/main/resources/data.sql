-- Eventos
INSERT INTO eventos (id, nombre, descripcion, fecha_hora, lugar, precio_base, recargo_grada, recargo_vip)
VALUES
        (1, 'Concierto: The Rolling Waves', 'Gira latinoamericana - espectáculo de 2 horas con invitados.', '2025-07-10 21:00:00', 'Estadio Nacional', 45.00, 10.00, 60.00),
        (2, 'Festival de Jazz de Lima', 'Tres días de jazz con artistas nacionales e internacionales.', '2025-08-03 18:30:00', 'Parque Central', 30.00, 5.00, 40.00),
        (3, 'Obra de Teatro: La Casa de Marzo', 'Drama contemporáneo ganador de premios regionales.', '2025-09-12 19:00:00', 'Teatro Municipal', 25.00, 7.50, 35.00),
        (4, 'Conferencia Tech Summit 2025', 'Charlas y talleres sobre IA, cloud y seguridad.', '2025-11-05 09:00:00', 'Centro de Convenciones', 150.00, 20.00, 250.00),
        (5, 'Partido: FC Ciudad vs Rojos United', 'Clásico de la temporada con capacidad limitada.', '2025-10-02 16:00:00', 'Arena Metropolitano', 20.00, 15.00, 50.00),
        (6, 'Exposición de Arte Contemporáneo', 'Muestras de artistas emergentes y paneles curatoriales.', '2025-12-01 11:00:00', 'Galería Norte', 10.00, 0.00, 0.00);

-- Compras de entradas
INSERT INTO compra_entadas (id, evento_id, nombre_comprador, email_comprador, numero_entradas, precio_unitario, precio_total, fecha_compra)
VALUES
        (1, 1, 'María Gómez', 'maria.gomez@example.com', 2, 105.00, 210.00, '2025-05-02 10:15:00'), -- VIP (45 + 60)
        (2, 1, 'Carlos Pérez', 'c.perez@example.com', 4, 55.00, 220.00, '2025-06-20 14:40:00'),    -- Grada (45 + 10)
        (3, 2, 'Luisa Fernández', 'luisaf@example.org', 3, 30.00, 90.00, '2025-07-10 09:05:00'),     -- Base
        (4, 2, 'Agencia Eventos S.A.', 'ventas@eventos-sa.com', 10, 70.00, 700.00, '2025-07-15 11:30:00'), -- VIP (30 + 40)
        (5, 3, 'Diego Morales', NULL, 2, 32.50, 65.00, '2025-08-20 19:20:00'),                      -- Grada (25 + 7.5)
        (6, 3, 'Teatro Amigos', 'contacto@teatroamigos.org', 6, 60.00, 360.00, '2025-08-01 08:50:00'), -- VIP (25 + 35)
        (7, 4, 'Ing. Paula Rojas', 'paula.rojas@techco.com', 1, 370.00, 370.00, '2025-09-01 12:00:00'), -- VIP (150 + 250)
        (8, 4, 'Equipo DevOps', 'devops@startup.io', 5, 170.00, 850.00, '2025-09-10 09:10:00'),        -- Grada (150 + 20)
        (9, 5, 'Familia Ruiz', 'familia.ruiz@example.com', 5, 35.00, 175.00, '2025-09-15 17:45:00'),    -- Grada (20 + 15)
        (10, 5, 'Luis Navarro', 'luis.navarro@mail.com', 2, 70.00, 140.00, '2025-09-30 10:00:00'),     -- VIP (20 + 50)
        (11, 6, 'Colegio San Martín', 'info@csanmartin.edu', 20, 10.00, 200.00, '2025-11-10 08:00:00'), -- Base
        (12, 6, 'Patricia Soto', 'patricia.soto@example.com', 1, 10.00, 10.00, '2025-11-25 16:25:00');   -- Base
