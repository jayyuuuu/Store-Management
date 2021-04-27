package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class updateproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        String name = request.getParameter("pro_name");
        String brand = request.getParameter("brand");
        String  price= request.getParameter("price");
       
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
        pst = con.prepareStatement("update product set pro_name = ?, brand =?,price= ? where id = ?");
        pst.setString(1, name);
        pst.setString(2, brand);
        pst.setString(3, price);
        pst.setString(4, id);
        pst.executeUpdate();  
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script>   \n");
      out.write("            alert(\"Product Updated\");           \n");
      out.write("       </script>\n");
      out.write(" \n");
      out.write("                \n");
      out.write("    ");
             
    }
 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>R & D</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            *{\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-color: rgba(0, 0, 0, 0.418);\n");
      out.write("            }\n");
      out.write("           input[type=text], select {\n");
      out.write("            width: 40%; \n");
      out.write("            color: #000;\n");
      out.write("            padding: 12px; \n");
      out.write("            text-align: left;\n");
      out.write("            font-size: 15px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-sizing: border-box; \n");
      out.write("            margin-top: 6px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            margin-left: 10px;\n");
      out.write("            resize: vertical; \n");
      out.write("            background-color: rgb(197, 183, 183);\n");
      out.write("          }\n");
      out.write("            input:focus {\n");
      out.write("           outline:none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("      input[type=submit] {\n");
      out.write("            background-color: #4caf4fe0;\n");
      out.write("            color: white;\n");
      out.write("            padding: 8px 35px;\n");
      out.write("            border: 2px solid orange;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            margin-right: 260px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        \n");
      out.write("          input[type=submit]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("            border: 2px solid yellow;\n");
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
      out.write("        \n");
      out.write("               h1{\n");
      out.write("                   font-size: 45px;\n");
      out.write("                   text-align: center;\n");
      out.write("                   color:  #000000c4;\n");
      out.write("                   margin-top: 40px;\n");
      out.write("                   margin-bottom: 20px;\n");
      out.write("               }\n");
      out.write("  nav h1{\n");
      out.write("   color: white;\n");
      out.write("   font-size: 30px;\n");
      out.write("  display: flex;\n");
      out.write("  position: absolute;\n");
      out.write("  top: -20px;\n");
      out.write("  left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav{\n");
      out.write("  background-color: rgba(0, 0, 0, 0.685);\n");
      out.write("  width: 100%;\n");
      out.write("  height: 70px;\n");
      out.write("  color: white;\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
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
      out.write("  color: white;\n");
      out.write("  padding: 10px;\n");
      out.write("}\n");
      out.write("    nav div a:hover{\n");
      out.write("    color: orange;\n");
      out.write("}  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav>\n");
      out.write("             <div class=\"contain\">\n");
      out.write("              <h1> R & D</h1>\n");
      out.write("             <div id=\"menu\">\n");
      out.write("            <a href=\"home.jsp\">Home</a>\n");
      out.write("          </div>\n");
      out.write("     </nav>\n");
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
                          
                        pst = con.prepareStatement("select * from product where pid = ?");
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                while(rs.next())
                {
                    
                    
      out.write("\n");
      out.write("               <label for=\"pro_name\">Product Name :</label>\n");
      out.write("               <input type=\"text\" id=\"pro_name\" name=\"pro_name\"><br>\n");
      out.write("\n");
      out.write("               <label for=\"Brand\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Brand :</label>\n");
      out.write("               <input type=\"text\" id=\"brand\" name=\"brand\" ><br>\n");
      out.write("\n");
      out.write("               <label for=\"Price\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Price :</label>\n");
      out.write("               <input type=\"text\" id=\"price\" name=\"price\" ><br>\n");
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
