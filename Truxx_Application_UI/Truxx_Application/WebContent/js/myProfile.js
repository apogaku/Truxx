/**
 * 
 */

 
function setCookie(name, value, days) {
    var d = new Date;
    d.setTime(d.getTime() + 24*60*60*1000*days);
    document.cookie = name + "=" + value + ";expires=" + d.toGMTString();
}

function getCookie(name) {
    var v = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
    return v ? v[2] : null;
}

function myFunction() {
  
 $('#tuckdetails').show();


}
function hidefunction() {
  
 $('#tuckdetails').hide();

}
var usertype="Driver";
function loadProfile(){

$.getJSON('http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.users/'+getCookie("userid"), function(data) {
	console.log("test"+data);
       document.getElementById('first_name').value=data.firstName;
       document.getElementById('last_name').value=data.lastName;
       document.getElementById('email').value=data.email;
       document.getElementById('street').value=data.streetName;
        var cityID= "1";
        var cityName = document.getElementById('city').value;
		var stateID = "1";
		document.getElementById('Phone_number').value=data.contactNo;
		
		document.getElementById('state').value="NC";
		document.getElementById('zipcode').value="28262";
		var id = "1";
	   var typeID=new Object();
	   typeID=data.typeID;
	   usertype=typeID.typeName;
	   document.getElementById('myspan').textContent=usertype;
	   if(usertype=="Driver")
	   	{
	   	myFunction();
	   	
	   	}
	   if(usertype=="Renter")
	   {
	   	hidefunction();

	   }
    });
}
