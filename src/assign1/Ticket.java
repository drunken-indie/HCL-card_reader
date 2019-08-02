package assign1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
 
public class Ticket {
	static ClockPane a = new ClockPane();
	
	static String parkedTime;
	static String lineBreaker = "----------------------------------------------------------------------";
	static String currentTime = ClockPane.currentTime();
	static String currentDate = ClockPane.currentDate();
	static String cardNumber="";
    public static JFrame frame = new JFrame("Ticket");
    static JTextPane textBox = new JTextPane();
    
    
    public static void initialize(Container pane) throws Exception {
    	
       
        pane.setBackground(Color.WHITE);
        
        
        
        SimpleAttributeSet textCenter = new SimpleAttributeSet();
        StyleConstants.setAlignment(textCenter, StyleConstants.ALIGN_CENTER);
        
      
        
        pane.add(textBox);
        
        
        
        textBox.setSize(new Dimension(100, 100));
        textBox.setVisible(true);
        textBox.setLocation(new Point(-150, 0));
        textBox.setEditable(false);
        textBox.setFont(new Font("Arial", Font.PLAIN, 20));
 
    
        
        
        
      
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        
       
    }
 //i 0 = purchase 1 = refund j 0 = card 1 = coin
   public static void showRecipt(int i, int j) {
	   	parkedTime = ParkingMeter.textParkUntil.getText();
	   	textBox.setVisible(true);
   		if (i == 0) {
   			if (j == 0) {
   				textBox.setText("\nYellow Parking\n\n8 Longwood Road North\nHamilton, ON, L8S 0A2\n"+lineBreaker+"\nPURCHASE\n\nPurchased on :              "
   		        		+ "          "+currentDate+" "+currentTime+"\nPaid Until :                               "+currentDate+" "+parkedTime+"\nPaid Amount :   "
   		        				+ "                                               $"+ParkingMeter.totalDue+"\n"+lineBreaker+"\n\nPaid Method :               "
   		        		+ "                                     Card\nAcct # :                                               ************"+cardNumber.substring(cardNumber.length()-5, cardNumber.length()-1)
   		        		+"\nApproval :                                                        162021\nRefer # :                                                              8833\nBatch :     "
   		        		+ "                                                           1078"
   		        		+ "\nSeq :                                                                   8833");
   			}
   			if (j == 1) {
   				textBox.setText("\nYellow Parking\n\n8 Longwood Road North\nHamilton, ON, L8S 0A2\n"+lineBreaker+"\nPURCHASE\n\nPurchased on :              "
   		        		+ "         "+currentDate+" "+currentTime+"\nPaid Until :                               "+currentDate+" "+parkedTime+"\nPaid Amount :   "
   		        				+ "                                               $"+ParkingMeter.totalDue+"\n"+lineBreaker+"\n\nPaid Method :               "
   		        		+ "                                     CASH\nRefer # :                                                              8833\nBatch :     "
   		        		+ "                                                           1078"
   		        		+ "\nSeq :                                                                   8833");
   			}
   		}
   		if (i == 1) {
   			if (j == 0) {
   				textBox.setText("\nYellow Parking\n\n8 Longwood Road North\nHamilton, ON, L8S 0A2\n"+lineBreaker+"\nREFUND\n\nRefunded on :              "
   		        		+ "          "+currentDate+" "+currentTime+"\nPaid Until :                               "+currentDate+" "+parkedTime+"\nRefunded Amount :   "
   		        				+ "                                               $"+ParkingMeter.totalDue+"\n"+lineBreaker+"\n\nRefund Method :             "
   		        		+ "                                     Card\nAcct # :                                               ************"+cardNumber.substring(cardNumber.length()-5, cardNumber.length()-1)
   		        		+"\nApproval :                                                        162021\nRefer # :                                                              8833\nBatch :     "
   		        		+ "                                                           1078"
   		        		+ "\nSeq :                                                                   8833");
   			}
   			if (j == 1) {
   				textBox.setText("\nYellow Parking\n\n8 Longwood Road North\nHamilton, ON, L8S 0A2\n"+lineBreaker+"\nREFUND\n\nRefunded on :              "
   		        		+ "         "+currentDate+" "+currentTime+"\nPaid Until :                               "+currentDate+" "+parkedTime+"\nRefund Amount :   "
   		        				+ "                                             $"+ParkingMeter.totalDue+"\n"+lineBreaker+"\n\nPaid Method :               "
   		        		+ "                                     CASH\nRefer # :                                                              8833\nBatch :     "
   		        		+ "                                                           1078"
   		        		+ "\nSeq :                                                                   8833");
   			}
   		}
   		
   }
  
  
  
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * @throws Exception 
     */
  
    public static void initiateTicket() throws Exception {
        //Create and set up the window.
    	
    	
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        initialize(frame.getContentPane());
 
        //Size and display the window.
        frame.setSize(500,1000);
        frame.setVisible(true);
    }
    public static int stringToInt(String string) {
    	int result = Integer.parseInt(string);
    	return result;
    }
    
    public static String intToString(int integer) {
    	String temp="";
    	if (integer<10) {
    		temp = "0";
    	}
    	String numberAsString = Integer.toString(integer);
    	return temp+numberAsString;
    }
    
  
    public static void Quit() {
    	frame.setVisible(false);
    }
 
}

