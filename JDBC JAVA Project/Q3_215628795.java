
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class Q3_215628795 {
	
	public static ArrayList<String> errorout = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		mainscreen2 window = new mainscreen2();
		window.frame.setVisible(true);
				
	}
	
	public static void inserteventdata(String eventname, String weblink, String cfptext) {
		String name = "root";
   	    String password = "";
   	    try {
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    int r = s.executeUpdate("INSERT INTO Event values ('"+eventname+"','"+weblink+"','"+cfptext+"');");
		    
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	public static void inserteventconferencedata(String eventname, String city, String country, String Date) {
		String name = "root";
   	    String password = "";
   	    try {
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    int r = s.executeUpdate("INSERT INTO EventConference values ('"+eventname+"','"+city+"','"+country+"','"+Date+"');");
		    
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	/*public static void insertActivityHappens(String eventname, String activityname, String activitydate) {
		String name = "root";
   	    String password = "";
   	    try {
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    int r = s.executeUpdate("INSERT INTO ActivityHappens values ('"+eventname+"','"+activityname+"','"+activitydate+"');");
		    
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
		    e.printStackTrace();
	    }
	}*/
	
	public static void insertActivityHappens(String eventname,DefaultTableModel model) {
		String name = "root";
   	    String password = "";
   	    try {
   	    	//System.out.println(model.getRowCount());
   	    	//System.out.println(model.getColumnCount());
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    for(int r = 0; r < model.getRowCount();r++) {
		    	for(int c = 0; c < (model.getColumnCount()-1);c++) {
				    s.executeUpdate("INSERT INTO ActivityHappens values ('"+eventname+"','"+model.getValueAt(r, c)+"','"+model.getValueAt(r,c+1)+"');");
		    	}
		    }
		    s.close();
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	public static void insertEventJournal(String eventname, String JournalName, String Publisher) {
		String name = "root";
   	    String password = "";
   	    try {
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    int r = s.executeUpdate("INSERT INTO EventJournal values ('"+eventname+"','"+JournalName+"','"+Publisher+"');");
		    
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	/*public static void insertPeople(String P_name, String affiliation) {
		String name = "root";
   	    String password = "";
   	    try {
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    int r = s.executeUpdate("INSERT INTO People values ('"+P_name+"','"+affiliation+"');");
		    
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
		    e.printStackTrace();
	    }
	}*/
	
	public static void insertPeople(DefaultTableModel model, String eventname, Boolean choice) {
		String name = "root";
   	    String password = "";
   	    try {
   	    	//System.out.println(model.getRowCount());
   	    	//System.out.println(model.getColumnCount());
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    for(int r = 0; r < model.getRowCount();r++) {
		    	for(int c = 0; c < (model.getColumnCount()-2);c++) {
				    s.executeUpdate("INSERT INTO People values ('"+model.getValueAt(r, c)+"','"+model.getValueAt(r,c+1)+"');");
				    if(choice == true) {
				    	s.executeUpdate("INSERT INTO Organizes values ('"+eventname+"','"+model.getValueAt(r, c)+"','"+model.getValueAt(r,c+2)+"');");
				    } 
		    	}
		    }
		    s.close();
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
   	    	//System.out.println(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	
	public static void inserteventbook(String eventname, String publisher) {
		String name = "root";
   	    String password = "";
   	    try {
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    int r = s.executeUpdate("INSERT INTO EventBook values ('"+eventname+"','"+publisher+"');");
		    
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	public static void insertResearchtopic(DefaultTableModel model, String eventname) {
		String name = "root";
   	    String password = "";
   	    try {
   	    	//System.out.println(model.getRowCount());
   	    	//System.out.println(model.getColumnCount());
		    Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
		    for(int r = 0; r < model.getRowCount();r++) {
		    	for(int c = 0; c < (model.getColumnCount()-1);c++) {
				    s.executeUpdate("INSERT INTO ResearchTopic values ('"+model.getValueAt(r, c)+"','"+model.getValueAt(r,c+1)+"');");
				    s.executeUpdate("INSERT INTO Covers values ('"+eventname+"','"+model.getValueAt(r, c)+"');");				    
		    	}
		    }
		    s.close();
   	    }catch (SQLException e) {
			// TODO Auto-generated catch block
   	    	StringWriter sw = new StringWriter();
   	    	e.printStackTrace(new PrintWriter(sw));
   	    	String exceptionAsString = sw.toString();
   	    	errorout.add(exceptionAsString);
		    //e.printStackTrace();
	    }
	}
	
	
    public static ArrayList<String> Query1() {
    	 String name = "root";
    	 String password = "";
    	 ArrayList<String> column1 = new ArrayList<String>();
    	 try {
			   Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
			   ResultSet r = s.executeQuery("with Joined(month,ename,year) as (Select min(month(A.ActivityDate)), A.EventName, year(A.ActivityDate)\r\n" + 
			   		"FROM  (SELECT DISTINCT ActivityHappens.EventName , (ActivityDate)\r\n" + 
			   		"      FROM ActivityHappens, EventJournal\r\n" + 
			   		"	  WHERE EventJournal.EventName = ActivityHappens.EventName) as A\r\n" + 
			   		"Group By A.EventName),\r\n" + 
			   		"\r\n" + 
			   		"Joined2(month,ename,year) as (Select min(month(A.ActivityDate)), A.EventName, year(A.ActivityDate)\r\n" + 
			   		"FROM  (SELECT DISTINCT ActivityHappens.EventName , (ActivityDate)\r\n" + 
			   		"      FROM ActivityHappens, EventBook\r\n" + 
			   		"	  WHERE EventBook.EventName = ActivityHappens.EventName) as A\r\n" + 
			   		"Group By A.EventName)\r\n" + 
			   		"\r\n" + 
			   		"Select *\r\n" + 
			   		"FROM ( \r\n" + 
			   		"(Select 'EventJournal' as Event_Type, concat(MONTHNAME(STR_TO_DATE(month, '%m')), ',', year) AS 'Name of Month', count(*)    -- CONVERT TO TEXT MONTH\r\n" + 
			   		"from Joined\r\n" + 
			   		"GROUP BY month)UNION ALL\r\n" + 
			   		"(\r\n" + 
			   		"Select 'EventBook' as Event_Type, concat(MONTHNAME(STR_TO_DATE(month, '%m')), ',', year) AS 'Name of Month', count(*)\r\n" + 
			   		"from Joined2\r\n" + 
			   		"GROUP BY month)UNION ALL\r\n" + 
			   		"(\r\n" + 
			   		"Select 'EventConference' as Event_Type, concat(MONTHNAME(Date), ',', year(Date)), COUNT(*)\r\n" + 
			   		"FROM EventConference \r\n" + 
			   		"Group By month(Date)\r\n" + 
			   		")\r\n" + 
			   		") as alljoin;");
			   while(r.next()) {
				   for(int y = 1; y <=1; y++) {
					   column1.add(r.getString(y)+"      "+r.getString(y+1)+"      "+r.getString(y+2));
				   }
			   }
			   
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			    e.printStackTrace();
		 }
    	 
		return column1;  
     }
    
    public static ArrayList<String> Query2() {
    	String name = "root";
	   	String password = "";
	   	ArrayList<String> column1 = new ArrayList<String>();
	   	try {
			Statement s = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3421a03",name, password).createStatement();
			ResultSet r = s.executeQuery("Select * FROM\r\n" + 
					"(\r\n" + 
					"(\r\n" + 
					"SELECT 'EventConference' as Event_type ,E.EventName, (ActivityDate),A.ActivityName\r\n" + 
					"FROM EventConference as E ,ActivityHappens as A\r\n" + 
					"WHERE E.EventName = A.EventName AND A.ActivityDate = (\r\n" + 
					"      SELECT MIN(ActivityDate)\r\n" + 
					"      FROM ActivityHappens,EventConference\r\n" + 
					"      WHERE EventConference.EventName = ActivityHappens.EventName))UNION ALL\r\n" + 
					"(\r\n" + 
					"SELECT 'EventBook' as Event_type ,E.EventName, (ActivityDate),A.ActivityName\r\n" + 
					"FROM EventBook as E ,ActivityHappens as A\r\n" + 
					"WHERE E.EventName = A.EventName AND A.ActivityDate = (\r\n" + 
					"      SELECT MIN(ActivityDate)\r\n" + 
					"      FROM ActivityHappens,EventBook\r\n" + 
					"      WHERE EventBook.EventName = ActivityHappens.EventName))UNION ALL\r\n" + 
					"(\r\n" + 
					"SELECT 'EventJournal' as Event_type ,E.EventName, (ActivityDate),A.ActivityName\r\n" + 
					"FROM EventJournal as E ,ActivityHappens as A\r\n" + 
					"WHERE E.EventName = A.EventName AND A.ActivityDate = (\r\n" + 
					"      SELECT MIN(ActivityDate)\r\n" + 
					"      FROM ActivityHappens,EventJournal\r\n" + 
					"      WHERE EventJournal.EventName = ActivityHappens.EventName\r\n" + 
					"))\r\n" + 
					") as joinedall");
			while(r.next()) {
				//System.out.println(r.getString("EventName"));
			       column1.add(r.getString(1)+"      "+r.getString(2)+"      "+r.getString(3)+"      "+r.getString(4));
			}
				   
		} catch (SQLException e) {
			  // TODO Auto-generated catch block
		      e.printStackTrace();
		}
	   return column1;
    	
    }
    
}

class mainscreen2 extends JFrame implements ActionListener{

	public JFrame frame;
	JButton btnNewButton,btnNewButton_1;
	String selected = "Insert Into Database";

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
	 
		 mainscreen2 window = new mainscreen2();
		window.frame.setVisible(true);
	}*/

	/**
	 * Create the application.
	 */
	public mainscreen2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Insert CFP Into Database");
		btnNewButton.setBounds(28, 150, 222, 44);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Retrieve Information for Query");
		btnNewButton_1.setBounds(285, 150, 222, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Please Select One Of The Action");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(150, 54, 296, 44);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnNewButton) {
			//selected = "Insert Into Database";
			frame.dispose();
			Q1_215628795 window = new Q1_215628795();
			window.frame.setVisible(true);
			// reset error table
			Q3_215628795.errorout.clear();
		}else if(e.getSource() == btnNewButton_1) {
			//selected = "Retrieve Query Info";
			frame.dispose();
			Q2_215628795 window = new Q2_215628795();
			window.frame.setVisible(true);
		}
	}

}

