package ua.lviv.trainapplogos;
import ua.lviv.trainapplogos.domain.UserAccount;
import ua.lviv.trainapplogos.service.UserAccountService;
import ua.lviv.trainapplogos.service.impl.UserAccountServiceImpl;

public class MainTest {
	public static void main(String[] args) {
		
		UserAccountService userService = new UserAccountServiceImpl();
		userService.create(new UserAccount("test@test.test", "Andrew", "Filler", "test"));
		
		UserAccount user = userService.read(1);
		System.out.println("> 1st User: " + user);
		
		user.setEmail("changed_test@test.test");
		userService.update(user);
		user = userService.read(1);
		System.out.println("> 1st User after updating: " + user);
		
		userService.delete(1);
		user = userService.read(1);
		System.out.println("> Retrieve 1st User after deleting: " + user);
		
	}
}
