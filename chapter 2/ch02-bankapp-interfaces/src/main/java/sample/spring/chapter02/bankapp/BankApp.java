package sample.spring.chapter02.bankapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter02.bankapp.controller.FixedDepositController;

public class BankApp {

	private static Logger logger = Logger.getLogger(BankApp.class);
	private static ApplicationContext context;

	public static void main(String args[]) {
		context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");

		FixedDepositController fixedDepositController = (FixedDepositController) context.getBean("controller");

		logger.info("Submission status of fixed deposit : "	+ fixedDepositController.submit());
		logger.info("Returned fixed deposit info : " + fixedDepositController.get());
	}
	
}
