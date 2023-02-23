import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;


public class FormWindows implements ChangeListener, KeyListener{

	
	public JFrame frame;
	public JTextField textFieldOpcion7;

	/**
	 * Create the application.
	 */
	public FormWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3));
		
		
		JRadioButton rdbtnButtonOpcion1 = new JRadioButton("New radio button");
		panel.add(rdbtnButtonOpcion1);
		
		JCheckBox chckbxButtonOpcion4 = new JCheckBox("New check box");
		panel.add(chckbxButtonOpcion4);
		
		textFieldOpcion7 = new JTextField();
		panel.add(textFieldOpcion7);
		textFieldOpcion7.setColumns(10);
		
		
		JRadioButton rdbtnButtonOpcion2 = new JRadioButton("New radio button");
		panel.add(rdbtnButtonOpcion2);
		
		JCheckBox chckbxButtonOpcion5 = new JCheckBox("New check box");
		panel.add(chckbxButtonOpcion5);
		
		Lista Lista = new Lista();
		JComboBox listOpcion8 = new JComboBox(Lista.Lista);
		panel.add(listOpcion8);
		
		JRadioButton rdbtnButtonOpcion3 = new JRadioButton("New radio button");
		panel.add(rdbtnButtonOpcion3);
		
		JCheckBox chckbxButtonOpcion6 = new JCheckBox("New check box");
		panel.add(chckbxButtonOpcion6);
		
		JSpinner spinnerOpcion9 = new JSpinner();
		panel.add(spinnerOpcion9);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(3, 3));
		
		JRadioButton rdbtnButtonOpcion1_1 = new JRadioButton("New radio button");
		panel_1.add(rdbtnButtonOpcion1_1);
		
		JCheckBox chckbxButtonOpcion4_1 = new JCheckBox("New check box");
		panel_1.add(chckbxButtonOpcion4_1);
		
		JTextField textFieldOpcion7_1 = new JTextField();
		panel_1.add(textFieldOpcion7_1);
		
		JRadioButton rdbtnButtonOpcion1_2 = new JRadioButton("New radio button");
		panel_1.add(rdbtnButtonOpcion1_2);
		
		JCheckBox chckbxButtonOpcion4_2 = new JCheckBox("New check box");
		panel_1.add(chckbxButtonOpcion4_2);
		
		JComboBox listOpcion8_1 = new JComboBox(Lista.Lista);
		panel_1.add(listOpcion8_1);
		
		JRadioButton rdbtnButtonOpcion1_3 = new JRadioButton("New radio button");
		panel_1.add(rdbtnButtonOpcion1_3);
		
		JCheckBox chckbxButtonOpcion4_3 = new JCheckBox("New check box");
		panel_1.add(chckbxButtonOpcion4_3);
		
		JSpinner spinnerOpcion9_1 = new JSpinner();
		panel_1.add(spinnerOpcion9_1);
		
		
		//Acciones------------------------------------------------------------------------------------------------------------------------
		rdbtnButtonOpcion1.addActionListener(new ActionListener() {		//Opcion #1
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnButtonOpcion1.isSelected()) {
					rdbtnButtonOpcion1_1.setSelected(true);
				}
				else {
					rdbtnButtonOpcion1_1.setSelected(false);
				}
			}
		});
		
		rdbtnButtonOpcion2.addActionListener(new ActionListener() {		//Opcion #2
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnButtonOpcion2.isSelected()) {
					rdbtnButtonOpcion1_2.setSelected(true);
				}
				else {
					rdbtnButtonOpcion1_2.setSelected(false);
				}
			}
		});
		
		
		rdbtnButtonOpcion3.addActionListener(new ActionListener() {		//Opcion #3
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnButtonOpcion3.isSelected()) {
					rdbtnButtonOpcion1_3.setSelected(true);
				}
				else {
					rdbtnButtonOpcion1_3.setSelected(false);
				}
			}
		});
		
		
		chckbxButtonOpcion4.addActionListener(new ActionListener() {		//Opcion #4
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxButtonOpcion4.isSelected()) {
					chckbxButtonOpcion4_1.setSelected(true);
				}
				else {
					chckbxButtonOpcion4_1.setSelected(false);
				}
			}
		});
		
		
		chckbxButtonOpcion5.addActionListener(new ActionListener() {		//Opcion #4
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxButtonOpcion5.isSelected()) {
					chckbxButtonOpcion4_2.setSelected(true);
				}
				else {
					chckbxButtonOpcion4_2.setSelected(false);
				}
			}
		});
		
		
		chckbxButtonOpcion6.addActionListener(new ActionListener() {		//Opcion #4
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxButtonOpcion6.isSelected()) {
					chckbxButtonOpcion4_3.setSelected(true);
				}
				else {
					chckbxButtonOpcion4_3.setSelected(false);
				}
			}
		});
		
		
		textFieldOpcion7.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				textFieldOpcion7_1.setText(textFieldOpcion7.getText());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		listOpcion8.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				textFieldOpcion7_1.setText(textFieldOpcion7.getText());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				listOpcion8_1.setAction(listOpcion8.getAction());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//FinAcciones----------------------------------------------------------------------------------------------------------------------
		
		
	}

	

}
