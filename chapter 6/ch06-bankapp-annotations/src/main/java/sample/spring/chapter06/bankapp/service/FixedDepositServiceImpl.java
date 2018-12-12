package sample.spring.chapter06.bankapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sample.spring.chapter06.bankapp.dao.FixedDepositDao;
import sample.spring.chapter06.bankapp.dao.TxDaoImpl;
import sample.spring.chapter06.bankapp.domain.FixedDepositDetails;

@Service(value="fixedDepositService")
@Qualifier("service")
public class FixedDepositServiceImpl implements FixedDepositService {
	
	@Autowired
	@Qualifier(value="myFixedDepositDao")
	private FixedDepositDao myFixedDepositDao;
	
	private static Logger logger = LogManager
			.getLogger(FixedDepositServiceImpl.class);
	
	public FixedDepositServiceImpl() {
		logger.info("Created FixedDepositServiceImpl instance");
	}
	
	@Override
	public void createFixedDeposit(FixedDepositDetails fdd) throws Exception {
		// -- create fixed deposit
		myFixedDepositDao.createFixedDeposit(fdd);
	}
}
