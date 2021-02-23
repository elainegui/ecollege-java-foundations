package eCollegeJava.guiDevelopment;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MessageDialogBox extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//showMessageDialog()
		/*JOptionPane.showMessageDialog(null, "Java GUI Developer", "Welcome User",
				JOptionPane.INFORMATION_MESSAGE);*/

		//input
		/*String name = JOptionPane.showInputDialog(null, "Enter Name", "Java GUI Developer",
				JOptionPane.INFORMATION_MESSAGE);
		
		int age = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Enter Age", "Java GUI Developer", JOptionPane.INFORMATION_MESSAGE));
		*/

		//output
		/*JOptionPane.showMessageDialog(null, "Name: " + name + "\n" + "Age: " + age, "Java GUI Developer",
				JOptionPane.INFORMATION_MESSAGE);
		*/

		//showConfirmDialog()
		//pop up window to prompt the user whether they want to vontinue or terminate f. ex
		/*int option = JOptionPane.showConfirmDialog(null, "Continue?");
		
		if (option == JOptionPane.YES_OPTION) { // Yes Button ... 0
			JOptionPane.showMessageDialog(null, "You wish to continue!");
		} else if (option == JOptionPane.NO_OPTION) { // No Button ... 1
			JOptionPane.showMessageDialog(null, "You do not wish to continue!");
		} else if (option == JOptionPane.CANCEL_OPTION) { // Cancel Button ... 2
			JOptionPane.showMessageDialog(null, "You pressed the cancel button!");
		}*/

		/*The showConfirmDialog() method returns an int value:
		If the Yes button is pressed, 0 is returned.
		If the No button is pressed, 1 is returned.
		If the Cancel button is pressed, 2 is returned.*/

		/*To create a frame, you can either:
		Create a class which extends the JFrame class.
		public class MyFrame extends JFrame{
		or
		Create an instance of the JFrame class within your own class.
		JFrame frame = new JFrame();
		*/

		// Create a JFrame
		JFrame frame = new JFrame("MyFrame");

		/*// Set the frame size
		frame.setSize(400, 300); // 400 pixels wide and 300 pixels high
		
		// Centre the frame
		frame.setLocationRelativeTo(null);
		
		// Close the frame upon exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display the frame
		frame.setVisible(true);
		
		// Each JFrame contains a content pane. A content pane is an instance of java.awt.Container.
		// A content pane is like an invisible layer placed on top of the frame.
		// GUI components such as buttons can be placed onto the content pane of a frame.
		// Create a JButton object
		JButton jbtSubmit = new JButton("Submit");
		
		// Add a button to the content pane of the frame
		 Note: A frame by default, uses a border layout manager to organise where its components are located.
		 *  We will be looking at the concept of layout managers in future topics.
		 *  For now, be aware that a layout manager is an object that is responsible for the layout of GUI components
		 *  within a container, such as a frame.
		 *  A Border Layout Manager, divides a container up into different regions.
		 *  The regions are North | East | Centre | West | South.
		 *  Think of the map of Ireland - and the different regions.
		 *  By default, the Border Layout Manager will place GUI components into the centre region.
		
		// Add the button to the frame - placed by default into the centre region by the Border Layout manager.
		frame.add(jbtSubmit);
		// Set the frame's attributes
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);*/

		// Set FlowLayout as the layout manager for the frame.
		// Specify left alignment for GUI components.
		// Specify a horizontal gap of 10 pixels between components.
		// Specify a vertical gap of 20 pixels between components.
		/*FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 20);
		frame.setLayout(layout);
		// Create and add labels, text fields and buttons to the frame.
		frame.add(new JLabel("First Name: "));
		frame.add(new JTextField(10));
		// space for 10 characters to be entered
		frame.add(new JLabel("Last Name: "));
		frame.add(new JTextField(10));
		// space for 10 characters to be entered
		frame.add(new JButton("Submit: "));
		frame.add(new JButton("Exit"));
		// Set the attributes of the frame.
		frame.setTitle("ShowFlowLayout");
		frame.setSize(250, 210);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);*/

		// Set GridLayout as the layout manager for the frame.
		// Specify 3 rows, 2 columns and spacing gaps of 5 pixels
		// between components, both vertically and horizontally.
		/*	GridLayout layout = new GridLayout(3, 2, 5, 5);
			frame.setLayout(layout);
			// Create and add labels, text fields and buttons to the frame.
			frame.add(new JLabel("First Name: "));
			frame.add(new JTextField(10));
			// space for 10 characters to be entered
			frame.add(new JLabel("Last Name: "));
			frame.add(new JTextField(10));
			// space for 10 characters to be entered
			frame.add(new JButton("Submit: "));
			frame.add(new JButton("Exit"));
			// Set the attributes of the frame.
			frame.setTitle("GridLayout Manager");
			frame.setSize(300, 200);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);*/

		/*A layout manager is an object whose function is to place GUI components such as text fields, labels, buttons etc.
		 into the correct locations of a container.
		 There are three basic layout managers noted below, others are more complex.
		FlowLayout, GridLayout and BorderLayout*/

		/*The BorderLayout manager, views a container (i.e. a frame) as being composed of several regions, north, east, west, centre, south.
		 Components are added to the container by specifying one of five constants
		 (BorderLayout.EAST, BorderLayout.WEST, BorderLayout.NORTH, BorderLayout.CENTRE (default), BorderLayout.SOUTH).
		 The CENTRE component can stretch both horizontally and vertically to fill any empty space*/

		// Set BorderLayout as the layout manager for the frame.
		// Note, by default, a frame has a border layout set.
		/*BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		// Create and add labels to the frame.
		frame.add(new JButton("CENTRE"), BorderLayout.CENTER);
		frame.add(new JButton("North"), BorderLayout.NORTH);
		frame.add(new JButton("South"), BorderLayout.SOUTH);
		frame.add(new JButton("West"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		// Set the attributes of the frame.
		frame.setTitle("BorderLayout Manager");
		frame.setSize(250, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);*/

		/*A panel is a sub-container that can be used to organise GUI components.
		For organisation purposes, GUI components such as labels, text fields and buttons can be added to a panel,
		and subsequently, the panel is added to the frame.
		A frame can contain many panels.
		For example, if the frame is set to a border layout, panels can be placed into each of its regions.
		Panels can be placed inside a frame or inside another panel.
		Panels also use layout managers to organise GUI components.*/

		// Create a JPanel object to hold two labels and two text fields.
		// A panel has a flow layout by default
		// We are going to use a grid layout instead.
		/*JPanel panelUserEntry = new JPanel(new GridLayout(2, 2, 5, 5));
		// Create and add labels, text fields to panelUserEntry.
		panelUserEntry.add(new JLabel("First Name: "));
		panelUserEntry.add(new JTextField(10));
		panelUserEntry.add(new JLabel("Last Name: "));
		panelUserEntry.add(new JTextField(10));
		// Create a second JPanel object to hold two buttons.
		JPanel panelButtons = new JPanel();
		// Create and add two buttons to panelButtons.
		panelButtons.add(new JButton("Submit"));
		panelButtons.add(new JButton("Exit"));
		// Create a third panel to act as a parent panel, to store panel1 and panel2.
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		JPanel panelParent = new JPanel(layout);
		panelParent.add(panelUserEntry);
		panelParent.add(panelButtons);
		// Add panelParent to the frame
		frame.add(panelParent);
		// Set the attributes of the frame.
		frame.setTitle("Panels as Subcontainers");
		frame.setSize(300, 160);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);*/

		//creation of a calculator frame
		// Create panel p1 to store the buttons for the GUI.
		// Set GridLayout as Layout Manager.
		/*JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 3));
		// Add buttons 0-9 to panel p1, using a for loop.
		for (int i = 0; i <= 9; i++) {
			p1.add(new JButton("" + i));
		}
		// loop
		// Add the remaining buttons.
		p1.add(new JButton("Dial"));
		p1.add(new JButton("Clear"));
		// Create panel p2, to hold a text field.
		// In practice, this would display the number dialled.
		// This is beyond the scope of this demonstration.
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.add(new JTextField("Dialled No. entered appears here:"));
		// Create a parent panel p3 to hold child panels, p1 and p2.
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.add(p2);
		// add panel with text field
		p3.add(p1);
		// add panel with buttons
		// Add parent panel p3 to the frame.
		frame.add(p3);
		// Frame has a border layout by default.
		// Set the frame's attributes and display it.
		frame.setTitle("Telephone Pad");
		frame.setSize(250, 200);
		frame.setLocationRelativeTo(null);
		// centre the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
			}
		}*/

		// Create an object from the class.
		MessageDialogBox cb = new MessageDialogBox();
		// Set frame attributes
		cb.setSize(200, 200);
		cb.setLocationRelativeTo(null);
		cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Display the frame
		cb.setVisible(true);
		// Event Handling Method

	}
	//working with colors
	// Instance variable
	JButton jbtSubmit;
	// Constructor
	public MessageDialogBox() {
		// Instantiate JButton object
		jbtSubmit = new JButton("Submit");
		// Add actionListener for button
		jbtSubmit.addActionListener(this);
		// Instantiate Color object
		Color color = new Color(255, 255, 0);
		// YELLOW
		// Set background colour of object
		jbtSubmit.setBackground(color);
		// Add button to frame - it will be placed in the centre
		add(jbtSubmit);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// There is only one GUI component on the frame.

		// There is no ambiguity as to which component generated the event.
		System.out.println("Button clicked");
	}
}
