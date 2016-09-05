//Blake Carter Lab13 created 1/5/2014 2:23 PM 

function validate (){
	var isValid = true;
	var fName = document.getElementById('firstname');
	var sName = document.getElementById('surname');
	var phone = document.getElementById('phone');
	var sender = document.getElementById('sender');
	

	var fNameErr = document.getElementById('firstnameError');
	fNameErr.innerHTML="";
	var sNameErr = document.getElementById('surnameError');
	sNameErr.innerHTML="";
	
	var phoneErr = document.getElementById('phoneError');
	var phoneNum = /^[0-9 -]+$/;
	phoneError.innerHTML="";
	
	var senderErr = document.getElementById('senderError');
	var sendercar = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}$/
	senderError.innerHTML="";
	
	
	if(fName.value == "" || fName.value == ""){
		isValid = false;
		fNameErr.innerHTML = "You must include a first name."
	}
	
	if(sName.value == "" || sName.value == ""){
		isValid = false;
		sNameErr.innerHTML = "You must include a last name."
	}
	
	if(!phone.value.match(phoneNum)){
		isValid = false;
		phoneErr.innerHTML = "You must include a valid phone 		number."
	}
	
	if(!sender.value.match(sendercar)){
	    isValid = false;
	    senderErr.innerHTML = "You must include a valid email address."
	}
	
	return isValid;
}
	


