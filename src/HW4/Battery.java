import java.util.*;

class Battery implements RoverComponent {
    private Random random = new Random();
	int batteryNo = 4;

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void battery() {
		for (int i = 1; i <= batteryNo; i++) {
			System.out.print(i + " ");
			checkError(i);
		}
		System.out.println();
	}

	public void checkError(int x) {
        int error = random.nextInt(100);

        if (error == 1) {
			System.out.println();
			System.out.println("\tBattery" + x + " needs to be repaired");
			System.out.print("\tFixing battery" + x + " ");
		}
		else {
			if (x == batteryNo) {
				System.out.print("OK");
			}
		}
	}
}