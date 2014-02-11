package com.kilbees.struts2.action.utils;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.util.ServletContextAware;

import com.kilbees.struts2.action.AbstractAction;

public class XMLUploadction extends AbstractAction implements ServletContextAware  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;
	
	private ServletContext servletContext;
	
	public String processXMLFile()
	{
		String filePath = servletContext.getRealPath("/");
		System.out.println("Server path:" + filePath+"     "+fileUploadFileName);
		File fileToCreate = new File(filePath, this.fileUploadFileName);
		try {
			FileUtils.copyFile(this.fileUpload, fileToCreate);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
 
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}
 
	public void setFileUploadContentType(String fileUploadContentType) {
		this.fileUploadContentType = fileUploadContentType;
	}
 
	public String getFileUploadFileName() {
		return fileUploadFileName;
	}
 
	public void setFileUploadFileName(String fileUploadFileName) {
		this.fileUploadFileName = fileUploadFileName;
	}
 
	public File getFileUpload() {
		return fileUpload;
	}
 
	public void setFileUpload(File fileUpload) {
		this.fileUpload = fileUpload;
	}
 
	public String execute() throws Exception{
 
		return SUCCESS;
 
	}
 
	public String display() {
		return NONE;
	}
	
	@Override
	public void setServletContext(ServletContext context) {
		 this.servletContext = context;
		
	}

}
