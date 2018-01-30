//BUG
//Exception in thread "main" java.lang.NullPointerException
//	at fx.Pc.<init>(Pc.java:17)
	//at fx.PcTestDrive.main(PcTestDrive.java:6)

package fx;
import java.awt.Color;

import javax.swing.JLabel;

import gui.*;

public class Pc {//computer
	Jan ui= new Jan();
	Pc(){
		
		String answer;
		int i=0;
		switch(Jan.lblMsg[i].getText().toString()){
			case "oi": 
				pcSend("Oieeeeee!");
				i++; break;
		}
		//System.out.print(Jan.lblMsg[i].getText());
		//Jan.lblMsg[i].setText("23");
		
		//if(Jan.lblMsg[i].getText().equals("oi") && Jan.lblMsg[i]!=null){
			//pcSend("Oieeeeee!");
			//i++;
		//}
	}
	
	public void pcSend(String msg){int t=0;
	Jan.lblMsg[t]=new JLabel(msg);
	Jan.lblMsg[t].setBackground(Color.BLUE);
	Jan.pnl.add(Jan.lblMsg[t]);
	Jan.lblMsg[t].setText(msg);
		t++;
	}

}
