<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>


	<div class=col-md-2>
		<div class="block block-drop-shadow">
	        <div class="user bg-default bg-light-rtl">
	        <a href=# class="informer informer-four"> 
	          			<span>Welcome&nbsp;
	          				<s:property value="#session.SESSION_USER.userName" />
	          			</span> 
	          		</a> 
	          <div class=info> 
	          		<a href=# class="informer informer-three"> 
	          			<span>14 / 255</span> Messages 
	          		</a> 
	          		<a href=# class="informer informer-four"> 
	          			<span>$549.44</span> Balance 
	          		</a> 
	          		<img id="defaultIndicator" src="<s:url value="/js/kilbees-alive/img/example/user/dmitry_b.jpg" includeParams="none"/>" class="img-circle img-thumbnail" /> 
	          		
	           </div>
	        </div>
	        <div class="content list-group list-group-icons"> 
	        	<a href=# class=list-group-item>
	        		<span class=icon-envelope></span>Messages<i class="icon-angle-right pull-right"></i>
	        	</a> 
	        	<a href=# class=list-group-item>
	        		<span class=icon-bar-chart></span>Statistic<i class="icon-angle-right pull-right"></i>
	        	</a> 
	        	<a href=# class=list-group-item>
	        		<span class=icon-cogs></span>Settings<i class="icon-angle-right pull-right"></i>
	        	</a> 
	        	<s:a namespace="/login" action="logout-user" cssClass="list-group-item">
	        		<span class=icon-off></span>Logout<i class="icon-angle-right pull-right"></i>
	        	</s:a> 
	        </div>
	    </div>
	</div>
</div>