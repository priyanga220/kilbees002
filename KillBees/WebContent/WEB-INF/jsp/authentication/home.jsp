<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>	
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<sj:head jqueryui="true" jquerytheme="cupertino" defaultIndicator="defaultIndicator"/>
	<title>Insert title here</title>

	<script type="text/javascript" src="<s:url value="/js/carouselmenu/jquery.mousewheel.js" includeParams="none"/>"></script>
	
	<script type="text/javascript" src="<s:url value="/js/carouselmenu/ui.core.js" includeParams="none"/>"></script>
	
	<script type="text/javascript" src="<s:url value="/js/carouselmenu/ui.carousel.js" includeParams="none"/>"></script>
	
	<link href="<s:url value="/css/carouselmenu/style.css" includeParams="none"/>" rel="stylesheet" type="text/css" />
	<style type="text/css">
	
		.demo {
			border: 1px solid #eee;
			background: #000;
		}
		#carousel { position: relative; height: 350px; margin: 0; padding: 0; }
		#carousel li { float: left; cursor: pointer; cursor: hand; list-style: none; margin: 0; padding: 0; width: 128px; height: 128px; }
		#carousel li img { height: 100%; width: 100%; }	
	
	</style>

</head>
<body>

	You Are Authenticated......
	Category Name  : <s:property value="category.categoryName"/></p>
		<s:select headerKey="-1" headerValue="select Item"
					    name="drugitem"
					    id="drugitem"
						list="category.drugItems"	listKey="itemNo" listValue="tradeName"
						label="DrugItems"/>
		
	
	<s:iterator value="category.drugItems">
  <p>Drug item is  : <s:property value="tradeName"/></p>
</s:iterator>

<s:url id="viewItemURL" action="view-full-item-list" namespace="/item" ></s:url>
<s:url id="viewMenu1URL" action="view-carousel-menu" namespace="/common" ></s:url>
<s:url id="logoutURL" action="logout-user" namespace="/login" ></s:url>
<s:url id="testMDBURL" action="test-MDB" namespace="/common" ></s:url>
<s:url id="leftMenuPageURL" action="goto-main-menu" namespace="/common" ></s:url>

<sj:menu id="menuWithItems"  cssStyle="width:50%">
	<sj:menuItem title="Struts2" href="http://struts.apache.org/2.x/index.html"/>
	<sj:menuItem title="Struts2 jQuery News" menuIcon="ui-icon-extlink" href="http://www.jgeppert.com/category/java/struts2-jquery/"/>
	<sj:menuItem title="Struts2 Plugins">
		<sj:menu id="subMenuPlugins" cssStyle="width:50%">
			<sj:menuItem title="Item List" href="%{viewItemURL}"/>
			<sj:menuItem title="Carousel Menu" href="%{viewMenu1URL}"/>
			<sj:menuItem title="MenuPage" href="%{leftMenuPageURL}"/>
		</sj:menu>
	</sj:menuItem>

	<sj:menuItem title="Struts2 @ Social Media">
		<sj:menu id="subMenuSocialMedia" cssStyle="width:50%">
			<sj:menuItem title="Struts2 @ Twitter" href="https://twitter.com/TheApacheStruts"/>
			<sj:menuItem targets="treecontainer" title="Send MSG to QUEUE" href="%{testMDBURL}"/>
			<sj:menuItem title="LOG OUT" href="%{logoutURL}"/>
		</sj:menu>
	</sj:menuItem>

	<sj:menuItem title="AJAX">
		<sj:menu id="subMenuAjax" cssStyle="width:50%">
			<s:url var="ajax1" value="/ajax1.action"/>
			<sj:menuItem title="Ajax 1" href="%{ajax1}" targets="result"/>
			<s:url var="ajax2" value="/ajax2.action"/>
			<sj:menuItem title="Ajax 2" href="%{ajax2}" targets="result" effect="highlight" effectDuration="2500"/>
			<s:url var="ajax3" value="/ajax3.action"/>
			<sj:menuItem title="Ajax 3" href="%{ajax3}" targets="result" onBeforeTopics="beforeLink"
			             onCompleteTopics="completeLink"/>
			<s:url var="ajax4" value="/ajax4.action"/>
			<sj:menuItem title="Ajax 4" href="%{ajax4}" menuIcon="ui-icon-gear" targets="result" effect="bounce" effectDuration="1000"/>
		</sj:menu>
	</sj:menuItem>
</sj:menu>


<div id="treecontainer"></div>
</body>
</html>
