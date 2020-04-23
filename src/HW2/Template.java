public class Template extends Thread {
	int delay = 1000;
	public void randSpeed(int max) {
		int speed = 0;
		System.out.print("Speed: ");
		for (int i = 0; i < 5; i++) {
			speed = (int)(Math.random()*(max-speed+1)+speed);
			System.out.print(speed + " ");
			try {
				Thread.sleep(delay);
			}
			catch (InterruptedException e)
			{}
		}
		System.out.println("\n");
	}

	public void randAltimeter(int max) {
		int altimeter = 0;
		System.out.print("Altimeter: ");
		for (int i = 0; i < 5; i++) {
			altimeter = (int)(Math.random()*(max-altimeter+1)+altimeter);
			System.out.print(altimeter + " ");
			try {
				Thread.sleep(delay);
			}
			catch (InterruptedException e)
			{}
		}
		System.out.print("\n");
	}

	public void randDepth() {
		int depth = (int)(Math.random()*96 + 5);
		System.out.println("Water Depth: " + depth);
	}

	public void randSeaLevel() {
		int SeaLevel = 0;
		System.out.print("Below Sea Level: ");
		for (int i = 0; i < 5; i++) {
			SeaLevel = (int)(Math.random()*(-31-SeaLevel)+SeaLevel);
			System.out.print(SeaLevel + " ");
			try {
				Thread.sleep(delay);
			}
			catch (InterruptedException e)
			{}
		}
		System.out.print("\n");
	}

	public void wings(String s) {
		System.out.println("Wings " + s);
	}

	public void wheels(String s) {
		System.out.println("Wheels " + s);
	}
}
