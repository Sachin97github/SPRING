

function validate(frm)
{
	alert("Entered in Js");
	
    let eno=frm.eno.value;
    let ename=frm.ename.value;
    let sal=frm.sal.value;
    let deptno=frm.deptno.value;
    let flag=true;
    
     frm.scriptStatus.value="enabled";
    
    if(ename=="")
    {
    	flag=false;
    	document.getElementById("enameError").innerHTML="Name should not be Empty";
    }
    else if(!isNaN(ename))
    {
    	flag=false;
    	document.getElementById("enameError").innerHTML="Name should not be a Number";
   }
    else if(ename.length<5 || ename.length>10)
    {
    	flag=false;
    	document.getElementById("enameError").innerHTML="Name>5  and Name < 10";
   }
    
    if(sal=="")
    {
    	flag=false;
    	document.getElementById("salError").innerHTML="Salary should not be Empty";
    	
   }
    else if(isNaN(sal)){
    	flag=false;
		document.getElementById("salError").innerHTML="Salary Should be a Number";
	}
    else if(sal<10000)
    {
    	flag=false;
		document.getElementById("salError").innerHTML="Salary should more than 10000";
    }
    	
   return flag;
}