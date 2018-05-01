$(document).ready(function () {

function setCookie(name, value, days) {
    var d = new Date;
    d.setTime(d.getTime() + 24*60*60*1000*days);
    document.cookie = name + "=" + value + ";expires=" + d.toGMTString();
}

function getCookie(name) {
    var v = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
    return v ? v[2] : null;
}
function deleteAllCookies() {
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var eqPos = cookie.indexOf("=");
        var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
        document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
}

var emaildisp=getCookie("emailid");
document.getElementById('dispEmail').textContent=emaildisp;

 $("#logout-btn").click(function (event) {
     console.log(getCookie('userid'));
     //delete cookie
     deleteAllCookies();
     window.location="index.html"; 
 });
 $("#delete-prof").click(function (event) {
     console.log(getCookie('userid'));
	 var userid=getCookie('userid');
    
	 		$.ajax({
  type:"POST",
  url: 'http://localhost:8383/Truxx_final1/webresources/truxx/deletelogin/'+getCookie('userid'),
  contentType:"application/json",
  dataType: 'json'
  
  
});
	 
		 		$.ajax({
  type:"POST",
  url: 'http://localhost:8383/Truxx_final1/webresources/truxx/deleteUser/'+getCookie('userid'),
  contentType:"application/json",
  dataType: 'json'
  
  
 
}); 
	 
     deleteAllCookies();
	 alert("Profile deleted");
     window.location="index.html"; 
 });


function displayUserName(loguserId)
	{
	
		
	}

});