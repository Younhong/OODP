/* User's manual
This program will be used to check whether Martian rover's components are properly working. If you run this program, t will be checked for 20 times.
There are six components in Martian rover. They are wheel, camera, arm, battery, motor, solar energy collector.
On each trial, every components will be checked with the order I just mentioned.
When it is checking the component, it will check all the number of components and print their number.
And if any number is not properly working, then it will print the message that component needs to be repaired.
And then it will print the message that it has been fixed.
*/

public class Main {
	public static RoverComponent[] list = { new Wheel(), new Camera(), new Arm(), new Battery(), new Motor(), new SolarEnergyCollector() };

	public static void main(String[] args) {
		try {
			NewVisitor v = new NewVisitor();

			for (int i = 0; i < 20; i++) {
				System.out.println("Checking the components of Martian Rover");

				for (int x = 0; x < list.length; x++) {
					list[x].accept(v);
				}

				System.out.println("=== Checking Cycle Finished ===");
				System.out.println();
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){}
	}
}