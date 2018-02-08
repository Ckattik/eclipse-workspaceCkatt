package video_8_2;

public class Box<T> {

	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	
	public T get() {
		return t;
	}
	
}
