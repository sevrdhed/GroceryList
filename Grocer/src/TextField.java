import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextField extends JPanel {
	
	private JTextArea textArea;
	public TextField() {
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
	}
	public void append(String text) {
		
		textArea.append(text);
		// TODO Auto-generated method stub
		
	}

}
