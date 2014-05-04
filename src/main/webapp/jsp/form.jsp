<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd"> 
<html>
	<head>
		<s:include value="/jsp/head.jsp" />	        
	</head>
	
	<body>
	
	    tip14cookie_0 : <s:property value="tip14cookie_0"/>
	    <br>
	    tip14cookie_1 : <s:property value="tip14cookie_1"/>
        <br>
		<s:form action="writeCookies" method="POST" theme="simple">				
			<s:submit value="%{getText('write')}"/>  			
		</s:form>
		<s:form action="readCookies" method="POST" theme="simple">				
			<s:submit value="%{getText('read')}"/>  			
		</s:form>
		<s:include value="/jsp/footer.jsp" />
	</body>
</html>