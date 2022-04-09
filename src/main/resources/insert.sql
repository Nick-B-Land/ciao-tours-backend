--User Roles
INSERT INTO `roles` (`role_id`,`name`) VALUES (1,'ROLE_ADMIN');
INSERT INTO `roles` (`role_id`,`name`) VALUES (2,'ROLE_BOOKKEEPER');
INSERT INTO `roles` (`role_id`,`name`) VALUES (3,'ROLE_HR');
INSERT INTO `roles` (`role_id`,`name`) VALUES (4,'ROLE_EMPLOYEE');

--Employee Types
INSERT INTO `employee_type` (`employee_type_id`,`description`) VALUES ('1','HOURLY');
INSERT INTO `employee_type` (`employee_type_id`,`description`) VALUES ('2','SALARY');
INSERT INTO `employee_type` (`employee_type_id`,`description`) VALUES ('3','ITALIAN');
INSERT INTO `employee_type` (`employee_type_id`,`description`) VALUES ('99','INACTIVE');