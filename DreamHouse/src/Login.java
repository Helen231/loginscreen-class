import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	Connection connection = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {

		setTitle("Login - HomeSHome");
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 264);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setBounds(57, 52, 67, 25);
		contentPane.add(lblUserName);

		txtUserName = new JTextField();
		txtUserName.setBounds(134, 54, 148, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(57, 101, 72, 14);
		contentPane.add(lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(134, 98, 148, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);

		btnLogin.setBounds(193, 150, 89, 23);
		contentPane.add(btnLogin);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}