package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>R & D</title>\n");
      out.write("<style>\n");
      out.write("*{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav h1{\n");
      out.write("  font-size: 30px;\n");
      out.write("  display: flex;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 15px;\n");
      out.write("  left: 20px;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("#menu{\n");
      out.write("  padding-top: 20px;\n");
      out.write("  margin-right: 20px;\n");
      out.write("  /* border: 2px solid red; */\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav div a{\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: black;\n");
      out.write("  font-weight: bold;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("nav div a:hover{\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".mid{\n");
      out.write("  width: 100%;\n");
      out.write("  height: 400px;\n");
      out.write("  background: url(https://images.unsplash.com/photo-1546213290-e1b492ab3eee?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=967&q=80);\n");
      out.write("  text-align: center;\n");
      out.write("  background-color:rgba(153, 172, 192, 0.63);\n");
      out.write("  background-position: center;\n");
      out.write("}\n");
      out.write("#text{\n");
      out.write("  padding-top: 50px;\n");
      out.write("  padding-bottom: 166px;\n");
      out.write("  font-size: 40px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: rgba(255, 255, 255, 0.966);\n");
      out.write("  background-color: rgba(0, 0, 0, 0.466);\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("#function{\n");
      out.write("  width: 100%;\n");
      out.write("  /* height: 400px; */\n");
      out.write("  background-color: rgba(0, 0, 0, 0.418);\n");
      out.write("\n");
      out.write("}\n");
      out.write("#function section{\n");
      out.write("  display: flex;\n");
      out.write("  flex-direction: column;\n");
      out.write("  text-align: center;\n");
      out.write("  margin-right: 300px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("#function section button{\n");
      out.write("    width: 30vw;\n");
      out.write("   margin-bottom: 20px;\n");
      out.write("   margin-left: 320px;\n");
      out.write("  padding: 10px;\n");
      out.write("  background-color: #fff;\n");
      out.write("  border: 2px solid black;\n");
      out.write("  border-radius: 30px 0px 30px 0px;\n");
      out.write("\n");
      out.write("  \n");
      out.write("}\n");
      out.write("#function section button:hover{\n");
      out.write(" transform: scale(1.1);\n");
      out.write(" background-color: rgba(83, 172, 255, 0.911);\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#function section button{\n");
      out.write("\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 20px;\n");
      out.write("  color: black;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("#things{\n");
      out.write("  \n");
      out.write("  margin-bottom: 50px;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("#things h1{\n");
      out.write("  font-size: 50px;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer{\n");
      out.write("  height: 200px;\n");
      out.write("  background-color: rgb(0, 0, 0);\n");
      out.write("}\n");
      out.write("\n");
      out.write("footer{\n");
      out.write("color: white;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#rnd{\n");
      out.write("  /* border: 2px solid red; */\n");
      out.write("  padding-top: 80px;\n");
      out.write("  align-items: center;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("#name{\n");
      out.write("   display: flex;\n");
      out.write("   position: absolute;\n");
      out.write("   right: 0;\n");
      out.write("   flex-direction: column;\n");
      out.write("   padding-top: 55px;\n");
      out.write("   padding-right: 30px;\n");
      out.write("   align-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav{\n");
      out.write("background-color: lightpink;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 70px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <nav>\n");
      out.write("    <div class=\"contain\">\n");
      out.write("      <h1> R & D</h1>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("    <a href=\"home.jsp\">Home</a>\n");
      out.write("    <a href=\"register.jsp\">Register</a>\n");
      out.write("    <a href=\"allproducts.jsp\">Products</a>\n");
      out.write("    <a href=\"customerList.jsp\">Customers</a>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("<div class=\"mid\">\n");
      out.write("  <div id=\"text\">\n");
      out.write("  <h1>--The Store X--</h1>\n");
      out.write("  <h1>Recent and Decent!!</h1>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"function\">\n");
      out.write("  <div style=\"height: 40px;\"></div>\n");
      out.write("  <div id=\"things\"><h1>Manage The Store..</h1></div>\n");
      out.write("  <section>\n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("        <button onclick=\"window.location.href='register.jsp';\">New Customer Registration</button>\n");
      out.write("      <button onclick=\"window.location.href='customerList.jsp';\">Customer List</button>\n");
      out.write("      <button onclick=\"window.location.href='product.jsp';\">Add New Products</button>\n");
      out.write("      <button onclick=\"window.location.href='allproducts.jsp';\">Product List</button>\n");
      out.write("   </div>\n");
      out.write("</section>\n");
      out.write("<div style=\"height: 40px;\"></div>\n");
      out.write("</div>\n");
      out.write("<footer>\n");
      out.write("<div id=\"name\">\n");
      out.write("<h2>Design and Developed by:</h2>\n");
      out.write("<h1>Jaydeep Kumar Silawat</h1>\n");
      out.write("<h2>Roll no.: MCA/10051/19</h2>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"rnd\">\n");
      out.write("<h1>Recent & Decent</h1>  \n");
      out.write("<h4>Front-End Design Project</h4>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
