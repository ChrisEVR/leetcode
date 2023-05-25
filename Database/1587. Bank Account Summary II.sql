SELECT name AS "NAME", SUM(amount) AS balance
FROM Transactions T INNER JOIN Users U
ON T.account = U.account
GROUP BY T.account
HAVING balance > 10000;