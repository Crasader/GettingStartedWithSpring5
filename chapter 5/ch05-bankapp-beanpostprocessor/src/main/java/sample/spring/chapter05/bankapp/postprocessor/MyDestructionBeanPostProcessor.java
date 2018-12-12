package sample.spring.chapter05.bankapp.postprocessor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class MyDestructionBeanPostProcessor implements DestructionAwareBeanPostProcessor{

	private static Logger logger = LogManager
			.getLogger(MyDestructionBeanPostProcessor.class);
	
	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		logger.info("MyDestructionBeanPostProcessor postProcessBeforeDestruction method invoked for bean " + beanName + " of type " + bean.getClass());
		
		
	}

}
