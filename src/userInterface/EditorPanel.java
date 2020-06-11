package userInterface;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
	private EditorControl editorControl;
	
	EditorPanel(EditorControl control) {
		editorControl = control;
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				super.mousePressed(e);
				editorControl.setFirstPoint(e.getPoint());
				System.out.println("Mouse pressed");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				super.mouseReleased(e);
				editorControl.setSecondPoint(e.getPoint());
				editorControl.generateFigur();
				System.out.println("Mouse released");
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		editorControl.drawAllNew(g);
	}
}