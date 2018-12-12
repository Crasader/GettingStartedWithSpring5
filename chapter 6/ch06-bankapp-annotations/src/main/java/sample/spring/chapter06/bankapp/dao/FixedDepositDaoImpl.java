package sample.spring.chapter06.bankapp.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import sample.spring.chapter06.bankapp.domain.FixedDepositDetails;

@Repository(value="myFixedDepositDao")
public class FixedDepositDaoImpl implements FixedDepositDao {
	
	private static Logger logger = LogManager
			.getLogger(FixedDepositDaoImpl.class);
	public FixedDepositDaoImpl() {
		logger.info("Created FixedDepositDaoImpl instance");
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		// -- save the fixed deposits and then return true
		return true;
	}
}
