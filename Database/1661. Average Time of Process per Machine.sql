# Write your MySQL query statement below
SELECT E.machine_id, ROUND(AVG(E.timestamp - S.timestamp), 3) AS processing_time
FROM Activity S JOIN Activity E ON 
    E.machine_id = S.machine_id AND E.process_id = S.process_id AND 
    E.activity_type = 'end' AND S.activity_type = 'start'
GROUP BY S.machine_id;