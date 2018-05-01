

$(document).ready(function () {
  $('#datePicker').val(new Date().toDateInputValue());
 $("#Submitkey").click(function (event) {
	 alert("On submit")
	 var registerJson=new Object();
	 var cityIDObj=new Object();
	 var stateIDObj=new Object();
	 var typeIDObj=new Object();
	 var zipcodeIDObj=new Object();
	 var firstname = document.getElementById('first_name').value;
        var lastname = document.getElementById('last_name').value;
        var email = document.getElementById('email').value;
        var password = "test";
        var streetName = document.getElementById('street').value;
        var cityID= "1";
        var cityName = document.getElementById('city').value;
		var stateID = "1";
		var contactNo = document.getElementById('Phone_number').value;
		var dateOfBirth = document.getElementById('datepicker').value;
		var stateName = document.getElementById('state').value;
		var zipcode = document.getElementById('zipcode').value;
		var id = "1";
		
		
		
		registerJson.firstName=firstname;
		registerJson.lastName=lastname;
		registerJson.email=email;
		registerJson.streetName=streetName;
		registerJson.contactNo=contactNo;
		

		var registerJsonres = JSON.stringify(registerJson);
		console.log("check city json"+registerJsonres);
alert(registerJsonres);
  $.ajax({
type: "POST",
url:'http://localhost:8383/Truxx_final1/webresources/truxx/updateUser/',
contentType:"application/json",
  dataType: 'json',
data: registerJsonres,
success: function(data, status) {

                        alert("Profile updated");
                    }
   


})
   
       
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

});
