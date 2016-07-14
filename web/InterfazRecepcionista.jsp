<%-- 
    Document   : InterfazEmpleado
    Created on : 13-jun-2016, 9:21:26
    Author     : copi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panel de Control</title>
    </head>   
        <body>
            <div>
          <table align="center">
                    <tr>
                  <td><a><img src="im/4.PNG" width="1350px" height="150px"></a></td>
                    </tr>
                </table>
           </div>
        <nav class="navbar navbar-default" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-togle="collapse" data target="#acolapsar">
                        <span class="sr-only">Toggle Navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="MenuPrincipal.jsp"><img src="imagenes/3.png" width="50px" title="Menu Principal"></a>   
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="MenuPrincipal.jsp"><img src="imagenes/3.png" width="50px" title="Menu Principal"></a></li>
                        <li><a href="ConsultaAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Alquiler</a></li>
                        <li><a href="ConsultarReservasRecepcionista.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Reserva</a></li>
                        <li><a href="RegistroEntrega.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Entrega</a></li>
                        <li><a href="RegistroAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Reserva</a></li>
                        <li><a href="InicioSesionCliente.jsp"><span class="glyphicon glyphicon-home"></span>Iniciar Cliente</a></li>
                        <li><a href="InicioSesionRecepcionista.jsp"><span class="glyphicon glyphicon-home"></span>Iniciar Empleado</a></li>     
                    </ul>  
                </div>
            </div>             
        </nav>      
         >
            <div class="container">
                <table class="table table-striped">
                    <tr class="active">
                        <td colspan="1" align="center">Mis Menu</td>
                    </tr>
                    <tr class="success">
                <td>
              <ul>
            <li>  Bienvenido,  ${emp.nombre}</li>
              </ul>
              <ul>
            <li><a href="ConsultaAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Alquileres</a></li>
              </ul>
              <ul>
            <li><a href="ConsultarReservasRecepcionista.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Reservas</a></li>
            </ul>
              <ul>
             <li><a href="RegistroEntrega.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Entregas</a></li>
            </ul>
              <ul>
             <li><a href="RegistroAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Alquileres</a></li> 
             </ul> 
                </td>
             </tr>
             <tr class="active">
                  <td colspan="1" align="center"><a href="">Novedades</a></td>      
              </tr>
              <tr class="success">
                   <td>
                       <ul>
                           <li><a href="ListarMarcas.jsp"><span class="glyphicon glyphicon-home"></span>Ver Marcas</a></li>    
                       </ul>
                        <ul>
                            <li><a href="listarModelos.jsp"><span class="glyphicon glyphicon-home"></span>Ver Modelos</a></li>    
                       </ul>
                       <ul>
                             <li><a href="UsuarioServlet?accion=cerrarsesion"><span class="glyphicon glyphicon-home"></span>Cerrar Sessión</a></li> 
                       </ul>
                   </td>  
              </tr>
             </table>
        </div>
    </body>
</html>
