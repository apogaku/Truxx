/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



$(document).ready(function () {
 var i=0;
 $('#tuckdetails').hide();
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
 function OnChangeRadio() {
    alert("show");
 $('#tuckdetails').show();
}
 $("#addIcon").click(function (event) 
{
	i=i+1;
    let tbody = createNode('tbody'),tr=createNode('tr'),td1=createNode('td'),td2=createNode('td'),td3=createNode('td'),
	td1_value=createNode('select'),td1_option=createNode('option'),td1_option1=createNode('option'),td1_option2=createNode('option'),td1_option3=createNode('option'),td1_option4=createNode('option'),td1_option5=createNode('option'),
	td2_value = createNode('select'),td2_option=createNode('option'),td2_option1=createNode('option'),td2_option2=createNode('option'),td2_option3=createNode('option'),td2_option4=createNode('option'),td2_option5=createNode('option'),
	td3_value = createNode('select'),td3_option=createNode('option'),td3_option1=createNode('option'),td3_option2=createNode('option'),td3_option3=createNode('option'),td3_option4=createNode('option'),td3_option5=createNode('option');

   td1_value.id="make"+i;
   td1_value.className="browser-default";
   td2_value.className="browser-default";
   td3_value.className="browser-default";
	   td2_value.id="model"+i;
	td3_value.id="year"+i;
	td1_option.value="";
	td1_option1.value="GMC 15' truck";
	td1_option2.value="GMC 17' truck";
	td1_option3.value="GMC 20' truck";
	td1_option4.value="Ford";
	td1_option5.value="Volvo";
	td1_value.appendChild(td1_option);
	td1_value.appendChild(td1_option1);
	td1_value.appendChild(td1_option2);
	td1_value.appendChild(td1_option3);
	td1_value.appendChild(td1_option4);
	td1_value.appendChild(td1_option5);
	td1_option.textContent="Make";
	td1_option.disabled="true";
	td1_option1.textContent="GMC 15' truck";
	td1_option2.textContent="GMC 17' truck";
	td1_option3.textContent="GMC 20' truck";
	td1_option4.textContent="Ford";
	td1_option5.textContent="Volvo";
	td2_option.value="";
	td2_option1.value="21521360299";
	td2_option2.value="42315145199";
	td2_option3.value="38745225999";
	td2_option4.value="49201114399";
	
	td2_value.appendChild(td2_option);
	td2_value.appendChild(td2_option1);
	td2_value.appendChild(td2_option2);
	td2_value.appendChild(td2_option3);
	td2_value.appendChild(td2_option4);
	
	td2_option.textContent="Model";
	td2_option.disabled="true";
	td2_option1.textContent="21521360299";
	td2_option2.textContent="42315145199";
	td2_option3.textContent="38745225999";
	td2_option4.textContent="49201114399";
	td3_option.value="";
	td3_option1.value="2017";
	td3_option2.value="2016";
	td3_option3.value="2015";
	td3_option4.value="2014";
	
	td3_value.appendChild(td3_option);
	td3_value.appendChild(td3_option1);
	td3_value.appendChild(td3_option2);
	td3_value.appendChild(td3_option3);
	td3_value.appendChild(td3_option4);
	
	td3_option.textContent="Year";
	td3_option.disabled="true";
	td3_option1.textContent="2017";
	td3_option2.textContent="2016";
	td3_option3.textContent="2015";
	td3_option4.textContent="2014";
	
	
	td1.appendChild(td1_value);
	td2.appendChild(td2_value);
	
	td3.appendChild(td3_value);	
	
	tr.appendChild(td1);
	
	tr.appendChild(td2);
	tr.appendChild(td3);
	
	 document.getElementById("tbody").appendChild(tr);




});
 
 $("#Submitkey").click(function (event) {
	 alert("On submit")
	 var registerJson=new Object();
	 var cityIDObj=new Object();
	 var stateIDObj=new Object();
	 var typeIDObj=new Object();
	 var zipcodeIDObj=new Object();
	 var driverIDObj=new Object();
	 var truckObj=new Object();
	 var truckins=new Object();
	 var TypeID;
	 var TypeName;
	 var firstname = document.getElementById('first_name').value;
        var lastname = document.getElementById('last_name').value;
        var email = document.getElementById('email').value;
        var password = "test";
        var streetName = document.getElementById('street').value;
        var cityID= "1";
        var cityName = document.getElementById('city').value;
		var ssn,Drivinglicensenumber,licenseexpirydate,make,model,year;
        var stateID = "1";
		var contactNo = document.getElementById('Phone_number').value;
		var dateOfBirth = document.getElementById('datepicker').value;
		var stateName = document.getElementById('state').value;
		var zipcode = document.getElementById('zipcode').value;
		if(document.getElementById('driver').checked==true) {
			TypeID=2;
			TypeName="Driver";
			ssn=document.getElementById('ssn').value;
			Drivinglicensenumber= document.getElementById('license').value;
			licenseexpirydate= document.getElementById('licenseExpiryDate').value;
			
		}else if(document.getElementById('renter').checked==true) {
			TypeID=1;
			TypeName="Renter";
		}
		var dateOfBirth = document.getElementById('datepicker').value;
		var stateName = document.getElementById('state').value;
		var zipcode = document.getElementById('zipcode').value;
		var id = "1";
		cityIDObj.cityID=cityID;
		cityIDObj.cityName="Charlotte";
		stateIDObj.stateID=cityID;
		stateIDObj.stateName="NC";
		typeIDObj.typeID=TypeID;
		typeIDObj.typeName=TypeName;
		cityIDObj.stateID=stateIDObj;//city object
		zipcodeIDObj.id="1";
		zipcodeIDObj.zipcode="28262"
		registerJson.cityID=cityIDObj;
		registerJson.contactNo=contactNo;
		registerJson.dateOfBirth=dateOfBirth;
		
		registerJson.email=email;
		registerJson.firstName=firstname;
		registerJson.lastName=lastname;
		registerJson.stateID=stateIDObj;
		registerJson.streetName=streetName;
		registerJson.typeID=typeIDObj;
		registerJson.userID="104";
		registerJson.zipcodeID=zipcodeIDObj;
if(TypeName=="Driver"){
	driverIDObj.id="111";
	driverIDObj.licenseNumber=Drivinglicensenumber;
	driverIDObj.ssn=ssn;
	driverIDObj.userId=registerJson;
	var driverJson=JSON.stringify(driverIDObj);
	console.log("check drivers json"+driverJson);
}

var registerJsonres = JSON.stringify(registerJson);
		console.log("check usesrs json"+registerJsonres);
		
	var logindetails=new Object();
		
	logindetails.Username=email;
	logindetails.Password=password;
		
		
		
		
alert(registerJsonres);
  $.ajax({
type: "POST",
url:'http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.users',
contentType:"application/json",
  dataType: 'json',
data: registerJsonres,
success: function(data, status) {
	

                        alert("Success");
                        $.getJSON('http://localhost:8383/Truxx_final1/webresources/truxx/getuserid/'+email, function(userdata) {
                            
                        	var userid=userdata.userID;
                        	if(TypeName=="Driver"){
                        		driverIDObj.id="111";
                        		driverIDObj.licenseNumber=Drivinglicensenumber;
                        		driverIDObj.ssn=ssn;
                        		registerJson.userID=userid;
                        		driverIDObj.userId=registerJson;
                        		var driverJson=JSON.stringify(driverIDObj);
                        		console.log("check drivers json"+driverJson);
                        		 $.ajax({
                        			 type: "POST",
                        			 url:'http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.driver',
                        			 contentType:"application/json",
                        			   dataType: 'json',
                        			 data: driverJson,
                        			 success: function(data, status) {
                        				 
                        				 alert("Driver details saved");
                        			
                        						var oRows = document.getElementById('table').getElementsByTagName('tr');
                        						var iRowCount = oRows.length;
                        						for(i=0;i<oRows.length;i++)
                        						{
                        							if(i!=0){
                        								var e = document.getElementById("make"+i);
                        						var value = e.options[e.selectedIndex].value;
                        						 make = e.options[e.selectedIndex].text;
                        						 var e1 = document.getElementById("model"+i);
                        							var value1 = e1.options[e1.selectedIndex].value;
                        						model= e1.options[e1.selectedIndex].text;
                        						var e2 = document.getElementById("year"+i);
                        						var value2 = e2.options[e2.selectedIndex].value;
                        						year= e2.options[e2.selectedIndex].text;
                        						}
                        							else
                        							{
                        								var e = document.getElementById("make");
                        						var value = e.options[e.selectedIndex].value;
                        						 make = e.options[e.selectedIndex].text;
                        						 var e1 = document.getElementById("model");
                        							var value1 = e1.options[e1.selectedIndex].value;
                        						model= e1.options[e1.selectedIndex].text;
                        						var e2 = document.getElementById("year");
                        						var value2 = e2.options[e2.selectedIndex].value;
                        						year= e2.options[e2.selectedIndex].text;
                        						}
                        							truckObj.capacity="110"
                        			   				 truckObj.make=make;
                        			   				 truckObj.model=model;
                        			   				 truckObj.year=year;
                        			   				truckObj.truckId='1'; 
                        			   			truckObj.userID=registerJson;	
                        					
                        			var trcksjson=JSON.stringify(truckObj);
                        			console.log("check trucks"+driverJson);
                        				 $.ajax({
                                			 type: "POST",
                                			 url:'http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.trucks',
                                			 contentType:"application/json",
                                			   dataType: 'json',
                                			 data: trcksjson,
                                			 success: function(data, status) {
                                				 
                                				 alert("Truck details saved");
                                			 }})
                        						} }})
                        			 
                        			
                        			 		
                        	}
                        	logindetails.userID=userid;
                        	var logindetailsJson = JSON.stringify(logindetails);
                        	  $.ajax({
                     			 type: "POST",
                     			 url:'http://localhost:8383/Truxx_final1/webresources/truxx/addLogin',
                     			 contentType:"application/json",
                     			   dataType: 'json',
                     			 data: logindetailsJson,
                     			 success: function(data, status) {
                     				 
                     				 alert("Login details saved");
                     			 }})
                								setCookie('userid',userdata.userID,1);
                								setCookie('emailid',email,1);
                								console.log("userid is:  "+getCookie("userid"));
                								
                								window.location="UserProfilepage.html"; 
                				     
                							
                });              
}
  


})

   

       
 });
});
