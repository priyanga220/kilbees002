<%@tag description="Overall Page template" language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <html lang=en>
	<tag:header></tag:header>
	<body class=bg-img-num1> 
		<tag:topnavigator></tag:topnavigator>  		
		<div id="dynamicBodyContext">
  			<tag:bedcrumb/>
  			<tag:leftmenu/>
  			<div id="body">
      			<jsp:doBody/>
    		</div>
    	</div>
  	</body> 
  </html>
