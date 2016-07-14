package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      \n");
      out.write("        <title>REGISTRO DE USUARIO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-togle=\"collapse\" data target=\"#acolapsar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle Navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                     <a href=\"MenuPrincipal.jsp\"><img src=\"imagenes/3.png\" width=\"50px\" title=\"Menu Principal\"></a> \n");
      out.write("                    <a href=\"MenuPrincipal.jsp\" class=\"navbar-brand\">IntiTours</a>  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                         <li><a href=\"InicioSesionCliente.jsp\"><span class=\"glyphicon glyphicon-home\"></span>Iniciar Cliente</a></li>      \n");
      out.write("                    </ul>      \n");
      out.write("                </div>\n");
      out.write("            </div>        \n");
      out.write("             \n");
      out.write("        </nav>\n");
      out.write("        <form action=\"UsuarioServlet\">\n");
      out.write("            <div class=\"jumbotron loginbox\">\n");
      out.write("               <input type=\"hidden\" name=\"accion\" value=\"agregar\" />\n");
      out.write("                <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" class=\"text-center\">REGISTRATE EN INTITOURS</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("              <p>Nombre: </p><input type=\"text\" name=\"txtNombre\" value=\"\"  placeholder=\"Ingrese Su nombre \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("              <p>Apellidos: </p><input type=\"text\" name=\"txtApellidos\" value=\"\"  placeholder=\"Ingrese Sus Apellidos \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <tr>DNI(Si no posee ingresar carnet extranjería) : </tr>\n");
      out.write("                  <p>DNI: </p><input type=\"text\" name=\"txtDNI\" value=\"\"  placeholder=\"Ingrese Su DNI \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("               <p>Brevete: </p><input type=\"text\" name=\"txtBrevete\" value=\"\"  placeholder=\"Ingrese Su Nro De Brevete \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <p>Carnet de Extrangeria </p><input type=\"text\" name=\"txtCarnetEx\" value=\"\"  placeholder=\"Ingrese Su carnet De Extrangeria \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <p>Nombre de Usuario </p><input type=\"text\" name=\"txtUsuario\" value=\"\"  placeholder=\"Ingrese Su Nombre De Usuario \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <p>Contraseña </p><input type=\"password\" name=\"txtContrasena\" value=\"\"  placeholder=\"Ingrese Su Clave De Usuario \" size=\"40px\" class=\"form-control\"/>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                  <td></td>\n");
      out.write("                 <td><input type=\"submit\" value=\"Registrarse\"  class=\"btn-info\" /></td>\n");
      out.write("                </tr>\n");
      out.write("        </table>   \n");
      out.write("            </div>        \n");
      out.write("        </form>     \n");
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
