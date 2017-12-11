package p15;

import java.util.ArrayList;

public class Service {
	
	private DAO dao;
	
	Service() {
		dao = new DAO();
	}
	public boolean addUser(User user) {
		return dao.addUser(user);
	}
	
	public boolean removeUser(User user) {
		return dao.removeUser(user);
	}
	
	public ArrayList<User> getUserList(String str){
		return dao.getUserList(str);
	}
	public boolean updateUser(User user) {
		return dao.updateUser(user);
	}

}
