package Intellect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Intellect.Service.FlifCartService;

@RestController
public class MsgController {
      @Autowired
	private FlifCartService flifCartService;
	@GetMapping("/Mapping")
	public String Msget() {
		String returnMsgToClient = flifCartService.returnMsgToClient();
		return returnMsgToClient;
	}
}
