import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class AddItemButton extends JButton {
	
	private JButton addItem;
	public AddItemButton() {
		super("Add this item");
		
		addActionListener(new ActionListener() {
//Below is where the STUFF GOES. This event occurs when someone clicks the
//AddItem button, which should add their input and check it.
			public void actionPerformed(ActionEvent e) {
			//textDisplay.append("Hello\n");
			}
		});
	}

}
