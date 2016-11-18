var helloAjaxApp = angular.module("helloAjaxApp", []);

helloAjaxApp.controller("CompanyCtrl", ['$scope', '$http', function($scope, $http) {
	$scope.companies = [
	                    { 'name':'Infosys Technologies',
	                    	'employees': 125000,
	                    	'headoffice': 'Bangalore'},
	                    	{ 'name':'Cognizant Technologies',
		                    	'employees': 100000,
		                    	'headoffice': 'Bangalore'},
		                    	{ 'name':'Wipro',
			                    	'employees': 115000,
			                    	'headoffice': 'Bangalore'},
			                    	{ 'name':'Tata Consultancy Services (TCS)',
				                    	'employees': 150000,
				                    	'headoffice': 'Bangalore'},				                    	
	                    ];
	
	$scope.addRowAsyncAsJSON = function(){		
		$scope.companies.push({ 'name':$scope.name, 'employees': $scope.employees, 'headoffice':$scope.headoffice });
		// Writing it to the server
		//		
		var dataObj = {
				itemName : $scope.itemName,
				itemDate : $scope.itemDate,
				remarks : $scope.remarks,
				price: $scope.price
				
		};	
		var res = $http.post('/menu/addmenu', dataObj);
		res.success(function(data, status, headers, config) {
			$scope.Menu = data;
		});
		res.error(function(data, status, headers, config) {
			alert( "failure message: " + JSON.stringify({data: data}));
		});		
		// Making the fields empty
		//
		$scope.itemName='';
		$scope.itemDate='';
		$scope.remarks='';
		$scope.price='';
	};
}]);