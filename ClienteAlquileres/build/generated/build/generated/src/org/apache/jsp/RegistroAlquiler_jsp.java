package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroAlquiler_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <link href=\"bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registar Alquiler</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("          <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                  <td><a><img src=\"im/15.PNG\" width=\"1350px\" height=\"150px\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("           </div>\n");
      out.write("               <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-togle=\"collapse\" data target=\"#acolapsar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle Navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"MenuPrincipal.jsp\" class=\"navbar-brand\">IntiTours</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"ConsultaAlquiler.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Consultar Alquiler</a></li>\n");
      out.write("                        <li><a href=\"ConsultarReservasRecepcionista.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Consultar Reserva</a></li>\n");
      out.write("                        <li><a href=\"RegistroEntrega.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Registrar Entrega</a></li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-home\"></span>Bienvenido ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emp.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                         <li><a href=\"UsuarioServlet?accion=cerrarsesion\"><span class=\"glyphicon glyphicon-home\"></span>Cerrar Session</a></li>  \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>          \n");
      out.write("        </nav>\n");
      out.write("        </div>  \n");
      out.write("        <div class=\"jumbotron loginbox\">\n");
      out.write("                  <form action=\"UsuarioServlet\">\n");
      out.write("                    <table>\n");
      out.write("                       <input type=\"hidden\" name=\"accion\" value=\"buscar\" />\n");
      out.write("                  <tr>\n");
      out.write("                     <p>Buscar por Nombre De Usuario</p><input type=\"text\" name=\"txtUsuarioBuscar\" placeholder=\"Busque aquí al cliente\" size=\"45px\" class=\"form-control\"/>\n");
      out.write("                 <td>\n");
      out.write("                     <input  type=\"submit\" value=\"Buscar Cliente\" class=\"btn-success\"/>                    \n");
      out.write("                 </td>\n");
      out.write("             </tr> \n");
      out.write("             <tr>\n");
      out.write("                 <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cli.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                 <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cli.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                 <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cli.apellidos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                 <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cli.usuario.nomusr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("            </table>  \n");
      out.write("             </form>\n");
      out.write("          </div>\n");
      out.write("             <div class=\"jumbotron loginbox\">\n");
      out.write("        <form action=\"AlquilerServlet\">\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"alquilar\" />\n");
      out.write("        <table>    \n");
      out.write("            <tr>\n");
      out.write("            <p>Ingrese Auto</p><select name=\"cboAuto\">\n");
      out.write("                        ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Auto> result = port.operation();
         for(services.Auto au : result){
   
         
      out.write("\n");
      out.write("         <option value=\"");
      out.print(au.getPlaca());
      out.write("\"> \n");
      out.write("         ");
      out.print(au.getModelo().getDescripcion());
      out.write("\n");
      out.write("         ");
      out.print(au.getNombre());
      out.write("\n");
      out.write("         </option>\n");
      out.write("                        ");

         
         }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write(" </select>\n");
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write(" <td>\n");
      out.write("     <p><input type=\"submit\" value=\"Registar Alquilar\"  class=\"btn-success\" />\n");
      out.write(" </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <p>Cliente:</p><input type=\"text\" name=\"txtCliente\" value=\"\"  placeholder=\"Ingrese Cliente\" size=\"40px\" class=\"form-control\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resul}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                    ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	services.ServicioListar_Service service = new services.ServicioListar_Service();
	services.ServicioListar port = service.getServicioListarPort();
	// TODO process result here
	java.util.List<services.Cliente> result = port.listarCliente();
	for(services.Cliente cl : result){
        
          
      out.write("\n");
      out.write("          <tr>\n");
      out.write("              <td>");
      out.print(cl.getCodigo());
      out.write("</td>\n");
      out.write("              <td>");
      out.print(cl.getNombre());
      out.write("</td>\n");
      out.write("               <td>");
      out.print(cl.getApellidos());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(cl.getUsuario().getNomusr());
      out.write("</td>\n");
      out.write("          </tr>            \n");
      out.write("                    ");

        }
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("            </table>\n");
      out.write("                 </form>\n");
      out.write("             </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
