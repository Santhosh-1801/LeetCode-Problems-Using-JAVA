select users.name,sum(transactions.amount) as 'balance'
from users join transactions 
on users.account=transactions.account
group by transactions.account
having sum(transactions.amount)>10000;