<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body data-ng-app="demo">

<div class="container" data-ng-controller="demo1">
<div class="card-panel  green accent-4"> <h1><center>BECOME A SERVICE PROVIDER</center></h1></div>

<form:form modelAttribute="ServiceProvider" method="POST" action="ServiceProvider">

<input placeholder="First Name"  id="UserFirstName" type="text" class="active validate" name="UserFirstName" required>
<input placeholder="Last Name"  id="UserLastName" type="text" class="active validate" name="UserLastName" required>
<input placeholder="E-Mail ID"  id="User_Email" type="text" class="active validate" name="User_Email" required>
<input placeholder="Preferred Area"  id="PreferredArea" type="text" class="active validate" name="PreferredArea" required>
<br>
<div class="input-field">
    <select>
     
      <option ng-repeat="service in services">{{service}}</option>
     
    </select>
  </div>
  <br>
<input placeholder="Latitiude"  id="Latitiude" type="text" class="active validate" name="Latitiude" required>
<input placeholder="Longitude"  id="Longitude" type="text" class="active validate"  name="Longitude" required>
<input placeholder="Phone Number"  id="PhoneNumber" type="text" class="active validate"  name="PhoneNumber" required>
<button type="submit" value="Submit">Submit</button>

</form:form>

</div>
<script>
var demo = angular.module("demo", []);
demo.controller("demo1", function($scope, $http)
		{
	
	$http(
			{
				method:'GET',
				url:'/demo/MakeMeAsServiceProvider'
			}).then(function(response) {
		$scope.services = response.data;
		
		
	      
	});
		});
</script>
</body>
</html>