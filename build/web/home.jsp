<%-- 
    Document   : home
    Created on : Apr 20, 2021, 10:15:08 PM
    Author     : jayzz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>R & D</title>
<style>
*{
  margin: 0;
  padding: 0;
}

nav h1{
  font-size: 30px;
  display: flex;
  position: absolute;
  top: 15px;
  left: 20px;
  color: black;
}



#menu{
  padding-top: 15px;
  margin-right: 25px;
  /* border: 2px solid red; */
}

nav div a{
  text-decoration: none;
  font-size: 20px;
  color: black;
  font-weight: bold;
  padding: 10px;
}
nav div a:hover{
  color: white;
}


.mid{
  width: 100%;
  height: 400px;
  background: url(https://images.unsplash.com/photo-1546213290-e1b492ab3eee?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=967&q=80);
  text-align: center;
  background-color:rgba(153, 172, 192, 0.63);
  background-position: center;
}
#text{
  padding-top: 50px;
  padding-bottom: 166px;
  font-size: 40px;
  font-weight: bold;
  color: rgba(255, 255, 255, 0.966);
  background-color: rgba(0, 0, 0, 0.466);
  
}

#function{
  width: 100%;
  /* height: 400px; */
  background-color: rgba(0, 0, 0, 0.418);

}
#function section{
  display: flex;
  flex-direction: column;
  text-align: center;
  margin-right: 300px;
   
}
#function section button{
    width: 30vw;
   margin-bottom: 20px;
   margin-left: 320px;
  padding: 10px;
  background-color: #fff;
  border: 2px solid black;
  border-radius: 30px 0px 30px 0px;

  
}
#function section button:hover{
 transform: scale(1.1);
 background-color: rgba(83, 172, 255, 0.911);



}

#function section button{

  text-decoration: none;
  font-size: 20px;
  color: black;
  font-weight: bold;
}
#things{
  
  margin-bottom: 50px;


}
#things h1{
  font-size: 50px;
  text-align: center;
}

footer{
  height: 200px;
  background-color: rgb(0, 0, 0);
}

footer{
color: white;

}
#rnd{
  /* border: 2px solid red; */
  padding-top: 50px;
  align-items: center;
  
}

#name{
   display: flex;
   position: absolute;
   right: 0;
   flex-direction: column;
   padding-top: 55px;
   padding-right: 30px;
   align-items: center;
}

nav{
background-color: lightpink;
  width: 100%;
  height: 70px;
  color: white;
  text-align: right;
}

#logout{
    margin: 5px;
    margin-bottom: 10px;
    font-weight: bold;
    padding: 8px 5px;
    width: 80px;
    background-color: orange;
    border:1px solid white;
    border-radius: 5px;
}
#logout:hover{
    background-color: orchid;
    color: white;
}

</style>


</head>
<body>
  <nav>
    <div class="contain">
      <h1> R & D</h1>
    <div id="menu">
    <a href="home.jsp">Home</a>
    <a href="register.jsp">Register</a>
    <a href="allproducts.jsp">Products</a>
    <a href="customerList.jsp">Customers</a>
    <button id="logout" onclick="location.href='login.jsp'"> LogOut </button>
    </div>
  </nav>
<div class="mid">
  <div id="text">
  <h1>--The Store X--</h1>
  <h1>Recent and Decent!!</h1>
 </div>
</div>
<div id="function">
  <div style="height: 40px;"></div>
  <div id="things"><h1>Manage The Store..</h1></div>
  <section>
    <div class="btn-group">
        <button onclick="window.location.href='register.jsp';">New Customer Registration</button>
      <button onclick="window.location.href='customerList.jsp';">Customer List</button>
      <button onclick="window.location.href='product.jsp';">Add New Products</button>
      <button onclick="window.location.href='allproducts.jsp';">Product List</button>
   </div>
</section>
<div style="height: 40px;"></div>
</div>
<footer>
<div id="name">
<h2>Design and Developed by:</h2>
<h1>Jaydeep Kumar Silawat</h1>
<h2>Roll no.: MCA/10051/19</h2>
</div>

<div id="rnd">
    <h1>&nbsp&nbsp The Store X</h1>
<h1>Recent & Decent</h1>  
<h4>&nbsp &nbsp &nbsp  Front-End Design Project</h4>
</div>

</footer>


</body>
</html>