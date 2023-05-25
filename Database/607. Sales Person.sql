SELECT name
FROM(
    SELECT S.name, C.name AS Company_Name
    FROM SalesPerson AS S LEFT JOIN Orders AS O USING(sales_id)
    LEFT JOIN Company AS C USING(com_id)
    GROUP BY S.name
    HAVING C.name IS NULL OR C.name NOT LIKE "RED"
) T;