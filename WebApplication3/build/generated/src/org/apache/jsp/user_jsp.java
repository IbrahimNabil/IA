package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("<form method=\"POST\" action=\"servletcontrollerApp\" name=\"frmAddUser\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"insert\" />\n");
      out.write("<p><b>Add New Record</b></p>\n");
      out.write("  Child Name : \n");
      out.write("        <input type=\"text\" name=\"child\" value=\"\" /><br>\n");
      out.write("        Parent Name :  \n");
      out.write("        <input type=\"text\" name=\"first\" placeholder=\"karim\" />\n");
      out.write("        <input type=\"text\" name=\"last\" placeholder=\"karim\" />\n");
      out.write("        <br>\n");
      out.write("        Age : \n");
      out.write("        <input type=\"text\" name=\"age\" value=\"\" /><br>\n");
      out.write("        Parent Mobile : \n");
      out.write("        <input type=\"text\" name=\"mobile\" value=\"\" /><br>\n");
      out.write("        Address :\n");
      out.write("        <input type=\"text\" name=\"address\" value=\"\" /><br>\n");
      out.write("        User Name :\n");
      out.write("        <input type=\"text\" name=\"user\" value=\"\" /><br>\n");
      out.write("        Password : \n");
      out.write("        <input type=\"password\" name=\"pass\" value=\"\" /><br>\n");
      out.write("        re-enter Password :\n");
      out.write("        <input type=\"text\" name=\"rpass\" value=\"\" /><br>\n");
      out.write("        Level : \n");
      out.write("        <select name=\"level\">\n");
      out.write("            <option>KG1</option>\n");
      out.write("            <option>KG2</option>\n");
      out.write("        </select>\n");
      out.write("        Child Skills : \n");
      out.write("        <textarea name=\"skills\" rows=\"4\" cols=\"20\">\n");
      out.write("        </textarea><br>\n");
      out.write("        Diseases : \n");
      out.write("        <textarea name=\"diseases\" rows=\"4\" cols=\"20\">\n");
      out.write("        </textarea>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"submit\" />\n");
      out.write("</form>\n");
      out.write("<p><a href=\"servletcontrollerApp?action=listUser\">View-All-Records</a></p>\n");
      out.write("</body>\n");
      out.write("   \n");
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
