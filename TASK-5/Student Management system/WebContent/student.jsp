 <!DOCTYPE html>
<html lang="eng">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>


<body>

<div class="row">
  <div class="col-sm-12"><h3 style="background: lavender;text-align: center;">Student Management System</h3></div>
 
</div>
<form action="StudentServlet" method="post">
<div class="row">
  <div class="col-sm-2"><label for="fname">First Name:</label></div>
  <div class="col-sm-4"><input type="text" id="fname" name="fName" class="std" ></div>
  </div>
  
  <div class="row">
  <div class="col-sm-2"><label for="lname">Last Name:</label></div>
  <div class="col-sm-4"><input type="text" id="lname" name="lName" class="std" ></div>
 </div>
  <div class="row">
  <div class="col-sm-2"><label for="rno">Roll No:</label></div>
  <div class="col-sm-4"><input type="text" id="rno" name="rno" class="std" ></div>
</div>
 
 
<div class="row">
  <div class="col-sm-2"><label for="mname">Email:</label></div>
  <div class="col-sm-4"><input type="text"  name="email" class="std" ></div>
  </div>
  <div class="row">
  <div class="col-sm-2"><label for="mname">Grade :</label></div>
  <div class="col-sm-4"><input type="text"  name="grade" class="std" ></div>
  </div>
<input type="submit" value="submit">
</form>
</body>
</html>
 