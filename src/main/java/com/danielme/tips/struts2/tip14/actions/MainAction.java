package com.danielme.tips.struts2.tip14.actions;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.Cookie;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.CookieProvider;
import org.apache.struts2.interceptor.CookiesAware;

import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport implements CookieProvider, CookiesAware
{
	private static final long serialVersionUID = 1L;
	
	private static Logger LOG = Logger.getLogger(MainAction.class);
	
	private String tip14cookie_0;
	
	private String tip14cookie_1;	
	

	public String execute() 
	{
        return SUCCESS;
    }	
	
	@Override
	public Set<Cookie> getCookies()
	{
		Set<Cookie> cookies = new HashSet<Cookie>(10);
		for (int i = 0 ;i < 10; i++)
		{
			cookies.add(new Cookie("tip14cookie_" + i, "value" + i));			
		}
		return cookies;
	}

	@Override
	public void setCookiesMap(Map<String, String> cookies)
	{
		if (cookies != null)
			LOG.info(cookies.keySet());
	}
	
	public String getTip14cookie_0()
	{
		return tip14cookie_0;
	}

	public void setTip14cookie_0(String tip14cookie_0)
	{
		this.tip14cookie_0 = tip14cookie_0;
	}

	public String getTip14cookie_1()
	{
		return tip14cookie_1;
	}

	public void setTip14cookie_1(String tip14cookie_1)
	{
		this.tip14cookie_1 = tip14cookie_1;
	}	

}
