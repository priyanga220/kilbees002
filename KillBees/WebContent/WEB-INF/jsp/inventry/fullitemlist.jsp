<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<%-- <tag:genericpage> --%>
<tag:dynamicbody>

<jsp:body>
		
<div class=col-md-10 style="padding-left: 2;" > 
<!--  
	<div class=block> 
		 
		<div class=content style="margin: 0;" >  -->
		<div align="center" id="gridarea">
<s:url id="categoryFilterUrl" action="load-category-grid-filter" namespace="/item"></s:url>
 <s:url id="remoteurl" action="item-list-grid-data-provider" namespace="/item"/>
    <sjg:grid
						    	id="gridedittable"
						    	caption="Registered Items"
						    	hidegrid="true"
						    	dataType="json"
						    	href="%{remoteurl}"
						    	pager="true"
						    	navigator="true"
						    	navigatorEdit="true"
						    	navigatorView="false"
						    	navigatorDelete="false"
						    	navigatorAdd="false"
						    	navigatorSearch="false"
						    	navigatorInlineEditButtons="true"
						    	navigatorExtraButtons="{
						    		seperator: { 
						    			title : 'seperator'  
						    		}
						    		,
						    		excelbtn : {
	                        				caption : 'Export to Excel',
	                            			title : 'Export to Excel',
	                            			icon : 'ui-icon-save',
	                            			onclick: function() 
	                            			{
	                            			}
                        			}
                        			,
                        			hide : { 
                        					caption : 'Show/Hide',
								    		title : 'Show/Hide', 
								    		icon: 'ui-icon-wrench', 
								    		topic: 'showcolumns'
							    		}
						    	}"
						    	filter="true"
						    	filterOptions="{ searchOnEnter : true, enableClear : true , autosearch : true}"
						    	gridModel="gridModel"
						    	rowList="10,15,20,50"
						    	rowNum="15"
						    	editinline="false"
						    	viewrecords="true"
						    	width="1100"
						    	height="400"
						    	shrinkToFit="true"
						    	rownumbers="true"
						    >
						    	<sjg:gridColumn name="itemNo" align="center" frozen="true" width="80" index="id" title="Utilities" search="false" sortable="false" editable="false"/>
						    	<sjg:gridColumn name="itemNo" frozen="true" index="itemNo" title="ID" width="60" editable="false" sortable="true" searchoptions="{sopt:['eq']}"/>
						    	
						    		<sjg:gridColumn name="drugCategory.categoryName" index="drugCategory.categoryName" title="Category" width="100" sortable="false" editable="true" search="true" surl="%{categoryFilterUrl}" searchoptions="{sopt:['eq'], dataUrl : '%{categoryFilterUrl}'}" searchtype="select"
						    		edittype="select"
            						editoptions="{ dataUrl : '%{categoryFilterUrl}' ,
                                       dataEvents: [
                                       				{  type: 'change', fn: function(value) 
                                       										{

                                    										
                                    										}

                             						}
                          							
                      							]     }"
                       />
                       
						    	<sjg:gridColumn name="tradeName" index="tradeName" title="TradeName"  sortable="true"  width="100" editable="false" />
						    	<sjg:gridColumn name="drugCategory.categoryName" index="drugCategory.categoryName" title="CategoryName" width="100" editable="false" sortable="true" searchoptions="{sopt:['eq']}"/>
						    	<sjg:gridColumn name="margin" index="margin" title="Margin" width="65" editable="true" sortable="false" searchoptions="{sopt:['eq']}"/>
						    	<sjg:gridColumn name="itemRegisteredDate" index="itemRegisteredDate" width="150" title="Registered Date" editable="false" sortable="yes"
						    	formatter="date" formatoptions="{newformat : 'd.m.Y H:i', srcformat : 'Y-m-d H:i:s'}"  search="false" />
						    	
						    	
						    </sjg:grid>
    </div>
	<!-- 	</div> -->
	</div>
</div>

    
    
    
</jsp:body>

</tag:dynamicbody>
