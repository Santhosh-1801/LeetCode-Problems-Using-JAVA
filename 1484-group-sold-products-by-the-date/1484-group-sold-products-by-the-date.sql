SELECT sell_date,
COUNT(DISTINCT product) as num_sold,
GROUP_CONCAT(DISTINCT product ORDER BY product) as products
FROM activities
GROUP BY sell_date;