package presentation;

import com.opensymphony.xwork2.ActionSupport;

public class Controler extends ActionSupport {
//	https://struts.apache.org/getting-started/hello-world-using-struts2.html
/***/
public void method() {
	
	
//http://magicmonster.com/kb/prg/java/spring/webmvc/web_application_context.html
//javax.servlet.ServletContext servletContext = new 
//org.springframework.web.context.WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//SampleService service = (SampleService) webApplicationContext.getBean("sampleService");
//    
}


	private MessageStore messageStore;

public String execute() {
    messageStore = new MessageStore() ;
    
    return SUCCESS;
}

public MessageStore getMessageStore() {
    return messageStore;
}
}
