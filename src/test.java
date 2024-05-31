import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Label;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(149, 5, 416, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Font oms = new Font("Knewave",Font.ITALIC,20);
		
		JLabel lblNewLabel_1 = new JLabel("OSM");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Knewave", Font.PLAIN, 99));
		lblNewLabel_1.setBounds(0, 0, 416, 205);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(343, 260, 146, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("I D : ");
		lblNewLabel.setBounds(254, 265, 81, 25);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(343, 305, 146, 35);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(254, 310, 81, 25);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("CHECK");
		btnNewButton.setAction(action);
		btnNewButton.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		btnNewButton.setBounds(242, 385, 251, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("log in  page");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(251, 206, 241, 49);
		contentPane.add(lblNewLabel_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "sgin up");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello");
			new signUp(); ///   (JFrame)malloc(sizeof(signUp()))
	
		}
		
	}
}
