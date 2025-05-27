# **Proyecto: MediaVault Manager (sistema de renta y venta de películas y videojuegos)**

El proyecto consiste en la creación de una aplicación o sistema de aspecto administrativo para un plan de negocios de renta y venta de videojuegos, estilo Blockbuster. Se enfoca en llevar el control de clientes, operaciones, así como del registro de los productos.

## **Características Principales**

* Gestión de clientes (crear, consultar, historial de rentas/compras, descuentos)  
* Registro de operaciones (renta y compra de videojuegos)  
* Cálculo automático de fechas de devolución y aplicación de promociones  
* Consulta de inventario de videojuegos y películas  
* Generación de reportes y tickets en PDF  
* Funciones de acceso del Administrador (Login, Registro, Logout)

## **Herramientas Utilizadas (hasta el momento)**

* Figma: Empleado para la creación del prototipo del diseño de la interfaz del proyecto  
* Dropbox: Se creó y subió una carpeta con la tipografía, logo, y elementos gráficos usados en el prototipo  
* Loom: Usado para la grabación de un breve video explicativo sobre el proyecto
* Eclipse: Es el IDE que se emplea para el desarrollo del código de programación del sistema, el cual se escribe en el lenguaje de programación "Java"
* GitHub: Usado para publicar el código de programación del sistema, con quien acceda al link del repositorio

## **Breve Descripción de los Avances**

* Martes/27/mayo/2025:
* Se creó el diagrama del Modelo Entidad-Relación del sistema
* Se elaboró el patrón de arquitectura de software MVC (Modelo/Vista/Controlador) en el proyecto de Java en el IDE Eclipse
* Se terminó de programar la vista: Login
* Se avanzó la vista: Home
* Se autenticaron los usuarios y las contraseñas de tres admins desde una base de datos de MySQL en un servidor remoto en aiven.io
* Se implementó PreparedStatement para evitar SQL injection; para así mejorar la seguridad del sistema
* Se validó la autenticación de los tres amdins, encriptando las contraseñas con BCrypt, en caso de ser correcta; para así mejorar la seguridad del sistema
* Se dió acceso al admin a la vista: Home, en dado caso de que la autenticación de su usuario y contraseña sea correcta
* Se programó el botón: Cerrar Sesión, en la vista: Home; el cual si es presionado regresa al admin a la vista: Login

## **Enlace al Diseño del Sistema en Figma**

* https://www.figma.com/design/3PEkIHDUbOMhvKQtKb3XI2/MediaVault-Manager--Edici%C3%B3n-?m=auto&t=a1LyGdxeG3fwWwqc-1

## **Integrantes**
 
* Jorge Alejandro Mercado Guzmán
