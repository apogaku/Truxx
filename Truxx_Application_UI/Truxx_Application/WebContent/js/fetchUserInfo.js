
   function setCookie(name, value, days) {
        var d = new Date;
        d.setTime(d.getTime() + 24*60*60*1000*days);
        document.cookie = name + "=" + value + ";expires=" + d.toGMTString();
    }

    function getCookie(name) {
        var v = document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
        return v ? v[2] : null;
    }
$.getJSON('http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.users/'+getCookie("userid"), function(data) {
	console.log("test"+data);
       document.getElementById('first_name').value=data.firstName;
       document.getElementById('last_name').value=data.lastName;
       document.getElementById('email').value=data.email;
       document.getElementById('street').value=data.streetName;
       document.getElementById('country').value="United States";
       document.getElementById('city').value="Charlotte";
        var cityID= "1";
        var cityName = document.getElementById('city').value;
		var stateID = "1";
		document.getElementById('Phone_number').value=data.contactNo;
		
		document.getElementById('state').value="NC";
		document.getElementById('zipcode').value="28262";
		var id = "1";
	  if(data.typeID.typeID==1){
		  document.getElementById('myspan').value="Renter";
		  
		  $('#tuckdetails').hide();
	  }
if(data.typeID.typeID==2){
	document.getElementById('myspan').value="Driver";
	$('#tuckdetails').show();
	
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
	
	 
	  }

    });

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
