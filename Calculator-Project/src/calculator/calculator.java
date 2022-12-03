package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	//Launch the application.

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the application.
	 
	public calculator() {
		initialize();
	}

	//Initialize the contents of the frame.
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 20));
		frame.setBounds(100, 100, 286, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setBounds(12, 12, 250, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_backspace = new JButton("B");
		btn_backspace.setFont(new Font("Arial", Font.BOLD, 20));
		btn_backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
				
			}
		});
		btn_backspace.setBounds(12, 100, 80, 43);
		frame.getContentPane().add(btn_backspace);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Arial", Font.PLAIN, 18));
		btn7.setBounds(12, 155, 51, 43);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial", Font.PLAIN, 18));
		btn4.setBounds(12, 210, 51, 43);
		frame.getContentPane().add(btn4);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial", Font.PLAIN, 18));
		btn0.setBounds(12, 320, 51, 43);
		frame.getContentPane().add(btn0);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 18));
		btn1.setBounds(12, 265, 51, 43);
		frame.getContentPane().add(btn1);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Arial", Font.BOLD, 20));
		btn_clear.setBounds(100, 100, 74, 43);
		frame.getContentPane().add(btn_clear);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Arial", Font.PLAIN, 18));
		btn8.setBounds(68, 155, 51, 43);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Arial", Font.PLAIN, 18));
		btn5.setBounds(68, 210, 51, 43);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial", Font.PLAIN, 18));
		btn2.setBounds(68, 265, 51, 43);
		frame.getContentPane().add(btn2);
		
		final JButton btn_spot = new JButton(".");
		btn_spot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_spot.getText();
				textField.setText(number);
			}
		});
		btn_spot.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_spot.setBounds(68, 320, 51, 43);
		frame.getContentPane().add(btn_spot);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btn_plus.setFont(new Font("Arial", Font.BOLD, 20));
		btn_plus.setBounds(186, 100, 76, 43);
		frame.getContentPane().add(btn_plus);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Arial", Font.PLAIN, 18));
		btn9.setBounds(123, 155, 51, 43);
		frame.getContentPane().add(btn9);
		
		JButton btn_subtract = new JButton("-");
		btn_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btn_subtract.setFont(new Font("Arial", Font.BOLD, 20));
		btn_subtract.setBounds(186, 155, 76, 43);
		frame.getContentPane().add(btn_subtract);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Arial", Font.PLAIN, 18));
		btn6.setBounds(123, 210, 51, 43);
		frame.getContentPane().add(btn6);
		
		JButton btn_multi = new JButton("*");
		btn_multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btn_multi.setFont(new Font("Arial", Font.BOLD, 20));
		btn_multi.setBounds(186, 210, 76, 43);
		frame.getContentPane().add(btn_multi);
		
		JButton btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btn_division.setFont(new Font("Arial", Font.BOLD, 20));
		btn_division.setBounds(186, 265, 76, 43);
		frame.getContentPane().add(btn_division);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial", Font.PLAIN, 18));
		btn3.setBounds(123, 265, 51, 43);
		frame.getContentPane().add(btn3);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btn_equal.setFont(new Font("Arial", Font.PLAIN, 18));
		btn_equal.setBounds(123, 320, 51, 43);
		frame.getContentPane().add(btn_equal);
		
		JButton btn_porcent = new JButton("%");
		btn_porcent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btn_porcent.setFont(new Font("Arial", Font.BOLD, 20));
		btn_porcent.setBounds(186, 320, 76, 43);
		frame.getContentPane().add(btn_porcent);
	}
}
