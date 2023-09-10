import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;

public class CalculatorUsingGUI extends JFrame {

	private JPanel contentPane;
	private JTextField Input;
	private double result,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUsingGUI frame = new CalculatorUsingGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str) {
		Input.setText(Input.getText() + str);
	}
	
	public void calculate() {
		switch(operation) {
		case 1:
			result = number + Double.parseDouble(Input.getText());
			Input.setText(Double.toString(result));
			break;
		case 2:
			result = number - Double.parseDouble(Input.getText());
			Input.setText(Double.toString(result));
			break;	
		case 3:
			result = number * Double.parseDouble(Input.getText());
			Input.setText(Double.toString(result));
			break;
		case 4:
			result = number / Double.parseDouble(Input.getText());
			Input.setText(Double.toString(result));
			break;	
		}
	}

	/**
	 * Create the frame.
	 */
	public CalculatorUsingGUI() {
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Screen = new JPanel();
		Screen.setBounds(10,16, 364, 60);
		contentPane.add(Screen);
		Screen.setLayout(null);
		
		Input = new JTextField();
		Input.setFont(new Font("Tahoma", Font.BOLD, 23));
		Input.setHorizontalAlignment(SwingConstants.RIGHT);
		Input.setBounds(0, 24, 364, 36);
		Screen.add(Input);
		Input.setColumns(10);
		
		JLabel Label = new JLabel("");
		Label.setFont(new Font("Tahoma", Font.BOLD, 10));
		Label.setHorizontalAlignment(SwingConstants.RIGHT);
		Label.setBounds(0, 1, 354, 13);
		Screen.add(Label);
		
		JPanel Control = new JPanel();
		Control.setBounds(10, 86, 364, 367);
		contentPane.add(Control);
		Control.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1);
		
		JButton btnNewButton_1_4 = new JButton("8");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_4);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 1;
				Input.setText("");
				Label.setText(number + e.getActionCommand());
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("4");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_5 = new JButton("6");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_3_1 = new JButton("-");
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 2;
				Input.setText("");
				Label.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_3_2_1 = new JButton("1");
		btnNewButton_1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_1);
		
		JButton btnNewButton_1_3_2_1_1 = new JButton("2");
		btnNewButton_1_3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_1_1);
		
		JButton btnNewButton_1_3_2 = new JButton("3");
		btnNewButton_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2);
		
		JButton btnNewButton_1_3_2_2 = new JButton("*");
		btnNewButton_1_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 3;
				Input.setText("");
				Label.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_3_2_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_2);
		
		JButton btnNewButton_1_3_2_2_1 = new JButton("0");
		btnNewButton_1_3_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_3_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_2_1);
		
		JButton btnNewButton_1_3_2_1_1_1 = new JButton("=");
		btnNewButton_1_3_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				Label.setText("");
			}
		});
		btnNewButton_1_3_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_1_1_1);
		
		JButton btnNewButton_1_3_2_3 = new JButton("C");
		btnNewButton_1_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText("");
			}
		});
		btnNewButton_1_3_2_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_3);
		
		JButton btnNewButton_1_3_2_2_2 = new JButton("/");
		btnNewButton_1_3_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(Input.getText());
				operation = 4;
				Input.setText("");
				Label.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_3_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		Control.add(btnNewButton_1_3_2_2_2);
	}
}
