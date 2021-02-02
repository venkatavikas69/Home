package HomeInventory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeInventory extends JFrame {

	JToolBar inventoryToolBar = new JToolBar();
	JButton newButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\new.gif"));
	JButton deleteButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\delete.gif"));
	JButton saveButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\save.gif"));
	JButton previousButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\previous.gif"));
	JButton nextButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\next.gif"));
	JButton printButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\print.gif"));
	JButton exitButton = new JButton();

	public static void main(String[] args) {
		new HomeInventory();
	}

	public HomeInventory() {
		setVisible(true);
		setTitle("Home Inventory Manager");
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints gridConstraints;

		inventoryToolBar.setFloatable(false);
		inventoryToolBar.setBackground(Color.DARK_GRAY);
		inventoryToolBar.setOrientation(SwingConstants.VERTICAL);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 0;
		gridConstraints.gridy = 0;
		gridConstraints.gridheight = 8;
		gridConstraints.fill = GridBagConstraints.VERTICAL;
		getContentPane().add(inventoryToolBar, gridConstraints);

		inventoryToolBar.addSeparator();

		Dimension bSize = new Dimension(70, 50);
		
		newButton.setText("New");
		sizeButton(newButton, bSize);
		newButton.setToolTipText("Add New Item");
		newButton.setHorizontalTextPosition(SwingConstants.CENTER);
		newButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		inventoryToolBar.add(newButton);
		newButton.addActionListener(e -> newButtonActionPerformed(e));

		deleteButton.setText("Delete");
		sizeButton(deleteButton, bSize);
		deleteButton.setToolTipText("Delete Current Item");
		deleteButton.setHorizontalTextPosition(SwingConstants.CENTER);
		deleteButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		inventoryToolBar.add(deleteButton);
		deleteButton.addActionListener(e -> deleteButtonActionPerformed(e));

		saveButton.setText("Save");
		sizeButton(saveButton, bSize);
		saveButton.setToolTipText("Save Current Item");
		saveButton.setHorizontalTextPosition(SwingConstants.CENTER);
		saveButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		inventoryToolBar.add(saveButton);
		saveButton.addActionListener(e -> saveButtonActionPerformed(e));

		inventoryToolBar.addSeparator();

		previousButton.setText("Previous");
		sizeButton(previousButton, bSize);
		previousButton.setToolTipText("Display Previous Item");
		previousButton.setHorizontalTextPosition(SwingConstants.CENTER);
		previousButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		inventoryToolBar.add(previousButton);
		previousButton.addActionListener(e -> previousButtonActionPerformed(e));

		nextButton.setText("Next");
		sizeButton(nextButton, bSize);
		nextButton.setToolTipText("Display Next Item");
		nextButton.setHorizontalTextPosition(SwingConstants.CENTER);
		nextButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		inventoryToolBar.add(nextButton);
		nextButton.addActionListener(e -> newButtonActionPerformed(e));
		
		printButton.setText("Print");
		sizeButton(printButton, bSize);
		printButton.setToolTipText("Print Inventory list");
		printButton.setHorizontalTextPosition(SwingConstants.CENTER);
		printButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		inventoryToolBar.add(printButton);
		printButton.addActionListener(e -> printButtonActionPerformed(e));

		exitButton.setText("Exit");
		sizeButton(exitButton, bSize);
		exitButton.setToolTipText("Exit Program");
		inventoryToolBar.add(exitButton);
		exitButton.addActionListener(e -> exitButtonActionPerformed(e));

		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())),
				getWidth(), getHeight());
	}

	private void sizeButton(JButton b, Dimension d) {
		b.setPreferredSize(d);
		b.setMinimumSize(d);
		b.setMaximumSize(d);
	}

	private void newButtonActionPerformed(ActionEvent e) {

	}

	private void deleteButtonActionPerformed(ActionEvent e) {

	}

	private void saveButtonActionPerformed(ActionEvent e) {

	}

	private void previousButtonActionPerformed(ActionEvent e) {

	}

	private void nextButtonActionPerformed(ActiveEvent e) {

	}

	private void printButtonActionPerformed(ActionEvent e) {

	}

	private void exitButtonActionPerformed(ActionEvent e) {

	}

	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}

}
