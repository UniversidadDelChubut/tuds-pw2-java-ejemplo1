<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página inicial</title>
    </head>
    <body>
        <h1>Secciones disponibles</h1>
        
        ${persona.apellido} - ${persona.nombre}
    <c:if test="${persona.mayor}">
        <p style="color: red">SECCION PARA ADULTOS</p>
    </c:if>
        
        <ul>
            <li><a href="/ejemplo1/productos">Catálogo de productos</a></li>
            <li><a href="/ejemplo1/ventas">Ventas</a></li>
            <li><a href="/ejemplo1/contacto">Contacto</a></li>
        </ul>
    </body>
</html>
