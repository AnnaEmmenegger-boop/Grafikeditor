package figures;

import java.awt.Graphics;

public class Line extends Figur {
	private int endX;
	private int endY;
	
	public Line(int x, int y, int endX, int endY) {
		super(x, y);
		this.endX = endX;
		this.endY = endY;
	}

	@Override
	public void move(int deltaX, int deltaY) {
		super.move(deltaX, deltaY);
		this.endX += deltaX;
		this.endY += deltaY;
	}

	@Override
	public void resize(int scale) {
		this.endX *= scale;
		this.endY *= scale;
	}

	@Override
	public void turn(int degrees) {
		double[] vector = new double[2];
		int vectorX = endX - this.endX;
		int vectorY = endY - this.endY;
		double Radians = Math.toRadians(degrees);
		
		vector[0] = vectorX * Math.cos(Radians) - vectorX * Math.sin(Radians);
		vector[1] = vectorY * Math.sin(Radians) + vectorY * Math.cos(Radians);
		
		this.endX = (int) vector[0] + this.endX;
		this.endY = (int) vector[1] + this.endY;		
	}	

	@Override
	public String toString() {
		return super.toString() + "\nX End: " + endX + "\nY End: " + endY;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(x, y, endX, endY);
	}

	@Override
	public boolean isType(char typ) {
		if (typ == 'l') return true;
		return false;
	}

	@Override
	public Figur create(int x1, int x2, int y1, int y2) {
		return new Line(x1, y1, x2, y2);
	}
}
