/***************************/
/* Name: Ronald Brooks         */ 
/* Class: CS3310                    */
/* Term: Fall 2014                  */
/* Lab #: 3part1                      */
/***************************/

/*Multiplication:*/

/*What are all the possible combinations of pets and owners?*/
SELECT *
FROM PET, OWNER;


/*Join:*/
 
/*Who are the pets and who are their owners?*/
SELECT *
FROM PET, OWNER
WHERE PET.OwnerID = OWNER.OwnerID;

/*What are the pet names,species, breeds, and owner names?*/
SELECT name, species, breed, ownername
FROM PET, OWNER
WHERE PET.OwnerID = OWNER.OwnerID;

/*What are the pet ID's and owner ID's?*/
SELECT ID, OWNER.ownerID
FROM PET, OWNER
WHERE PET.OwnerID = OWNER.OwnerID;


/*Outer Join:*/

/*Who are the pets and their owners, as well as people without pets?*/
SELECT *
FROM PET, OWNER
WHERE PET.OWnerID = OWNER.OwnerID(+);

/*What are the pet ID's and owner ID's of the pets and their owners, as well as people without pets?*/
SELECT ID, OWNER.OwnerID
FROM PET, OWNER
WHERE PET.OwnerID = OWNER.OwnerID(+);

/*What are the pet names,species, breeds, and owner names of the pets and their owners, as well as people without pets?*/
SELECT name, species, breed, ownername
FROM PET, OWNER
WHERE PET.OwnerID = OWNER.OwnerID(+);

/*Who are the pets and their owners, as well animals without owners?*/
SELECT *
FROM PET, OWNER
WHERE PET.OwnerID(+) = OWNER.OwnerID;

/*What are the pet ID's and owner ID's of the pets and their owners, as well animals without owners?*/
SELECT ID, OWNER.OwnerID
FROM PET, OWNER
WHERE PET.OwnerID(+) = OWNER.OwnerID;



/*Union:*/

/*Who are the shelter animals and registered pets?*/
SELECT *
FROM SHELTER_ANIMAL
UNION
SELECT *
FROM PET;

/*What are ID numbers of the registered pets as well as the shelter animals?*/
SELECT ID
FROM PET
UNION
SELECT ID
FROM SHELTER_ANIMAL;


/*Intersection:*/

/*What registered pets are from the shelter?*/
SELECT *
FROM PET
UNION
SELECT *
FROM SHELTER_ANIMAL;

/*What are the ID numbers of the registered pets that are from the shelter?*/
SELECT ID
FROM PET
UNION
SELECT ID
FROM SHELTER_ANIMAL;



/*Difference*/

/*What shelter animals are not registered pets?*/
SELECT *
FROM SHELTER_ANIMAL
MINUS
SELECT *
FROM PET;

/*What are the ID numbers of the registered pets not from the shelter?*/
SELECT ID
FROM PET
MINUS
SELECT ID
FROM SHELTER_ANIMAL;
