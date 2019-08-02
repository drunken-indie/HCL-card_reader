package assign1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
 
public class coinMachine {

	private static float inserted = (float) 0.0;

	static ActionListener temp1,temp2,temp3,temp4,temp5,temp6,temp7;
	public static JFrame frame = new JFrame("Coin Machine");
    static JButton buttonToonie = new JButton();
    static JButton buttonLoonie = new JButton();
    static JButton buttonQuarter = new JButton();
    static JButton buttonDime = new JButton();
    static JButton buttonNickel = new JButton();
    static JButton buttonCancel = new JButton("CANCEL");
    static JButton buttonClose = new JButton("Close");
    
    static JTextPane textBox = new JTextPane();
    
    
    public static void initialize(Container pane) throws Exception {
    	
    	URL url = coinMachine.class.getResource("toonie.jpg");           
    	ImageIcon cardReaderImage = new ImageIcon(url);
    	Image cardReaderImage1 = cardReaderImage.getImage();
    	Image toonieImage = cardReaderImage1.getScaledInstance(100,100, 0);
        //pane.setLayout(null);
        
        URL urla = coinMachine.class.getResource("loonie.jpg");           
    	ImageIcon cardReaderImagea = new ImageIcon(urla);
    	Image cardReaderImage1a = cardReaderImagea.getImage();
    	Image loonieImage = cardReaderImage1a.getScaledInstance(100,100, 0);
        //pane.setLayout(null);
        
        URL urlb = coinMachine.class.getResource("quarter.jpg");           
    	ImageIcon cardReaderImageb = new ImageIcon(urlb);
    	Image cardReaderImage1b = cardReaderImageb.getImage();
    	Image quarterImage = cardReaderImage1b.getScaledInstance(100,100, 0);
        //pane.setLayout(null);
        
        URL urlc = coinMachine.class.getResource("dime.jpg");           
    	ImageIcon cardReaderImagec = new ImageIcon(urlc);
    	Image cardReaderImage1c = cardReaderImagec.getImage();
    	Image dimeImage = cardReaderImage1c.getScaledInstance(100,100, 0);
       // pane.setLayout(null);
        
        URL urld = coinMachine.class.getResource("nickel.jpg");           
    	ImageIcon cardReaderImaged = new ImageIcon(urld);
    	Image cardReaderImage1d = cardReaderImaged.getImage();
    	Image nickelImage = cardReaderImage1d.getScaledInstance(100,100, 0);
        //pane.setLayout(null);
        
    
        
        //pane.setBackground(Color.WHITE);
        
        
      
        
        pane.add(buttonToonie);
        pane.add(buttonLoonie);
        pane.add(buttonQuarter);
        pane.add(buttonDime);
        pane.add(buttonNickel);
        pane.add(buttonCancel);
        pane.add(buttonClose);
        pane.add(textBox);
        
        
        
        textBox.setSize(new Dimension(130, 40));
        textBox.setVisible(false);
        textBox.setLocation(new Point(150, 0));
        textBox.setEditable(false);
        textBox.setText("Change : ");
        textBox.setFont(new Font("Arial", Font.PLAIN, 35));
        

       ResetText();
        
        buttonToonie.setSize(new Dimension(130, 130));
        buttonToonie.setLocation(new Point(10, 50));
        buttonToonie.setIcon(new ImageIcon(toonieImage));
        buttonToonie.setText("");
        buttonToonie.setVisible(true);
        
        buttonLoonie.setSize(new Dimension(130, 130));
        buttonLoonie.setLocation(new Point(160, 50));
        buttonLoonie.setIcon(new ImageIcon(loonieImage));
        buttonLoonie.setText("");;
        buttonLoonie.setVisible(true);
        
        buttonQuarter.setSize(new Dimension(130, 130));
        buttonQuarter.setLocation(new Point(310, 50));
        buttonQuarter.setIcon(new ImageIcon(quarterImage));
        buttonQuarter.setText("");
        buttonQuarter.setVisible(true);
        
        
        buttonDime.setSize(new Dimension(130, 130));
        buttonDime.setLocation(new Point(100, 200));
        buttonDime.setIcon(new ImageIcon(dimeImage));
        buttonDime.setText("");
        buttonDime.setVisible(true);
        
        buttonNickel.setSize(new Dimension(130, 130));
        buttonNickel.setLocation(new Point(250, 200));
        buttonNickel.setIcon(new ImageIcon(nickelImage));
        buttonNickel.setText("");
        buttonNickel.setVisible(true);
        
        buttonCancel.setSize(new Dimension(110, 70));
        buttonCancel.setVisible(true);
        buttonCancel.setBackground(Color.RED);
        buttonCancel.setContentAreaFilled(false);
        buttonCancel.setOpaque(true);
        buttonCancel.setLocation(new Point(150, 380));
        buttonCancel.setFont(new Font("Arial", Font.PLAIN, 20));

        buttonClose.setSize(new Dimension(110, 70));
        buttonClose.setVisible(false);
        buttonClose.setBackground(Color.RED);
        buttonClose.setContentAreaFilled(false);
        buttonClose.setOpaque(true);
        buttonClose.setLocation(new Point(280, 380));
        buttonClose.setFont(new Font("Arial", Font.PLAIN, 20));
       
        
        
        
        
        
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        
       
    }
 //adasdas
   public static void showRefund(float amount) {
	   RemoveAction();
	   RemoveAction();
	   RemoveAction();
	   RemoveAction();
	   
	   inserted = (float) 0.0;
	   int numToonie = 0;
	   int numLoonie = 0;
	   int numQuarter = 0;
	   int numDime = 0;
	   int numNickel = 0;
	   	textBox.setVisible(true);
   		buttonClose.setVisible(true);
   		buttonCancel.setVisible(false);
   		numToonie = (int) (amount/2.0);
   		amount = amount -(float) (numToonie*2);
   		numLoonie = (int) (amount/1.0);
   		amount = amount - (float)(numLoonie*1);
   		numQuarter = (int) (amount/0.25);
   		amount =  (amount - (float)(numQuarter*0.25));
   		numDime = (int) (amount/0.1);
   		amount =  (amount - (float)(numDime*0.1));
   		numNickel = (int) (amount/0.04);
   		buttonToonie.setVisible(false);
 	   buttonLoonie.setVisible(false);
 	   buttonQuarter.setVisible(false);
 	   buttonDime.setVisible(false);
 	   buttonNickel.setVisible(false);
 	  buttonToonie.setText("<html><center><font color=black>X "+numToonie+"</font></center></html>");
 		buttonLoonie.setText("<html><center><font color=black>X "+numLoonie+"</font></center></html>");
 		buttonQuarter.setText("<html><center><font color=black>X "+numQuarter+"</font></center></html>");
 		buttonDime.setText("<html><center><font color=black>X "+numDime+"</font></center></html>");
 		buttonNickel.setText("<html><center><font color=black>X "+numNickel+"</font></center></html>");
 	   inserted=0;
 	   buttonToonie.setVisible(true);
 	   buttonLoonie.setVisible(true);
 	   buttonQuarter.setVisible(true);
 	   buttonDime.setVisible(true);
 	   buttonNickel.setVisible(true);
 	  buttonClose.addActionListener(temp7=new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
          	frame.setVisible(false);
          	textBox.setVisible(false);
          	buttonClose.setVisible(false);
          	buttonCancel.setVisible(true);
          	buttonClose.removeActionListener(this);
          }
      });
   		
   }
  public static void initateAction() {
	  buttonToonie.addActionListener(temp1 = new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              try {
              	inserted =  (inserted +(float)2.0);
              	ParkingMeter.payPrice(2.0);
              	

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             
          }
      });
      buttonLoonie.addActionListener(temp2 = new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              try {
              	inserted = (inserted +(float) 1.0);
              	ParkingMeter.payPrice(1.0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              
          }
      });
      buttonQuarter.addActionListener(temp3=new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              try {
              	inserted = (inserted +(float) 0.25);
              	ParkingMeter.payPrice(0.25);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              
          }
      });
      buttonDime.addActionListener(temp4=new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              try {
              	inserted =  (inserted +(float)0.1);
              	ParkingMeter.payPrice(0.1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             
          }
      });
      buttonNickel.addActionListener(temp5=new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
              try {
              	inserted =  (inserted +(float)0.05);
              	ParkingMeter.payPrice(0.05);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
              
          }
      });
      buttonCancel.addActionListener(temp6 = new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
          	try {
          		float temp = -1*inserted;
          		System.out.println(temp);
					ParkingMeter.payPrice(temp);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
          	
          	
          	
          	
          	
          	
          	buttonClose.setVisible(true);
          	
          	buttonCancel.setVisible(false);
          	
          }
      });
  }
  
  
   public static void RemoveAction() {
	   buttonToonie.removeActionListener(temp1);
   		buttonLoonie.removeActionListener(temp2);
   		buttonQuarter.removeActionListener(temp3);
   		buttonDime.removeActionListener(temp4);
   		buttonNickel.removeActionListener(temp5);
   		buttonCancel.removeActionListener(temp6);
   		buttonClose.removeActionListener(temp7);
   }
   
   
   public static void ResetText() {
	   buttonToonie.setVisible(false);
	   buttonLoonie.setVisible(false);
	   buttonQuarter.setVisible(false);
	   buttonDime.setVisible(false);
	   buttonNickel.setVisible(false);
	   buttonToonie.setText("");
	   buttonLoonie.setText("");
	   buttonQuarter.setText("");
	   buttonDime.setText("");
	   buttonNickel.setText("");
	   buttonToonie.setVisible(true);
	   buttonLoonie.setVisible(true);
	   buttonQuarter.setVisible(true);
	   buttonDime.setVisible(true);
	   buttonNickel.setVisible(true);
   }
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * @throws Exception 
     */
  
    public static void initiateCoinMachine() throws Exception {
        //Create and set up the window.
    	
    	
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        inserted=0;
        //Set up the content pane.
        initialize(frame.getContentPane());
 
        //Size and display the window.
        
        
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

