import java.util.*;

class Motor implements RoverComponent {
    private Random random = new Random();
	int motorNo = 6;

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void motor() {
		for (int i = 1; i <= motorNo; i++) {
			System.out.print(i + " ");
			checkError(i);
		}
		System.out.println();
	}

	public void checkError(int x) {
        int error = random.nextInt(100);

        if (error == 1) {
			System.out.println();
			System.out.println("\tMotor" + x + " needs to be repaired");
			System.out.print("\tFixing motor" + x + " ");
		}
		else {
			if (x == motorNo) {
				System.out.print("OK");
			}
		}
	}
}