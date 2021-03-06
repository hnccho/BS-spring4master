package sample.spring.chapter05.bankapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter05.bankapp.domain.FixedDepositDetails;
import sample.spring.chapter05.bankapp.service.FixedDepositService;

public class BankApp {
	
	private static ApplicationContext context;

	public static void main(String args[]) throws Exception {
		context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(
				new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
	}
}
