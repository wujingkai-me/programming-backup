CREATE DATABASE jdbc_test;
USE jdbc_test;

CREATE TABLE jdbc(
    student_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    student_name VARCHAR(3) NOT NULL,
    student_gender INT NOT NULL,
    student_of_school VARCHAR(20)
)