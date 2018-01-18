package Video_4;

public class TestPeopleAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		People workers [] = new People[5];
		
		workers [0] = new Man ("Jony");
		workers [1]= new Women("Samanta");
		workers [2] = new Man("Piter");
		workers [3] = new Man("Pider");
		workers [4] = new Women("Linda");
		
		
		for(People p : workers) {
			p.go();
		}
		
	}

}
