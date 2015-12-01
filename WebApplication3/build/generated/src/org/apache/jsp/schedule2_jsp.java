package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.tablebean;
import java.util.List;
import model.table2dao;

public final class schedule2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <title>Schedule</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/reset.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/grid_12.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/slider.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/font.css\">\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"images/icon.png\"/>\n");
      out.write("    <script src=\"js/jquery-1.7.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("    <script src=\"js/tms-0.4.1.js\"></script>\n");
      out.write("    <script>\n");
      out.write("\t\t$(document).ready(function(){\t\t\t\t   \t\n");
      out.write("\t\t\t$('.slider')._TMS({\n");
      out.write("\t\t\t\tshow:0,\n");
      out.write("\t\t\t\tpauseOnHover:true,\n");
      out.write("\t\t\t\tprevBu:'.prev',\n");
      out.write("\t\t\t\tnextBu:'.next',\n");
      out.write("\t\t\t\tplayBu:false,\n");
      out.write("\t\t\t\tduration:800,\n");
      out.write("\t\t\t\tpreset:'fade',\n");
      out.write("\t\t\t\tpagination:true,\n");
      out.write("\t\t\t\tpagNums:false,\n");
      out.write("\t\t\t\tslideshow:7000,\n");
      out.write("\t\t\t\tnumStatus:false,\n");
      out.write("\t\t\t\tbanners:false,\n");
      out.write("\t\t\t\twaitBannerAnimation:false,\n");
      out.write("\t\t\t\tprogressBar:false\n");
      out.write("\t\t\t})\t\t\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!--[if lt IE 8]>\n");
      out.write("       <div style=' clear: both; text-align:center; position: relative;'>\n");
      out.write("         <a href=\"http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode\">\n");
      out.write("           <img src=\"http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg\" border=\"0\" height=\"42\" width=\"820\" alt=\"You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today.\" />\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    <![endif]-->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("   \t\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("    \t<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/ie.css\">\n");
      out.write("\t<![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("            \n");

//UserBean user = new UserBean();
table2dao dao = new table2dao();
List<tablebean> userList = dao.getAll();
//Iterator<UserBean> itr = userList.iterator();

      out.write("\n");
      out.write("  <div class=\"main\">\n");
      out.write("  <!--==============================header=================================-->\n");
      out.write("    <header>\n");
      out.write("        <h1><a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\"></a></h1>\n");
      out.write("        <nav>  \n");
      out.write("            <div id=\"slide\">\t\t\n");
      out.write("                <div class=\"slider\">\n");
      out.write("                    <ul class=\"items\">\n");
      out.write("                        <li><img src=\"images/slider-1.jpg\" alt=\"\" /></li>\n");
      out.write("                        <li><img src=\"images/slider-2.jpg\" alt=\"\" /></li>\n");
      out.write("                        <li><img src=\"images/slider-3.jpg\" alt=\"\" /></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\t\n");
      out.write("                <a href=\"#\" class=\"prev\"></a><a href=\"#\" class=\"next\"></a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <li><a href=\"index.html\" class=\"clr-1\">Home</a></li>\n");
      out.write("                <li><a href=\"about.html\" class=\"clr-2\">About</a></li>\n");
      out.write("                <li class=\"current\"><a href=\"schedule.jsp\" class=\"clr-3\">Schedule</a></li>\n");
      out.write("                <li><a href=\"gallery.html\" class=\"clr-4\">Gallery</a></li>\n");
      out.write("                <li><a href=\"contacts.html\" class=\"clr-5\">Contacts</a></li>\n");
      out.write("            </ul>\n");
      out.write("         </nav>\n");
      out.write("    </header>   \n");
      out.write("  <!--==============================content================================-->\n");
      out.write("    <table border=\"1\" align=\"center\" >\n");
      out.write("    <caption> user information</caption>\n");
      out.write("<tr>\n");
      out.write("<th>day</th>\n");
      out.write("<th>First</th>\n");
      out.write("<th>second</th>\n");
      out.write("<th>third</th>\n");
      out.write("<th>fourth</th>\n");
      out.write("<th>fifth</th>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");

/*while(itr.hasNext())
{
System.out.println(user.getId());*/
for (tablebean user : userList) {

      out.write("\n");
      out.write("<td>");
      out.print(user.getDay());
      out.write("</td>\n");
      out.write("<td>");
      out.print(user.getFirst());
      out.write("</td>\n");
      out.write("<td>");
      out.print(user.getSecond());
      out.write("</td>\n");
      out.write("<td>");
      out.print(user.getThird());
      out.write("</td>\n");
      out.write("<td>");
      out.print(user.getFourth());
      out.write("</td>\n");
      out.write("<td>");
      out.print(user.getFifth());
      out.write("</td>\n");
      out.write("<td></td>\n");
      out.write("<td></td>\n");
      out.write("\n");
      out.write("</tr>\n");

}
//}

      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("            <!--==============================footer=================================-->\n");
      out.write("            <footer>\n");
      out.write("                <p>© 2012 Art School</p>\n");
      out.write("                <p>Website Template by <a class=\"link\" href=\"http://www.templatemonster.com/\" target=\"_blank\" rel=\"nofollow\">www.templatemonster.com</a></p>\n");
      out.write("            </footer>\t  \n");
      out.write("          </div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("    </section>    \n");
      out.write("   </div>      \n");
      out.write("</body>\n");
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
