<%-- 
    Document   : index
    Created on : 15 Apr, 2021, 4:57:54 PM
    Author    
--%>


<%@page import="java.util.regex.Matcher"%>
<%@page import="java.util.regex.Pattern"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*"  %>



<%
     
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
    %>
            <script>
                alert("Racord ADDED Sucessfully");
            </script>   
    <%
        }catch(Exception e) {
    %>
          <script>   
              alert("Customer Mobile Number already registerd");           
          </script>
     <%
          }
     
       }
       else
       {
     %>
          <script>   
              alert("Incorrect Mobile Number");           
          </script>
      <% 
        }
      %>
    

<%    
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
            table {
              font-family: arial, sans-serif;
              border-collapse: collapse;
              width: 70%;
              margin-left: 180px;
            }
            
            input[type=text], select {
            width: 40%; 
            padding: 12px; 
            text-align: left;
            font-size: 20px;
            border: 1px solid #ccc; /* Gray border */
            border-radius: 10px; /* Rounded borders */
            box-sizing: border-box; /* Make sure that padding and width stays in place */
            margin-top: 6px; /* Add a top margin */
            margin-bottom: 10px; /* Bottom margin */
            resize: vertical ;
            background-color: rgb(192, 185, 185);
          }
           input:focus {
             outline:none;
            }
            
            input[type=submit] {
            background-color: #4caf4fe0;
            color: white;
            padding: 8px 20px;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            margin-right: 200px;
            }
          
            .lab{
                font-size: 20px;
                font-family: monospace;
                margin-left: 5px;
            }
            
            
            input[type=submit]:hover {
            background-color: #45a049;
          }
          
          #heading{
            font-size: 40px;
              margin-top: 20px;
              margin-bottom: 20px;
              text-align: center;
              color: #000000c9
          }

         
            
            td, th {
              border: 2px solid #131010;
              text-align: left;
              padding: 8px;
            }
            tr{
                background-color: rgba(0, 0, 0, 0.123);
            }
            
            form{
                margin-top: 30px;
            }
       
           form,label,input{
               text-align: center;
               margin-right: 100px;
            
           }
         
            
nav h1{
  font-size: 30px;
  display: flex;
  position: absolute;
  top: 15px;
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
        <h1 id="heading">Customer Registration Form </h1>
        <div class="page1"> 
            <div class="form">
                <form class="card" method="POST" action="#">
                  <label for="Cname" class="lab">Customer Name:</label>
                  <input type="text" id="name" name="name" value=""><br>
                  <label for="con_no" class="lab">&nbsp&nbsp Mobile No :</label>
                  <input type="text" id="mobileNo" name="MobileNo" value=""><br>
                  <label for="address" class="lab">&nbsp&nbsp&nbsp&nbsp&nbspAddress :</label>
                  <input type="text" id="address" name="address" value="">
                  <br><br>
                  <input  type="submit" id="submit" value="submit" name="submit">
                </form> 
            </div>
            
            <div class="table">
                

                <h1 id="heading">Customer List</h1>
            <table>
              <tr>
                <th>Customer Name</th>
                <th>Contact No.</th>
                <th>Address</th>
                <th>Edit</th>
                <th>Delete</th>
              </tr>
              

              
        <%  
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
              
              %>
              
              <tr>
                  <td><%=rs.getString("cus_name") %></td>
                  <td><%=rs.getString("con_no") %></td>
                  <td><%=rs.getString("address") %></td>
                  <td> <a href="update.jsp?id=<%=id%>"> Edit </a> </td>
                  <td> <a href="delete.jsp?id=<%=id%>"> Delete </a></td>
              </tr>
              
              <%
                } 
              %>
              
            </table>
                
            </div>
           
        </div>
    </body>
</html>
