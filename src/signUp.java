import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class signUp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUp frame = new signUp();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public signUp() {
		setBounds(100, 100, 413, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setVisible(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("닉네임");
		lblNewLabel.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel.setBounds(12, 118, 159, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(12, 182, 159, 54);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("로그인 ID");
		lblNewLabel_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(12, 246, 159, 54);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD");
		lblNewLabel_3.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(12, 310, 159, 54);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("사는곳");
		lblNewLabel_4.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(12, 374, 159, 54);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("이메일");
		lblNewLabel_5.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(12, 438, 159, 54);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("성별");
		lblNewLabel_5_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 30));
		lblNewLabel_5_1.setBounds(12, 502, 159, 54);
		contentPane.add(lblNewLabel_5_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 195, 159, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 263, 159, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 332, 159, 31);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 396, 159, 31);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(183, 460, 159, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(183, 135, 159, 31);
		contentPane.add(textField_6);
		
		
		ButtonGroup bg = new ButtonGroup();
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("남");
		rdbtnNewRadioButton.setBounds(190, 523, 56, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("여");
		rdbtnNewRadioButton_1.setBounds(267, 523, 56, 23);
		contentPane.add(rdbtnNewRadioButton_1);
	
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setAction(action);
		btnNewButton.setFont(new Font("배달의민족 주아", Font.PLAIN, 40));
		btnNewButton.setBounds(90, 546, 212, 60);
		contentPane.add(btnNewButton);
		
	}
	information in = new information();
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "확인");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			in.setNickname(textField_6);
			in.setName(textField_1.getText());
			setVisible(false);
		}
	}
	
	
}
