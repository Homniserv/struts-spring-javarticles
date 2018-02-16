package presentation;

import org.apache.commons.logging.impl.Log4JLogger;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action Controller <br>
 * https://stackoverflow.com/questions/6644861/struts-action-mapping-action-input-attribute
 */
public class Controler extends ActionSupport {

	private static final long serialVersionUID = 1L;
	String a;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	// https://struts.apache.org/getting-started/hello-world-using-struts2.html
	/***/
	// public void method() {
	//
	// //
	// http://magicmonster.com/kb/prg/java/spring/webmvc/web_application_context.html
	// // javax.servlet.ServletContext servletContext = new
	// // org.springframework.web.context.WebApplicationContext
	// webApplicationContext =
	// // WebApplicationContextUtils.getWebApplicationContext(servletContext);
	// // SampleService service = (SampleService)
	// // webApplicationContext.getBean("sampleService");
	// //
	// }
  //  private static final Logger LOGGER = LogManager.getLogger();
    public Controler() {
		 

	}

	public String method2() {
		return "SUCCESS";
	}

	private MessageStore messageStore;

	public String execute() {
		messageStore = new MessageStore();
	//	this.LOGGER.error("execute");
		
	
//		org.apache.struts2.dispatcher.FilterDispatcher
		return SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	/**
	 * https://stackoverflow.com/questions/6644861/struts-action-mapping-action-input-attribute
	 */
	// public ActionForward doMethod(ActionMapping mapping, ActionForm form,
	// HttpServletRequest request,
	// HttpServletResponse response) {
	// return mapping.getInputForward();
	// }
}
