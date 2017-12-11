package p15;

import java.util.ArrayList;

public class Controller {
	
	private Service service;
	
	public Controller() {
		service = new Service();
	}
	
	public ArrayList<User> get(String command,User user) {
		if(command.equals("list")) {
			return getUserList(null);
		}else if(command.equals("add")) {
			boolean isOk = addUser(user);
			if(isOk) {
				System.out.println(user.getName() + "입력 완료!");
			}else {
				System.out.println("입력 중에 알 수 없는 에러가 발생했습니다.");
			}
		}else if(command.equals("remove")) {
			boolean isOk = removeUser(user);
			if(isOk) {
				System.out.println(user.getName() + "삭제 완료!");
			}else {
				System.out.println("삭제 중에 알 수 없는 에러가 발생했습니다.");
			}
		}else if(command.equals("search")) {
			return getUserList(user.getName());
		}else if (command.equals("update")) {
			boolean isOk = updateUser(user);
			if(isOk) {
				System.out.println(user.getName() + "수정 완료!");
			}else {
				System.out.println("수정 중에 알 수 없는 에러가 발생했습니다.");
			}
		}
		return null;
	}
	
	public boolean addUser(User user) {
		return service.addUser(user);
	}
	public boolean removeUser(User user) {
		return service.removeUser(user);
	}
	
	
	public ArrayList<User> getUserList(String str){
		return service.getUserList(str);
	}

	public boolean updateUser(User user) {
		return service.updateUser(user);
	}
}
