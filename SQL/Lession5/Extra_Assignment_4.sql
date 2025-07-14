use adventureworks;

-- Exercise 1: Subquery
-- Question1
SELECT Name
FROM product
WHERE ProductSubcategoryID IN (
	SELECT ProductSubcategoryID
    FROM productsubcategory
    WHERE Name = 'Saddles'
    );
    
-- Question2
SELECT Name
FROM product
WHERE ProductSubcategoryID IN (
	SELECT ProductSubcategoryID
    FROM productsubcategory
    WHERE Name LIKE 'Bo%'
    );
    
-- Question3
SELECT Name
FROM product
WHERE ProductSubcategoryID = 3
  AND ListPrice = (
    SELECT MIN(ListPrice)
    FROM product
    WHERE ProductSubcategoryID = 3
);

-- Exercise 2: Joining mutiple tables
-- Question1
SELECT c.Name AS Country, s.Name AS Province
FROM countryregion c
JOIN stateprovince s ON c.CountryRegionCode = s.CountryRegionCode;

-- Question2
SELECT c.Name AS Country, s.Name AS Province
FROM countryregion c
JOIN stateprovince s ON c.CountryRegionCode = s.CountryRegionCode
WHERE c.Name IN ('Canada','Germany')
ORDER BY Country;

-- Question3
SELECT soh.SalesOrderID, soh.OrderDate, soh.SalesPersonID, sp.SalesPersonID AS BusinessEntityID, sp.Bonus, sp.SalesYTD
FROM salesorderheader soh
RIGHT JOIN salesperson sp ON  soh.SalesPersonID = sp.SalesPersonID
WHERE OnlineOrderFlag = '0'
ORDER BY soh.SalesOrderID;

-- Question4
SELECT soh.SalesOrderID, soh.OrderDate, e.Title AS Jobtitle, sp.Bonus, sp.SalesYTD
FROM salesorderheader soh
RIGHT JOIN salesperson sp ON  soh.SalesPersonID = sp.SalesPersonID
JOIN employee e ON soh.SalesPersonID = e.EmployeeID
WHERE OnlineOrderFlag = '0'
ORDER BY soh.SalesOrderID;