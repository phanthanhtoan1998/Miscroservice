create table category_product_extra
(
    id               bigint       not null,
    name             varchar(255) not null,
    icon             varchar(255) ,
    create_at_time   date  not null,
    update_at_time   date  not null,
    primary key (id)
);
create table category_product_main
(
    id             bigint       not null,
    name           varchar(255) not null,
    icon           varchar(255),
    create_at_time date  not null,
    update_at_time date  not null,
    primary key (id)
);

create table product_main
(
    id                       bigint       not null,
    name                     varchar(255) not null,
    description              varchar(5000),
    price                    decimal      not null,
    create_at_time           date  not null,
    update_at_time           date  not null,
    id_Category_product_main bigint       not null,


    primary key (id),

    CONSTRAINT product_main_fk_category_product_main
        FOREIGN KEY (id_Category_product_main)
            REFERENCES category_product_main (id)

);

create table product_extra
(
    id                        bigint       not null,
    name                      varchar(255) not null,
    price                     decimal      not null,
    image_link                varchar(255),
    create_at_time            date  not null,
    update_at_time            date  not null,
    id_product_main           bigint       not null,
    id_category_product_extra bigint       not null,
    primary key (id),

    CONSTRAINT product_extra_fk_product_main
        FOREIGN KEY (id_product_main)
            REFERENCES category_product_main (id),

    CONSTRAINT product_extra_fk_category_product_extra
        FOREIGN KEY (id_category_product_extra)
            REFERENCES category_product_extra (id)
);


create table image_product_main
(
    id             bigint       not null,
    link           varchar(255) not null,
    create_at_time date  not null,
    update_at_time date  not null,
    id_product_main bigint  not null,
    primary key (id),

    CONSTRAINT image_product_main_fk_product_main
        FOREIGN KEY (id_product_main)
            REFERENCES product_main (id)
);