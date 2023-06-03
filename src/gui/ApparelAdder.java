package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class ApparelAdder extends JFrame{
	public ApparelAdder() {
		//for Top
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name:",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelGender = new JLabel("Gender:",JLabel.TRAILING);
		JTextField fieldGender = new JTextField(10);
		labelGender.setLabelFor(fieldGender);
		panel.add(labelGender);
		panel.add(fieldGender);
		
		JLabel labelSize = new JLabel("Size:",JLabel.TRAILING);
		JTextField fieldSize = new JTextField(10);
		labelSize.setLabelFor(fieldSize);
		panel.add(labelSize);
		panel.add(fieldSize);
		
		JLabel labelProductNum = new JLabel("ProductNumber:",JLabel.TRAILING);
		JTextField fieldProductNum = new JTextField(10);
		labelProductNum.setLabelFor(fieldProductNum);
		panel.add(labelProductNum);
		panel.add(fieldProductNum);
		
		JLabel labelLocation = new JLabel("Location:",JLabel.TRAILING);
		JTextField fieldLocation = new JTextField(10);
		labelLocation.setLabelFor(fieldLocation);
		panel.add(labelLocation);
		panel.add(fieldLocation);
		
		JLabel labelStock = new JLabel("Stock:",JLabel.TRAILING);
		JTextField fieldStock = new JTextField(10);
		labelStock.setLabelFor(fieldStock);
		panel.add(labelStock);
		panel.add(fieldStock);
		
		JLabel labelColor = new JLabel("Color:",JLabel.TRAILING);
		JTextField fieldColor = new JTextField(10);
		labelColor.setLabelFor(fieldColor);
		panel.add(labelColor);
		panel.add(fieldColor);
		
		JLabel labelPrice = new JLabel("Price:",JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelSeason = new JLabel("Season:",JLabel.TRAILING);
		JTextField fieldSeason = new JTextField(10);
		labelSeason.setLabelFor(fieldSeason);
		panel.add(labelSeason);
		panel.add(fieldSeason);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		SpringUtilities.makeCompactGrid(panel,10,2,6,6,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
