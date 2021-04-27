package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title> R&D Login</title>\n");
      out.write("\n");
      out.write("   <style>\n");
      out.write("\n");
      out.write("@import \"https://use.fontawesome.com/releases/v5.5.0/css/all.css\";\n");
      out.write("body{\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  font-family: sans-serif;\n");
      out.write("  background: url(https://images.unsplash.com/photo-1617286647344-95c86d56748a?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=889&q=80) no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write(".login-box{\n");
      out.write("  width: 280px;\n");
      out.write("  height: 400px;\n");
      out.write("  /* border: 2px solid black; */\n");
      out.write("  padding: 20px;\n");
      out.write("  border-radius: 20px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  background-color: rgba(14, 13, 13, 0.541);\n");
      out.write("  transform: translate(-50%,-50%);\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("h2,h5{\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".login-box h1{\n");
      out.write("  float: left;\n");
      out.write("  font-size: 40px;\n");
      out.write("  border-bottom: 6px solid #4caf50;\n");
      out.write("  margin-bottom: 50px;\n");
      out.write("  /* padding: 13px 0; */\n");
      out.write("}\n");
      out.write(".textbox{\n");
      out.write("  width: 100%;\n");
      out.write("  overflow: hidden;\n");
      out.write("  font-size: 20px;\n");
      out.write("  padding: 8px 0;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  border-bottom: 1px solid #4caf50;\n");
      out.write("}\n");
      out.write(".textbox i{\n");
      out.write("  width: 26px;\n");
      out.write("  float: left;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write(".textbox input{\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  background: none;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 18px;\n");
      out.write("  width: 80%;\n");
      out.write("  float: left;\n");
      out.write("  margin: 0 10px;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("  width: 100%;\n");
      out.write("  background: none;\n");
      out.write("  border: 2px solid #4caf50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 5px;\n");
      out.write("  font-size: 18px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  margin: 12px 0;\n");
      out.write("}\n");
      out.write("#opac{\n");
      out.write("  width: 100vw;\n");
      out.write("  height: 100vh;\n");
      out.write("  background-color: rgba(0, 0, 0, 0.514);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("  <div id=\"opac\"></div>\n");
      out.write("<div class=\"login-box\">\n");
      out.write("  <h2>Recent & Decent</h2>\n");
      out.write("  <h1>Login</h1>\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    <i class=\"fas fa-user\"></i>\n");
      out.write("    <input type=\"text\" placeholder=\"Username\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"textbox\">\n");
      out.write("    <i class=\"fas fa-lock\"></i>\n");
      out.write("    <input type=\"password\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <input type=\"button\" class=\"btn\" value=\"Sign in\" onclick=\"window.location.href='home.jsp';\">\n");
      out.write("  <h5>Not a user? <a href=\"#\" style=\"text-decoration: none; color: yellow\">Register here!</a></h5>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("  </body>\n");
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
