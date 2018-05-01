/**
 * 
 */
$(document).ready(function() {
  $('select').attr("class", "browser-default")



 

$.getJSON('http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.users/'+getCookie("userid"), function(data) {
	console.log("test"+data);
       document.getElementById('first_name').value=data.firstName;
      document.getElementById('last_name').value=data.lastName;
       document.getElementById('email').value=data.email;
      document.getElementById('street').value=data.streetName;
      document.getElementById('city').value="Charlotte";
      document.getElementById('country').value="United States";
      var d = new Date("03/25/2015");
      document.getElementById('datepicker').value=d;
        var cityID= "1";
        var usertype="Driver";
        var typeID=new Object();
 	   typeID=data.typeID;
        usertype=typeID.typeName;
 	   document.getElementById('myspan').textContent=usertype;
        if(usertype=="Driver")
	   	{
	   	myFunction();
	   	$.getJSON('http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.driver/'+getCookie("userid"), function(driver) {
			 document.getElementById('ssn').value=driver.ssn;
			 document.getElementById('license').value=driver.licenseNumber;
			 document.getElementById('licenseExpiryDate').value="04/30/2018";
		});
	    $.getJSON('http://localhost:8383/Truxx_final1/webresources/truxx/gettrucks/'+getCookie("userid"), function(userdata) {
	    	var i=0;
	    	$.each(userdata, function(index, item) {
	    	
	    		i++;
				
	               let tbody = createNode('tbody'),tr=createNode('tr'),td1=createNode('td'),td2=createNode('td'),td3=createNode('td'),td4=createNode('td'),td5=createNode('td'),
					td1_value=createNode('text'),
					td2_value = createNode('text'),
					td3_value = createNode('text'),
					td4_value = createNode('text'),
	               td5_value = createNode('text');
	               
	               td1_value.className="rtest";
	               td1_value.value=i;
					td2_value.value=item.capacity;
					td3_value.value=item.model;
					td4_value.value=item.make;
					td5_value.value=item.year;
					td1.textContent=td1_value.value;
					td2.textContent=td2_value.value;
					td3.textContent=td3_value.value;
					td4.textContent=td4_value.value;
					td5.textContent=td5_value.value;
					
					tr.appendChild(td1);
					tr.appendChild(td2);
					tr.appendChild(td3);
					tr.appendChild(td4);
					tr.appendChild(td5);
					 document.getElementById("table").appendChild(tr);
	    	});
	    	
				     
							
});    
		document.getElementById('ssn').value;
		document.getElementById('license').value;
		document.getElementById('licenseExpiryDate').value;
		document.getElementById("make");
		
	   	}
	   if(usertype=="Renter")
	   {
	   	hidefunction();

	   }
        var cityName = document.getElementById('city').value;
		var stateID = "1";
		document.getElementById('Phone_number').value=data.contactNo;
		
		document.getElementById('state').value="NC";
		document.getElementById('zipcode').value="28262";
		var id = "1";
	  
	   
	  
    });
function setCookie(name, value, days) {
    var d = new Date;
    d.setTime(d.getTime() + 24*60*60*1000*days);
    document.cookie = name + "=" + value + ";expires=" + d.toGMTString();
}

function getCookie(name) {
    var v = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
    return v ? v[2] : null;
}
function createNode(element) {
    return document.createElement(element);
}
const table = document.getElementById('table');

function append(parent, el) {
  return parent.appendChild(el);
}
function myFunction() {
  
 $('#tuckdetails').show();


}
function hidefunction() {
  
 $('#tuckdetails').hide();

}
});