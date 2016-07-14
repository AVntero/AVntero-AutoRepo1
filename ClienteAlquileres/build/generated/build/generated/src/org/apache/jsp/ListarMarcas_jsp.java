package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ListarMarcas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("            <link href=\"login.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ver de Marcas </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data target=\"#acolapsar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle Navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a href=\"MenuPrincipal.jsp\" class=\"navbar-brand\">IntiTours</a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"acolapsar\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"ListarMarcas.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Ver Autos por Marca</a></li>  \n");
      out.write("                          <li><a href=\"UsuarioServlet?accion=cerrarsesion\"><span class=\"glyphicon glyphicon-home\"></span>Cerrar Session</a></li>  \n");
      out.write("                    </ul>        \n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("        </nav>\n");
      out.write("       <div>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                 <tr>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Bugatti.jpg\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Cadillac.jpg\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Chevrolet.jpg\" width=\"200px\" height=\"200px\" ></a></td>\n");
      out.write("                     <td><a href=\"%\"><img src=\"marcas/Honda.jpg\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>               \n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Hyundai.jpg\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Isuzu.png\" width=\"200px\" height=\"200px\" ></a></td>\n");
      out.write("                     <td><a href=\"%\"><img src=\"marcas/Kia.jpg\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Lada.png\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Lexus.jpg\" width=\"200px\" height=\"200px\" ></a></td>\n");
      out.write("                     <td><a href=\"%\"><img src=\"marcas/Mahindra.png\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Maserati.png\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Mazda.jpg\" width=\"200px\" height=\"200px\" ></a></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Mercedes.png\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Morgan.jpg\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Nissan.jpg\" width=\"200px\" height=\"200px\" ></a></td>\n");
      out.write("                      <td><a href=\"%\"><img src=\"marcas/Rolls-Royce.png\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                  \n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Subaru.jpg\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                    <td><a href=\"%\"><img src=\"marcas/Suzuki.jpg\" width=\"200px\" height=\"200px\" ></a></td>\n");
      out.write("                  <td><a href=\"%\"><img src=\"marcas/Tesla.jpg\" width=\"200px\" height=\"200px\"></a></td>\n");
      out.write("                   <td><a href=\"%\"><img src=\"marcas/Toyota.jpg\" width=\"200px\"height=\"200px\" ></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
