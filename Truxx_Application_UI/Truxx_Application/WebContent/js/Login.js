function setCookie(name, value, days) {
    var d = new Date;
    d.setTime(d.getTime() + 24*60*60*1000*days);
    document.cookie = name + "=" + value + ";expires=" + d.toGMTString();
}

function getCookie(name) {
    var v = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
    return v ? v[2] : null;
}

function validate(){
    var userName=document.getElementById('email').value;
    var userpsw=document.getElementById('password').value;
console.log("Your username is "+userName+" and your password is: "+userpsw);

  var userflag=0;
$.getJSON('http://localhost:8383/Truxx_final1/webresources/truxx/getlogindetails/', function(userdata) {
           
	
  
      		$.each(userdata, function(index, item) {
                  if(item.username==userName && item.password==userpsw){
					alert("success login"); 
					userflag=1;
								setCookie('userid',item.userID,1);
								setCookie('emailid',item.username,1);
								
								console.log("userid is: "+item.userID+" userid is: "+getCookie("userid")+"Email"+getCookie("emailid"));
								
								window.location="UserProfilepage.html"; 
				  }
					
					
                                                                             
                            });
							if(userflag==0)
							{
								
								alert("invalide credentials");
							}
});

	}	

