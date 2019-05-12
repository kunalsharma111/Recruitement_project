<%-- 
    Document   : show_jobs
    Created on : Apr 14, 2019, 7:32:42 PM
    Author     : Nichiket
--%>

<%@page import="java.util.List"%>
<%@page import="model.job"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta http-equiv="X-UA-Compatible" content="ie=edge">
      <title></title>
      <link rel="stylesheet" href="style3.css">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
      <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
</head>
<body bgcolor="#EEEEEE">
      <div class="wrapper">
            <header style="z-index: 1;">

                  <nav>

                        <div class="menu-icon">
                              <i class="fa fa-bars fa-2x"></i>
                        </div>

                        <div class="logo">
                              Naukri Bazar
                        </div>

                        <div class="menu">
                              <ul>
                                    <li><a href="index_1.html"><img src="p.png" class="aa"> Home</a></li>
                                    <li><a href="about.html">About</a></li>
                                    <li><a href="company_add.html">Recruit</a></li>
                  
                                    <div class="a">
                                    <li ><a href="LogoutServlet">Logout</a></li>
                                    <li >
                                        <a href="cv_apply.html"> <div class="pp1">Register CV</div></a>
                                    </li>
                              </ul>
                        </div>
                  </nav>
                  
            </header>
            <div class="content" style="z-index: 0;">
                <div class="left">
                  <div class=left1>
                      <form>
                            <frameset>
                      <span id="l">Search by Keywords</span>
                      <input type="text" name="t1" class="t1">
                      <hr style="position: relative; margin-top: 100px; width: 187%;  margin-left: -37px;">
                     <span id="l">Search by City</span>
                      <input type="text" name="t2" class="t2">
                      <button class="btn">Search</button>           
                            </frameset>
                      </form>
                </div>
                </div>
                
                <% 
                List<job> records = (List<job>)request.getAttribute("List");
               
                if( records!=null)
                {for(job j: records){
                    System.out.println(j);
                
                    
              %>
                
                
                
                
                <div class="right">
                      <div class="right1">
                          <span class="r1">  <a href="#"> <%= j.getJob_name() %></a></span>
                            <span class="r2">Type : <span class="r22"> <%= j.getJob_type() %></span></span>
                            <span class="r3">Posted : <span class="r22"><%= j.getJob_duration() %></span></span>
                      </div>
                      
                </div>
                      <br><br><br><br><br><br>
                            <% } } %>
                
                <div class="leftt">
                      <div class="left1">
                            Job Type
                            <form style="margin-top: 50px;">
                              <input type="radio" name="r1">Freelancer<br>
                              <input type="radio" name="r1" style=" top:20px;">Full Time<br>
                              <input type="radio" name="r1" style="top: 20px;">Contract
                            </form>
                      </div>
                </div>
                <div class="lefttt">
                      <div class="left1">
                            Qualifications
                            <form style="margin-top: 50px;">
                              <input type="radio" name="r1">Bachelor<br>
                              <input type="radio" name="r1" style=" top:20px;">Master<br>
                              <input type="radio" name="r1" style="top: 20px;">PHD
                            </form>
                      </div>
                </div>
                
            </div>
      </div>

      <script type="text/javascript">

      // Menu-toggle button

      $(document).ready(function() {
            $(".menu-icon").on("click", function() {
                  $("nav ul").toggleClass("showing");
            });
      });

      // Scrolling Effect

      $(window).on("scroll", function() {
            if($(window).scrollTop()) {
                  $('nav').addClass('black');
            }

            else {
                  $('nav').removeClass('black');
            }
      })


      </script>

</body>
</html>
