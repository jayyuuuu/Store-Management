package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     
    if(request.getParameter("submit")!=null)
    {
        String name=request.getParameter("name");
        String brand=request.getParameter("brand");
        int price = Integer.parseInt(request.getParameter("price"));
        

        String sql="INSERT INTO product(pname,brand_name,price) VALUES(?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        
        
       // System.out.println(n+" ROW ADDED");
        ps.setString(1,name);
        ps.setString(2,brand);
        ps.setInt(3,price);
        
       
          ps.executeUpdate(); 
  
     }
    
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>R & D</title>\n");
      out.write("          <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: rgba(0, 0, 0, 0.418);\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("              font-family: arial, sans-serif;\n");
      out.write("              border-collapse: collapse;\n");
      out.write("              width: 70%;\n");
      out.write("              margin-left: 180px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=text], select {\n");
      out.write("            width: 40%; \n");
      out.write("            padding: 12px; \n");
      out.write("            text-align: left;\n");
      out.write("            font-size: 20px;\n");
      out.write("            border: 1px solid #ccc; /* Gray border */\n");
      out.write("            border-radius: 10px; /* Rounded borders */\n");
      out.write("            box-sizing: border-box; /* Make sure that padding and width stays in place */\n");
      out.write("            margin-top: 6px; /* Add a top margin */\n");
      out.write("            margin-bottom: 10px; /* Bottom margin */\n");
      out.write("            resize: vertical ;\n");
      out.write("            background-color: rgb(192, 185, 185);\n");
      out.write("          }\n");
      out.write("           input:focus {\n");
      out.write("             outline:none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input[type=submit] {\n");
      out.write("            background-color: #4caf4fe0;\n");
      out.write("            color: white;\n");
      out.write("            padding: 8px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-right: 200px;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            .lab{\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-family: monospace;\n");
      out.write("                margin-left: 5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            input[type=submit]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("          }\n");
      out.write("          \n");
      out.write("          #heading{\n");
      out.write("            font-size: 40px;\n");
      out.write("              margin-top: 20px;\n");
      out.write("              margin-bottom: 20px;\n");
      out.write("              text-align: center;\n");
      out.write("              color: #1F1F1F;\n");
      out.write("          }\n");
      out.write("\n");
      out.write("         \n");
      out.write("            \n");
      out.write("            td, th {\n");
      out.write("              border: 2px solid #131010;\n");
      out.write("              text-align: left;\n");
      out.write("              padding: 8px;\n");
      out.write("            }\n");
      out.write("            tr{\n");
      out.write("                background-color: rgba(0, 0, 0, 0.123);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            form{\n");
      out.write("                margin-top: 30px;\n");
      out.write("            }\n");
      out.write("       \n");
      out.write("           form,label,input{\n");
      out.write("               text-align: center;\n");
      out.write("               margin-right: 100px;\n");
      out.write("            \n");
      out.write("           }\n");
      out.write("           h1{\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                margin-bottom: 20px;  \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("nav h1{\n");
      out.write("  font-size: 30px;\n");
      out.write("  display: flex;\n");
      out.write("  position: absolute;\n");
      out.write("  top: -15px;\n");
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
      out.write("}   \n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav>\n");
      out.write("             <div class=\"contain\">\n");
      out.write("              <h1> R & D</h1>\n");
      out.write("             <div id=\"menu\">\n");
      out.write("            <a href=\"home.jsp\">Home</a>\n");
      out.write("          </div>\n");
      out.write("     </nav>\n");
      out.write("        <h1 id=\"heading\">Add New Product </h1>\n");
      out.write("        <div class=\"page1\"> \n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form class=\"card\" method=\"POST\" action=\"#\">\n");
      out.write("                  <label for=\"Cname\" class=\"lab\">Product Name:</label>\n");
      out.write("                  <input type=\"text\" id=\"name\" name=\"name\" value=\"\"><br>\n");
      out.write("                  <label for=\"con_no\" class=\"lab\">&nbsp&nbsp&nbsp&nbsp&nbsp brand :</label>\n");
      out.write("                  <input type=\"text\" id=\"brand\" name=\"brand\" value=\"\"><br>\n");
      out.write("                  <label for=\"address\" class=\"lab\">&nbsp&nbsp&nbsp&nbsp&nbsp price :</label>\n");
      out.write("                  <input type=\"text\" id=\"price\" name=\"price\" value=\"\">\n");
      out.write("                  <br><br>\n");
      out.write("                  <input type=\"submit\" id=\"submit\" value=\"submit\" name=\"submit\">\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"table\">\n");
      out.write("                \n");
      out.write("\n");
      out.write("            <h1>Product List</h1>\n");
      out.write("            <table>\n");
      out.write("              <tr>\n");
      out.write("                <th> Pid</th>\n");
      out.write("                <th> Name</th>\n");
      out.write("                <th>brand</th>\n");
      out.write("                <th>price</th>\n");
      out.write("                <th>Edit</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("              </tr>\n");
      out.write("              \n");
      out.write("\n");
      out.write("              \n");
      out.write("        ");
  
                Connection con;
            
                java.sql.ResultSet rs;

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
                String query = "select * from product";
                Statement st = con.createStatement();

                rs =  st.executeQuery(query);

                  while(rs.next())
                   {
                       String id=rs.getString("pid");
              
              
      out.write("\n");
      out.write("              \n");
      out.write("              <tr>\n");
      out.write("                  <td>");
      out.print(rs.getInt("pid") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(rs.getString("pname") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(rs.getString("brand_name") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(rs.getInt("price") );
      out.write("</td>\n");
      out.write("                  <td> <a href=\"updateproduct.jsp?id=");
      out.print(id);
      out.write("\"> Edit </a> </td>\n");
      out.write("                  <td> <a href=\"prodelete.jsp?id=");
      out.print(id);
      out.write("\"> Delete </a></td>\n");
      out.write("              </tr>\n");
      out.write("              \n");
      out.write("              ");

                } 
              
      out.write("\n");
      out.write("              \n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
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
