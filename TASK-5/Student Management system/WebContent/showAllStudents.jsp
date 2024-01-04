<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
 <%@ page import ="sd.StudentObj" %>
<%
ArrayList<StudentObj> eList = (ArrayList<StudentObj>)request.getAttribute("list");
System.out.print(eList.size());
%>
<body>

<div class="container">
<form action="StudentServlet?action=search" method="post">
<div class="row">
  <div class="col-sm-2"><label for="fname">First Name:</label></div>
  <div class="col-sm-2"><input type="text" id="fname" name="fName" class="std" ></div>
 <div class="col-sm-1"><label for="fname">R No:</label></div>
  <div class="col-sm-4"><input type="text" id="fname" name="rno" class="std" > <input type="submit"  value="Search" class="std" >
  
   <a href='StudentServlet'>Add</a>
  </div>
   
  </div>
  </form>
   <table class="table table-bordered">
    <thead class="thead-dark">
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
         <th>R No</th>
          <th>Grade</th>
           <th>Actions</th>
      </tr>
    </thead>
    <tbody>
    
    <%
    if(eList.size()>0){
    for(int i=0;i<eList.size();i++){ 
    	StudentObj s=(StudentObj)eList.get(i);
    %>
      <tr>
        <td><%=s.getFirstName()%></td>
        <td><%=s.getLastName()%></td>
        <td><%=s.getEmail()%></td>
         <td><%=s.getRno()%></td>
          <td><%=s.getGrade()%></td>
           <td> <a href='StudentServlet?id=<%=s.getStdId()%>&action=edit'>Edit</a>  <a href='StudentServlet?id=<%=s.getStdId()%>&action=remove'>Remove</a></td>
      </tr>
     <%}}else{%>
      <tr><td colspan="6">No Results Found</td></tr>
     <%} %>
    </tbody>
  </table>
  
</div>

</body>
</html>
