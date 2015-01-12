(function(){
var app = angular.module('store',[ ]);

app.controller('StoreController',function(){
	this.products = gems;
});

var gems = [
{	
	name : 'Dodecahedron',
	price: 2.95,
	description: 'Bla Bla Bla',
	canPurchase: true,
	soldOut: false,
},
{
	name: 'Pentagonal Gem',
	price: 5.95,
	description: 'Bla Bla Bla Bla... ',
	canPurchase: true,
	soldOut: false,
},
{
	name: 'Azurite', 
	price: 2.95,
	description: 'Bla Bla...',
	canPurchase: true,
	soldOut: false,
},
{
	name: 'Zircon', 
	price: 3.95,
	description: 'Bla...',
	canPurchase: true,
	soldOut: false,
},
]
})();