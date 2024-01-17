SELECT user_code, COUNT(*) AS totes_packed
FROM order_tote_process_log
WHERE action_code = 'PACKED'
AND TIME(process_date) BETWEEN '10:00:00' AND '10:59:59'
GROUP BY user_code;

#The expected output is:
+-----------+--------------+
| user_code | totes_packed |
+-----------+--------------+
| P1        | 1            |
| P2        | 1            |
+-----------+--------------+