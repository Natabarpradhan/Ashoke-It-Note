package Intellect.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FlifCartService {

	private Logger logger=LoggerFactory.getLogger(FlifCartService.class);
	
	public String returnMsgToClient() {
		logger.info("returnMsgToClient before method");
		String str="My Name Is Khan";
		logger.info("returnMsgToClient after method");
		return str;
	}
}
