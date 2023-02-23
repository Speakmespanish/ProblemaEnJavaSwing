import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

public class Ventana implements ActionListener{

	//Creamos e instanciamos objetos
	Items item = new Items();
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel original = new JLabel("Original");
	JLabel espejo = new JLabel("Espejo");
	JLabel label1 = new JLabel("Opcion 1");
	JLabel label2 = new JLabel("Opcion 2");
	JLabel label3 = new JLabel("Opcion 3");
	JLabel label4 = new JLabel("Opcion 4");
	JLabel label5 = new JLabel("Opcion 5");
	JLabel label6 = new JLabel("Opcion 6");
	JCheckBox opcion1 = new JCheckBox();
	JCheckBox opcion2 = new JCheckBox();
	JCheckBox opcion3 = new JCheckBox();
	JRadioButton opcion4 = new JRadioButton();
	JRadioButton opcion5 = new JRadioButton();
	JRadioButton opcion6 = new JRadioButton();
	JTextField Text1 = new JTextField();
	JSpinner Spinner1 = new JSpinner();
	JComboBox TextArea1 = new JComboBox(item.Items);
	
	
	JLabel label1c = new JLabel("Opcion 1");
	JLabel label2c = new JLabel("Opcion 2");
	JLabel label3c = new JLabel("Opcion 3");
	JLabel label4c = new JLabel("Opcion 4");
	JLabel label5c = new JLabel("Opcion 5");
	JLabel label6c = new JLabel("Opcion 6");
	JCheckBox opcion1c = new JCheckBox();
	JCheckBox opcion2c = new JCheckBox();
	JCheckBox opcion3c = new JCheckBox();
	JRadioButton opcion4c = new JRadioButton();
	JRadioButton opcion5c = new JRadioButton();
	JRadioButton opcion6c = new JRadioButton();
	JTextField Text1c = new JTextField();
	JSpinner Spinner1c = new JSpinner();
	JComboBox TextArea1c = new JComboBox(item.Items);
	
	
	public void CrearVentana() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(600, 500);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.setResizable(false);
		
		frame.add(panel1);
		frame.add(panel2);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
	Object btnPulsado = e.getSource();
	
	if (btnPulsado.equals(opcion1)) {
		opcion1c.setEnabled(true);
		
		
	}
		
	}
	
	public void CrearPaneles() {
		
		//Configuracion del panel #1	
		panel1.setLayout(null);
		
		panel1.add(original);
		original.setBounds(30, -40, 50, 130);
							panel1.add(opcion1);		panel1.add(label1);			opcion1.setBounds(160, 30, 30, 50);			label1.setBounds(190, -10, 50, 130);
							panel1.add(opcion2);		panel1.add(label2);			opcion2.setBounds(160, 80, 30, 50);			label2.setBounds(190, 40, 50, 130);
							panel1.add(opcion3);		panel1.add(label3);			opcion3.setBounds(160, 130, 30, 50);		label3.setBounds(190, 90, 50, 130);
							panel1.add(opcion4);		panel1.add(label4);			opcion4.setBounds(260, 30, 30, 50);			label4.setBounds(290, -10, 50, 130);
							panel1.add(opcion5);		panel1.add(label5);			opcion5.setBounds(260, 80, 30, 50);			label5.setBounds(290, 40, 50, 130);
							panel1.add(opcion6);		panel1.add(label6);			opcion6.setBounds(260, 130, 30, 50);		label6.setBounds(290, 90, 50, 130);
		
							panel1.add(Text1);			Text1.setBounds(400, 50, 130, 30);
							panel1.add(TextArea1);		TextArea1.setBounds(400, 90, 130, 30);
							panel1.add(Spinner1);		Spinner1.setBounds(400, 140, 130, 30);
							
							opcion1.addActionListener(this);
							opcion2.addActionListener(this);
							
							
							
		//Configuracion del panel #2
		panel2.setLayout(null);
		
		panel2.add(espejo);
		espejo.setBounds(30, -40, 50, 130);
		
		panel2.add(opcion1c);		panel2.add(label1c);			opcion1c.setBounds(160, 30, 30, 50);			label1c.setBounds(190, -10, 50, 130);
		panel2.add(opcion2c);		panel2.add(label2c);			opcion2c.setBounds(160, 80, 30, 50);			label2c.setBounds(190, 40, 50, 130);
		panel2.add(opcion3c);		panel2.add(label3c);			opcion3c.setBounds(160, 130, 30, 50);			label3c.setBounds(190, 90, 50, 130);
		panel2.add(opcion4c);		panel2.add(label4c);			opcion4c.setBounds(260, 30, 30, 50);			label4c.setBounds(290, -10, 50, 130);
		panel2.add(opcion5c);		panel2.add(label5c);			opcion5c.setBounds(260, 80, 30, 50);			label5c.setBounds(290, 40, 50, 130);
		panel2.add(opcion6c);		panel2.add(label6c);			opcion6c.setBounds(260, 130, 30, 50);			label6c.setBounds(290, 90, 50, 130);

		panel2.add(Text1c);			Text1c.setBounds(400, 50, 130, 30);
		panel2.add(TextArea1c);		TextArea1c.setBounds(400, 90, 130, 30);
		panel2.add(Spinner1c);		Spinner1c.setBounds(400, 140, 130, 30);
	}
	
	
	Ventana() {
		
		//Creamos los paneles
		CrearPaneles();
		//Creamos la ventana
		CrearVentana();
	}
}
