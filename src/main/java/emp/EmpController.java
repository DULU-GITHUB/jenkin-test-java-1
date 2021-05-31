package emp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@RequestMapping(value = "/testemployee", method = RequestMethod.GET)
	public String gettestEmployee() {

		return "This is a test employee for controller test check";

	}

}
