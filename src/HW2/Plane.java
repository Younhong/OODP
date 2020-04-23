public class Plane extends Template {
	public void move() {
		wings("Extruding");
		System.out.println("Rotor Propeller Starting");
		randAltimeter(500);
		wheels("Concealed Inside");
		System.out.println("Starting Radar");
		randSpeed(200);
	}
}