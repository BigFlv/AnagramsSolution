package bridge;

//Java program to implement
//a Simple Registration Form
//using Java Swing

import javax.swing.*;

import actions.Action;
import actions.Assemble;
import actions.Design;
import actions.Produce;
import objects.Furniture;


import java.awt.*;
import java.awt.event.*;

class BridgePatternForm extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Container c;
	private JLabel title;
	private JLabel mno;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	
	
	private JComboBox<String> furnitureComboBox;
	private JComboBox<String> colour;
	private JTextField height;
	private JTextField width;
	private JTextField length;
	private JComboBox<String> material;
	
	public BridgePatternForm()
	{
		setTitle("Fabrica de mobila");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Selecteaza mobila favorita");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(500, 30);
		title.setLocation(300, 30);
		c.add(title);//am adaugat titlul selecteaza mobila favorita
		
		furnitureComboBox = new JComboBox<>();
		furnitureComboBox.setFont(new Font("Arial", Font.PLAIN, 20));
		furnitureComboBox.setSize(300, 30);
		furnitureComboBox.setLocation(100, 100);
		furnitureComboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Canapea", "Dulap", "Scaun", "Masa"}));//am creat casuta cu canapea ,dulap,scaun,masa folosind ComboBox
		c.add(furnitureComboBox);

		mno = new JLabel("Culoare");
		mno.setFont(new Font("Arial", Font.PLAIN, 20));
		mno.setSize(100, 20);
		mno.setLocation(100, 150);
		c.add(mno);//am adaugat culoare

		colour = new JComboBox<>();
		colour.setFont(new Font("Arial", Font.PLAIN, 15));
		colour.setSize(150, 20);
		colour.setLocation(200, 150);
		colour.setModel(new DefaultComboBoxModel<>(new String[] {"Rosu", "Alb", "Negru", "Verde"}));//ComboBox pentru culoare 
		c.add(colour);

		JLabel heightLabel = new JLabel("Inaltime");//am creat casuta cu inaltime unde putem pune sa ii cerem ce inaltime ar trebui sa aiba un anumit obiect pe care noi il alegem
		heightLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		heightLabel.setSize(100, 20);
		heightLabel.setLocation(100, 200);
		c.add(heightLabel);//am adaugat inaltimea

		height = new JTextField();
		height.setFont(new Font("Arial", Font.PLAIN, 15));
		height.setSize(75, 20);
		height.setLocation(200, 200);
		c.add(height);

		JLabel widthLabel = new JLabel("Adancime");//la fel ca inaltimea
		widthLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		widthLabel.setSize(100, 20);
		widthLabel.setLocation(100, 250);
		c.add(widthLabel);

		width = new JTextField();
		width.setFont(new Font("Arial", Font.PLAIN, 15));
		width.setSize(75, 20);
		width.setLocation(200, 250);
		c.add(width);
		
		JLabel lengthLabel = new JLabel("Lungime");
		lengthLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lengthLabel.setSize(100, 20);
		lengthLabel.setLocation(100, 300);
		c.add(lengthLabel);

		length = new JTextField();
		length.setFont(new Font("Arial", Font.PLAIN, 15));
		length.setSize(75, 20);
		length.setLocation(200, 300);
		c.add(length);

		JLabel materialLabel = new JLabel("Material");
		materialLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		materialLabel.setSize(100, 20);
		materialLabel.setLocation(100, 350);
		c.add(materialLabel);

		material = new JComboBox<>();
		c.add(material);
		material.setFont(new Font("Arial", Font.PLAIN, 15));
		material.setSize(150, 20);
		material.setLocation(200, 350);
		material.setModel(new DefaultComboBoxModel<>(new String[] {"Lemn", "MDF", "PAL", "Stofa", "Catifea"}));//ComboBox pentru a alege ce fel de material poate avea unul din obiectele alese de noi

		sub = new JButton("Trimite comanda");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);//actioneaza butonul Trimite comanda
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			
			String furnitureValue = (String) furnitureComboBox.getSelectedItem();
			String colourValue = (String) colour.getSelectedItem();
			String heightValue = height.getText();
			String lengthValue = length.getText();
			String widthValue = width.getText();
			String materialValue = (String) material.getSelectedItem();
						
			double heightVal = Double.valueOf(heightValue);
			double lengthVal = Double.valueOf(lengthValue);
			double widthVal = Double.valueOf(widthValue);
			
			Factory factory = new Factory();
			Furniture furniture = null;
			if(furnitureValue.equalsIgnoreCase("CANAPEA")) {
				
				furniture = factory.getSofa(colourValue, heightVal, lengthVal, widthVal, materialValue);
			}
			if(furnitureValue.equalsIgnoreCase("MASA")) {
				
				furniture = factory.getTable(colourValue, heightVal, lengthVal, widthVal, materialValue);
			}
			if(furnitureValue.equalsIgnoreCase("SCAUN")) {
				
				furniture = factory.getChair(colourValue, heightVal, lengthVal, widthVal, materialValue);
			}
			if(furnitureValue.equalsIgnoreCase("DULAP")) {
				
				furniture = factory.getWardrobe(colourValue, heightVal, lengthVal, widthVal, materialValue);
			}
			
			if(furniture != null) {
				manufacture(furniture);
				tout.setText("SUCCES!");
			}


		}

		else if (e.getSource() == reset) {
			String def = "";
			furnitureComboBox.setSelectedIndex(0);
			colour.setSelectedIndex(0);
			height.setText(def);
			length.setText(def);
			width.setText(def);
			material.setSelectedIndex(0);
		}
	}
	
	private void manufacture(Furniture furniture) {
		
		Action designProcess = new Design();
		Action produceProcess = new Produce();
		Action assembleProcess = new Assemble();
	
		furniture.addAssemblyLine(designProcess);
		furniture.addAssemblyLine(produceProcess);
		furniture.addAssemblyLine(assembleProcess);
		furniture.manufacture();
	}
	
}

