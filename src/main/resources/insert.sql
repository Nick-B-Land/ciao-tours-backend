--User Roles
INSERT INTO `roles` (`role_id`,`name`) VALUES (1,'ROLE_ADMIN');
INSERT INTO `roles` (`role_id`,`name`) VALUES (2,'ROLE_BOOKKEEPER');
INSERT INTO `roles` (`role_id`,`name`) VALUES (3,'ROLE_HR');
INSERT INTO `roles` (`role_id`,`name`) VALUES (4,'ROLE_EMPLOYEE');

--Employee Types
INSERT INTO `employee_type` (`description`) VALUES ('HOURLY');
INSERT INTO `employee_type` (`description`) VALUES ('SALARY');
INSERT INTO `employee_type` (`description`) VALUES ('ITALIAN');
INSERT INTO `employee_type` (`type_id`,`description`) VALUES ('99','ITALIAN');