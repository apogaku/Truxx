 $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15, // Creates a dropdown of 15 years to control year,
    today: 'Today',
    clear: 'Clear',
    close: 'Ok',
    closeOnSelect: false // Close upon selecting a date,
  });
  
    $('.timepicker').pickatime({
    default: 'now', // Set default time: 'now', '1:30AM', '16:30'
    fromnow: 0,       // set default time to * milliseconds from now (using with default = 'now')
    twelvehour: false, // Use AM/PM or 24-hour format
    donetext: 'OK', // text for done-button
    cleartext: 'Clear', // text for clear-button
    canceltext: 'Cancel', // Text for cancel-button
    autoclose: false, // automatic close timepicker
    ampmclickable: true, // make AM PM clickable
    aftershow: function(){} //Function for after opening timepicker
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

    function bookTrip(){
    	var tripObj=new Object();
    	
        var start_date=document.getElementById('start_date').value;
        var start_time=start_date+" "+document.getElementById('start_time').value+":00.000000";
        var End_date=document.getElementById('End_date').value;
        var End_time=End_date+" "+document.getElementById('End_time').value+":00.000000";
        var Start_add=document.getElementById('Start_add').value;
        var End_add=document.getElementById('End_add').value;
        var capacity=document.getElementById('capacity').value;
        var drivertypeID;
    	if(document.getElementById('withdriver').checked==true) {
    		drivertypeID='1';
			
		}
    	else if(document.getElementById('withoutdriver').checked==true) {
    		drivertypeID='2';
		}
    	tripObj.tripId='1';
    	tripObj.tripStartTime=start_time;
    	tripObj.tripEndTime=End_time;
    	tripObj.tripDate=start_date;
    	tripObj.tripTypeId=drivertypeID;
    	tripObj.renterUserID='1'//getCookie('userid');
    	tripObj.tripStartLocationStreetName=Start_add;
    	
    	tripObj.tripDestinationStreetName=End_add;
    	

    	tripObj.Capacity=capacity;
    	var tripJson = JSON.stringify(tripObj);
    	var data=new Object();
    	console.log('http://localhost:8383/Truxx_final1/webresources/truxx/gettruckid/'+tripObj.Capacity+'/'+tripObj.tripStartTime+'/'+tripObj.tripEndTime);
    	$.getJSON('http://localhost:8383/Truxx_final1/webresources/truxx/gettruckid/'+tripObj.Capacity+'/'+tripObj.tripStartTime+'/'+tripObj.tripEndTime+'/', function(result) {

      		$.each(result, function(index, item) {
                  
      			tripObj.TruckID=item.truckId;
      			tripObj.TruckID=78;	
      			setCookie("truckid",tripObj.TruckID,1);
				  });
					
					
    	//	tripObj.TruckID=data.truckId;
    		  
      		
							
});
    	var tripObjJson = JSON.stringify(tripObj);
    	 $.ajax({
 			 type: "POST",
 			 url:'http://localhost:8383/Truxx_final1/webresources/truxx/addTrip',
 			 contentType:"application/json",
 			   dataType: 'json',
 			 data: tripObjJson,
 			 success: function(data, status) {
 				 
 				 alert("status");
 			 }});

    	}	