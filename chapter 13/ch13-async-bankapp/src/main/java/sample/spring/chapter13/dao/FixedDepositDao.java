package sample.spring.chapter13.dao;

import java.util.List;

import sample.spring.chapter13.domain.FixedDepositDetails;

public interface FixedDepositDao {

	List<FixedDepositDetails> getFixedDeposits();
	void saveFixedDeposit(FixedDepositDetails fixedDepositDetails);
	void closeFixedDeposit(int fixedDepositId);
	FixedDepositDetails getFixedDeposit(int fixedDepositId);
	void editFixedDeposit(FixedDepositDetails fixedDepositDetails);
	
}
