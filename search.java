import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class search extends JFrame {

	private JPanel contentPane;
	private JTextField namesearch;
	private JTable table_1;
	private JTable table;

	
	public search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lnamesearch = new JLabel("enter name to be searched");
		lnamesearch.setBounds(40, 40, 182, 40);
		lnamesearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lnamesearch);
		
		table = new JTable();
		table.setBounds(214, 73, 270, 89);
		contentPane.add(table);
		
		namesearch = new JTextField();
		namesearch.setBounds(289, 53, 159, 19);
		namesearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			  
				
		
			DefaultTableModel tableModel = new DefaultTableModel();
			tableModel.addColumn("Name");
			tableModel.addColumn("Pno");
			tableModel.addColumn("Email");
		    

			try {
			   BufferedReader br=new BufferedReader(new FileReader(new File("e:\\contact.txt")));
			   String name;

			   while((name=br.readLine())!=null)
			   {
				   
				   
				   
				   if(name.contains(namesearch.getText()))
				   {
				   String s[]=name.split(",");
				   tableModel.addRow(s);
				   }
			   }
			   
			   table.setModel(tableModel);
			   
			}
			catch(Exception e111)
			{
				e111.getMessage();
			}
			}
			
		});
		namesearch.setColumns(10);
		contentPane.add(namesearch);
		
		JButton exit = new JButton("exit");
		exit.setBounds(289, 249, 130, 47);
		
		exit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(exit);
		
		JButton btnSearch4 = new JButton("search");
		btnSearch4.setBounds(40, 249, 130, 47);
		btnSearch4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSearch4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnSearch4);
		
		
		
		
		
		
		
		
	}
}