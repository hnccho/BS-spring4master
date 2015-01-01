package sample.spring.chapter03.bankapp.event;

import java.util.Properties;

public class WebServiceEventSender implements EventSender {

	@SuppressWarnings("unused")
	private Properties webServiceProperties;

	public WebServiceEventSender(Properties webServiceProperties) {
		this.webServiceProperties = webServiceProperties;
	}

	@Override
	public void sendEvent(Event e) {
		// -- send the event to the remote web service
	}

}
