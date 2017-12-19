package p16;

public class Excute {
	
	public void printAction(Action act) {
		act.eat();
		act.sleep();
		act.walk();
	}
	
	public static void main(String[] args) {
		Action p = new Hong("Hong",20,173,"hone@gmail.com");
		
		Excute e = new Excute();
		
		e.printAction(p);
		
		Cat c = new Cat("냥이",2,34);
		
		e.printAction(c);

	}
}
