
INSERT INTO `WAPPGROUP` (id, name) VALUES (1, 'Example Group');

INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (1, 'Juan', 'Perez', '15-2434-5771');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (2, 'Mariana', 'Lazanski', '15-5794-1347');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (3, 'Jorge' ,'Poeta', '15-5741-3663');
INSERT INTO `CONTACT` (id, first_name, last_name, phone_number) VALUES (4, 'Graciela', 'Rodriguez', '15-4567-8741');


INSERT INTO `WAPPGROUP_MEMBERS` (group_id, members_id) VALUES (1, 1);
INSERT INTO `WAPPGROUP_MEMBERS` (group_id, members_id) VALUES (1, 2);
INSERT INTO `WAPPGROUP_MEMBERS` (group_id, members_id) VALUES (1, 3);
INSERT INTO `WAPPGROUP_MEMBERS` (group_id, members_id) VALUES (1, 4);


INSERT INTO `CONTACT_CONTACTS` (contact_id, contacts_id) VALUES (1, 2);
INSERT INTO `CONTACT_CONTACTS` (contact_id, contacts_id) VALUES (1, 4);
