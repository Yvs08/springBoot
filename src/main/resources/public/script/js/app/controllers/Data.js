

mainApp.controller('dataController', function ($scope, $http) {
    $scope.plop = {};

    $scope.plop = {
        description: 'ABC',
        code: 'CVB',
    };

    $scope.submitForm = function () {
        console.log("posting data....");
        formData = $scope.plop;
        console.log(formData);
        var addUrl = 'http://localhost:8080/datasource/adddatasource';
        $http.post(addUrl,formData)
                .success(function ( ) {
              
                });
    };

});








