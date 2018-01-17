package video_1;

import java.util.Scanner;

public class FriendsAndFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
          
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("\n Enter you firstName: ");
			String firstName = input.next();
			
			System.out.println("\n Enter you lastName: ");
			String lastName = input.next();
            
			System.out.println("\n Enter you adress: ");
			String adress = input.next();
			
			System.out.print(firstName + " " + lastName + " " + adress);
			
			System.exit(0); 
		}while(true);
		
	}

}
