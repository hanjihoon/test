package p13;

import java.util.ArrayList;

public class E1 {

	public static void main(String[] args) {

		P1 p = new P1();
		p.setName("Trump");
		p.setAge(67);

		ArrayList<P1> alPerson = new ArrayList<P1>();
		alPerson.add(p);

		p = new P1();
		p.setName("Micael");
		p.setAge(32);
		alPerson.add(p);

		p = new P1();
		p.setName("Lisa");
		p.setAge(22);
		alPerson.add(p);

		p = new P1();
		p.setName("Baby");
		p.setAge(17);
		alPerson.add(p);

		p = new P1();
		p.setName("Kitten");
		p.setAge(45);
		alPerson.add(p);

		p = new P1();
		p.setName("Kiser");
		p.setAge(80);
		alPerson.add(p);

		// for(int i=0;i<alPerson.size();i++) {
		// for(int j=i+1; j <alPerson.size();j++) {
		// if(alPerson.get(i).age < alPerson.get(j).age) {
		// int tmp1 = 0;
		// tmp1 = alPerson.get(i).age;
		// alPerson.get(i).age = alPerson.get(j).age;
		// alPerson.get(j).age = tmp1;
		// String tmp2 = "";
		// tmp2 = alPerson.get(i).name;
		// alPerson.get(i).name = alPerson.get(j).name;
		// alPerson.get(j).name = tmp2;
		// }
		// }
		// }

		for (P1 pr : alPerson) {
			System.out.println(pr);
		}

		System.out.println();
		System.out.println();

		int size = alPerson.size();
		int minNum = 0;
		int idx = -1;
		for (int i = 0; i < size; i++) {
			if (minNum < alPerson.get(i).age) {
				minNum = alPerson.get(i).age;
				idx++;
			}
			alPerson.add(alPerson.get(idx));
			
			if (idx == size) {
				idx--;
				alPerson.remove(idx);

			} else {
				alPerson.remove(idx);
			}
			i = -1;
			size--;
			idx=-1;
		}
		
		

		for (P1 pr : alPerson) {
			System.out.println(pr);
		}
	}
}
