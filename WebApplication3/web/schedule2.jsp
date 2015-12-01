<%-- 
    Document   : schedule
    Created on : Dec 26, 2014, 3:36:40 PM
    Author     : karim
--%>

<%@page import="model.tablebean"%>
<%@page import="java.util.List"%>
<%@page import="model.table2dao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <title>Schedule</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/reset.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/grid_12.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/slider.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/font.css">
	<link rel="shortcut icon" href="images/icon.png"/>
    <script src="js/jquery-1.7.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/tms-0.4.1.js"></script>
    <script>
		$(document).ready(function(){				   	
			$('.slider')._TMS({
				show:0,
				pauseOnHover:true,
				prevBu:'.prev',
				nextBu:'.next',
				playBu:false,
				duration:800,
				preset:'fade',
				pagination:true,
				pagNums:false,
				slideshow:7000,
				numStatus:false,
				banners:false,
				waitBannerAnimation:false,
				progressBar:false
			})		
		});
	</script>
	<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
   		<script type="text/javascript" src="js/html5.js"></script>
    	<link rel="stylesheet" type="text/css" media="screen" href="css/ie.css">
	<![endif]-->
</head>
<body>
    
            
<%
//UserBean user = new UserBean();
table2dao dao = new table2dao();
List<tablebean> userList = dao.getAll();
//Iterator<UserBean> itr = userList.iterator();
%>
  <div class="main">
  <!--==============================header=================================-->
    <header>
        <h1><a href="index.html"><img src="images/logo.png" alt=""></a></h1>
        <nav>  
            <div id="slide">		
                <div class="slider">
                    <ul class="items">
                        <li><img src="images/slider-1.jpg" alt="" /></li>
                        <li><img src="images/slider-2.jpg" alt="" /></li>
                        <li><img src="images/slider-3.jpg" alt="" /></li>
                    </ul>
                </div>	
                <a href="#" class="prev"></a><a href="#" class="next"></a>
            </div>
            <ul class="menu">
                <li><a href="index2.html" class="clr-1">Home</a></li>
                <li><a href="about2.html" class="clr-2">About</a></li>
                <li class="current"><a href="schedule2.jsp" class="clr-3">Schedule</a></li>
                <li><a href="gallery2.html" class="clr-4">Gallery</a></li>
                <li><a href="contacts2.html" class="clr-5">Contacts</a></li>
            </ul>
         </nav>
    </header>   
  <!--==============================content================================-->
    <table border="1" align="center" >
    <caption> user information</caption>
<tr>
<th>day</th>
<th>First</th>
<th>second</th>
<th>third</th>
<th>fourth</th>
<th>fifth</th>
</tr>
<tr>
<%
/*while(itr.hasNext())
{
System.out.println(user.getId());*/
for (tablebean user : userList) {
%>
<td><%=user.getDay()%></td>
<td><%=user.getFirst()%></td>
<td><%=user.getSecond()%></td>
<td><%=user.getThird()%></td>
<td><%=user.getFourth()%></td>
<td><%=user.getFifth()%></td>
<td></td>
<td></td>

</tr>
<%
}
//}
%>
</table>

            <!--==============================footer=================================-->
            <footer>
                <p>© 2012 Art School</p>
                <p>Website Template by <a class="link" href="http://www.templatemonster.com/" target="_blank" rel="nofollow">www.templatemonster.com</a></p>
            </footer>	  
          </div>
          <div class="clear"></div>
        </div>
    </section>    
   </div>      
</body>
</html>
