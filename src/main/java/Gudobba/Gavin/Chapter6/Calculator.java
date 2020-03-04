package Gudobba.Gavin.Chapter6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator {

	private JFrame frame;
	private JTextField num;
	private JTextField den;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		num = new JTextField();
		num.setBounds(68, 104, 116, 22);
		panel.add(num);
		num.setColumns(10);
		
		den = new JTextField();
		den.setBounds(268, 104, 116, 22);
		panel.add(den);
		den.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(100, 75, 71, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(289, 75, 87, 16);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(78, 183, 97, 25);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(296, 187, 56, 16);
		panel.add(lblNewLabel_2);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double num =Double.parseDouble("num");
				double den =Double.parseDouble("den");
			
			SimpleMath result = new SimpleMath(); 
				result.divide(num,den);
				
				try {
					JLabel lblNewLabel_2 = new JLabel("result");}
					catch(ArithmeticException e1) {
						e1.printStackTrace();
					}
				}
			}	
		);
	}
}
