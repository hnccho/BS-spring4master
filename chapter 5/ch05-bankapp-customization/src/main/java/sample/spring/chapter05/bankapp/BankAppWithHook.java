package sample.spring.chapter05.bankapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.spring.chapter05.bankapp.domain.FixedDepositDetails;
import sample.spring.chapter05.bankapp.service.FixedDepositService;

public class BankAppWithHook {
	
	private static AbstractApplicationContext context;

	public static void main(String args[]) throws Exception {
		context = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");

		context.registerShutdownHook();
		FixedDepositService fixedDepositService = context.getBean(FixedDepositService.class);
		fixedDepositService.createFixedDeposit(
				new FixedDepositDetails(1, 1000, 12, "someemail@somedomain.com"));
	}
	
}
