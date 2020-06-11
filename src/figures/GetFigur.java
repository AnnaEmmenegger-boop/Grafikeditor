package figures;

public class GetFigur {

	private Figur[] prototypFigur = new Figur[] {
			new Rectangle(0, 0, 0, 0),
			new Square(0, 0, 0),
			new Line(0, 0, 0, 0),
			new Circle(0, 0, 0)
	};
	
	public Figur getFigur(int x1, int x2, int y1, int y2, char figurTyp) {				
		for (Figur f : prototypFigur) {
			if (f.isType(figurTyp)) {
				return f.create( x1, x2, y1, y2);			
			}
		}
		return null;
	}
}
