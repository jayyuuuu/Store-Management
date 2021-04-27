package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customeradded_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Thank you!</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"generator\" content=\"TSW WebCoder\">\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    p{\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 30px;\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    p strong{\n");
      out.write("        color: red;\n");
      out.write("        font-size: 40px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <p>     <strong> New Customer added Successfully!!</strong>\n");
      out.write("            <br>\n");
      out.write("            Thank you for reaching out to us. We will get back to you shortly. Please click <a href=\"home.jsp\" style=\"text-decoration: none; color #0986d9 !important;;\">here </a> if you are not redirected within a few seconds.</p>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        setTimeout(function () {\n");
      out.write("            window.location.replace(\"home.jsp\"); //will redirect to main page.\n");
      out.write("        }, 3000); //will call the function after 3 secs.\n");
      out.write("    </script>   \n");
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
