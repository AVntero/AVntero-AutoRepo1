<%-- 
    Document   : ConsultaAlquiler
    Created on : 01/07/2016, 01:39:45 PM
    Author     : copi
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONSULTAR ALQUILER</title>
    </head>
    <body>
        <div>
          <table align="center">
                    <tr>
                  <td><a><img src="im/15.PNG" width="1350px" height="150px"></a></td>
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
                    <a href="MenuPrincipal.jsp" class="navbar-brand">IntiTours</a>
                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="ConsultarReservasRecepcionista.jsp"><span class="glyphicon glyphicon-home"></span>Consultar Reserva</a></li>
                        <li><a href="RegistroEntrega.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Entrega</a></li>
                        <li><a href="RegistroAlquiler.jsp"><span class="glyphicon glyphicon-home"></span>Registrar Reserva</a></li>
                     <li><a href="UsuarioServlet?accion=cerrarsesion"><span class="glyphicon glyphicon-home"></span>Cerrar Session</a></li>  
                    </ul>   
                </div>
            </div>        
        </nav>
         
            <div class="container">
                <div class="table table-bordered table-hover table-condensed">
                <table class="table table-striped">  
                     <tr class="active">
                    <td  colspan="4" align="center">LISTADO GENERAL DE ALQUILERES INTITOURS</td>
                </tr>
                <tr class="success">
                <th>CodigoAlquiler</th>
                <th>Nombre</th>
                 <th>Auto</th>
            </tr>
        
         <%-- start web service invocation --%><hr/>
    <%
    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Alquiler> result = port.listarGenAlquileres();
	for(services.Alquiler alq : result){
            
          
        %> 
        <tr>
        <td><%=alq.getCodigo()%></td>
    
         <td><%=alq.getClie().getNombre()%> <%=alq.getClie().getApellidos()%> </td>
         <td><%=alq.getPlaca().getModelo().getDescripcion()%>  
         <%=alq.getPlaca().getModelo().getMarca().getDescripcion()%> 
         </td>
        </tr>
         <%
            
            
        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
   
         </table>
    </div>
            </div>
       
    </body>
</html>
