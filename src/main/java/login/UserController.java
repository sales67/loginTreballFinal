package login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@CrossOrigin
	@RequestMapping(path="/getUser",method = RequestMethod.GET)
	public User getUser (@RequestParam Long id) {	
		System.out.println("agafant" + id);
		System.out.println("agafant" + id);
		System.out.println("agafant" + id);
		//User u = userRepository.findOne(id);
		User u = userRepository.findByUsername("admin");
		return u;
	}
}
