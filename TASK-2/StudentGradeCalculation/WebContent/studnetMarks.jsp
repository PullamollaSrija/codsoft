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
<form action="StudentGradeCalculationServlet" method="post">
<div class="row">
  <div class="col-sm-12"><h5>Enter Marks</h5></div>
 
</div>

<div class="row">
  <div class="col-sm-2"><label for="sname">Student Name:</label></div>
  <div class="col-sm-3"><input type="text" id="sname" name="sname" class="std" ></div>
  
  <div class="col-sm-1"><label for="sname">Rol No:</label></div>
  <div class="col-sm-4"><input type="text"  name="rollNo" class="std" ></div>
 
</div>

<div class="row">
  <div class="col-sm-2"><label for="sname">English:</label></div>
  <div class="col-sm-4"><input type="number"  name="english" class="std" ></div>
  
  
</div>
<div class="row">
  <div class="col-sm-2"><label for="sname">Second Language:</label></div>
  <div class="col-sm-4"><input type="number"  name="secondLanguage" class="std" ></div>
  
  
</div><div class="row">
  <div class="col-sm-2"><label for="sname">Mathematics:</label></div>
  <div class="col-sm-4"><input type="number"  name="mathematics" class="std" ></div>
  
  
</div><div class="row">
  <div class="col-sm-2"><label for="sname">Statistics:</label></div>
  <div class="col-sm-4"><input type="number"  name="statistics" class="std" ></div>
  
  
</div>
<div class="row">
  <div class="col-sm-2"><label for="sname">Computer Science:</label></div>
  <div class="col-sm-4"><input type="number"  name="computerScience" class="std" ></div>
  
  
</div>
<div class="row">
  <div class="col-sm-2"></div>
  <div class="col-sm-4"><input type="submit" value="Submit"></div>
  
  
</div>

</form>
</div>
</body>
</head>
</html>
