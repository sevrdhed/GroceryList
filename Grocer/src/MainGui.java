import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;

public class MainGui extends JFrame {

	private TextField textDisplay;
	private InputField inputField;
	private int i = 0;
	private double sum = 0;
	private ArrayList<FoodItem> userList = new ArrayList<FoodItem>();
	private validList goodList = new validList(); // These two lines import the
													// full list of food items
	private ArrayList<FoodItem> origlist = (goodList.getList());

	public MainGui() {
		super("Grocery List Creator");

		setLayout(new BorderLayout());

		textDisplay = new TextField();
		inputField = new InputField();
		textDisplay
				.append("Thank you for using the Grocery List creator. I love you. Please put in your items in the field above.\n");

		inputField.setStringListener(new StringListener() {

			public void textEmitted(String text) {
				boolean tr = false;
				text = text.trim();
				if (!text.equalsIgnoreCase("done")) {
					while (!tr && i <= origlist.size() - 1) {

						String exists = origlist.get(i).getName(); // These two
																	// lines
																	// check to
																	// see if
																	// the input
						tr = (text.equalsIgnoreCase(exists)); // matches with
																// the name of
																// an item in
																// the list.
						i++;
					}

					if (tr) {

						userList.add(origlist.get(i - 1));
						textDisplay.append(origlist.get(i - 1).getName()
								+ " has been added to the list.\n");
						tr = false;
						i = 0;
					} else {
						textDisplay.append("I'm sorry, " + text
								+ " isn't a valid item\n"); // This is where we
															// will add
															// functionality to
															// add new items in
															// future
															// iterations.
						i = 0;
					}
				} else {
					// Add the reordering function here.
					textDisplay
							.append("\nThank you. Your reorganized list is below:\n\n");
					Collections.sort(userList); // Sorts the list

					for (FoodItem outputlist : userList) {

						// sum = sum + (outputlist.getPrice()); //This and the
						// last println(sum) total up the projected cost based
						// on the price variable of each object.

						textDisplay.append(outputlist.getName() + " "
								+ outputlist.getLocation() + "\n");

					}
					sum = 0;
					for (FoodItem outputlist : userList) {
						sum = sum + (outputlist.getPrice());
					}
					DecimalFormat numberFormat = new DecimalFormat("#.00");

					textDisplay.append("\nTotal price will be: "
							+ numberFormat.format(sum) + "\n");
				}
			}
		});

		add(textDisplay, BorderLayout.CENTER);
		add(inputField, BorderLayout.NORTH);
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
