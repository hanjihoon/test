package p16;

public class Person implements Action {
	
	public String name;
	public int age;
	public int height;
	public String email;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", email=" + email + "]";
	}

	public void eat() {
		System.out.println(name+"가 밥을 먹는다");
	}

	
	public void sleep() {
		System.out.println(name+"가 잠을 잔다");
	}

	
	public void walk() {
		
		System.out.println(name+"가 걷는다");
	}

}
