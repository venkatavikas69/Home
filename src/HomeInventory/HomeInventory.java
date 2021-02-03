package HomeInventory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import com.toedter.calendar.*;
import java.beans.*;

public class HomeInventory extends JFrame {

	JToolBar inventoryToolBar = new JToolBar();
	JButton newButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\new.gif"));
	JButton deleteButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\delete.gif"));
	JButton saveButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\save.gif"));
	JButton previousButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\previous.gif"));
	JButton nextButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\next.gif"));
	JButton printButton = new JButton(new ImageIcon("C:\\Users\\Vikas Ravi\\Downloads\\New Size\\print.gif"));
	JButton exitButton = new JButton();
	JLabel itemLabel = new JLabel();
	JTextField itemTextField = new JTextField();
	JLabel locationLabel = new JLabel();
	JComboBox locationComboBox = new JComboBox();
	JCheckBox markedCheckBox = new JCheckBox();
	JLabel serialLabel = new JLabel();
	JTextField serialTextField = new JTextField();
	JLabel priceLabel = new JLabel();
	JTextField priceTextField = new JTextField();
	JLabel dateLabel = new JLabel();
	JDateChooser dateDateChooser = new JDateChooser();
	JLabel storeLabel = new JLabel();
	JTextField storeTextField = new JTextField();
	JLabel noteLabel = new JLabel();
	JTextField noteTextField = new JTextField();
	JLabel photoLabel = new JLabel();
	JTextArea photoTextArea = new JTextArea();
	JButton photoButton = new JButton();

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
		
		itemLabel.setText("Inventory Item");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 0;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(itemLabel, gridConstraints);
		
		itemTextField.setPreferredSize(new Dimension(400, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 0;
		gridConstraints.gridwidth = 5;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(itemTextField, gridConstraints);
		
		locationLabel.setText("Location");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(locationLabel, gridConstraints);
		
		locationComboBox.setPreferredSize(new Dimension(270, 25));
		locationComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
		locationComboBox.setEditable(true);
		locationComboBox.setBackground(Color.WHITE);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 1;
		gridConstraints.gridwidth = 3;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(locationComboBox, gridConstraints);
		
		markedCheckBox.setText("Marked?");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 5;
		gridConstraints.gridy = 1;
		gridConstraints.insets = new Insets(10, 10, 0, 0);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(markedCheckBox, gridConstraints);
		
		serialLabel.setText("Serial Number");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(serialLabel, gridConstraints);
		
		serialTextField.setPreferredSize(new Dimension(270, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 2;
		gridConstraints.gridwidth = 3;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(serialTextField, gridConstraints);
		
		priceLabel.setText("Purchase Price");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(priceLabel, gridConstraints);
		
		priceTextField.setPreferredSize(new Dimension(160,25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 3;
		gridConstraints.gridwidth = 2;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(priceTextField, gridConstraints);
		
		dateLabel.setText("Date Purchased");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 4;
		gridConstraints.gridy = 3;
		gridConstraints.insets = new Insets(10, 10, 0, 0);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(dateLabel, gridConstraints);
		
		dateDateChooser.setPreferredSize(new Dimension(120, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 5;
		gridConstraints.gridy = 3;
		gridConstraints.gridwidth = 2;
		gridConstraints.insets = new Insets(10,0,0,10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(dateDateChooser, gridConstraints);
		
		storeLabel.setText("Store/Website");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(storeLabel, gridConstraints);
		
		storeTextField.setPreferredSize(new Dimension(400, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 4;
		gridConstraints.gridwidth = 5;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(storeTextField, gridConstraints);
		
		noteLabel.setText("Note");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(noteLabel, gridConstraints);
		
		noteTextField.setPreferredSize(new Dimension(400, 25));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 5;
		gridConstraints.gridwidth = 5;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(noteTextField, gridConstraints);
		
		photoLabel.setText("Photo");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 6;
		gridConstraints.insets = new Insets(10, 10, 0, 10);
		gridConstraints.anchor = GridBagConstraints.EAST;
		getContentPane().add(photoLabel, gridConstraints);
		
		photoTextArea.setPreferredSize(new Dimension(350, 35));
		photoTextArea.setFont(new Font("Arial", Font.PLAIN, 12));
		photoTextArea.setEditable(false);
		photoTextArea.setLineWrap(true);
		photoTextArea.setWrapStyleWord(true);
		photoTextArea.setBackground(new Color(255,255,192));
		photoTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 2;
		gridConstraints.gridy = 6;
		gridConstraints.gridwidth = 4;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(photoTextArea, gridConstraints);
		
		photoButton.setText("...");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = 6;
		gridConstraints.gridy = 6;
		gridConstraints.insets = new Insets(10, 0, 0, 10);
		gridConstraints.anchor = GridBagConstraints.WEST;
		getContentPane().add(photoButton, gridConstraints);
		photoButton.addActionListener(e -> photoButtonActionPerformed(e));

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
	
	private void photoButtonActionPerformed(ActionEvent e) {
		
	}

	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}

}
