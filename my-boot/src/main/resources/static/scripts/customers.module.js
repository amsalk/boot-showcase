(function(app) {
    var Customer = function(data) {
        this.id = data.id;
        this.firstName = data.firstName;
        this.lastName = data.lastName;
        this.balance = data.balance;
    }

    app.factory('Customer', function() {
        return Customer;
    });
})(angular.module('boot'));
