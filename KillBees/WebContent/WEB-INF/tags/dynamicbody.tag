<%@tag description="Overall Page template" language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

		

  			<tag:bedcrumb/>
  			<tag:leftmenu/>
  			<div id="dynamicbody">
      			<jsp:doBody/>
    		</div>


