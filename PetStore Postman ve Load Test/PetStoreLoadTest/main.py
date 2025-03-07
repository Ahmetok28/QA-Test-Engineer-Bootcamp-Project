from locust import HttpUser, between, task


class WebsiteUser(HttpUser):
    wait_time = between(5, 15)

    #######-----------User-------------#########
    @task
    def logout(self):
        self.client.get("/v2/user/logout")

    @task
    def login(self):
        self.client.get("/v2/user/login?username=Ahmetok&password=string")

    @task
    def get_user_info(self):
        self.client.get("/v2/user/Ahmetok3")

    @task
    def create_user(self):
        body = {
            "id": 3234543,
            "username": "Ahmetok1",
            "firstName": "Ahmet",
            "lastName": "OK",
            "email": "ahmet12@gmail.com",
            "password": "string",
            "phone": "534 856 98 75",
            "userStatus": 0
        }
        self.client.post("/v2/user", json=body)

    @task
    def create_user_with_list(self):
        body = [
            {
                "id": 7537421,
                "username": "Ahmetok6",
                "firstName": "Ahmet",
                "lastName": "OK",
                "email": "ahmet12@gmail.com",
                "password": "string",
                "phone": "534 856 98 75",
                "userStatus": 0
            },
            {
                "id": 42863867,
                "username": "Ahmetok7",
                "firstName": "Ahmet",
                "lastName": "OK",
                "email": "ahmet12@gmail.com",
                "password": "string",
                "phone": "534 856 98 75",
                "userStatus": 0
            },
            {
                "id": 4243521,
                "username": "Ahmetok8",
                "firstName": "Ahmet",
                "lastName": "OK",
                "email": "ahmet12@gmail.com",
                "password": "string",
                "phone": "534 856 98 75",
                "userStatus": 0
            },
            {
                "id": 825683,
                "username": "Ahmetok9",
                "firstName": "Ahmet",
                "lastName": "OK",
                "email": "ahmet12@gmail.com",
                "password": "string",
                "phone": "534 856 98 75",
                "userStatus": 0
            },
            {
                "id": 5283,
                "username": "Ahmetok10",
                "firstName": "Ahmet",
                "lastName": "OK",
                "email": "ahmet12@gmail.com",
                "password": "string",
                "phone": "534 856 98 75",
                "userStatus": 0
            }
        ]
        self.client.post("/v2/user", json=body)

    @task
    def delete_user(self):
        self.client.delete("/v2/user/Ahmetok1")

    @task
    def update_user(self):
        body2 = {
            "id": 45377375,
            "username": "AhmetAA",
            "firstName": "Ahmet",
            "lastName": "OK",
            "email": "string@gmail.com",
            "password": "string",
            "phone": "0543 546 12 34",
            "userStatus": 0
        }
        header_payload = {
            "accept": "application/json",
            "Content-Type": "application/json"
        }
        self.client.put("/v2/user/Ahmetok2", json=body2, headers=header_payload)

    #######-----------Store-------------#########
    @task
    def get_order(self):
        self.client.get("/v2/store/order/9")

    @task
    def get_inventory(self):
        self.client.get("/v2/store/inventory")

    @task
    def create_order(self):
        create_order_body = {
            "id": 10,
            "petId": 9223372036854762000,
            "quantity": 0,
            "shipDate": "2025-03-07T11:15:11.049Z",
            "status": "placed",
            "complete": True
        }
        self.client.post("/v2/store/order", json=create_order_body)

    @task
    def delete_order(self):
        self.client.delete("/v2/store/order/7")

    #######-----------Pet-------------#########

    @task
    def available_pets(self):
        self.client.get("/v2/pet/findByStatus?status=available")

    @task
    def add_pet(self):
        add_pet_body = {
            "id": 5,
            "category": {
                "id": 2,
                "name": "Kedi"
            },
            "name": "Baykuş",
            "photoUrls": [
                "string"
            ],
            "tags": [
                {
                    "id": 0,
                    "name": "string"
                }
            ],
            "status": "available"
        }
        self.client.post("v2/pet", json=add_pet_body)

    @task
    def update_pet(self):
        pet_body = {
            "id": 143,
            "category": {
                "id": 2,
                "name": "Kedi"
            },
            "name": "Baykuş",
            "photoUrls": [
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRM4PW6W-O4D-x85tdubFg2O1r_IH72BilwVA&s"
            ],
            "tags": [
                {
                    "id": 1,
                    "name": "Miyav"
                }
            ],
            "status": "available"
        }
        header_payload = {
            "accept": "application/json",
            "Content-Type": "application/json"
        }
        self.client.put("v2/pet", json=pet_body,headers=header_payload)

    @task
    def get_pets_by_status(self):
        self.client.get("v2/pet/findByStatus?status=available")

    @task
    def get_pet_by_id(self):
        self.client.get("/v2/pet/143")

    @task
    def delete_pet(self):
        self.client.delete("v2/pet/9")
