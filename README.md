# KIẾN TRÚC THIẾT KẾ PHẦN MỀM THỰC HÀNH 6
## List request
1. Register
```
curl --location 'http://localhost:8080/api/account/register' \
--header 'Content-Type: application/json' \
--data '{
    "username": "quan4",
    "password": "minhquan"
}'
```

2. Login
```
curl --location 'http://localhost:8080/api/account/login' \
--header 'Content-Type: application/json' \
--data '{
    "username": "quan1",
    "password": "minhquan"
}'
```
