INSERT INTO ADDRESS(city,street) VALUES('Novi Sad','Trg Dositeja Obradovića 6');
INSERT INTO ADDRESS(city,street) VALUES('Novi Sad','Bulevar Oslobodjenja 10');




INSERT INTO COMPANY (name, address_id) VALUES ('FTN', 1);


INSERT INTO DEPARTMENT (name, company_id) VALUES ('Menadžment', 1);
INSERT INTO DEPARTMENT (name, company_id) VALUES ('Računarski centar', 1);

INSERT INTO EMPLOYEE (first_name, last_name, position, department_id, address_id) VALUES ('Aleksandar', 'Aleksić', 'radnik', 1, 2);
INSERT INTO EMPLOYEE (first_name, last_name, position, department_id, address_id) VALUES ('Milica', 'Milić', 'menadžer', 1, 2);
INSERT INTO EMPLOYEE (first_name, last_name, position, department_id, address_id) VALUES ('Slavica', 'Slavić', 'radnik', 2, 2);

INSERT INTO PROJECT (name, deadline) VALUES ('Biću student FTN', '2019-02-10');
INSERT INTO PROJECT (name, deadline) VALUES ('Podizanje sistema', '2019-05-1');

INSERT INTO WORKING (project_id, employee_id) VALUES (1, 1);
INSERT INTO WORKING (project_id, employee_id) VALUES (1, 2);
INSERT INTO WORKING (project_id, employee_id) VALUES (2, 3);
