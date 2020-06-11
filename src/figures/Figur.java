package figures;

import java.awt.Graphics;

public abstract class Figur {
	protected int x;
	protected int  y;
	
	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(int deltaX, int deltaY) {
		x += deltaX;
		y += deltaY;
	}

	public int calculateCoordinate(int a, int b) {
		int result;
		
		if (a < b) {
			result = a;
		} else {
			result = b;
		}
		
		return result;
	}
	
	public int calculateDistance(int a, int b) {
		int distance;

		if (a < b) {
			distance = b - a;
		} else {
			distance = a - b;
		}
		
		return distance;
	}

	public String toString() {return "X: " + x + "\nY: " + y;}
	
	public abstract void resize(int scale);
	
	public abstract void turn(int degrees);
	
	public abstract boolean isType(char typ);

	public abstract void draw(Graphics g);

	public abstract Figur create(int x1, int x2, int y1, int y2);
}
