import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;

import java.awt.event.ActionEvent;

public class addcontact extends JFrame {

	private JPanel contentPane;
	private JTextField nametext;
	private JTextField phonetext;
	private JTextField emailtext;

	
	public addcontact() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(64, 61, 119, 31);
		contentPane.add(lblNewLabel);
		
		nametext = new JTextField();
		
		nametext.setBounds(213, 70, 143, 19);
		contentPane.add(nametext);
		nametext.setColumns(10);
		
		JLabel lblPhoneNo = new JLabel("phone no.");
		lblPhoneNo.setBackground(Color.PINK);
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPhoneNo.setBounds(64, 132, 119, 31);
		contentPane.add(lblPhoneNo);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBackground(Color.BLUE);
		lblEmail.setForeground(Color.GRAY);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEmail.setBounds(64, 202, 119, 31);
		contentPane.add(lblEmail);
		
		phonetext = new JTextField();
		phonetext.setColumns(10);
		phonetext.setBounds(213, 132, 143, 19);
		contentPane.add(phonetext);
		
		emailtext = new JTextField();
		emailtext.setColumns(10);
		emailtext.setBounds(213, 211, 143, 19);
		contentPane.add(emailtext);
		
		JButton save = new JButton("save");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				File f=new File("e:\\contact.txt");
				FileWriter fw=new FileWriter(f,true);
				PrintWriter pw=new PrintWriter(fw);
				
				String name=nametext.getText()+","+phonetext.getText()+","+emailtext.getText();
;				pw.println(name);
				pw.close();
				fw.close();
				nametext.setText("");
				phonetext.setText("");
				emailtext.setText("");
				
				
				}
				catch(Exception e11)
				{
					System.out.println(e11.getMessage());
				}
			}
			
		});
		save.setFont(new Font("Tahoma", Font.PLAIN, 14));
		save.setForeground(new Color(0, 0, 0));
		save.setBounds(157, 342, 103, 31);
		contentPane.add(save);
		
	}
}