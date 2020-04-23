public class CarAdapter implements CarInterface {
	public void move(int a) {
		Car car = new Car();
		Plane plane = new Plane();
		Boat boat = new Boat();
		Submarine sub = new Submarine();
		if (a == 1)
		{
			car.move();
		}
		else if (a == 2)
		{
			plane.move();
		}
		else if (a == 3)
		{
			boat.move();
		}
		else if (a == 4)
		{
			sub.move();
		}
	}
}