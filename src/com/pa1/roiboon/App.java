package com.pa1.roiboon;
/**
 * @author Roiboon Chaiyachit
 */

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JMenuItem;


@SuppressWarnings("serial")
public class App extends JFrame {
	
	private JPanel 				mainPane;
	private JLabel 				equalLabel;
	private JTextField 			rightTextField;
	private JTextField 			leftTextField;
	static  JComboBox<Object> 	leftComboBox;
	static  JComboBox<Object> 	rightComboBox;
	private JMenuItem 			mntmNewMenuItem;
	private UnitFactory 		unitFactory;
	private JMenuBar 			menuBar;
	private JMenu 				mnUnitType;

	/*
	 Initial Distance Converter value and unit converter
	 * */
	public App() {
		setTitle("Unit Converter");
		unitFactory = UnitFactory.getInstance();
		initComponent();
		
	}
	
	/**
	 Initial value all of the component
	 */
	public void initComponent(){
		mainPane 		= new JPanel();
		leftTextField 	= new JTextField();
		leftTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				typeValue(Choice.LEFT);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				typeValue(Choice.LEFT);
			}
		});
		leftTextField.setColumns(10);
		leftComboBox	= new JComboBox<Object> (Length.values());
		leftComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				typeValue(Choice.LEFT);
			}
		});
		equalLabel 		= new JLabel("=");
		rightTextField 	= new JTextField();
		rightTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				typeValue(Choice.RIGHT);
			}
			@Override
			public void keyReleased(KeyEvent e) {
				typeValue(Choice.RIGHT);
			}
		});
		rightTextField.setColumns(10);
		rightComboBox	= new JComboBox<Object> (Length.values());
		rightComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typeValue(Choice.RIGHT);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 100);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		mnUnitType = new JMenu("Unit Type");
		menuBar.add(mnUnitType);
		
		setMenu();
		mnUnitType.add(mntmNewMenuItem);
		setContentPane(mainPane);
		mainPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		mainPane.add(leftTextField);
		mainPane.add(leftComboBox);
		mainPane.add(equalLabel);
		mainPane.add(rightTextField);
		mainPane.add(rightComboBox);
		
	}
	
	private void setMenu() {
		UnitType[] unitType = unitFactory.getUnitTypes();
		for(UnitType type : unitType){
			mntmNewMenuItem = new JMenuItem(String.valueOf(type));
			mntmNewMenuItem.addActionListener( new UnitAction(type.getUnit()) );
			mnUnitType.add(mntmNewMenuItem);
		}
	}
	
	/**
	 * @param choice is a enum that contained user's deicsion to type the input on the left or on the right texfield
	 * this program will convert unit automatically depend on user choice.
	 * So when user's input is not a number or user remove thier input, Program will set the both side of textfield to be empty 
	 * */
	
	private void typeValue(Choice choice) {
		if(choice.equals(Choice.LEFT)){
			try {
				double amount = Double.parseDouble(leftTextField.getText());
				if(amount >= 0) {
					leftTextField.setForeground(Color.BLACK);
					rightTextField.setForeground(Color.BLACK);
					Unit fromUnit = (Unit) leftComboBox.getSelectedItem();
					Unit toUnit = (Unit) rightComboBox.getSelectedItem();
					String result = String.valueOf(String.format("%.6f", unitFactory.convert(amount, fromUnit, toUnit)));
					rightTextField.setText(result);
				}
				else {
					leftTextField.setForeground(Color.RED);
					rightTextField.setForeground(Color.RED);
				}
			}
			catch(Exception e){
				leftTextField.setForeground(Color.RED);
				rightTextField.setForeground(Color.RED);
			}
		}
		else if(choice.equals(Choice.RIGHT)) {
			try {
				double amount = Double.parseDouble(rightTextField.getText());
				if(amount >= 0) {
					rightTextField.setForeground(Color.BLACK);
					leftTextField.setForeground(Color.BLACK);
					Unit fromUnit = (Unit) rightComboBox.getSelectedItem();
					Unit toUnit = (Unit) leftComboBox.getSelectedItem();
					String result = String.valueOf(String.format("%.6f", unitFactory.convert(amount, fromUnit, toUnit)));
					leftTextField.setText(result);
				}
				else {
					leftTextField.setForeground(Color.RED);
				}
			}catch(Exception e){
				leftTextField.setForeground(Color.RED);
				rightTextField.setForeground(Color.RED);
			}
		}
	}
}
