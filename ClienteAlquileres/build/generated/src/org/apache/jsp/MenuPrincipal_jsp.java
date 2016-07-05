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
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>¡Alquila un Auto en Intitours!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <table align=\"center\">\n");
      out.write("              <tr>\n");
      out.write("                  <td><a href=\"RegistarUsuario.jsp\"><img src=\"imagenes/registrar.jpg\" width=\"250px\"  title=\"Regsitar Usuario\"></a></td>           \n");
      out.write("              </tr>\n");
      out.write("          </table>\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        <div>\n");
      out.write("            <table class=\"tablaDatos\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"MenuPrincipal.jsp\"><img src=\"imagenes/logo0.png\" width=\"250px\" title=\"Menu Principal\"></a></td>\n");
      out.write("                    <td><a href=\"ListarAuto.jsp\"><img src=\"imagenes/logo4.png\" width=\"250px\" title=\"Listado de Autos\"></a></td>\n");
      out.write("                    <td><a href=\"InicioSesionCliente.jsp\"><img src=\"imagenes/logo5.png\" width=\"250px\" title=\"Login\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table align=\"center\">\n");
      out.write("             <tr>\n");
      out.write("              <td><font size=\"30px\"><h4>¡Alquila Auto en Intitours...! !Ya...!</h4> </font>  </td>\n");
      out.write("                </tr>\n");
      out.write("                  </table>   \n");
      out.write("      </div>\n");
      out.write("    </body>       \n");
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
