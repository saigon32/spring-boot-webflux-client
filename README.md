material del curso de webflux udemy pragma: https://www.udemy.com/certificate/UC-454143b4-5f8b-4720-b793-0886b0dc5ce5/

Seccion 8: WebClient: Consumiendo Servicios RESTful

se adjunta la coleccion de postman al proyecto: webflux-apirest-v3.postman_collection

api-client-listar: curl --location 'http://localhost:8090/api/client'

api-client-ver: curl --location 'http://localhost:8090/api/client/680bbca4a5f066639f14510c' \
--data ''

api-client-upload: curl --location 'http://localhost:8090/api/client/upload/680bbca4a5f066639f145114' \
--form 'file=@"/C:/Users/andres.jurado_pragma/Desktop/pngtree-led-tv-television-screen-vector-png-image_6673700.png"'

api-client-crear: curl --location 'http://localhost:8090/api/client' \
--header 'Content-Type: application/json' \
--data '{
    "nombre": "Nokia 9011",
    "precio": 1000,
    "categoria": {
        "id": "680bbca4a5f066639f145109",
        "nombre": "Deporte"
    }
}'

api-client-editar: curl --location --request PUT 'http://localhost:8090/api/client/680bbca4a5f066639f14510d' \
--header 'Content-Type: application/json' \
--data '    {
        "nombre": "Sony CS Camara HD Digital",
        "precio": 7800.89,
        "categoria": {
            "id": "680bbca4a5f066639f145108",
            "nombre": "Electronico"
        }
    }'

api-client-eliminar: curl --location --request DELETE 'http://localhost:8090/api/client/680bbca4a5f066639f14510d' \
--data ''    

