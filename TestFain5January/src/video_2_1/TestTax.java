package video_2_1;

//Передаем аргуметы через терминал , через метод main получаем массив стрингов , парсим и пользуемся на здоровья


public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tax t = new Tax();   // create an instance of Tax
		
		double grossIncome = Double.parseDouble(args[0]);
		int dependents = Integer.parseInt(args[1]);
		String state = String.valueOf(args [2]);
		
		
		System.out.println(grossIncome + " " + dependents + " " + state);
		
//		t.grossIncome = 50000;
//		t.dependents = 2;
//		t.state = "NJ";
		
		
		
		
//		NjTax t = new NjTax(40000, "NJ", 2);
		
		
		
		
		double yourTax = t.calcTax(grossIncome);
//		double njt = t.adjustForStudents(yourTax);
		
        System.out.println("Yor tax is " + yourTax);
	}

}
