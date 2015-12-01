<%-- 
    Document   : timetable
    Created on : Dec 25, 2014, 9:55:18 PM
    Author     : karim
--%>

<%@page import="model.tablebean"%>
<%@page import="java.util.List"%>
<%@page import="model.tabledao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>time table Page</title>
    </head>
    <body>
         
<%
//UserBean user = new UserBean();
tabledao dao = new tabledao();
List<tablebean> userList = dao.getAll();
//Iterator<UserBean> itr = userList.iterator();
%>
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
<p align="center"><a href="servlet?action=insert">Add</a></p>
        
    </body>
</html>