package video_8_3;

public class ShippingOrder<K,V> {
	
	private K key;
	private V value;
	
	public ShippingOrder (K key, V value) {
		
		this.key = key;
		this.value = value;
	}

	
	public K getK() {
		return this.key;
	}
	
}
