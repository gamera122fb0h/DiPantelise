package conscutive;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Layout extends JFrame implements ActionListener{
		int n,k;
		String s1;
		//Create TextFields
	 	JTextField textField = new JTextField(),textField2 = new JTextField(),textField3 = new JTextField(),textField4 = new JTextField();
	 	JTextField textField5 = new JTextField(),textField6 = new JTextField(),textField7 = new JTextField(),textField8 = new JTextField();
	 	JTextField textField9 = new JTextField(),textField10 = new JTextField();
	 	
	 	ImageIcon btnicon = new ImageIcon("Image3.jpg"),btnicon2 = new ImageIcon("Image4.jpg"),btnicon3 = new ImageIcon("Imagenew.jpg");
	 	
	    // Create a Button
	    JButton button = new JButton(""),button2 = new JButton("");
	    public Layout(){
	    	
			super("");
			
			
			// Create a window
			JFrame window = new JFrame("Signature-consecutive-k-out-of-n:F");
			
			//window size
			window.setSize(1000,720);
			// Exit on close
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			// set the LayoutManager
			window.setLayout(new GridLayout( 9,1));
			
			//Fonts
			Font f = new Font("Calibri",Font.BOLD,20),f2 = new Font("Calibri",Font.CENTER_BASELINE,18);
			
			// Add the textfield and button to the JFrames .		
				
			window.add(textField8);
			textField8.setForeground(Color.white);
			textField8.setBackground(Color.orange);
			textField8.setFont(f);
			textField8.setText("\t Προσέγγιση διανύσματος υπογραφής συστημάτων consecutive-k-απο-τα-n:F");
			textField8.setEditable(false);
			
			window.add(textField5);
			textField5.setForeground(Color.white);
			textField5.setFont(f2);
			textField5.setText("Πλήθος μονάδων συστήματος (n) :");
			textField5.setEditable(false);
			
			window.add(textField);
			
			
			window.add(textField6);
			textField6.setForeground(Color.white);
			textField6.setFont(f2);
			textField6.setText(" Αριθμός μονάδων που αν αποτύχουν,τότε το σύστημα θα αποτύχει (k): ");
			textField6.setEditable(false);
			
			window.add(textField2);
		
	    	window.add(button);
	    	button.setBackground(Color.white);
	    	button.setIcon(btnicon);
	    	button.addActionListener(this);
	    	
	    	window.add(button2);
	    	button2.setBackground(Color.white);
	    	button2.setIcon(btnicon3);
	    	button2.addActionListener(this);
	    	
	    	window.add(textField9);
	    	textField9.setForeground(Color.white);
	    	textField9.setBackground(Color.orange);
			textField9.setFont(f2);
			textField9.setText(" Προσέγγιση διανύσματος υπογραφής :");
			textField9.setEditable(false);
			
	    	window.add(textField4);

	    	window.setVisible(true);
	    	
	    }
	    //Action performed when the button is pressed
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				button.setIcon(btnicon2);
				n=Integer.parseInt(textField.getText());
				k=Integer.parseInt(textField2.getText());
				s1=algori8mos.lush(n,k);
				textField4.setText(s1);
				
			}
			if(e.getSource()==button2) {
				button.setIcon(btnicon);
				textField.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				
			}	
		}
		public static void main(String[] args) {
			
			Layout lout=new Layout();
			
		}
		
}