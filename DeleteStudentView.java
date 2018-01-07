package Datafeed_pkg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


//This class provides interface for deleteing a student record

public class DeleteStudentView {

	JPanel jp = new JPanel();

	DeleteStudentView() {

		jp.setBounds(00, 00, 700, 600);
		jp.setLayout(null);
		jp.setBackground(null);
		jp.setVisible(true);

		//label
		JLabel l = new JLabel("		        DataFeed Tool");
		l.setBounds(110, 20, 500, 50);
		l.setFont(new Font("Comic Sans MS", 00, 36));
		l.setForeground(new Color(1, 87, 155));
		l.setVisible(true);
		jp.add(l);

		//text Field (noneditable)
		JTextField l1 = new JTextField("	    Enter Student Info");
		l1.setBounds(00, 100, 700, 50);
		l1.setBackground(new Color(1, 87, 155));
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Comic Sans MS", 00, 30));
		l1.setEditable(false);
		l1.setVisible(true);
		jp.add(l1);

		//Button
		JButton jb = new JButton("Delete");
		jb.setFont(new Font("Comic Sans MS", 00, 20));
		jb.setBounds(550, 500, 100, 40);
		jb.setBackground(new Color(1, 87, 155));
		jb.setForeground(Color.white);
		jp.add(jb);
		
		//Button
		JButton jb1=new JButton("Exit");
		jb1.setFont(new Font("Comic Sans MS",00,20));
		jb1.setBounds(50, 500, 100, 40);
		jb1.setBackground(new Color(1,87,155));
		jb1.setForeground(Color.white);
		jp.add(jb1);

		//label
		JLabel l3 = new JLabel("Student ID : ");
		l3.setBounds(100, 200, 150, 35);
		l3.setForeground(new Color(1, 87, 155));
		l3.setFont(new Font("Comic Sans MS", 00, 20));
		l3.setVisible(true);
		jp.add(l3);

		//TextField prompts for student ID
		JTextField tf1 = new JTextField();
		tf1.setBounds(250, 200, 200, 35);
		tf1.setFont(new Font("Comic Sans MS", 00, 20));

		tf1.setVisible(true);
		tf1.setForeground(new Color(1, 87, 155));
		jp.add(tf1);
		
		//Actions upon clicking buttons
		
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Action
				Operations.delete(Integer.parseInt(tf1.getText()));
			}
		});

		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ControllerClass.returntomenu(jp);
			}
		});
		
	}
}
