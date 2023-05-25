SELECT product_id, product_name
FROM Product JOIN Sales USING(product_id)
GROUP BY product_id
HAVING MIN(DATE(Sales.sale_date)) >= DATE('2019-01-01') AND MAX(DATE(Sales.sale_date)) < DATE('2019-03-31');