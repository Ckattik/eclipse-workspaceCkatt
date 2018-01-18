package Video_4_1;

public class TestPeopleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sexeble workers [] = new Sexeble[3];
		
		workers [0] = new Man("Stiv");
		workers [1] = new Woman("Helga");
		workers [2] = new Man("Alex");

		for(Sexeble s : workers) {
			s.go();
		}
		
	}

}
