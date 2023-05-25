SELECT id, MAX(IF(month = 'Jan', revenue, null)) AS Jan_Revenue,
Feb_Revenue,
Mar_Revenue,
Apr_Revenue,
May_Revenue,
Jun_Revenue,
Jul_Revenue,
Aug_Revenue,
Sep_Revenue,
Oct_Revenue,
Nov_Revenue,
Dec_Revenue
FROM Department Jan LEFT JOIN (
    SELECT id, MAX(IF(month = 'Feb', revenue, null)) AS Feb_Revenue
    FROM Department
    GROUP BY id
) Feb USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Mar', revenue, null)) AS Mar_Revenue
    FROM Department
    GROUP BY id
) Mar USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Apr', revenue, null)) AS Apr_Revenue
    FROM Department
    GROUP BY id
) Apr USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'May', revenue, null)) AS May_Revenue
    FROM Department
    GROUP BY id
) May USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Jun', revenue, null)) AS Jun_Revenue
    FROM Department
    GROUP BY id
) Jun USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Jul', revenue, null)) AS Jul_Revenue
    FROM Department
    GROUP BY id
) Jul USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Aug', revenue, null)) AS Aug_Revenue
    FROM Department
    GROUP BY id
) Aug USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Sep', revenue, null)) AS Sep_Revenue
    FROM Department
    GROUP BY id
) Sep USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Oct', revenue, null)) AS Oct_Revenue
    FROM Department
    GROUP BY id
) Oct USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Nov', revenue, null)) AS Nov_Revenue
    FROM Department
    GROUP BY id
) Nov USING(id) LEFT JOIN (
    SELECT id, MAX(IF(month = 'Dec', revenue, null)) AS Dec_Revenue
    FROM Department
    GROUP BY id
) Dece USING(id)
GROUP BY id;