<%-- 
    Document   : product
    Created on : Apr 21, 2021, 12:12:53 AM
    Author     : jayzz
--%>

<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*"  %>



<%
     
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
    %>
    

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>R & D</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        body{
            background-color: rgba(0, 0, 0, 0.418);
        }
        
        
            h1{
                text-align: center;
                margin-top: 30px;
                margin-bottom: 20px;  
            }
            table {
             width: 70%;
             margin-left:180px;
              border-collapse: collapse;
            }
            
            table, th{
                 border: 4px solid black;
                 height: 50px;
                 background-color: lightsalmon;
            }
            
           table,td{
           border: 2px solid black;
           height: 30px;
          }
          tr{
              background-color: lightgoldenrodyellow;
          }
          tr:nth-of-type(odd){
              background-color: lightcyan;
          } 
          nav h1{
  font-size: 30px;
  display: flex;
  position: absolute;
  top: -10px;
  left: 20px;
}

nav{
  background-color: rgba(0, 0, 0, 0.685);
  width: 100%;
  height: 70px;
  color: white;
  text-align: right;
}

#menu{
  padding-top: 20px;
  margin-right: 20px;
  /* border: 2px solid red; */
}

nav div a{
  text-decoration: none;
  font-size: 20px;
  color: white;
  padding: 10px;
}
    nav div a:hover{
    color: orange;
}  
            
       
        </style>
        
        
    </head>
    <body>
         <nav>
             <div class="contain">
              <h1> R & D</h1>
             <div id="menu">
            <a href="home.jsp">Home</a>
          </div>
     </nav>
        <h1>  Products List </h1>
  
            <div class="table">
            <table>
              <tr>
                <th>Pid</th>
                <th>Name</th>
                <th>brand</th>
                <th>price</th>
                <th>Edit</th>
                <th>Delete</th>
              </tr>
              

              
        <%  
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
              
              %>
              
              <tr>
                  <td><%=rs.getInt("pid") %></td>
                  <td><%=rs.getString("pname") %></td>
                  <td><%=rs.getString("brand_name") %></td>
                  <td><%=rs.getInt("price") %></td>
                  <td> <a href="updateproduct.jsp?id=<%=id%>"> Edit </a> </td>
                  <td> <a href="prodelete.jsp?id=<%=id%>"> Delete </a></td>
              </tr>
              
              <%
                } 
              %>
              
            </table>
                
            </div>
    </body>
</html>
