/***************************/
/*Name: Ronald Brooks         */
/*Class: CS3310                    */
/*Term: Fall 2014                  */
/*Lab #: 3part2                      */
/**************************/

/*  1.List the name of all products for which an order was placed. */

SELECT pname
FROM PRODUCTS, ORDER
WHERE Products.pID = Order.pID;

/* List the name of customers that ordered product ‘p07’*/

SELECT cname
FROM customers, orders
WHERE orders.pid= "p07";

/* 3)List name of agents that placed an order for customer c003 or customer c006? */

SELECT aname
FROM agents, orders
WHERE orders.cid = "c003"
OR orders.cid= "c006";

/* List name of customers that ordered product ‘p01’ through agent 'a01'*/
SELECT cname
FROM customers, orders
WHERE orders.pid = "po1"
AND order.aid = "a01";

/* List the name of each customer that placed an order, the pid of what they ordered and also the customers that did not place an order. */
SELECT cname, pid
FROM customers, orders
WHERE customers.cID = orders.cID(+);

/* List the name of each customer that placed an order and the product name for each product they ordered. */
SELECT cname, pname
FROM customers, products, orders
WHERE customers.cid=orders.cid
AND orders.pid = products.pid;

/* List the name of each customer and the total amount ordered by the customers and also list the customers that did not place an order. */
SELECT cname, dollars
FROM customers, orders
WHERE customer.cid = orders.cid(+);

/* List the name and the sum of dollars for each customer that ordered more than $1,000 */
SELECT cname, dollars
FROM customers, orders
WHERE orders.dollars > 1000;

/* List the agent name, product name and customer name for each product ordered. */
SELECT aname, pname, cname
FROM agents, products, customers, orders
WHERE orders.pid = products.pid
AND agents.aid = orders.aid;

/* What would be the result of the following SQL Statement: SELECT * from CUSTOMERS, PRODUCTS */
/*All the information is pulled from both the customers and products tables.*/
