package userInterface;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public final class EditorFrame extends JFrame {
	private EditorControl editorControl = new EditorControl();	

	public EditorFrame(int width, int height) {
		generateAndSetEditorPanel();
		centerWindow(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				super.keyTyped(e);
				editorControl.setFigurTyp(e.getKeyChar());
			}
		});
	}

	private void generateAndSetEditorPanel() {
		JPanel panel = new EditorPanel(editorControl);
		setContentPane(panel);
	}

	private void centerWindow(int width, int height) {
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle windowRectangle = new Rectangle();
		windowRectangle.width = width;
		windowRectangle.height = height;
		windowRectangle.x = (screensize.width - windowRectangle.width) / 2;
		windowRectangle.y = (screensize.height - windowRectangle.height) / 2;
		setBounds(windowRectangle);
	}
	
}
