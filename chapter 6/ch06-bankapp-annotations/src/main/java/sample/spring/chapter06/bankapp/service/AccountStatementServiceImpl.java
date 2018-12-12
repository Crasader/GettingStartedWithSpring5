package sample.spring.chapter06.bankapp.service;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sample.spring.chapter06.bankapp.dao.AccountStatementDao;
import sample.spring.chapter06.bankapp.dao.TxDaoImpl;
import sample.spring.chapter06.bankapp.domain.AccountStatement;

@Service(value="accountStatementService")
@Qualifier("service")
public class AccountStatementServiceImpl implements AccountStatementService {
	
	private static Logger logger = LogManager
			.getLogger(AccountStatementServiceImpl.class);
	@Autowired 
	private AccountStatementDao accountStatementDao;
	
	public AccountStatementServiceImpl() {
		logger.info("Created AccountStatementServiceImpl instance");
	}
	
	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}
