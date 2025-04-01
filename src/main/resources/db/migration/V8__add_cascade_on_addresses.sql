alter table addresses
    drop foreign key addresses_ibfk_1;

alter table addresses
    add constraint addresses_ibfk_1
        foreign key (user_id) references users (id)
            on delete cascade;
