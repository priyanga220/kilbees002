<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>


	<div class=container> 
		<div class=row> 
			<div class=col-md-12> 
				<nav class="navbar brb" role=navigation> 
					<div class=navbar-header> 
						<button type=button class=navbar-toggle data-toggle=collapse data-target=.navbar-ex1-collapse>
 							<span class=sr-only>Toggle navigation</span> 
 							<span class=icon-reorder></span> 
 						</button> 
 						<s:url id="homeURL" action="goto-home" namespace="/login" ></s:url>
 						<s:a href="%{homeURL}" cssClass="navbar-brand" >
 						<!-- <a class= href=index.html> -->
 							<img id="defaultIndicator" src="<s:url value="/js/kilbees-alive/img/logo.png" includeParams="none"/>"/> 
 						</s:a> 
 					</div> 
 					<div class="collapse navbar-collapse navbar-ex1-collapse"> 
 						<ul class="nav navbar-nav"> 
 							<s:if test="%{#session.SESSION_USER.dashBoardFuncList}">
    							<li> <a href=# class=dropdown-toggle data-toggle=dropdown>
 									<span class=icon-home></span> Dashboard </a> 
 									<ul class=dropdown-menu>
 									<%-- <s:set var="counter" value="0" scope="page" ></s:set> --%>
 									<s:iterator value="#session.SESSION_USER.dashBoardFuncList" var="funcD" status="counterD" >
 									<s:url id="funcURLD#counterD.count"  value="%{#funcD.systemFunctions.combinedUrl}"></s:url>
    								<li>
									<sj:a  
										href="%{funcURLD#counterD.count}" 
										targets="dynamicBodyContext">
									  	<s:property value="#funcD.systemFunctions.functionName" />
									</sj:a>
									</li>
	
 										<%-- <li><a href="<s:property value="#func.systemFunctions.url" />"><s:property value="#func.systemFunctions.functionName" /></a></li> --%>
 									</s:iterator>
 									</ul>
 								</li> 
							</s:if>
 							
 						<%-- 	<li class=dropdown> <a href=# class=dropdown-toggle data-toggle=dropdown>
 								<span class=icon-pencil></span> forms</a> 
 									<ul class=dropdown-menu> 
 										<li><a href=form_elements.html>Form elements</a></li> 
 										<li><a href=form_editors.html>WYSIWYG and upload</a></li>
  										<li><a href=form_validation.html>Validation and wizard</a>
  										</li> 
  									</ul> 
  									
  							</li>  --%>
  							<s:if test="%{#session.SESSION_USER.bussinessRulesFuncList}">
    							<li> <a href=# class=dropdown-toggle data-toggle=dropdown>
 									<span class=icon-pencil></span> System </a> 
 									<ul class=dropdown-menu>
 									<s:iterator value="#session.SESSION_USER.bussinessRulesFuncList" var="funcB" status="counterB" >
 										<%-- <li><a href="<s:property value="#func.systemFunctions.url" />"><s:property value="#func.systemFunctions.functionName" /></a></li> --%>
 										
 										<s:url id="funcURLB#counterB.count"  value="%{#funcB.systemFunctions.combinedUrl}"></s:url>
    								<li>
									<sj:a  
										href="%{funcURLB#counterB.count}" 
										targets="dynamicBodyContext">
									  	<s:property value="#funcB.systemFunctions.functionName" />
									</sj:a>
									</li>
 									
 									</s:iterator>
 									</ul>
 								</li> 
							</s:if>
  							
  							<%-- <li class="dropdown active"> <a href=# class=dropdown-toggle data-toggle=dropdown><span class=icon-cogs></span> components</a> 
  								<ul class=dropdown-menu> 
  									<li><a href=component_blocks.html>Blocks and panels</a></li> 
  									<li><a href=component_buttons.html>Buttons</a></li> 
  									<li><a href=component_modals.html>Modals and popups</a></li> 
  									<li><a href=component_tabs.html>Tabs, accordion</a></li> 
  									<li><a href=component_progress.html>Progressbars</a></li> 
  									<li><a href=component_lists.html>List groups</a></li> 
  									<li><a href=component_messages.html>Messages</a></li>
  									<li> <a href=#>Tables<i class="icon-angle-right pull-right"></i></a> 
  										<ul class=dropdown-submenu> 
  											<li><a href=component_table_default.html>Default tables</a></li> 
  											<li><a href=component_table_sortable.html>Sortable tables</a></li> 
  										</ul> 
  									</li> 
  									<li> <a href=#>Layouts<i class="icon-angle-right pull-right"></i></a> 
  										<ul class=dropdown-submenu> 
  											<li><a href=component_layout_blank.html>Default layout(blank)</a></li> 
  											<li><a href=component_layout_custom.html>Custom navigation</a></li> 
  											<li><a href=component_layout_scroll.html>Content scroll</a></li> 
  											<li><a href=component_layout_fixed.html>Fixed content</a></li> 
  										</ul> 
  									</li> 
  									<li><a href=component_charts.html>Charts</a></li> 
  									<li><a href=component_maps.html>Maps</a></li> 
  									<li><a href=component_typography.html>Typography</a></li> 
  									<li><a href=component_gallery.html>Gallery</a></li> 
  									<li><a href=component_calendar.html>Calendar</a></li> 
  									<li><a href=component_icons.html>Icons</a></li> 
  								</ul> 
  							</li>  --%>
  							
  							<s:if test="%{#session.SESSION_USER.salesFuncList}">
    							<li> <a href=# class=dropdown-toggle data-toggle=dropdown>
 									<span class=icon-cogs></span> Sales </a> 
 									<ul class=dropdown-menu>
 									<s:iterator value="#session.SESSION_USER.salesFuncList" var="func" >
 										<li><a href="<s:property value="#func.systemFunctions.url" />"><s:property value="#func.systemFunctions.functionName" /></a></li>
 									</s:iterator>
 									</ul>
 								</li> 
							</s:if>
  							<%-- <li><a href=widgets.html><span class=icon-globe></span> widgets</a></li> 
  							<li class=dropdown> <a href=# class=dropdown-toggle data-toggle=dropdown><span class=icon-file-alt></span> pages</a> 
  								<ul class=dropdown-menu> 
	  								<li><a href=sample_login.html>Login</a></li> 
								  	<li><a href=sample_registration.html>Registration</a></li> 
								  	<li><a href=sample_profile.html>User profile</a></li> 
								  	<li><a href=sample_profile_social.html>Social profile</a></li> 
								  	<li><a href=sample_edit_profile.html>Edit profile</a></li> 
								  	<li><a href=sample_mail.html>Mail</a></li> 
								  	<li><a href=sample_search.html>Search</a></li> 
								  	<li><a href=sample_invoice.html>Invoice</a></li> 
								  	<li><a href=sample_contacts.html>Contacts</a></li> 
								  	<li><a href=sample_tasks.html>Tasks</a></li> 
								  	<li><a href=sample_timeline.html>Timeline</a></li> 
								  	<li> <a href=#>Email templates<i class="icon-angle-right pull-right"></i></a> 
								  		<ul class=dropdown-submenu> 
								  			<li><a href=email_sample_1.html>Sample 1</a></li> 
								  			<li><a href=email_sample_2.html>Sample 2</a></li> 
								  			<li><a href=email_sample_3.html>Sample 3</a></li> 
								  			<li><a href=email_sample_4.html>Sample 4</a></li> 
								  		</ul> 
								  	</li> 
								  	<li> <a href=#>Error pages<i class="icon-angle-right pull-right"></i></a> 
								  		<ul class=dropdown-submenu> 
								  			<li><a href=sample_error_403.html>403 Forbidden</a></li> 
								  			<li><a href=sample_error_404.html>404 Not Found</a></li> 
								  			<li><a href=sample_error_500.html>500 Internal Server Error</a></li> 
								  			<li><a href=sample_error_503.html>503 Service Unavailable</a></li> 
								  			<li><a href=sample_error_504.html>504 Gateway Timeout</a></li> 
								  		</ul> 
								  	</li> 
							  </ul> 
							</li>  --%>
							<s:if test="%{#session.SESSION_USER.inventryFuncList}">
    							<li> <a href=# class=dropdown-toggle data-toggle=dropdown>
 									<span class=icon-globe></span> Inventry </a> 
 									<ul class=dropdown-menu>
 									<s:iterator value="#session.SESSION_USER.inventryFuncList" var="func" >
 										<li><a href="<s:property value="#func.systemFunctions.url" />"><s:property value="#func.systemFunctions.functionName" /></a></li>
 									</s:iterator>
 									</ul>
 								</li> 
							</s:if>
							<s:if test="%{#session.SESSION_USER.miscFuncList}">
    							<li> <a href=# class=dropdown-toggle data-toggle=dropdown>
 									<span class=icon-globe></span> Reports </a> 
 									<ul class=dropdown-menu>
 									<s:iterator value="#session.SESSION_USER.miscFuncList" var="func" >
 										<li><a href="<s:property value="#func.systemFunctions.url" />"><s:property value="#func.systemFunctions.functionName" /></a></li>
 									</s:iterator>
 									</ul>
 								</li> 
							</s:if>
							<s:if test="%{#session.SESSION_USER.reportFuncList}">
    							<li> <a href=# class=dropdown-toggle data-toggle=dropdown>
 									<span class=icon-globe></span> Misc </a> 
 									<ul class=dropdown-menu>
 									<s:iterator value="#session.SESSION_USER.reportFuncList" var="func" >
 										<li><a href="<s:property value="#func.systemFunctions.url" />"><s:property value="#func.systemFunctions.functionName" /></a></li>
 									</s:iterator>
 									</ul>
 								</li> 
							</s:if>
						</ul> 
  						<form class="navbar-form navbar-right" role=search> 
  							<div class=form-group> 
  								<input type=text class=form-control placeholder="search..."/> 
  							</div> 
  						</form> 
  						
  					</div> 
  
  				</nav> 
  			</div> 
  		</div>
  	</div>
