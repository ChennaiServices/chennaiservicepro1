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
<script type="text/javascript">
    (function()
    		{
    	
    	
    	 if(navigator.geolocation){
	           navigator.geolocation.getCurrentPosition(successCallback, errorCallback);
	         
	        } else{
	            alert("Please Enable your Browser to show your Location");
	        }
    	   
    	    function successCallback(position){
    	    	 
    	        document.getElementById("Latitiude").value =position.coords.latitude;
    	        document.getElementById("Longitude").value =position.coords.longitude;
    	    
    	    }
    	    
    	   
    	    function errorCallback(error){
    	        if(error.code == 1){
    	          alert("You've decided not to share your position, but it's OK. We won't ask you again.");
    	        } else if(error.code == 2){
    	        	alert("The network is down or the positioning service can't be reached.");
    	        } else if(error.code == 3){
    	        	alert("The attempt timed out before it could get the location data.");
    	        } else{
    	        	alert("Geolocation failed due to unknown error.");
    	        }
    	    }
    	
    		})();
   
</script>

</head>
<body data-ng-app="demo">

<div class="container" data-ng-controller="demo1">
<div class="card-panel  green accent-4"> <h1 class="black-text"><center>BECOME A SERVICE PROVIDER</center></h1></div>

<form:form modelAttribute="ServiceProvider" method="POST" action="ServiceProvider">

<input placeholder="First Name"   id="UserFirstName" type="text" class="active validate" name="UserFirstName"required>
<input placeholder="Last Name"  id="UserLastName" type="text" class="active validate" name="UserLastName" required>
<input placeholder="E-Mail ID"  id="User_Email" type="text" class="active validate" name="User_Email" required>
<input placeholder="Preferred Area"  id="PreferredArea" type="text" class="active validate" name="PreferredArea" required>
<br>
<select class="browser-default">
     
      <option ng-repeat="service in services">{{service}}</option>
     
    </select>
<div class="input-field">
    <select class="browser-default">
     
      <option ng-repeat="area in areas track by $index">{{area}}</option>
     
    </select>
  </div>
  <br>
<input placeholder="Latitiude"  id="Latitiude" type="text" class="active validate hide " name="Latitiude" >
<input placeholder="Longitude"  id="Longitude" type="text" class="active validate hide "  name="Longitude" >
<input placeholder="Phone Number"  id="PhoneNumber" type="text" class="active validate"  name="PhoneNumber" required>
 <button class="btn waves-effect waves-light" type="submit" name="action">Submit
    <i class="material-icons right"></i>
  </button>

</form:form>

</div>
<script>
var demo = angular.module("demo", []);
demo.factory('getAllAreas', function($cacheFactory)
		{
			return $cacheFactory('chennaiareas');
		});
demo.controller("demo1", function($scope, $http, getAllAreas)
		{
	var chennaiareas = getAllAreas.get('chennaiareas');
	if(chennaiareas)
		{
		alert("CACHED ");
		$scope.areas = chennaiareas;
		}
	else
		{
		$http(
				{
					method:'GET',
					url:'/demo/GetAllAreas'
				}).then(function(response) {
			$scope.areas = response.data;
			
		getAllAreas.put('chennaiareas',$scope.areas);
			
			});
		
	}
	
	$http(
			{
				method:'GET',
				url:'/demo/GetAllServices'
			}).then(function(response) {
		$scope.services = response.data;
		});
	
		});
</script>
</body>
</html>