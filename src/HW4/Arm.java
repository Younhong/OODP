import java.util.*;

class Arm implements RoverComponent {
    private Random random = new Random();
	int armNo = 2;

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void arm() {
		for (int i = 1; i <= armNo; i++) {
			System.out.print(i + " ");
			checkError(i);
		}
		System.out.println();
	}

	public void checkError(int x) {
        int error = random.nextInt(100);

        if (error == 1) {
			System.out.println();
			System.out.println("\tArm" + x + " needs to be repaired");
			System.out.print("\tFixing arm" + x + " ");
		}
		else {
			if (x == armNo) {
				System.out.print("OK");
			}
		}
	}
}