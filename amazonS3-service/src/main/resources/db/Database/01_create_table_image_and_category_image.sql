create table category_image
(
    id             bigint       not null,
    name           varchar(255) not null,
    description    varchar(255),
    create_at_time date         not null,
    update_at_time date         not null,
    primary key (id)
);
create table image
(
    id             bigint       not null,
    name           varchar(255) not null,
    url            varchar(255),
    width          bigint,
    height         bigint,
    description    varchar(255),
    create_at_time date         not null,
    update_at_time date         not null,
    primary key (id),
    id_category_image             bigint        ,

    CONSTRAINT image_fk_category_image
        FOREIGN KEY (id_category_image)
            REFERENCES category_image (id)
);

