import java.util.*;

class Camera implements RoverComponent {
    private Random random = new Random();
	int cameraNo = 2;

	public void accept(Visitor v) {
		v.visit(this);
	}

	public void camera() {
		for (int i = 1; i <= cameraNo; i++) {
			System.out.print(i + " ");
			checkError(i);
		}
		System.out.println();
	}

	public void checkError(int x) {
        int error = random.nextInt(100);

        if (error == 1) {
			System.out.println();
			System.out.println("\tCamera" + x + " needs to be repaired");
			System.out.print("\tFixing camera" + x + " ");
		}
		else {
			if (x == cameraNo) {
				System.out.print("OK");
			}
		}
	}
}