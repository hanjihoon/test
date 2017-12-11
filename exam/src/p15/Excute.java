package p15;

import java.util.ArrayList;

public class Excute {

	public static void main(String[] args) {
		Controller c = new Controller();
		ArrayList<User> userList = c.get("list", null);
		
		for (int i = 1; i <= 5; i++) {
			User user = new User("이름" + i, i, i);
			c.get("add", user);
		}

		

//		for (User user : userList) {
//			System.out.println(user);
//		}
//		User ru = new User(3);
//		c.get("remove", ru);
//		ru.setName("이름1");
//		userList = c.get("search",ru);
//		for (User user : userList) {
//			System.out.println(user);
//		}
		User user = new User("모모",20,2);
		c.get("update", user);
		System.out.println("수정결과 " );
		for (User u : userList) {
			System.out.println(u);
		}
		
		userList = c.get("search", user);
		c.get("add", user);
		System.out.println("검색결과 : ");
		for (User u : userList) {
			System.out.println(u);
		}
		
	}
}
