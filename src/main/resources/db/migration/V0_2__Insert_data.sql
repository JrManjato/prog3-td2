insert into team("name")
values ('Paris Saint-Germain'),
       ('Monaco'),
       ('FC Barcelone');
insert into player(name, number, id_team)
VALUES ('Gianluigi Donnarumma', 99, 1),
       ('Neymar JR', 10, 1),
       ('Ansu Fati', 22, 2);
insert into sponsor(name)
VALUES ('Qatar Airways'),
       ('Spotify');

insert into play_against (datetime, stadium, id_home, id_opponent)
values (current_timestamp, 'Camp Nou', 1, 2),
       (current_timestamp, 'Parc des Princes', 1, 3);

insert into have_sponsor(id_team, id_sponsor)
VALUES (1, 1),
       (1, 2),
       (2, 1);