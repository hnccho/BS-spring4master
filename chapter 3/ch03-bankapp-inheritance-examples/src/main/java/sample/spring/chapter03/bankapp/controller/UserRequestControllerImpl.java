package sample.spring.chapter03.bankapp.controller;

import sample.spring.chapter03.bankapp.base.ServiceTemplate;
import sample.spring.chapter03.bankapp.domain.Request;

public class UserRequestControllerImpl implements UserRequestController {

	private ServiceTemplate serviceTemplate;
	
	public void setServiceTemplate(ServiceTemplate serviceTemplate) {
		this.serviceTemplate = serviceTemplate;
	}
	
	@Override
	public void submitRequest(Request request) {
		//-- do something using ServiceTemplate
		serviceTemplate.getJmsMessageSender(); //-- For ex., send JMS message
	}
	
}
