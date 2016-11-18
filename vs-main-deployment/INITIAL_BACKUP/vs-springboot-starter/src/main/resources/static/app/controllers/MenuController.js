var myApp=angular.module("menuModule",[]);


myApp.controller('menulist', function($scope, $http) {
    $http.get('http://localhost:8085/menu/getmenu?itemNo=3').then(function(response) {
            Menu = response.data;
            console.log(Menu);
            $scope.Menu=Menu;
            $scope.greeting="hai";
        });
    
});

myApp.controller("testmenulist",function($scope){

var Menu = [{itemNo: 3, itemName: "dosai", itemDate: 1478563200000, remarks: "today special", price: 5},
{itemNo: 3, itemName: "dosai", itemDate: 1478563200000, remarks: "today special", price: 5}];

$scope.Menu=Menu;
});


myApp.controller('allmenulist', function($scope, $http) {
    $http.get('http://localhost:8085/menu/getallmenu').then(function(response) {
            Menu = response.data;
            console.log(Menu);
            $scope.Menu=Menu;
            $scope.greeting="hai";
        });
    
});


function getAllMenu($scope, $http) {

    $scope.people = [];

    $scope.loadmenu = function() {
        var httpRequest =     $http.get('http://localhost:8085/menu/getallmenu').success(function(data, status) {
            $scope.Menu = data;
        });

    };

}



