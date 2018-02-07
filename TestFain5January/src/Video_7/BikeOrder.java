package Video_7;

public class BikeOrder {

	private static String bikeModel;
	private static int quantity;
	
	
	static void validateOrder() throws ToManyBikesException {
		
		
//		perform some data validation
//		
		
		throw new ToManyBikesException("Can not ship " + quantity + " bikes of the model " + bikeModel);
		
		
	}
	
}
