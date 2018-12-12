package sample.spring.chapter05.bankapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sample.spring.chapter05.bankapp.dao.DatabaseConnection;
import sample.spring.chapter05.bankapp.dao.FixedDepositDao;
import sample.spring.chapter05.bankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService {
	public FixedDepositServiceImpl() {
		logger.info("FixedDepositServiceImpl's constructor method invoked");
	}

	private static Logger logger = LogManager.getLogger(FixedDepositServiceImpl.class);
	private FixedDepositDao myFixedDepositDao;

	public void setMyFixedDepositDao(FixedDepositDao mFixedDepositDao) {
		logger.info("FixedDepositServiceImpl's setMyFixedDepositDao method invoked");
		this.myFixedDepositDao = mFixedDepositDao;
	}

	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
	
	public void initializeDbConnection() {
		logger.info("FixedDepositServiceImpl's initializeDbConnection method invoked");
	}
	
	public void releaseDbConnection() {
		logger.info("FixedDepositServiceImpl's releaseDbConnection method invoked");
		System.out.println("closing");
	}
}
