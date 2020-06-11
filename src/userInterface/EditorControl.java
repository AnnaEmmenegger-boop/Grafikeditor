package userInterface;

import java.awt.Graphics;
import java.awt.Point;
import drawing.Drawing;
import figures.Figur;
import figures.GetFigur;

final class EditorControl {
	private Drawing drawing = new Drawing();
	private GetFigur getFigurFactory = new GetFigur();
	private char figurTyp;
	private Point firstPoint;
	private Point secondPoint;

	public void drawAllNew(Graphics g) {
		drawing.drawFigur(g);
	}

	public void setFigurTyp(char figurTyp) {
		this.figurTyp = figurTyp;
	}

	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}
	
	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}

	public void generateFigur() {
		Figur f = getFigurFactory.getFigur(firstPoint.x, secondPoint.x, firstPoint.y, secondPoint.y, figurTyp);
		
		if (f == null) {
			System.err.println("Press a key before drawing.");
		} else {
			drawing.add(f);
		}
	}
	
}
