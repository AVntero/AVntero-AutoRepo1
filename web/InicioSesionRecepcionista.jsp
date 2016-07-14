<%-- 
    Document   : InicioSesion
    Created on : 30/06/2016, 12:14:22 PM
    Author     : copi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="login.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
         <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-togle="collapse" data target="#acolapsar">
                        <span class="sr-only">Toggle Navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="MenuPrincipal.jsp" class="navbar-brand">IntiTours</a>
                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="ConsultaAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Alquiler</a></li>
                        <li><a href="ConsultarReservasRecepcionista.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Reserva</a></li>
                        <li><a href="RegistroEntrega.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Entrega</a></li>
                        <li><a href="RegistroAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Reserva</a></li>
                    </ul>
                    
                </div>
            </div>        
             
        </nav>
        <div class="jumbotron loginbox">
            <form action="UsuarioServlet">
            <input type="hidden" name="accion" value="inicior" />
            <table align="center">
                <tr>
                    <td colspan="2" class="text-center">LOGIN EMPLEADO</td>
                </tr>
            </table>
            <table>
                <tr>
                <p>Nombre de Usuario:</p><input type="text" name="txtNomUsr" placeholder="Ingrese Su nombre De Usuario" size="40px" value="" class="form-control"/>
                </tr>
                  
                <tr>
                    
                <p>Contraseña:</p><input type="password" name="txtPasswd" value=""placeholder="Ingrese Su Clave De Usuario" size="40px" class="form-control"/>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Iniciar Session" class="btn-success"/></td>
                </tr>
               </table>
        </form>
        ${err}
        </div>
         
          
        
    </body>
</html>
