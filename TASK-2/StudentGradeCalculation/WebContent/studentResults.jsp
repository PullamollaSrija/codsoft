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
<style>
.radius{
margin: 54px;
border: 2px solid;
padding: 2px;
   
}

</style>

</head>


<body>

<div class="row">
  <div class="col-sm-12"><h3 style="background: lavender;text-align: center;">Student Grade Calculater</h3></div>
 
</div>
<div class="radius">
<div class="row">
  <div class="col-sm-12"><h5>Student Marks</h5></div>
 
</div>

<div class="row">
  <div class="col-sm-2"><label for="sname">Student Name:<%= request.getAttribute("sname")!=null?request.getAttribute("sname"):"" %></label></div>
 </div>
  <div class="row">
  <div class="col-sm-1"><label for="sname">Roll No:<%= request.getAttribute("rollNo")!=null?request.getAttribute("rollNo"):"" %></label></div>
</div>
<div class="row">
  <div class="col-sm-2"><label for="total">Total:<%= request.getAttribute("totalMrks")!=null?request.getAttribute("totalMrks"):"" %></label></div>
</div>
<div class="row">
  <div class="col-sm-2"><label for="percentage">Percentage:<%= request.getAttribute("studentPercentage")!=null?request.getAttribute("studentPercentage"):"" %></label></div>
</div><div class="row">
  <div class="col-sm-2"><label for="sname">Grade:<%= request.getAttribute("grade")!=null?request.getAttribute("grade"):"" %></label></div>  
</div>
<input type="button" value="back">
</div>
</body>
</head>
</html>
 