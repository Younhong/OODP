public class Car extends Template {
	public void move() {
		wings("Folding up");
		wheels("Popping Down");
		System.out.println("Starting Engine");
		randSpeed(200);
	}
}