# microservice_vise
Es necesario el ejecutar el projecto EurekaServer desde la parte del main para levantar el servidor.
Iniciar clase principal del projecto Eureka server, observando el archivo application.properties, en el cual esta la ruta para acceder a spring eureka.
Ingresar la siguiente url para acceder a eureka server: http://localhost:8761 (tomando en cuenta el puerto asignado en el archivo properties del projecto eureka).

Es necesario que ambos projectos esten activos, por lo cual tienen que estar en ejecucion, DetalleFactura y Encabezado factura, ambos ejecutados desde su archivo principal.

Al realizar la prueba de los EndPoints, necesariamente tienen que estar los 3 projectos ejecutandose a la par. Cada projecto esta asignado a un puerto diferente mediante
el archivo application.properties.
