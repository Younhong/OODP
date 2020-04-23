import java.util.*;

class Wheel implements RoverComponent {
    private Random random = new Random();
	int wheelNo = 6;

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void wheel() {
		for (int i = 1; i <= wheelNo; i++) {
			System.out.print(i + " ");
			checkError(i);
		}
		System.out.println();
	}

	public void checkError(int x) {
        int error = random.nextInt(100);

        if (error == 1) {
			System.out.println();
			System.out.println("Wheel" + x + " needs to be repaired");
			System.out.print("Fixing wheel" + x + " ");
		}
		else {
			if (x == wheelNo) {
				System.out.print("OK");
			}
		}
	}
}