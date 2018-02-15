package presentation;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Action Controller <br>
 * https://stackoverflow.com/questions/6644861/struts-action-mapping-action-input-attribute
 */
public class Controler extends ActionSupport {
	// https://struts.apache.org/getting-started/hello-world-using-struts2.html
	/***/
	public void method() {

		// http://magicmonster.com/kb/prg/java/spring/webmvc/web_application_context.html
		// javax.servlet.ServletContext servletContext = new
		// org.springframework.web.context.WebApplicationContext webApplicationContext =
		// WebApplicationContextUtils.getWebApplicationContext(servletContext);
		// SampleService service = (SampleService)
		// webApplicationContext.getBean("sampleService");
		//
	}

	private MessageStore messageStore;

	public String execute() {
		messageStore = new MessageStore();

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
