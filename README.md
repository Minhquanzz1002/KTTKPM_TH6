# KIẾN TRÚC THIẾT KẾ PHẦN MỀM THỰC HÀNH 6
* Thực hành lưu dữ liệu vào Redis
* Thực hành microservice
* Cài đặt Docker
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
[View Full Image](https://raw.githubusercontent.com/Minhquanzz1002/KTTKPM_TH6/main/demo/register.png)
![Register](https://raw.githubusercontent.com/Minhquanzz1002/KTTKPM_TH6/main/demo/register.png)

2. Login
```
curl --location 'http://localhost:8080/api/account/login' \
--header 'Content-Type: application/json' \
--data '{
    "username": "quan1",
    "password": "minhquan"
}'
```
[View Full Image](https://raw.githubusercontent.com/Minhquanzz1002/KTTKPM_TH6/main/demo/login.png)
![Login](https://raw.githubusercontent.com/Minhquanzz1002/KTTKPM_TH6/main/demo/login.png)
