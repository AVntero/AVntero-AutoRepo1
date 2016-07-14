package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>¡ALQUILA TU AUTO EN INTITOURS!</title>\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("         <div>\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                  <td><a><img src=\"im/16.PNG\" width=\"1400px\" height=\"300px\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("           </div>\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-togle=\"collapse\" data target=\"#acolapsar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle Navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                     <a href=\"MenuPrincipal.jsp\" class=\"navbar-brand\">IntiTours</a> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"MenuPrincipal.jsp\"><img src=\"im/3.png\" width=\"10px\" title=\"Menu Principal\"></a></li>\n");
      out.write("                        <li><a href=\"ConsultaAlquiler.jsp\">Consultar Alquiler</a></li>\n");
      out.write("                        <li><a href=\"ConsultarReservasRecepcionista.jsp\">Consultar Reserva</a></li>\n");
      out.write("                        <li><a href=\"RegistroEntrega.jsp\">Registrar Entrega</a></li>\n");
      out.write("                        <li><a href=\"RegistroAlquiler.jsp\">Registrar Reserva</a></li>\n");
      out.write("                     </br>\n");
      out.write("                        </br>\n");
      out.write("                       <a href=\"InicioSesionCliente.jsp\"><input type=\"submit\" name=\"Login Cliente\" value=\"Login Cliente\" class=\"btn-info\"/></a>\n");
      out.write("                       <a href=\"InicioSesionRecepcionista.jsp\"><input type=\"submit\" name=\"Login Cliente\" value=\"Login Empleado\" class=\"btn-success\"/></a>   \n");
      out.write("                          \n");
      out.write("                    </ul>  \n");
      out.write("                </div>\n");
      out.write("            </div>      \n");
      out.write("        </nav> \n");
      out.write("        <div>\n");
      out.write("               \n");
      out.write("         <div class=\"container\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr class=\"active\">\n");
      out.write("                  <td colspan=\"1\" align=\"center\"><a>Realiza tus Registros en Intoturs</a></td>      \n");
      out.write("              </tr>\n");
      out.write("              <tr class=\"success\">\n");
      out.write("                   <td>\n");
      out.write("                       <ul>\n");
      out.write("                           \n");
      out.write("                           <li><a href=\"RegistroUsuario.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Registrate</a></li>    \n");
      out.write("                       </ul>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"ListarMarcas.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Ver Marcas</a></li>    \n");
      out.write("                       </ul>\n");
      out.write("                          <ul>\n");
      out.write("                              <li><a href=\"listarModelos.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Ver Modelos</a></li>    \n");
      out.write("                       </ul>\n");
      out.write("                       <ul>\n");
      out.write("                             <li><a href=\"UsuarioServlet?accion=cerrarsesion\"><span class=\"glyphicon glyphicon-home\"></span>Cerrar Sessión</a></li> \n");
      out.write("                       </ul>               \n");
      out.write("                   </td>    \n");
      out.write("              </tr>\n");
      out.write("              <tr class=\"active\">\n");
      out.write("                  <td colspan=\"1\" align=\"center\"><a href=\"\">Novedades</a></td>      \n");
      out.write("              </tr>\n");
      out.write("              <tr class=\"danger\">\n");
      out.write("                  <td>\n");
      out.write("                      <ul>\n");
      out.write("                          <li<a href=\"\"><img src=\"\" width=\"200px\" title=\"Menu Principal\"></a></li>\n");
      out.write("                           <li<a href=\"\"><img src=\"im/images (2).jpg\" width=\"650px\" title=\"Menu Principal\"></a></li>\n");
      out.write("                      </ul>\n");
      out.write("                         <ul>\n");
      out.write("            <li> ¡Alquila un automóvil en Intitours!</li>\n");
      out.write("            <li><a href=\"InicioSesionCliente.jsp\">Iniciar Sesión</a></li>       \n");
      out.write("        </ul>  \n");
      out.write("                  </td>\n");
      out.write("              </tr>\n");
      out.write("             </table>\n");
      out.write("               <h4>¿Necesitas Transporte?</h4>\n");
      out.write("            <h4>¡Alquila un Auto en Intitours!</h4>  \n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${respo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
