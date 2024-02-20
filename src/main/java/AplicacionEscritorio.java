import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AplicacionEscritorio {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionEscritorio window = new AplicacionEscritorio();
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
	public AplicacionEscritorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOLA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(173, 10, 54, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("HOLA");
		btnNewButton.setBounds(53, 217, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBuenasTio = new JButton("BUENAS TIO");
		btnBuenasTio.setBounds(272, 217, 101, 21);
		frame.getContentPane().add(btnBuenasTio);
		
		textField = new JTextField();
		textField.setBounds(75, 64, 274, 94);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
