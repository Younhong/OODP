import java.util.*;

class SolarEnergyCollector implements RoverComponent {
    private Random random = new Random();
	// sec refers to solar energy collector
	int secNo = 2;

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void solarEnergyCollector() {
		for (int i = 1; i <= secNo; i++) {
			System.out.print(i + " ");
			checkError(i);
		}
		System.out.println();
	}

	public void checkError(int x) {
        int error = random.nextInt(100);

        if (error == 1) {
			System.out.println();
			System.out.println("\tSolar energy collector" + x + " needs to be repaired");
			System.out.print("\tFixing solar energy collector" + x + " ");
		}
		else {
			if (x == secNo) {
				System.out.print("OK");
			}
		}
	}
}