package sample.spring.chapter02.bankapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter02.bankapp.controller.FixedDepositController;
import sample.spring.chapter02.bankapp.domain.FixedDepositDetails;

public class BankApp {

	private static Logger logger = Logger.getLogger(BankApp.class);
	private static ApplicationContext context;

	public static void main(String args[]) {

		context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		
		FixedDepositController controller1 = (FixedDepositController) context.getBean("controller");
		FixedDepositController controller2 = (FixedDepositController) context.getBean("controller");

		FixedDepositDetails fixedDepositDetails1 = (FixedDepositDetails) context.getBean("fixedDepositDetails");
		FixedDepositDetails fixedDepositDetails2 = (FixedDepositDetails) context.getBean("fixedDepositDetails");

		if (controller1 == controller2) {
			logger.info("Same FixedDepositController instance");
		} else {
			logger.info("Different FixedDepositController instances");
		}
		if (fixedDepositDetails1 == fixedDepositDetails2) {
			logger.info("Same FixedDepositDetails instance");
		} else {
			logger.info("Different FixedDepositDetails instances");
		}
		
	}
	
}
