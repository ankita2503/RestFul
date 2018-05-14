package com.webservices.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage 
{
String msg;
int errCode;
String uri;

public ErrorMessage(String msg,int errCode,String uri)
{
	this.msg=msg;
	this.errCode=errCode;
	this.uri=uri;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public int getErrCode() {
	return errCode;
}
public void setErrCode(int errCode) {
	this.errCode = errCode;
}
public String getUri() {
	return uri;
}
public void setUri(String uri) {
	this.uri = uri;
}
}
