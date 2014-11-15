<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html lang=en> 
<head> 
<title>Log In - KilBees</title> 
<sj:head jqueryui="true" jquerytheme="start" defaultIndicator="defaultIndicator"/>
<meta http-equiv=Content-Type content="text/html; charset=utf-8" /> 
<!-- <link rel=icon type=image/ico href="favicon.html"/> --> 

<link href="<s:url value="/js/kilbees-alive/css/stylesheets.css" includeParams="none"/>" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/plugins/jquery/jquery-ui.min.js" includeParams="none"/>"></script>

<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/plugins/jquery/jquery-migrate.min.js" includeParams="none"/>"></script>
<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/plugins/jquery/globalize.js" includeParams="none"/>"></script>
<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/plugins/bootstrap/bootstrap.min.js" includeParams="none"/>"></script>
<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js" includeParams="none"/>"></script>
<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/plugins/uniform/jquery.uniform.min.js" includeParams="none"/>"></script>
<script type="text/javascript" src="<s:url value="/js/kilbees-alive/js/js.js" includeParams="none"/>"></script> 

<script type="text/javascript">
function submitLoginForm()
{
	$("#credentials-form").submit();
}

</script>
</head> 
<body class=bg-img-num1> 
	<div class=container> 
		<div class=login-block> 
			<div class="block block-transparent"> 
				<div class=head> 
				<div class="userLogin"><s:text name="user.login.signin" /></div>
    			<div class="loginHeader"><s:text name="global.application.title" /></div>
					<div class=user> 
						<div class="info user-change"> 
							<img id="defaultIndicator" src="<s:url value="/js/kilbees-alive/img/user.jpg" includeParams="none"/>" class="img-circle img-thumbnail" /> 
							<!-- <img src=img/example/user/dmitry_b.jpg class="img-circle img-thumbnail"/>  -->
								<%-- <div class=user-change-button> <span class=icon-off></span> 
								</div>  --%>
						</div> 
					</div> 
				</div> 
				<div class="content controls npt">
					<s:form action="authenticate-user" id="credentials-form" name="credentials-form" namespace="/login" method="post" validate="true"> 
					<!--  <div class="form-row user-change-row">  -->
	 				<div class=col-md-12> 
						 <div class=input-group> 
							 <div class=input-group-addon> <span class=icon-user></span> </div> 
							 <input name="kilbeesLoginManager.username" id="kilbeesLoginManager.username" type=text class=form-control placeholder="Login"/>
						 </div> 
					</div> 
					<!--  </div>  -->
					
	<br/>
	
					 <div class=form-row> 
						 <div class=col-md-12> 
							 <div class=input-group> 
								 <div class=input-group-addon> <span class=icon-key></span> </div> 
								 <input name="kilbeesLoginManager.password" id="kilbeesLoginManager.password" type=password class=form-control placeholder="Password"/> 
							 </div> 
						 </div> 
					 </div> 
					 <div class=form-row> 
						 <div class=col-md-12> <s:actionerror /></div> 
					 </div> 
					 
					 <div class=form-row> 
						 <div class=col-md-6> <a href=# class="btn btn-default btn-block btn-clean">Register</a> </div> 
						 <!-- <div class=col-md-6> <a href=# class="btn btn-default btn-block btn-clean">Log In</a> </div>  -->
						 <div class=col-md-6><input type="button" class="btn btn-default btn-block btn-clean" value="Log IN" onclick="submitLoginForm();"></input></div>
				         <%-- <div class=col-md-6> <s:submit cssClass="btn btn-default btn-block btn-clean"  value="%{getText('user.login.signin')}"/> </div> --%>
					 </div> 
					 <div class=form-row> 
					 <div class=col-md-12> 
					 <s:url var="forgotPasswordFormUrl" action="forgotPasswordForm.html" namespace="/user"/>
						<s:a cssClass="btn btn-link btn-block" href="%{#forgotPasswordFormUrl}"><s:text name="user.login.forgot.password"/></s:a></div>
					 	<!-- <a href=# class="btn btn-link btn-block">Forgot your password?</a>  -->
					 </div> 
					 </s:form>
				 </div> 
				 <%-- <div class=form-row> 
				 	<div class="col-md-12 tac"><strong>OR USE</strong></div> 
				 </div> 
				 <div class=form-row> 
				 	<div class=col-md-12> <a href=# class="btn btn-info btn-block"><span class=icon-facebook></span> &nbsp; Facebook</a> </div> 
				 </div> 
				 <div class=form-row> 
				 <div class=col-md-12> <a href=# class="btn btn-primary btn-block"><span class=icon-twitter></span> &nbsp; Tweeter</a> </div> 
				 </div>  --%>
 				</div> 
 			</div> 
 		</div> 
 	</div> 
 </body> 
 </html>