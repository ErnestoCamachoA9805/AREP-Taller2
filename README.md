# AREP-Taller2
> ## Autor
>> Ernesto Camacho Arroyave
>> 6 de septiembre 2021
>>
> ## Ejercicio 1
>> La clase usada para el Ejercicio 1 es la URLScanner muestra en consola el protocolo, autoridad, host, puerto, path, query, archivo y ref para ejecutarse debe usarse
>> - mvn exec:java -Dexec.mainClass="edu.escuelaing.Taller.URL.URLScanner"
>>
> ## Ejercicio 2
>> La clase usada para el Ejercicio 2 es la URLReader esta accepta por consola un String de la URL que se va a escanear linea por linea y genera un archivo en el root del proyecto llamado resultado.html para ejecutarse debe usarse
>>  - mvn exec:java -Dexec.mainClass="edu.escuelaing.Taller.URL.URLReader"
>>
> ## Ejercicio 3
>> Para este caso se usan dos clases el cliente llamado ClientSquare y el servidor llamado ServerSquare la informacion se envia desde el cliente y el servidor responde en la consola del cliente los comando para correr son
>> - mvn exec:java -Dexec.mainClass="edu.escuelaing.Taller.SquareCal.ServerSquare"
>> - mvn exec:java -Dexec.mainClass="edu.escuelaing.Taller.SquareCal.ClientSqaure"
>>
>> Seguido eso, la aplicacion recibe los numeros desde consola y los retorna por consola
>>
> ## Reto 1
>> Para el reto se uso una clase HttpServer que recibe el path de la URL y busca dentro de los archivos estaticos.La pagina para buscar es el "/index.html" retorna una imagen, texto plano y un boton a una pagina que usa bootstrap
>>
>> Link de heroku: https://httpserver-arep.herokuapp.com/index.html
>>
>> Si se desea correr de manera local se usa 
>> - mvn exec:java -D"exec.mainClass"="edu.escuelaing.Taller.httpServer.HttpServer"

