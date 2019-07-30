/***************************/ 
/* Name: Ronald Brooks         */ 
/* Class: CS3310/w01            */ 
/* Term: Fall 2014                  */ 
/* Assgn #: 4 	             */ 
/***************************/ 

/* A */
SELECT * 
FROM PROJECT;

/* B */
SELECT ProjectID, Name, StartDate, EndDate
FROM PROJECT;

/* C */
SELECT * 
FROM PROJECT
WHERE StartDate < '08/01/08';

/* D */
SELECT * 
FROM PROJECT
WHERE EndDate < 0;

/* E */
SELECT ProjectID, EmployeeNumber, LastName, FirstName, Phone
FROM PROJECT, EMPLOYEE;

/* F */
SELECT ProjectID, Name, Department, EmployeeNumber, LastName, FirstName, Phone
FROM PROJECT, EMPLOYEE;

/* G */
SELECT ProjectID, Name, Department, DEPARTMENT.Phone, 
EmployeeNumber, LastName, Firstname, EMPLOYEE.Phone
FROM DEPARTMENT, EMPLOYEE
ORDER BY ProjectID ASC;

/* H */
SELECT ProjectID, Name, Department, DEPARTMENT.Phone, 
EmployeeNumber, LastName, Firstname, EMPLOYEE.Phone
FROM DEPARTMENT, EMPLOYEE
ORDER BY ProjectID ASC;

/* I */
SELECT COUNT (ProjectID) AS Total_Projects
FROM PROJECT;

/* J */
SELECT SUM (MaxHours) AS Total_Max_Hours
FROM PROJECT;

/* K */
SELECT AVG (MaxHours) AS Avg_Max_Hours
FROM PROJECT;

/* L */
SELECT DEPARTMENT, COUNT(ProjectID)
FROM PROJECT;
