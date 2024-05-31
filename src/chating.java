import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class chating extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chating frame = new chating();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public chating() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 372, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 356, 598);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(0, 599, 292, 98);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("전송");
		btnNewButton.setBounds(290, 599, 66, 98);
		contentPane.add(btnNewButton);
	}
}
