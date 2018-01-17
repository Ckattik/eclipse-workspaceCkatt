package video_2_1;

public class NjTax extends Tax {

//	public NjTax(double gr, String st, int dep) {
//		super(gr, st, dep);
		// TODO Auto-generated constructor stub
//	}

	public double adjustForStudents(double tax) {
		return tax - 500;
	}
	
public double calcTax() {
		
		
		if(grossIncome < 50000) {
			return grossIncome * 0.10;
			
		}else { 
			return grossIncome * 0.13;
		}

}
	
	
}
