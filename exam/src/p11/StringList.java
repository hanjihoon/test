package p11;

import java.util.ArrayList;

public class StringList {
	
	ArrayList<String> alStr;
	StringList(){
		alStr = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		StringList sl = new StringList();
		int len = sl.alStr.size();
		System.out.println(len);
		
		
	}

}
