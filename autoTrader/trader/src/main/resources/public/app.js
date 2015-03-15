(function () 	
{
	var gem = {name : 'testaaa', price: 2.95};
	var app = angular.module('gemStore', []);
	
	app.controller('ControllerStore', function()	
	{
		this.product = gem;
	});
})


