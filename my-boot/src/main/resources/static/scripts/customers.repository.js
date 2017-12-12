(function(app) {
    var customersRepo = function($http) {

        function getCustomers() {
            return $http.get('/api/v1/customers')
                .then(success)
                .catch(fail);

            function fail(e) {
                return exception.catcher('XHR Failed for getCustomers')(e);
            }

            function success(response) {
                return response.data;
            }
        }

        return {
            getCustomers: getCustomers
        };
    }

    app.service('CustomersRepository', customersRepo);
})(angular.module('boot'));
