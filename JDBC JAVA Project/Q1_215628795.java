import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Q1_215628795 extends JFrame implements ActionListener {

	JFrame frame;
	public JTextField eventnamebox;
	public JButton x,btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4;
	
	public JRadioButton rdbtnNewRadioButton,rdbtnNewRadioButton_1,rdbtnNewRadioButton_2,rdbtnNewRadioButton_3,rdbtnNewRadioButton_4;
	List<JTextField> fieldsTf1 = new ArrayList<JTextField>();   // name list
	List<JTextField> fieldsTf2 = new ArrayList<JTextField>();   // affiliation list
	
	public DefaultTableModel model,model2,model3;
	
	public TextArea textArea;
	
	public String Event_name = "";
	public String EventWebLink = "";
	public String CFPText = "";
	
	public String city = "";
	public String country = "";
	public String date = "";
	
	public String journalname = "";
	public String publisher = "";
	
	Boolean iseventconference = false;
	Boolean iseventJournal = false;
	Boolean iseventbook = false;
	
	Boolean choiceflag = true;  // by default need role
	
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_12;
	private JLabel lblNewLabel_13;
	private JTextField textField_13;
	private JLabel lblNewLabel_14;
	private JTable table;
	private JScrollPane scrollPane;
	private JTable table_2;
	private JScrollPane scrollPane_2;
	private JLabel lblNewLabel_7;
	private JScrollPane scrollPane_1;
	private JTable table_1;
    
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		mytest window = new mytest();
		window.frame.setVisible(true);	
	}*/

	/**
	 * Create the application.
	 */
	public Q1_215628795() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1405, 885);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Event Table
		eventnamebox = new JTextField();
		eventnamebox.setBounds(24, 54, 416, 38);
		frame.getContentPane().add(eventnamebox);
		
		JLabel lblNewLabel = new JLabel("Enter Event_Name");
		lblNewLabel.setBounds(24, 17, 140, 40);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(484, 54, 424, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Enter EventWebLink for the event");
		lblNewLabel_1.setBounds(484, 31, 205, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(937, 54, 396, 38);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Enter CFPText for the event");
		lblNewLabel_2.setBounds(937, 31, 164, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		// Event Conference table
		textField_3 = new JTextField();
		textField_3.setBounds(667, 209, 177, 38);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(1115, 209, 164, 38);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(893, 209, 177, 38);
		frame.getContentPane().add(textField_5);  // country
		textField_5.setColumns(10);
		
		lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setBounds(667, 186, 94, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_6 = new JLabel("Date");
		lblNewLabel_6.setBounds(1115, 186, 124, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_5 = new JLabel("Country");
		lblNewLabel_5.setBounds(893, 186, 90, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		// Event Journal
		textField_12 = new JTextField();
		textField_12.setBounds(24, 209, 317, 39);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel_13 = new JLabel("JournalName");
		lblNewLabel_13.setBounds(24, 186, 90, 13);
		frame.getContentPane().add(lblNewLabel_13);
		
		textField_13 = new JTextField();
		textField_13.setBounds(394, 210, 234, 38);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		lblNewLabel_14 = new JLabel("Journal Publisher");
		lblNewLabel_14.setBounds(394, 186, 140, 13);
		frame.getContentPane().add(lblNewLabel_14);
		
		rdbtnNewRadioButton = new JRadioButton("EventConference");
		rdbtnNewRadioButton.setBounds(282, 122, 140, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("EventJournal");
		rdbtnNewRadioButton_1.setBounds(448, 122, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("EventBook");
		rdbtnNewRadioButton_2.setBounds(586, 122, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		ButtonGroup group=new ButtonGroup();  
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		table = new JTable(){public boolean isCellEditable(int row, int column) {   
			if(choiceflag){
				return true;  
			}else if(choiceflag == false && (column == 2)) {
				return false;
			}
			return true;
	    }};
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Affiliation", "Role"
			}
		));
		table.setBounds(24, 604, 540, 130);
		//frame.getContentPane().add(table);
		model = (DefaultTableModel) table.getModel();
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(24, 283, 540, 130);
		frame.getContentPane().add(scrollPane);
		
		rdbtnNewRadioButton.addActionListener(this);
		rdbtnNewRadioButton_1.addActionListener(this);
		rdbtnNewRadioButton_2.addActionListener(this);
		
		btnNewButton = new JButton("Insert CFP");
		btnNewButton.setBounds(611, 747, 205, 38);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Click to insert Activity");
		btnNewButton_1.setBounds(611, 360, 205, 38);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Click to Insert People");
		btnNewButton_2.setBounds(611, 295, 205, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("YYYY-MM-DD");
		lblNewLabel_3.setBounds(1288, 221, 93, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(862, 283, 471, 136);
		frame.getContentPane().add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setFillsViewportHeight(true);
		table_2.setColumnSelectionAllowed(true);
		table_2.setCellSelectionEnabled(true);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activity Name", "Activity Date (YYYY-MM-DD)"
			}
		));
		scrollPane_2.setViewportView(table_2);
		model2 = (DefaultTableModel) table_2.getModel();
		
		lblNewLabel_7 = new JLabel("Please select one of the Event type:");
		lblNewLabel_7.setBounds(24, 126, 227, 13);
		frame.getContentPane().add(lblNewLabel_7);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(792, 461, 540, 130);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFillsViewportHeight(true);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Research Topic Name", "Area"
			}
		));
		table_1.setBounds(30, 448, 540, 130);
		scrollPane_1.setViewportView(table_1);
		model3 = (DefaultTableModel) table_1.getModel();
		
		btnNewButton_3 = new JButton("Click to Insert Research Topic");
		btnNewButton_3.setBounds(990, 633, 205, 38);
		frame.getContentPane().add(btnNewButton_3);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Yes");
		rdbtnNewRadioButton_3.setBounds(200, 461, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("No");
		rdbtnNewRadioButton_4.setBounds(305, 461, 103, 21);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		ButtonGroup group2=new ButtonGroup();  
		group2.add(rdbtnNewRadioButton_3);
		group2.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_3.addActionListener(this);
		rdbtnNewRadioButton_4.addActionListener(this);
		
		JLabel lblNewLabel_8 = new JLabel("Insert role of a Person");
		lblNewLabel_8.setBounds(24, 465, 140, 13);
		frame.getContentPane().add(lblNewLabel_8);
		
	    textArea = new TextArea();
		textArea.setBounds(24, 549, 540, 122);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_9 = new JLabel("Application Message");
		lblNewLabel_9.setBounds(24, 523, 140, 13);
		frame.getContentPane().add(lblNewLabel_9);
		
		btnNewButton_4 = new JButton("Return To Main Screen");
		btnNewButton_4.setBounds(1169, 747, 164, 38);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.addActionListener(this);
		btnNewButton_4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == rdbtnNewRadioButton) {
			// Disable event journal textfields
			textField_12.setEditable(false);
			textField_12.setEnabled(false);
			textField_13.setEditable(false);
			textField_13.setEnabled(false);
			// keep only eventconference textfields live
			textField_3.setEditable(true);
			textField_3.setEnabled(true);
			textField_4.setEditable(true);
			textField_4.setEnabled(true);
			textField_5.setEditable(true);
			textField_5.setEnabled(true);
			
			iseventconference = true;
			iseventbook = false;
			iseventJournal = false;
			
		}else if(e.getSource() == rdbtnNewRadioButton_1) {
			//enable event journal textfields
			textField_12.setEditable(true);
			textField_12.setEnabled(true);
			textField_13.setEditable(true);
			textField_13.setEnabled(true);
			// Disable eventconference textfields 
			textField_3.setEditable(false);
			textField_3.setEnabled(false);
			textField_4.setEditable(false);
			textField_4.setEnabled(false);
			textField_5.setEditable(false);
			textField_5.setEnabled(false);
			
			iseventconference = false;
			iseventbook = false;
			iseventJournal = true;
			
		}else if(e.getSource() == rdbtnNewRadioButton_2) {
			//enable for eventbook
			textField_13.setEditable(true);
			textField_13.setEnabled(true);
			// disable all other
			textField_3.setEditable(false);
			textField_3.setEnabled(false);
			textField_4.setEditable(false);
			textField_4.setEnabled(false);
			textField_5.setEditable(false);
			textField_5.setEnabled(false);
			
			textField_12.setEditable(false);
			textField_12.setEnabled(false);
			
			iseventconference = false;
			iseventJournal = false;
			iseventbook = true;
		}
		
		if(e.getSource() == rdbtnNewRadioButton_3) {
			choiceflag = true;
		}else if(e.getSource() == rdbtnNewRadioButton_4) {
			choiceflag = false;
		}
		
		if(e.getSource() == btnNewButton) {
			//JOptionPane.showMessageDialog(this,"You are Female."); 
			
			//Reset error table 
			Q3_215628795.errorout.clear();
			
			if(table.isEditing()) {
				table.getCellEditor().stopCellEditing();
			}
			if(table_2.isEditing()) {
				table_2.getCellEditor().stopCellEditing();
			}
			if(table_1.isEditing()) {
				table_1.getCellEditor().stopCellEditing();
			}
			
			Event_name = eventnamebox.getText();
			EventWebLink = textField.getText();
			CFPText = textField_1.getText();
			Q3_215628795.inserteventdata(Event_name, EventWebLink, CFPText);
			if(model.getRowCount() != 0) {
				Q3_215628795.insertPeople(model,Event_name,choiceflag);
			}
			if(model2.getRowCount() != 0) {
				Q3_215628795.insertActivityHappens(Event_name,model2);
			}
			if(model3.getRowCount() != 0) {
				Q3_215628795.insertResearchtopic(model3,Event_name);
			}
			if(iseventconference == true) {
				city = textField_3.getText();
				country = textField_5.getText();
				date = textField_4.getText();
				Q3_215628795.inserteventconferencedata(Event_name, city, country, date);
			}
			if(iseventJournal == true) {
				journalname = textField_12.getText();
				publisher = textField_13.getText();
				Q3_215628795.insertEventJournal(Event_name, journalname, publisher);
			}
			if(iseventbook == true) {
				publisher = textField_13.getText();
				Q3_215628795.inserteventbook(Event_name, publisher);
			}
			
			//check for error
			Q3_215628795 c = new Q3_215628795();
			String add = "";
			textArea.setText("");
			for(String elem : Q3_215628795.errorout){
			    add = add + elem + "\n";
			}
			if(Q3_215628795.errorout.size() == 0) {
				textArea.setText("CFP Inserted Successfully !!");
			}else {
				textArea.setText(add);
			}
			
		}else if(e.getSource() == btnNewButton_2) {
			//JOptionPane.showMessageDialog(this,"You are Female."); 
			//model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] {});
		}else if(e.getSource() == btnNewButton_1) {
			//JOptionPane.showMessageDialog(this,"You are Female."); 
			//model2 = (DefaultTableModel) table_2.getModel();
			model2.addRow(new Object[] {});
		}else if(e.getSource() == btnNewButton_3) {
			//model3 = (DefaultTableModel) table_1.getModel();
			model3.addRow(new Object[] {});
		}else if(e.getSource() == btnNewButton_4) {
			frame.dispose();
			mainscreen2 window = new mainscreen2();
			window.frame.setVisible(true);
		}
		//JOptionPane.showMessageDialog(null, Event_name);
	}
}



