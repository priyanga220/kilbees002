<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <div class="header">
  	<div class="userLogin"><s:text name="user.login.signin" /></div>
    <div class="loginHeader"><s:text name="global.application.title" /></div>
  <!-- end .header --></div>
  <div class="content">
  	<div class="formLogin" align="center">
  		<s:form action="authenticate-user" namespace="/login" method="post" validate="true">

		  	<table border="0" cellspacing="0" cellpadding="5" id="tbl_login" align="center">
		  	  <tr>
		  	  	<td colspan="2"><s:actionerror /> </td>
		  	  </tr>
		      <tr>
		        <td style="height:22px;"><s:text name="user.login.email" /></td>
		        <td><table cellpadding="0" cellspacing="0">
		        	<s:textfield name="kilbeesLoginManager.username" cssClass="formcontrolstyle"  cssStyle="width:200px; height:22px" value=""  /></table></td>
		      </tr>
		      <tr>
		        <td style="height:22px;"><s:text name="user.login.password" /></td>
		        <td><table  cellpadding="0" cellspacing="0">
		        	<s:password name="kilbeesLoginManager.password" cssClass="formcontrolstyle" cssStyle="width:200px; height:22px" value=""/></table></td>
		      </tr>
		      <tr>
		        <td colspan="2" style="padding-top: 20px">
        		  <div class="fltlft pwdReset">
				   <div>
						<s:url var="forgotPasswordFormUrl" action="forgotPasswordForm.html" namespace="/user"/>
						<s:a href="%{#forgotPasswordFormUrl}"><s:text name="user.login.forgot.password" /></s:a></div>
				   </div>
				   <div class="fltrt">
				   	<table border="0" cellspacing="0" cellpadding="0">
				      <tr>
				        <td>
				        	<table>
				        	    <s:url var="signInImageUrl" value='/images/bttnSignin.png' includeParams="none"/>
				        		<s:submit cssStyle="width:135px;height:32px"  value="%{getText('user.login.signin')}" type="image"/>
							</table>
				       </td>
				       <td style="padding-left:20px;">
				       		<s:url var="resetImageUrl" value='/images/bttnCancel.png' includeParams="none"/>
				         	<input type="reset"	style="width:135px;height:32px;background: url('<s:property value="%{#resetImageUrl}" />') no-repeat;border:0" value=""/>
				        </td>
				      </tr>
				    </table>
				   </div>
		        </td>
		      </tr>
		    </table>
	    </s:form>
  </div>

  </div>
  </div>
</body>
</html>