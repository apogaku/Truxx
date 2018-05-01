 console.log("LoadPrice js");
 function createNode(element) {
      return document.createElement(element);
  }
const table = document.getElementById('table');

  function append(parent, el) {
    return parent.appendChild(el);
  }
$.getJSON('http://localhost:8383/Truxx_final1/webresources/com.truxx.entities.pricechart', function(data) {
	console.log("test"+data);
	var i=0;
      		$.each(data, function(index, item) {
			i++;
			console.log("TEst data "+item.genreName);
               let tbody = createNode('tbody'),tr=createNode('tr'),td1=createNode('td'),td2=createNode('td'),td3=createNode('td'),td4=createNode('td'),
				td1_value=createNode('text'),
				td2_value = createNode('text'),
				td3_value = createNode('text'),
				td4_value = createNode('text');
               td1_value.className="rtest";
               td1_value.value=i;
				td2_value.value="<"+item.capacity;
				td3_value.value=item.rate+" per hour";
				td4_value.value=item.tripTypeID.tripTypeName;
				
				td1.textContent=td1_value.value;
				td2.textContent=td2_value.value;
				td3.textContent=td3_value.value;
				td4.textContent=td4_value.value;
				
				tr.appendChild(td1);
				
				tr.appendChild(td2);
				tr.appendChild(td3);
				tr.appendChild(td4);
				 document.getElementById("table").appendChild(tr);
					
				//append(table, tr);	
						
});
  
    });
     