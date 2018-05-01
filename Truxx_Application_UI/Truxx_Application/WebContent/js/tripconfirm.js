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

    $(document).ready(function () {
    		console.log('truckid'+getCookie('truckid'));
    	 document.getElementById('last_name').value=getCookie('truckid');
    	 $.getJSON('http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.trucks/'+getCookie('truckid'), function(userdata) {
      		
    		 document.getElementById('model').value=userdata.make;
 				
 							
 });
    	
        

    });