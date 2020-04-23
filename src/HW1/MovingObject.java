import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

/* User's Manual
There¡¯s 4 buttons. First, click 'Up-Down Movement', 'Rectangular Movement', or 'Left-Right Movement'. If you click other buttons, nothing will happen.
If you clicked one of buttons I mentioned, then each buttons will make object pop up.
After clicking one of those buttons, don¡¯t click another button.
It is because value of variable a will increase, which will not be execute any of these buttons.
After clicking buttons I mentioned previously, then click ¡°Forward¡± or ¡°Backward¡±.
Then you will see another square made. It will move every time you click ¡°Forward¡± or ¡°Backward¡± buttons.
In first object, forward will move up and backward will move down.
In second object, backward will move in clock direction, forward will move in counter-clock.
Lastly, In third object, square will move left if you click forward, and opposite direction if you click backward.
*/

public class MovingObject extends Applet
    implements ActionListener {

    private Button move, move2, move3, forward, backward;
    int xPoint = 0, yPoint = 100;
    private Object box;
    int a = 0;

    public void init() {
        move = new Button("Up-Down Movement");
        add(move);
        move.addActionListener(this);

        move2 = new Button("Rectangular Movement");
        add(move2);
        move2.addActionListener(this);

        move3 = new Button("Left-Right Movement");
        add(move3);
        move3.addActionListener(this);

        forward = new Button("Forward");
        add(forward);
        forward.addActionListener(this);

        backward = new Button("Backward");
        add(backward);
        backward.addActionListener(this);
    }

    public void paint(Graphics g) {
		if (a == 1) {
			box.firstObject();
			g.setColor(Color.red);
			g.fillRect(0, yPoint, 30, 30);
		}
		if (a == 2) {
			box.secondObject();
			g.setColor(Color.blue);
			g.fillRect(xPoint, yPoint, 30, 30);
		}
		if (a == 3) {
			box.thirdObject();
			g.setColor(Color.green);
			g.fillRect(xPoint, 100, 30, 30);
		}
	}

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == move) {
            Graphics g = getGraphics();
            box = new Object(g);
            box.firstObject();
            a = a + 1;
		}
        if (event.getSource() == move2) {
			Graphics g = getGraphics();
			box = new Object(g);
			box.secondObject();
			a = a + 2;
		}
		if (event.getSource() == move3) {
            Graphics g = getGraphics();
            box = new Object(g);
            box.thirdObject();
            a = a + 3;
		}
        if (event.getSource() == forward) {
			Graphics g = getGraphics();
			box = new Object(g);
			if (a == 1) {
				if (yPoint >= 130) {
					yPoint = yPoint - 30;
				}
				repaint();
			}
			else if (a == 2) {
				if (xPoint == 0 && (yPoint >= 100 && yPoint <= 190)) {
					yPoint = yPoint + 30;
				}
				else if ((xPoint >= 0 && xPoint <= 90) && yPoint == 220) {
					xPoint = xPoint + 30;
				}
				else if (xPoint == 120 && (yPoint > 100 && yPoint <= 220)) {
					yPoint = yPoint - 30;
				}
				else if ((xPoint > 0 && xPoint <= 120) && yPoint == 100) {
					xPoint = xPoint - 30;
				}
				repaint();
			}
			else if (a == 3) {
				if (xPoint >= 30) {
					xPoint = xPoint - 30;
				}
				repaint();
			}
		}
        if (event.getSource() == backward) {
			Graphics g = getGraphics();
			box = new Object(g);
			if (a == 1) {
				if (yPoint < 220) {
					yPoint = yPoint + 30;
				}
				repaint();
			}
			else if (a == 2) {
				if ((xPoint >= 0 && xPoint <= 90) && yPoint == 100) {
					xPoint = xPoint + 30;
				}
				else if (xPoint == 120 && (yPoint >= 100 && yPoint <= 190)) {
					yPoint = yPoint + 30;
				}
				else if ((xPoint > 0 && xPoint <= 120) && yPoint == 220) {
					xPoint = xPoint - 30;
				}
				else if (xPoint == 0 && (yPoint > 100 && yPoint <= 220)) {
					yPoint = yPoint - 30;
				}
				repaint();
			}
			else if (a == 3) {
				if (xPoint < 120) {
					xPoint = xPoint + 30;
				}
				repaint();
			}
		}
    }
}

class Object extends Thread {
	private Graphics g;

    public Object(Graphics graphics) {
        g = graphics;
    }

	public void firstObject() {
		g.drawRect(0, 100, 30, 150);
	}

	public void secondObject() {
		g.drawRect(0, 100, 150, 150);
		g.setColor(Color.black);
		g.fillRect(30, 130, 90, 90);
	}

	public void thirdObject() {
		g.drawRect(0, 100, 150, 30);
	}
}