package video_2_1;

public class Tax {

	double grossIncome;
	String state;
	int dependents;
	
	
//	public Tax(double gr, String st, int dep) {
//		this.grossIncome = gr;
//		this.state = st;
//		this.dependents = dep;
		
//	}
	
	
	public double calcTax(double grossIncome) {
		
		
		if(grossIncome < 50000) {
			return grossIncome * 0.06;
			
		}else { 
			return grossIncome * 0.08;
		}
		
		
	}


	
}
