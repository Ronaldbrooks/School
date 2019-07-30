/***************************/ 
/* Name: Ronald Brooks     */ 
/* Class: CS3310-w01       */ 
/* Term: Fall 2014         */ 
/* Assgn #: 3              */ 
/***************************/

USE CapeCodd;


/* 2.28 */
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY
WHERE QuantityOnHand = 0, QuantityOnOrder > 0;
ORDER BY Warehouse DESC, SKU ASC;

/* 2.29 */
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY
WHERE QuantityOnHand > 1 AND QuantityOnHand < 10;

/* 2.30 */
SELECT SKU, SKU_Description, WarehouseID, QuantityOnHand
FROM INVENTORY
WHERE QuantityOnhandBETWEEN2AND9;

/* 2.31 */
SELECT DISTINCT SKU, SKU_Description
FROM INVENTORY
WHERE SKU_Description 
LIKE 'Half-dome%';


/* 2.32 */
SELECT DISTINCT SKU, SKU_Description
FROM INVENTORY
WHERE SKU_Description 
LIKE 'Climb%';

/* 2.33 */
SELECT DISTINCT SKU, SKU_Description
FROM INVENTORY
WHERE SKU_Description 
LIKE '__d%';

/* 2.34 */
SELECT COUNT (QuantityOnHand) AS Number_Of_Records,
 SUM (QuantityOnHand) AS Total_Number_Of_Items_On_Hand,
 AVG (QuantityOnHand) AS Ave_Number_Of_Items_On_Hand,
 MAX (QuantityOnHand) AS Max_Number_Of_Items_On_Hand,
 MIN (QuantityOnHand) AS Min_Number_Of_Items_On_Hand
FROM INVENTORY;

/* 2.35 */
/* Count counts the number of rows in a tables and sum */
/* adds up the data values in the specific column */

/* 2.36 */
/* SELECT WarehouseID, SUM(QuantityOnHand) AS TotalItemsOnHand */
/* FROM INVENTORY */
/* WHERE QuantityOnHand */
/* GROUP BY WarehouseID */
/* ORDER BY SUM (QuantityOnHand) DESC; */

/* 2.37 */
/* SELECT WarehouseID, SUM(QuantityOnHand) AS  TotalItemsOnHandLT3 */
/* FROM INVENTORY */
/* WHERE QuantityOnHand < 3 */
/* GROUP BY WarehouseID */
/* ORDER BY SUM (QuantityOnHand) DESC; */

/* 2.38 */
/* SELECT WarehouseID, SUM(QuantityOnHand) AS  TotalItemsOnHandLT3 */
/* FROM INVENTORY */
/* WHERE QuantityOnHand < 3 */
/* GROUP BY WarehouseID */
/* HAVING COUNT (*) < 2 */
/* ORDER BY SUM (QuantityOnHand) DESC; */

/* 2.39 */
/* The WHERE clause must always be applied before the HAVING clause, Otherwise */
/* there would be ambiguity in the SQL statement and the results would differ according */
/* to which clause was applied first. */

/* 2.40 */
SELECT SKU, SKU_Description, INVENTORY.WarehouseID
FROM INVENTORY, WAREHOUSE
WHERE INVENTORY.WarehouseID=WAREHOUSE.WarehouseID
AND WarehouseCity ('Atlanta','Bangor','Chicago');

/* 2.41 */
SELECT SKU, SKU_Description, WarehouseID 
FROM INVENTORY
WHERE WarehouseID IN
	( SELECT Warehouse ID
	   FROM INVENTORY
	   WHERE
	   IN ('Atlanta', 'Bangor', 'Chicago'));	   

/* 2.42 */
SELECT SKU, SKU_Description, INVENTORY.WarehouseID
FROM INVENTORY, WAREHOUSE
WHERE INVENTORY.WarehouseID=WAREHOUSE.WarehouseID
AND WarehouseCity Except ('Atlanta','Bangor','Chicago');

/* 2.43 */
SELECT SKU, SKU_Description, WarehouseID 
FROM INVENTORY
WHERE WarehouseID IN
	( SELECT Warehouse ID
	   FROM INVENTORY
	   WHERE
	   NOT IN ('Atlanta', 'Bangor', 'Chicago'));

/* 2.44 */
SELECT SKU_Description
FROM INVENTORY
WHERE WarehouseCity
IN(‘is in a warehouse in’) 
AS ItemLocation);

/* 2.45 */
SELECT SKU, SKU_Description, WarehouseID
FROM INVENTORY 
WHERE Manager = 'Lucille Smith’;


/* 2.46 */
SELECT I.SKU, I.SKU_Description, w.WarehouseID
FROM INVENTORY I JOIN Warehouse w
USING (WarehouseID)
WHERE w.Manager = 'Lucille Smith’;

/* 2.47 */
SELECT WarehouseID, AVG(QuantityOnHand) AS QuantityOnHand 
FROM INVENTORY 
WHERE WarehouseID 
IN (SELECT WarehouseID 
FROM WarehouseID 
WHERE Manager = 'Lucille Smith'
GROUP BY WarehouseID;

/* 2.48 */
SELECT w.WarehouseID, AVG(QuantityOnHand) AS QuantityOnHand 
FROM INVENTORY JOIN Warehouse w
WHERE WarehouseID 
IN (SELECT WarehouseID 
FROM WarehouseID 
USING (WarehouseID)
WHERE Manager = 'Lucille Smith'
GROUP BY WarehouseID;

/* 2.49 */
SELECTWarehouseID, SUM(WarehouseID) AS TotalItemsOnHand, 
SUM(QuantityOnOrder) AS TotalItemsOnOrder
FROM INVENTORY
WHERE QuantityOnOrder, WarehouseID
GROUPED BY WarehouseID, QuantityOnOrder

/* 2.50 */
SELECT I.SKU, I.SKU_Description, w.WarehouseID,
WarehouseCity, WarehouseState, Manager, QuantityOnHand
FROM INVENTORY I JOIN Warehouse w
USING (WarehouseID)
WHERE w.Manager = "Lucille Smith";
