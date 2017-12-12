(function(app) {
    var CustomersController = function($q, Customer, CustomersRepository) {
        var vm = this;
        vm.title = 'Available customers';
        vm.customers = [];
        activate();

        function activate() {
            return $q.resolve(getCustomers()).then(() =>
                console.log('Activated Main View'));
        }

        function getCustomers() {
            return CustomersRepository.getCustomers().then((data) => {
                angular.forEach(data, (customerDetail) =>
                    vm.customers.push(new Customer(customerDetail)));
                return vm.customers;
            });
        }
    }

    app.controller('CustomersController', CustomersController);
})(angular.module('boot'));
