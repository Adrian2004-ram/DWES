create table eventos
(
    id            int auto_increment
        primary key,
    nombre        varchar(100)   not null,
    descripcion   varchar(255)   not null,
    fecha_hora    datetime       not null,
    lugar         varchar(100)   not null,
    precio_base   decimal(10, 2) not null,
    recargo_grada decimal(10, 2) not null,
    recargo_vip   decimal(10, 2) not null
);

create table compra_entadas
(
    id               int            not null
        primary key,
    evento_id        int            not null,
    nombre_comprador varchar(100)   not null,
    email_comprador  varchar(100)   null,
    numero_entradas  int            not null,
    precio_unitario  decimal(10, 2) not null,
    precio_total     decimal(10, 2) null,
    fecha_compra     datetime       not null,
    constraint evento_id
        foreign key (evento_id) references eventos (id)
);

