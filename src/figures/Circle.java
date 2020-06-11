package figures;

import java.awt.Graphics;

public class Circle extends Figur {
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void resize(int scale) {
		this.radius *= scale;
	}

	@Override
	public void turn(int degrees) {
	}	

	@Override
	public String toString() {
		return super.toString() + "\nRadius: " + radius;
	}

	@Override
	public void draw(Graphics g) {
		g.drawArc(x, y, radius, radius, 0, 360);
	}

	@Override
	public boolean isType(char typ) {
		if (typ == 'c') return true;
		return false;
	}

	@Override
	public Figur create(int x1, int x2, int y1, int y2) {
		int width = calculateDistance(x1, x2);
		int x = calculateCoordinate(x1, x2);
		int y = calculateCoordinate(y1, y2);
		
		return new Circle(x, y - (width / 2), width);
	}
}
