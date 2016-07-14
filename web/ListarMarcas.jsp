<%-- 
    Document   : ListarAuto1
    Created on : 05/07/2016, 01:27:29 AM
    Author     : copi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
            <link href="login.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver de Marcas </title>
    </head>
    <body>
       <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data target="#acolapsar">
                        <span class="sr-only">Toggle Navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="MenuPrincipal.jsp" class="navbar-brand">IntiTours</a>
                    
                </div>
                <div class="collapse navbar-collapse" id="acolapsar">
                    <ul class="nav navbar-nav">
                        <li><a href="ListarMarcas.jsp"><span class="glyphicon glyphicon-home"></span>Ver Autos por Marca</a></li>  
                          <li><a href="UsuarioServlet?accion=cerrarsesion"><span class="glyphicon glyphicon-home"></span>Cerrar Session</a></li>  
                    </ul>        
                </div>
            </div>        
        </nav>
       <div>
            <table align="center">
                 <tr>
                    <td><a href="%"><img src="marcas/Bugatti.jpg" width="200px"height="200px" ></a></td>
                    <td><a href="%"><img src="marcas/Cadillac.jpg" width="200px" height="200px"></a></td>
                    <td><a href="%"><img src="marcas/Chevrolet.jpg" width="200px" height="200px" ></a></td>
                     <td><a href="%"><img src="marcas/Honda.jpg" width="200px"height="200px" ></a></td>
                </tr>
                 <tr>               
                    <td><a href="%"><img src="marcas/Hyundai.jpg" width="200px" height="200px"></a></td>
                    <td><a href="%"><img src="marcas/Isuzu.png" width="200px" height="200px" ></a></td>
                     <td><a href="%"><img src="marcas/Kia.jpg" width="200px"height="200px" ></a></td>
                    <td><a href="%"><img src="marcas/Lada.png" width="200px" height="200px"></a></td>
                </tr>
                 <tr>
                    <td><a href="%"><img src="marcas/Lexus.jpg" width="200px" height="200px" ></a></td>
                     <td><a href="%"><img src="marcas/Mahindra.png" width="200px"height="200px" ></a></td>
                    <td><a href="%"><img src="marcas/Maserati.png" width="200px" height="200px"></a></td>
                    <td><a href="%"><img src="marcas/Mazda.jpg" width="200px" height="200px" ></a></td>
                </tr>
                 <tr>
                    <td><a href="%"><img src="marcas/Mercedes.png" width="200px"height="200px" ></a></td>
                    <td><a href="%"><img src="marcas/Morgan.jpg" width="200px" height="200px"></a></td>
                    <td><a href="%"><img src="marcas/Nissan.jpg" width="200px" height="200px" ></a></td>
                      <td><a href="%"><img src="marcas/Rolls-Royce.png" width="200px"height="200px" ></a></td>
                </tr>
                  <tr>
                  
                    <td><a href="%"><img src="marcas/Subaru.jpg" width="200px" height="200px"></a></td>
                    <td><a href="%"><img src="marcas/Suzuki.jpg" width="200px" height="200px" ></a></td>
                  <td><a href="%"><img src="marcas/Tesla.jpg" width="200px" height="200px"></a></td>
                   <td><a href="%"><img src="marcas/Toyota.jpg" width="200px"height="200px" ></a></td>
                </tr>
                <tr>
                    
                </tr>
            </table>
      </div>
    </body>
</html>

