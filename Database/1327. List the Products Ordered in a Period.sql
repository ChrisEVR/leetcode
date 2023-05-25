SELECT product_name, SUM(unit) AS 'unit'
FROM Products P
INNER JOIN Orders O
ON P.product_id = O.product_id
WHERE MONTH(order_date) = 2
GROUP BY P.product_id
HAVING SUM(unit) >= 100;