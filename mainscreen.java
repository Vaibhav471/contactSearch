
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainscreen extends JFrame{

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainscreen frame = new mainscreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public mainscreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(416, 243, 10, 10);
		contentPane.add(panel);
		
		JButton addcont = new JButton("add contact");
		addcont.setBackground(Color.PINK);
		addcont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addcontact add=new addcontact();
				add.setVisible(true);
			}
		});
		addcont.setFont(new Font("Tahoma", Font.BOLD, 18));
		addcont.setForeground(Color.CYAN);
		addcont.setBounds(134, 24, 169, 55);
		contentPane.add(addcont);
		
		JButton search = new JButton("search");
		search.setBackground(Color.BLUE);
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search s=new search();
				s.setVisible(true);
			}
		});
		search.setForeground(Color.CYAN);
		search.setFont(new Font("Tahoma", Font.BOLD, 18));
		search.setBounds(134, 132, 169, 49);
		contentPane.add(search);
		
		JButton btnNewButton_1 = new JButton("exit");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(162, 203, 128, 28);
		contentPane.add(btnNewButton_1);
	}
}