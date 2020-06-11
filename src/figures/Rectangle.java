package figures;

import java.awt.Graphics;

public class Rectangle extends Figur {
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(int scale) {
		this.width *= scale;
		this.height *= scale;
	}

	@Override
	public void turn(int degrees) {
		int temp = this.width;
		this.width = this.height;
		this.height = temp;
	}	

	@Override
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);		
	}

	@Override
	public boolean isType(char typ) {
		if (typ == 'r') return true;
		return false;
	}

	@Override
	public Figur create(int x1, int x2, int y1, int y2) {
		int width = calculateDistance(x1, x2);
		int height = calculateDistance(y1, y2);
		int x = calculateCoordinate(x1, x2);
		int y = calculateCoordinate(y1, y2);
		
		return new Rectangle(x, y, width, height);
	}
}
