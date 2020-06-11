package drawing;

import java.awt.Graphics;
import java.util.Vector;

import figures.Figur;

public class Drawing {
	
	Vector<Figur> figuren = new Vector<Figur>();
	
	public void drawFigur(Graphics g) {
		for (Figur f : figuren) {
			f.draw(g);
		 }		
	}
	
	public void add(Figur figur) {
		figuren.add(figur);
	}


	public void deleteAll() {
		figuren.clear();
	}
	
	public Vector<Figur> showAll() {
		return figuren;
	}
}
