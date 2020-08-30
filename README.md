Order Item API:

1) Order Item Creation:
http://localhost:8787/orderitem/create
Method: POST
Content-Type:application/json

Request Body:
[{
"orderId":"1",
"productCode":"PRD3",
"productName":"Test3",
"quantity":"6"
}]

2) Get particular Order Item Detail:
http://localhost:8787/orderitem/orderdetails/1
Method: GET

3) Get All Order Item Details:
http://localhost:8787/orderitem/getall
Method: GET
