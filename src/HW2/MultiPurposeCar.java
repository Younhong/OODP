import java.util.Scanner;

/*
User's Manual
If you run this program, you will be asked to choose the function of your car.
There are 4 functions. They are car, plane, boat, submarine.
Unless you enter N, it will keep ask you to choose function.
If you enter C, then car will start moving.
If you choose P, then plane will start flying. Increasing number of altimeter will be shown.
If you enter B, then boat will start moving.
If you type S, then submarine will move under water. Decreasing number of sea_level will be shown.
And for all those types, increasing number of speed will be displayed.'
If you enter any other keys besides the ones I mentioned, it will not execute anything and ask question again.
*/

public class MultiPurposeCar
{
	public static void main(String[] args)
	{
		char answer = ' ';
		Scanner keyboard = new Scanner(System.in);

		CarInterface car = new CarAdapter();
		CarInterface plane = new CarAdapter();
		CarInterface boat = new CarAdapter();
		CarInterface submarine = new CarAdapter();

		System.out.println("Choose the function of your car.");
		System.out.println("(C)ar (P)lane, (B)oat, (S)ubmarine");
		answer = keyboard.next().charAt(0);

		while (answer != 'N') {
			if (answer == 'C') {
				car.move(1);
				System.out.println("Choose the function of your car.");
				System.out.println("(C)ar (P)lane, (B)oat, (S)ubmarine");
				answer = keyboard.next().charAt(0);
			}
			else if (answer == 'P') {
				plane.move(2);
				System.out.println("Choose the function of your car.");
				System.out.println("(C)ar (P)lane, (B)oat, (S)ubmarine");
				answer = keyboard.next().charAt(0);
			}
			else if (answer == 'B') {
				boat.move(3);
				System.out.println("Choose the function of your car.");
				System.out.println("(C)ar (P)lane, (B)oat, (S)ubmarine");
				answer = keyboard.next().charAt(0);
			}
			else if (answer == 'S') {
				submarine.move(4);
				System.out.println("Choose the function of your car.");
				System.out.println("(C)ar (P)lane, (B)oat, (S)ubmarine");
				answer = keyboard.next().charAt(0);
			}
			else {
				System.out.print("\n");
				System.out.println("Choose the function of your car.");
				System.out.println("(C)ar (P)lane, (B)oat, (S)ubmarine");
				answer = keyboard.next().charAt(0);
			}
		}
		System.out.println("End of this program.");
	}
}