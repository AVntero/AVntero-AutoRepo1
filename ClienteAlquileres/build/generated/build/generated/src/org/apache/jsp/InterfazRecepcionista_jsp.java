package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InterfazRecepcionista_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Panel de Control</title>\n");
      out.write("    </head>   \n");
      out.write("        <body>\n");
      out.write("            <div>\n");
      out.write("          <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                  <td><a><img src=\"im/4.PNG\" width=\"1350px\" height=\"150px\"></a></td>\n");
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
      out.write("                    <a href=\"MenuPrincipal.jsp\"><img src=\"imagenes/3.png\" width=\"50px\" title=\"Menu Principal\"></a>   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"MenuPrincipal.jsp\"><img src=\"imagenes/3.png\" width=\"50px\" title=\"Menu Principal\"></a></li>\n");
      out.write("                        <li><a href=\"ConsultaAlquiler.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Consultar Alquiler</a></li>\n");
      out.write("                        <li><a href=\"ConsultarReservasRecepcionista.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Consultar Reserva</a></li>\n");
      out.write("                        <li><a href=\"RegistroEntrega.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Registrar Entrega</a></li>\n");
      out.write("                        <li><a href=\"RegistroAlquiler.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Registrar Reserva</a></li>\n");
      out.write("                        <li><a href=\"InicioSesionCliente.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Iniciar Cliente</a></li>\n");
      out.write("                        <li><a href=\"InicioSesionRecepcionista.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Iniciar Empleado</a></li>     \n");
      out.write("                    </ul>  \n");
      out.write("                </div>\n");
      out.write("            </div>             \n");
      out.write("        </nav>      \n");
      out.write("         >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr class=\"active\">\n");
      out.write("                        <td colspan=\"1\" align=\"center\">Mis Menu</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr class=\"success\">\n");
      out.write("                <td>\n");
      out.write("              <ul>\n");
      out.write("            <li>  Bienvenido,  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${emp.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("              </ul>\n");
      out.write("              <ul>\n");
      out.write("            <li><a href=\"ConsultaAlquiler.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Consultar Alquileres</a></li>\n");
      out.write("              </ul>\n");
      out.write("              <ul>\n");
      out.write("            <li><a href=\"ConsultarReservasRecepcionista.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Consultar Reservas</a></li>\n");
      out.write("            </ul>\n");
      out.write("              <ul>\n");
      out.write("             <li><a href=\"RegistroEntrega.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Registrar Entregas</a></li>\n");
      out.write("            </ul>\n");
      out.write("              <ul>\n");
      out.write("             <li><a href=\"RegistroAlquiler.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Registrar Alquileres</a></li> \n");
      out.write("             </ul> \n");
      out.write("                </td>\n");
      out.write("             </tr>\n");
      out.write("             <tr class=\"active\">\n");
      out.write("                  <td colspan=\"1\" align=\"center\"><a href=\"\">Novedades</a></td>      \n");
      out.write("              </tr>\n");
      out.write("              <tr class=\"success\">\n");
      out.write("                   <td>\n");
      out.write("                       <ul>\n");
      out.write("                           <li><a href=\"ListarMarcas.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Ver Marcas</a></li>    \n");
      out.write("                       </ul>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"listarModelos.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Ver Modelos</a></li>    \n");
      out.write("                       </ul>\n");
      out.write("                       <ul>\n");
      out.write("                             <li><a href=\"UsuarioServlet?accion=cerrarsesion\"><span class=\"glyphicon glyphicon-home\"></span>Cerrar Sessión</a></li> \n");
      out.write("                       </ul>\n");
      out.write("                   </td>  \n");
      out.write("              </tr>\n");
      out.write("             </table>\n");
      out.write("        </div>\n");
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
