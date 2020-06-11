package figures;

import java.awt.Graphics;

public class Square extends Figur {
	private int width;
	
	public Square(int x, int y, int width) {
		super(x, y);
		this.width = width;
	}

	@Override
	public void resize(int scale) {
		this.width *= scale;
	}

	@Override
	public void turn(int degrees) {
	}	

	@Override
	public String toString() {
		return super.toString() + "\nWidth: " + width;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, width);		
	}

	@Override
	public boolean isType(char typ) {
		if (typ == 's') return true;
		return false;
	}

	@Override
	public Figur create(int x1, int x2, int y1, int y2) {
		int width = calculateDistance(x1, x2);
		int x = calculateCoordinate(x1, x2);
		int y = calculateCoordinate(y1, y2);
		
		return new Square(x, y, width);
	}	
}
