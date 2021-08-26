import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Q2_215628795 extends JFrame implements ActionListener {

	JFrame frame;
	TextArea textArea;
	JButton btnNewButton,btnNewButton_1;
	JButton btnNewButton_2;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		  Dummy2 window = new Dummy2();
		  window.frame.setVisible(true);
	}*/

	/**
	 * Create the application.
	 */
	public Q2_215628795() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new TextArea();
		textArea.setBounds(10, 10, 676, 183);
		frame.getContentPane().add(textArea);
		
		btnNewButton = new JButton("Show Event Type Count");
		btnNewButton.setBounds(56, 244, 195, 38);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Show Earliest Events");
		btnNewButton_1.setBounds(441, 244, 195, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Return To Main Screen");
		btnNewButton_2.setBounds(250, 336, 195, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnNewButton) {
			Q3_215628795 c = new Q3_215628795();
			String add = "Event_Type      Name_of_Month      Count(*)"+"\n\n";
			for(String elem : c.Query1()){
			    add = add + elem + "\n";
			}
			textArea.setText(add);
		}else if(e.getSource() == btnNewButton_1) {
			Q3_215628795 c = new Q3_215628795();
			String add = "Event_Type      Event_Name      Activity_Date      Activity_Name"+"\n\n";
			for(String elem : c.Query2()){
			    add = add + elem;
			    add = add +  "\n";
			}
			textArea.setText(add);
		}else if(e.getSource() == btnNewButton_2) {
			frame.dispose();
			mainscreen2 window = new mainscreen2();
			window.frame.setVisible(true);
		}
	}
	
}
