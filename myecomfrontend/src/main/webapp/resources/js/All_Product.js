 
var mainApp = angular.module("ngAppProduct", []);
         
         mainApp.controller('allProduct', function($scope) {
            $scope.allProductData =[ {sno:'1',name:'Balancing Lotion',brand:'Artistry Amway',category:'Skin Care',supplier:'Arun'},
            	{sno:'2',name:'Polishing Scrub',brand:'Artistry',category:'Skin Care',supplier:'Amway'},
            	{sno:'3',name:'Eye Liner ',brand:'Amway',category:'Eye Care',supplier:'Abhishek'},
            	{sno:'4',name:'duo color eye pencil(Sizzling silver & Rich emerald)',brand:'Lakme',category:'Eyes Care',supplier:'Arun'},
            	{sno:'5',name:'Nail Enamel (Pink Statement)',brand:'Attitude',category:'Skin Care',supplier:'Abhishek'}
            	];
//            
//                  {sno:'2',name:'Polishing Scrub',brand:'Artistry',category:'Skin Care',supplier:'Amway'},
//                  {sno:'3',name:'Eye Liner ',brand:'Amway',category:'Eye Care',supplier:'Abhishek'},
//                  {sno:'4',name:'duo color eye pencil(Sizzling silver & Rich emerald)',brand:'Lakme',category:'Eyes Care',supplier:'Arun'},
//                  {sno:'5',name:'Nail Enamel (Pink Statement)',brand:'Attitude',category:'Skin Care',supplier:'Abhishek'}
//             
        	 
	        	 $scope.msg="arun";
         });