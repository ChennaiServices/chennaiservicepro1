<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/angular.min.js"></script>
<title>Insert title here</title>
</head>


<body data-ng-app="demo">

<div data-ng-controller="demo1" class="container">
<div class=row>
 <div class="input-field col s6">
          <input placeholder="Search The Service You Needed" id="search_service" type="text" class="validate" ng-model="searchservice">
          <label for="search_service">Search Service</label>
        </div>
</div>
<div class="row" >
<div class="col s12 m6 l4" ng-repeat="service in services | filter:{service:searchservice}">

        <a href="{{service.service}}">  <div class="card">
            <div class="card-image">
              <img src="{{service.servicepic}}">
              <span class="card-title black-text"><b>{{service.service}}</b></span>
            </div>
            <div class="card-content">
              <p>{{service.servicedesc}}.</p>
            </div>
            <div class="card-action">
              <a>{{service.service}}</a>
            </div>
          </div>
          </a>
</div>
</div>
</div> 
  <script>
var demo = angular.module("demo", []);
demo.controller("demo1", function($scope, $http)
		{
	
	$http(
			{
				method:'GET',
				url:'/demo/services'
			}).then(function(response) {
		$scope.services = response.data;
		
	      
	});
		});
</script>
</body>


</html>