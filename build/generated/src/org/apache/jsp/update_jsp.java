package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    if(request.getParameter("submit")!=null)
    {
        String id = request.getParameter("id");
        String name = request.getParameter("cus_name");
        String contact = request.getParameter("con_no");
        String  address= request.getParameter("address");
       
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
        pst = con.prepareStatement("update customer set cus_name = ?,con_no =?,address= ? where id = ?");
        pst.setString(1, name);
        pst.setString(2, contact);
        pst.setString(3, address);
        pst.setString(4, id);
        pst.executeUpdate();  
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script>   \n");
      out.write("            alert(\"Record Updated\");           \n");
      out.write("       </script>\n");
      out.write(" \n");
      out.write("                \n");
      out.write("    ");
             
    }
 

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-color: rgba(252, 166, 166, 0.753);\n");
      out.write("            }\n");
      out.write("           input[type=text], select {\n");
      out.write("            width: 40%; \n");
      out.write("            color: yellow;\n");
      out.write("            \n");
      out.write("            padding: 12px; \n");
      out.write("            text-align: left;\n");
      out.write("            font-size: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-sizing: border-box; \n");
      out.write("            margin-top: 6px;\n");
      out.write("            margin-bottom: 10px; \n");
      out.write("            resize: vertical; \n");
      out.write("          }\n");
      out.write("            input:focus {\n");
      out.write("           outline:none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("      input[type=submit] {\n");
      out.write("            background-color: #4caf4fe0;\n");
      out.write("            color: white;\n");
      out.write("            padding: 8px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-right: 380px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        \n");
      out.write("          input[type=submit]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("\n");
      out.write("          .container {\n");
      out.write("            border-radius: 5px;\n");
      out.write("            padding: 15px;\n");
      out.write("          }\n");
      out.write("          form{\n");
      out.write("               text-align: center;\n");
      out.write("          }\n");
      out.write("            input{\n");
      out.write("               background-color: rgba(0, 0, 0, 0.336);\n");
      out.write("               }\n");
      out.write("               h1{\n");
      out.write("                   text-align: center;\n");
      out.write("                   color:  #ff1e00c9\n");
      out.write("               }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> Update Customer Details </h1>\n");
      out.write("        <div class=\"container\">\n");
      out.write("       <form method=\"POST\" action=\"#\">\n");
      out.write("            \n");
      out.write("           ");
    
                        Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
        
                         Class.forName("com.mysql.jdbc.Driver");
                         con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
                           
                        String id = request.getParameter("id");
                          
                        pst = con.prepareStatement("select * from customer where id = ?");
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                while(rs.next())
                {
                    
                    
      out.write("\n");
      out.write("               <label for=\"cus_name\">Customer Name</label>\n");
      out.write("               <input type=\"text\" id=\"cus_name\" name=\"cus_name\"><br>\n");
      out.write("\n");
      out.write("               <label for=\"con_no\">&nbsp&nbsp&nbsp&nbsp Mobile No :</label>\n");
      out.write("               <input type=\"text\" id=\"con_no\" name=\"con_no\" ><br>\n");
      out.write("\n");
      out.write("               <label for=\"address\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Address :</label>\n");
      out.write("               <input type=\"text\" id=\"address\" name=\"address\" ><br>\n");
      out.write("               \n");
      out.write("               ");
 } 
      out.write("\n");
      out.write("               \n");
      out.write("               <input  type=\"submit\" value=\"Submit\" id=\"submit\" name=\"submit\">\n");
      out.write("<!--               <p><a href=\"index.jsp\">Click Back</a></p>-->\n");
      out.write("        \n");
      out.write("         \n");
      out.write("          \n");
      out.write("       </form>\n");
      out.write("</div>\n");
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
