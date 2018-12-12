package sample.spring.chapter06.bankapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import sample.spring.chapter06.bankapp.domain.Tx;

@Repository(value = "txDao")
public class TxDaoImplcopy implements TxDao {

	private static Logger logger = LogManager
			.getLogger(TxDaoImplcopy.class);
	
	public TxDaoImplcopy() {
		logger.info("Created TxDaoImpl instance");
	}

	@Override
	public List<Tx> getTransactions(int accountNumber) {
		List<Tx> txList = new ArrayList<Tx>();
		txList.add(new Tx(1, "High value money transfer", "complete"));
		txList.add(new Tx(2, "High value money transfer", "in process"));
		return txList;
	}
}
