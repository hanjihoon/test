package p13;

public class P1 {
	
	public String name;
	public int age;
	
	public String toString() {
		
		return "이름은 : " + name+", "+"나이는 : "+age;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
