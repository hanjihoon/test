package p16;

public class Animal implements Action {
	public String name;
	public int age;
	public int height;

	public void eat() {
		System.out.println(name+"가 사료를 먹는다");
	}

	
	public void sleep() {
		System.out.println(name+"가 잠을 잔다");
	}

	
	public void walk() {
		
		System.out.println(name+"가 걷는다");
	}
}
