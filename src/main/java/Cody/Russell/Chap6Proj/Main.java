package Cody.Russell.Chap6Proj;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Main extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField numeratortext;
	private JTextField denominatortext;
	private JTextField numerator1;
	private JTextField denominator1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Main dialog = new Main();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Main() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		numerator1 = new JTextField();
		numerator1.setBounds(23, 52, 130, 26);
		panel.add(numerator1);
		numerator1.setColumns(10);
		
		denominator1 = new JTextField();
		denominator1.setBounds(278, 52, 130, 26);
		panel.add(denominator1);
		denominator1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 24, 124, 16);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(265, 24, 149, 16);
		panel.add(lblNewLabel_1);
		
		JButton calculate = new JButton("Calculate");
		
		calculate.setBounds(150, 105, 117, 29);
		panel.add(calculate);
		
		JLabel result1 = new JLabel("");
		result1.setHorizontalAlignment(SwingConstants.CENTER);
		result1.setBounds(51, 194, 346, 52);
		panel.add(result1);
		
		calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double numerator = Double.parseDouble(numerator1.getText());
				double denominator = Double.parseDouble(denominator1.getText());
				SimpleMath div = new SimpleMath();
				
				try {
				double result = div.divide(numerator, denominator);
				result1.setText(Double.toString(result));
				}
				catch (Exception e1){
				result1.setText("Cannot divide by 0");
			}
			}
		});
	}
}
		
		