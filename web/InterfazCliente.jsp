<%-- 
    Document   : InterfazCliente
    Created on : 01/07/2016, 10:51:43 AM
    Author     : copi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link href="bootstrap.css" rel="stylesheet" type="text/css"/>
            <link href="login.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Intranet cliente</title>
  <script>
   $(function() {
  var date = $('#datepicker').datepicker({ dateFormat: 'dd/mm/yy' }).val();
  });
  </script>
    </head>
    <body>
         <div>
                <table align="center">
                    <tr>
                  <td><a><img src="im/banner-autos.jpg" width="1350px" height="150px" title="Menu Principal"></a></td>
                    </tr>
                </table>
           </div>
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
                          <li><a href="#"><span class="glyphicon glyphicon-home"></span>Bienvenido ${cli.nombre}</a></li>
                          <li><a href="UsuarioServlet?accion=cerrarsesion"><span class="glyphicon glyphicon-home"></span>Cerrar Session</a></li>  
                    </ul>        
                </div>
            </div>        
        </nav>
          
            <div class="jumbotron loginbox">
        <form action="ReservaServlet">
        <input type="hidden" name="accion" value="reservar" />
        <table align="center">
            <td colspan="2"><li>   Bienvenido,  ${emp.nombre}</li></td> 
              ${res}
              ${err}
              <tr>
                <td>
            <select name="cboAuto">
                        <%-- start web service invocation --%><hr/>
    <%
    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Auto> result = port.operation();
         for(services.Auto au : result){
   
         %>
         <option value="<%=au.getPlaca()%>"> 
         <%=au.getModelo().getDescripcion()%>
         <%=au.getNombre()%>
         </option>
                        <%
         
         }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
 </select>
 </td>

   <td><input type="text" id="datepicker" name="calFecha"></td>

 <tr>
     <td>
         <td><input type="submit" value="Reservar" class="btn-info" />
     </td>   
 </tr>       
          </table>
         </form>
        </div>
   <div class="container">
                <table class="table table-striped">
                    <tr class="active">
                  <td colspan="1" align="center"><a>MI MENU</a></td>      
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
              <tr class="active">
                  <td colspan="1" align="center"><a href="">Novedades</a></td>      
              </tr>
              <tr class="danger">
                  <td>
                      <ul>
                          <li<a href=""><img src="im/MISTURA.png" width="200px" title="Menu Principal"></a></li>
                           <li<a href=""><img src="im/images (2).jpg" width="650px" title="Menu Principal"></a></li>
                      </ul>
                  </td>
              </tr>
             </table>
        </div>
    </body>
</html>
