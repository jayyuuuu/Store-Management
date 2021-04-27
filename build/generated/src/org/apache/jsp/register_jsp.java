package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

     
    if(request.getParameter("submit")!=null)
    {
        String name=request.getParameter("name");
        String number=request.getParameter("MobileNo");
        String address=request.getParameter("address");
        

        String sql="INSERT INTO customer(cus_name,con_no,address) VALUES(?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/shop","root","jayzz");
        PreparedStatement ps;
        ps = con.prepareStatement(sql);
        
        
        ps.setString(1,name);
        ps.setString(2,number);
        ps.setString(3,address);
        Pattern p=Pattern.compile("^[7-9][0-9]{9}$");
        Matcher m=p.matcher(number);
        if(m.matches())
        {
        try{
          ps.executeUpdate(); 
    
      out.write("\n");
      out.write("            <script>\n");
      out.write("                alert(\"Racord ADDED Sucessfully\");\n");
      out.write("            </script>   \n");
      out.write("    ");

        }catch(Exception e) {
    
      out.write("\n");
      out.write("          <script>   \n");
      out.write("              alert(\"Customer Mobile Number already registerd\");           \n");
      out.write("          </script>\n");
      out.write("     ");

          }
     
       }
       else
       {
     
      out.write("\n");
      out.write("          <script>   \n");
      out.write("              alert(\"Incorrect Mobile Number\");           \n");
      out.write("          </script>\n");
      out.write("      ");
 
        }
      
      out.write("\n");
      out.write("    \n");
      out.write("\n");
    
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
      out.write("            body{\n");
      out.write("                background-color: rgba(252, 166, 166, 0.753);\n");
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
      out.write("            resize: vertical /* Allow the user to vertically resize the textarea (not horizontally) */\n");
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
      out.write("            margin-right: 380px;\n");
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
      out.write("          h1{\n");
      out.write("              text-align: center;\n");
      out.write("              color: #ff1e00c9\n");
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
      out.write("                background-color: rgba(0, 0, 0, 0.336);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("       \n");
      out.write("           form,label,input{\n");
      out.write("               text-align: center;\n");
      out.write("            \n");
      out.write("           }\n");
      out.write("           input{\n");
      out.write("               background-color: rgba(0, 0, 0, 0.336);\n");
      out.write("               }\n");
      out.write("            \n");
      out.write("nav h1{\n");
      out.write("  font-size: 30px;\n");
      out.write("  display: flex;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 15px;\n");
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
      out.write("nav div a:hover{\n");
      out.write("  color: orange;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <nav>\n");
      out.write("    <div class=\"contain\">\n");
      out.write("      <h1> R & D</h1>\n");
      out.write("    <div id=\"menu\">\n");
      out.write("    <a href=\"home.jsp\">Home</a>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        <h1>Customer Registration Form </h1>\n");
      out.write("        <div class=\"page1\"> \n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form class=\"card\" method=\"POST\" action=\"#\">\n");
      out.write("                  <label for=\"Cname\" class=\"lab\">Customer Name:</label>\n");
      out.write("                  <input type=\"text\" id=\"name\" name=\"name\" value=\"\"><br>\n");
      out.write("                  <label for=\"con_no\" class=\"lab\">&nbsp&nbsp Mobile No :</label>\n");
      out.write("                  <input type=\"text\" id=\"mobileNo\" name=\"MobileNo\" value=\"\"><br>\n");
      out.write("                  <label for=\"address\" class=\"lab\">&nbsp&nbsp&nbsp&nbsp&nbspAddress :</label>\n");
      out.write("                  <input type=\"text\" id=\"address\" name=\"address\" value=\"\">\n");
      out.write("                  <br><br>\n");
      out.write("                  <input  type=\"submit\" id=\"submit\" value=\"submit\" name=\"submit\">\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"table\">\n");
      out.write("                \n");
      out.write("\n");
      out.write("            <h1>Customer List</h1>\n");
      out.write("            <table>\n");
      out.write("              <tr>\n");
      out.write("                <th>Customer Name</th>\n");
      out.write("                <th>Contact No.</th>\n");
      out.write("                <th>Address</th>\n");
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
                String query = "select * from customer";
                Statement st = con.createStatement();

                rs =  st.executeQuery(query);

                  while(rs.next())
                   {
                       String id=rs.getString("id");
              
              
      out.write("\n");
      out.write("              \n");
      out.write("              <tr>\n");
      out.write("                  <td>");
      out.print(rs.getString("cus_name") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(rs.getString("con_no") );
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(rs.getString("address") );
      out.write("</td>\n");
      out.write("                  <td> <a href=\"update.jsp?id=");
      out.print(id);
      out.write("\"> Edit </a> </td>\n");
      out.write("                  <td> <a href=\"delete.jsp?id=");
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
