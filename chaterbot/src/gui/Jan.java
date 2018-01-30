package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jan {

	public static JPanel pnl;
	JFrame jan;
	public static JTextField txtMsg;
	public static JLabel[] lblMsg;
	JButton btnSend;
	
	public Jan() {
		jan=new JFrame("ChatterBot v0.1");
		pnl=new JPanel();
		pnl.setLayout(new BoxLayout(pnl,BoxLayout.Y_AXIS));
		jan.setContentPane(pnl);
		//pnl.setBackground(Color.BLUE);
		jan.setSize(400,400);
		
		lblMsg=new JLabel[20];
		
		txtMsg= new JTextField("Escreva alguma mensagem");
		btnSend=new JButton("Enviar");
		
		btnSend.addActionListener( new MyBtn());
		
		
		pnl.add(txtMsg);
		pnl.add(btnSend);
		jan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jan.setVisible(true);
		
	}
	class MyBtn implements ActionListener{ int i=0;
		public void actionPerformed(ActionEvent a){
			usrSend();
			
		}
		public void usrSend(){
			lblMsg[i]=new JLabel("Mensagem");
			lblMsg[i].setBackground(Color.BLUE);
			pnl.add(lblMsg[i]);
			lblMsg[i].setText(txtMsg.getText());
			
			i++;
		}
	}
	

}
