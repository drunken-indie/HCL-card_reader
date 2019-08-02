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
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
 
public class ParkingMeter {
	

	static Ticket ticket = new Ticket();
	static coinMachine a = new coinMachine();
	static cardMachine b = new cardMachine();
	static ActionListener temp;
	static ActionListener temp1;
	static int timex = 100;
	static int timey = -150;
	static ClockPane time = new ClockPane();
	static JButton buttonStart = new JButton();
	static JButton buttonHome = new JButton();
	static JButton buttonPurchase = new JButton();
	static JButton buttonRefund = new JButton();
	static JButton buttonHourUp = new JButton();
	static JButton buttonMinUp = new JButton();
	static JButton buttonMerUp = new JButton();
	static JButton buttonHourDown = new JButton();
	static JButton buttonMinDown = new JButton();
	static JButton buttonMerDown = new JButton();
	static JButton buttonHourUp1 = new JButton();
	static JButton buttonMinUp1 = new JButton();
	static JButton buttonMerUp1 = new JButton();
	static JButton buttonHourDown1 = new JButton();
	static JButton buttonMinDown1 = new JButton();
	static JButton buttonMerDown1 = new JButton();
	static JButton button30Min = new JButton();
	static JButton button1Hour = new JButton();
	static JButton buttonMaximum = new JButton();
	static JButton buttonPayCash = new JButton();
	static JButton buttonPayCard = new JButton();
	static JButton buttonPreSetTicket1 = new JButton("Ticket 9am-3:30pm");
	static JButton buttonPreSetTicket2 = new JButton("Ticket 12pm-4pm");
	static JButton buttonPreSetTicket3 = new JButton("Ticket 7pm-8:22pm");
	static JTextPane textHoursOfOperation = new JTextPane();
	static JTextPane textParkUntil = new JTextPane();
	static JTextPane textParkUntil1 = new JTextPane();
	static JTextPane textTotalDue = new JTextPane();
	static JTextPane textProcessing = new JTextPane();
	static JTextPane textInfo = new JTextPane();
	static JTextPane textInfo1 = new JTextPane();
	public static float totalDue = (float) 0.0;
	public static float totalDue1;
	public static String cardNumber="";
	//0 ==> purchase 1 ==> refund
	public static int isRefund = 0;
	
    public static void initialize(Container pane) throws Exception {
    	URL url = ParkingMeter.class.getResource("home.jpg");           
    	ImageIcon homeImage = new ImageIcon(url);
    	Image homeImage1 = homeImage.getImage();
    	Image homeImageFinal = homeImage1.getScaledInstance(100,100, 0);
        pane.setLayout(null);
        
        
        //pane.setBackground(Color.WHITE);
        
        pane.add(time);
        pane.add(buttonStart);
        pane.add(buttonHome);
        pane.add(buttonPurchase);
        pane.add(buttonRefund);
        pane.add(textHoursOfOperation);
        pane.add(textParkUntil);
        pane.add(textParkUntil1);
        pane.add(buttonHourUp);
        pane.add(buttonMinUp);
        pane.add(buttonMerUp);
        pane.add(buttonHourDown);
        pane.add(buttonMinDown);
        pane.add(buttonMerDown);
        pane.add(buttonHourUp1);
        pane.add(buttonMinUp1);
        pane.add(buttonMerUp1);
        pane.add(buttonHourDown1);
        pane.add(buttonMinDown1);
        pane.add(buttonMerDown1);
        pane.add(button30Min);
        pane.add(button1Hour);
        pane.add(buttonMaximum);
        pane.add(buttonPayCash);
        pane.add(buttonPayCard);
        pane.add(textTotalDue);
        pane.add(textProcessing);
        pane.add(textInfo);
        pane.add(textInfo1);
        pane.add(buttonPreSetTicket1);
        pane.add(buttonPreSetTicket2);
        pane.add(buttonPreSetTicket3);
        
        SimpleAttributeSet textCenter = new SimpleAttributeSet();
        StyleConstants.setAlignment(textCenter, StyleConstants.ALIGN_CENTER);
        
        
        buttonPayCash.setSize(new Dimension(250, 50));
        buttonPayCash.setVisible(false);
        buttonPayCash.setContentAreaFilled(false);
        buttonPayCash.setOpaque(true);
        buttonPayCash.setLocation(new Point(timex+75, timey+715));
        buttonPayCash.setFont(new Font("Arial", Font.PLAIN, 30));
        //buttonPayCash.setText("Pay With Coin");
		buttonPayCash.setBackground(Color.BLACK);
        
        buttonPayCard.setSize(new Dimension(250, 50));
        buttonPayCard.setVisible(false);
        buttonPayCard.setContentAreaFilled(false);
        buttonPayCard.setOpaque(true);
        buttonPayCard.setLocation(new Point(timex+325, timey+715));
        buttonPayCard.setFont(new Font("Arial", Font.PLAIN, 30));
        //buttonPayCard.setText("Pay With Card");
        buttonPayCard.setBackground(Color.BLACK);
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        time.setSize(new Dimension(480, 50));
        time.setVisible(true);
        time.setLocation(new Point(10, 10));
        
        buttonStart.setSize(new Dimension(1000, 700));
        buttonStart.setVisible(true);
        buttonStart.setLocation(new Point(0, 0));
        buttonStart.setText("<html><center><font color=black>touch anywhere to begin</font></center></html>");
        
        
        buttonHome.setSize(new Dimension(100, 100));
        buttonHome.setVisible(false);
        buttonHome.setLocation(new Point(890, 10));
        buttonHome.setIcon(new ImageIcon(homeImageFinal));
        
        ///////////////////////////////////////////////////////////////////////////////
        buttonHourUp.setSize(new Dimension(50, 50));
        buttonHourUp.setVisible(false);
        buttonHourUp.setLocation(new Point(timex+175, timey+245));
        buttonHourUp.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonHourUp.setText("\u25b2");
        
        buttonMinUp.setSize(new Dimension(50, 50));
        buttonMinUp.setVisible(false);
        buttonMinUp.setLocation(new Point(timex+255, timey+245));
        buttonMinUp.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMinUp.setText("\u25b2");
        
        buttonMerUp.setSize(new Dimension(50, 50));
        buttonMerUp.setVisible(false);
        buttonMerUp.setLocation(new Point(timex+335, timey+245));
        buttonMerUp.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMerUp.setText("\u25b2");
        
        ///////////////////////////////////////////////////////////////////////////////
        
        buttonHourDown.setSize(new Dimension(50, 50));
        buttonHourDown.setVisible(false);
        buttonHourDown.setLocation(new Point(timex+175, timey+375));
        buttonHourDown.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonHourDown.setText("\u25bc");
        
        buttonMinDown.setSize(new Dimension(50, 50));
        buttonMinDown.setVisible(false);
        buttonMinDown.setLocation(new Point(timex+255, timey+375));
        buttonMinDown.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMinDown.setText("\u25bc");
        
        buttonMerDown.setSize(new Dimension(50, 50));
        buttonMerDown.setVisible(false);
        buttonMerDown.setLocation(new Point(timex+335, timey+375));
        buttonMerDown.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMerDown.setText("\u25bc");
        
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        buttonHourUp1.setSize(new Dimension(50, 50));
        buttonHourUp1.setVisible(false);
        buttonHourUp1.setLocation(new Point(timex+175, timey+445));
        buttonHourUp1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonHourUp1.setText("\u25b2");
        
        buttonMinUp1.setSize(new Dimension(50, 50));
        buttonMinUp1.setVisible(false);
        buttonMinUp1.setLocation(new Point(timex+255, timey+445));
        buttonMinUp1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMinUp1.setText("\u25b2");
        
        buttonMerUp1.setSize(new Dimension(50, 50));
        buttonMerUp1.setVisible(false);
        buttonMerUp1.setLocation(new Point(timex+335, timey+445));
        buttonMerUp1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMerUp1.setText("\u25b2");
        
        ///////////////////////////////////////////////////////////////////////////////
        
        buttonHourDown1.setSize(new Dimension(50, 50));
        buttonHourDown1.setVisible(false);
        buttonHourDown1.setLocation(new Point(timex+175, timey+575));
        buttonHourDown1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonHourDown1.setText("\u25bc");
        
        buttonMinDown1.setSize(new Dimension(50, 50));
        buttonMinDown1.setVisible(false);
        buttonMinDown1.setLocation(new Point(timex+255, timey+575));
        buttonMinDown1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMinDown1.setText("\u25bc");
        
        buttonMerDown1.setSize(new Dimension(50, 50));
        buttonMerDown1.setVisible(false);
        buttonMerDown1.setLocation(new Point(timex+335, timey+575));
        buttonMerDown1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMerDown1.setText("\u25bc");
        
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        button30Min.setSize(new Dimension(150, 50));
        button30Min.setVisible(false);
        button30Min.setLocation(new Point(timex+75, timey+475));
        button30Min.setFont(new Font("Arial", Font.PLAIN, 30));
        button30Min.setText("+30 MIN");
        
        button1Hour.setSize(new Dimension(150, 50));
        button1Hour.setVisible(false);
        button1Hour.setLocation(new Point(timex+250, timey+475));
        button1Hour.setFont(new Font("Arial", Font.PLAIN, 30));
        button1Hour.setText("+1 HR");
        
        buttonMaximum.setSize(new Dimension(150, 50));
        buttonMaximum.setVisible(false);
        buttonMaximum.setLocation(new Point(timex+425, timey+475));
        buttonMaximum.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonMaximum.setText("Maximum");
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        buttonPreSetTicket1.setSize(new Dimension(250, 100));
        buttonPreSetTicket1.setVisible(false);
        buttonPreSetTicket1.setLocation(new Point(700, 150));
        buttonPreSetTicket1.setFont(new Font("Arial", Font.PLAIN, 25));
        //buttonPreSetTicket1.setText("+30 MIN");
        
        buttonPreSetTicket2.setSize(new Dimension(250, 100));
        buttonPreSetTicket2.setVisible(false);
        buttonPreSetTicket2.setLocation(new Point(700, 275));
        buttonPreSetTicket2.setFont(new Font("Arial", Font.PLAIN, 25));
        //buttonPreSetTicket2.setText("+30 MIN");
        
        buttonPreSetTicket3.setSize(new Dimension(250, 100));
        buttonPreSetTicket3.setVisible(false);
        buttonPreSetTicket3.setLocation(new Point(700, 400));
        buttonPreSetTicket3.setFont(new Font("Arial", Font.PLAIN, 25));
        //buttonPreSetTicket3.setText("+30 MIN");
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        
        
        buttonPurchase.setSize(new Dimension(300, 300));
        buttonPurchase.setVisible(false);
        buttonPurchase.setLocation(new Point(175, 250));
        buttonPurchase.setIcon(new ImageIcon(homeImageFinal));
        buttonPurchase.setVerticalTextPosition(SwingConstants.TOP);
        buttonPurchase.setText("<html><center><font color=red>Purchase Ticket</font></center></html>");
        buttonPurchase.setFont(new Font("Arial", Font.PLAIN, 40));
        
        buttonRefund.setSize(new Dimension(300, 300));
        buttonRefund.setVisible(false);
        buttonRefund.setLocation(new Point(525, 250));
        buttonRefund.setIcon(new ImageIcon(homeImageFinal));
        buttonRefund.setVerticalTextPosition(SwingConstants.TOP);
        buttonRefund.setText("<html><center><font color=red>Refund Ticket</font></center></html>");
        buttonRefund.setFont(new Font("Arial", Font.PLAIN, 40));
        
        ///////////////////////////////////////////////////////////////////////////////
        textHoursOfOperation.setSize(new Dimension(300, 400));
        textHoursOfOperation.setVisible(false);
        textHoursOfOperation.setLocation(new Point(700, 200));
        textHoursOfOperation.setEditable(false);
        textHoursOfOperation.setText("Hours Of Operation: \n MON - SAT \n 8AM - 8PM \n\n RATES: \n $2.00 per 30 minutes \n $3.75 per 1 hour \nDAILY MAXIMUM: $30");
        textHoursOfOperation.setFont(new Font("Arial", Font.PLAIN, 30));
        textHoursOfOperation.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        
        textParkUntil.setSize(new Dimension(400, 70));
        textParkUntil.setVisible(false);
        textParkUntil.setLocation(new Point(timex+100, timey+300));
        textParkUntil.setEditable(false);
        textParkUntil.setText(ClockPane.currentTime());
        isInRange(0);
        textParkUntil.setFont(new Font("Arial", Font.PLAIN, 60));
        textParkUntil.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        
        textParkUntil1.setSize(new Dimension(400, 70));
        textParkUntil1.setVisible(false);
        textParkUntil1.setLocation(new Point(timex+100, timey+500));
        textParkUntil1.setEditable(false);
        textParkUntil1.setText(ClockPane.currentTime());
        isInRange(1);
        textParkUntil1.setFont(new Font("Arial", Font.PLAIN, 60));
        textParkUntil1.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        
        
        textTotalDue.setSize(new Dimension(600, 70));
        textTotalDue.setVisible(false);
        textTotalDue.setLocation(new Point(timex+50, timey+600));
        textTotalDue.setEditable(false);
        textTotalDue.setText("Total: $0.00");
        textTotalDue.setFont(new Font("Arial", Font.PLAIN, 60));
        textTotalDue.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        
        textProcessing.setSize(new Dimension(400, 200));
        textProcessing.setVisible(false);
        textProcessing.setLocation(new Point(timex+150, timey+300));
        textProcessing.setEditable(false);
        textProcessing.setFont(new Font("Arial", Font.PLAIN, 60));
        textProcessing.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        
        textInfo.setSize(new Dimension(200, 80));
        textInfo.setVisible(false);
        textInfo.setLocation(new Point(timex-100, timey+300));
        textInfo.setEditable(false);
        textInfo.setFont(new Font("Arial", Font.PLAIN, 30));
        textInfo.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        
        textInfo1.setSize(new Dimension(200, 80));
        textInfo1.setVisible(false);
        textInfo1.setLocation(new Point(timex-100, timey+500));
        textInfo1.setEditable(false);
        textInfo1.setText("Enter Time of Purchase");
        textInfo1.setFont(new Font("Arial", Font.PLAIN, 30));
        textInfo1.getStyledDocument().setParagraphAttributes(0,100,textCenter,false);
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        buttonPreSetTicket1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textParkUntil.setText("09:00 AM");
                textParkUntil1.setText("03:30 PM");
                updatePrice();
            }
        });
        buttonPreSetTicket2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textParkUntil.setText("12:00 PM");
                textParkUntil1.setText("04:00 PM");
                updatePrice();
            }
        });
        buttonPreSetTicket3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textParkUntil.setText("07:00 PM");
                textParkUntil1.setText("08:22 PM");
                updatePrice();
            }
        });
        
        buttonStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	showStartPage();

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonPurchase.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	showPurchasePage();

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonRefund.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	showRefundPage();

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	int dialogButton = JOptionPane.YES_NO_OPTION;
                	int dialogResult = JOptionPane.showConfirmDialog(pane, "Go To Home Page?", "YES_YES", dialogButton);
                	if(dialogResult == 0) {
                		showHomePage();
                	} else {
                	  
                	} 
                	

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        buttonMerUp1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	changeTime(2,0,0,1,1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonMerDown1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	changeTime(2,1,0,1,1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonHourUp1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(0,0,1,1,1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        buttonHourDown1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(0,1,1,1,1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        buttonMinUp1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(1,0,0,1,1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        buttonMinDown1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(1,1,0,1,1);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////
        
        buttonMerUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	changeTime(2,0,0,1,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonMerDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	changeTime(2,1,0,1,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonHourUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(0,0,1,1,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        buttonHourDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(0,1,1,1,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        buttonMinUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(1,0,0,1,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        buttonMinDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(1,1,0,1,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        button30Min.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(1,0,1,30,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        button1Hour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(1,0,1,60,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        buttonMaximum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                	//Hour/Minute, UP/DOWN
                	changeTime(-1,0,1,100,0);

					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        
        buttonPayCard.addActionListener(temp = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	textInfo.setVisible(false);
            	System.out.println("Pay Card with :"+isRefund);
            	if (totalDue > 0.0)
            	{
            		showPayWithCash(0);
            		try {
                    	//Hour/Minute, UP/DOWN
                    	
                    	cardMachine.initiateCardMachine();

    					
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            	}
                
            }
        });
        buttonPayCash.addActionListener(temp1 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	textInfo.setVisible(false);
            	System.out.println("Pay with :"+isRefund);
            	if (totalDue > 0.0) {
            		try {
                    	//Hour/Minute, UP/DOWN
                    	coinMachine.initiateCoinMachine();
                    	coinMachine.RemoveAction();
                    	coinMachine.initateAction();

    					
    				} catch (Exception e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
            		showPayWithCash(1);
            		
            		
            		if (isRefund == 1) {
            			try {
                        	//Hour/Minute, UP/DOWN
                        	Ticket.initiateTicket();

        					
        				} catch (Exception e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
            			coinMachine.showRefund(totalDue);
            			Ticket.showRecipt(1, 1);
            			
            		}
            		
            	}
                
            }
        });
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * @throws Exception 
     */
  //0 card 1 cash
    public static void showPayWithCash(int i) {
    	totalDue1 = totalDue;
    	if (isRefund == 0) {
    		if (i == 1) {
        		textProcessing.setText("Please Pay: $"+totalDue1+" using coin");
        	}
        	if (i == 0) {
        		textProcessing.setText("Please Pay: $"+totalDue1+" using card machine");
        	}
    	}
    	if (isRefund == 1){
    		if (i == 1) {
        		textProcessing.setText("Refund: $"+totalDue1+" via coin");
        	}
        	if (i == 0) {
        		textProcessing.setText("Refund: $"+totalDue1+" via card machine");
        	}
    	}
    	
    	textProcessing.setVisible(true);
    	
    	showClock1(false);
    	showClock(false);
    	textTotalDue.setVisible(false);
    	buttonPayCard.setVisible(false);
    	buttonPayCash.setVisible(false);
    	buttonPreSetTicket1.setVisible(false);
    	buttonPreSetTicket2.setVisible(false);
    	buttonPreSetTicket3.setVisible(false);
    }
    private static void initiateParkingMeter() throws Exception {
        //Create and set up the window.
    	
        JFrame frame = new JFrame("Parking Meter");
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        initialize(frame.getContentPane());
 
        //Size and display the window.
        frame.setSize(1000,700);
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
    //HOUR/MINUTES/MER, UP/DOWN MODE
    public static void changeTime(int i, int j, int k, int amount, int a) {
    	boolean up = false;
    	int which = 0;
    	String temp = "";
    	if (a == 0) {
    		temp = textParkUntil.getText();
    	}
    	if (a == 1){
    		temp = textParkUntil1.getText();
    	}
    	
    	String[] splitted = temp.split(" ");
    	//splitted[0] = HOUR:MIN splitted[1]=MER
    	String[] splitted1 = splitted[0].split(":");
    	//splitted1[0] = HOUR splitted1[1] = MIN
    	//if it is a HOUR
    	if (i == -1) {
    		splitted1[0] = intToString(8);
    		splitted1[1] = intToString(00);
    		splitted[1] = "PM";
    	}
    	if (i == 0) {
    		//if up
    		if(j == 0) {
    			if (stringToInt(splitted1[0])+amount > 12) {
    				if (k == 0) {
    					splitted1[0] = intToString(stringToInt(splitted1[0])+amount-12);
    				}else {
    					splitted1[0] = intToString(stringToInt(splitted1[0])+amount-12);
    				}
    			//up not in range
    			}else {
    				//System.out.println("hour +1"+amount);
    				if (stringToInt(splitted1[0]) == 11) {
    					up = true;
    					which = 2;
    				}
    				splitted1[0] = intToString(stringToInt(splitted1[0])+amount);
    			}
    		//if down	
    		}else {
    			if (stringToInt(splitted1[0])-amount < 1) {
    				if (k == 0) {
    					splitted1[0] = intToString(stringToInt(splitted1[0])-amount+12);
    				}else {
    					splitted1[0] = intToString(stringToInt(splitted1[0])-amount+12);
    				}
    			}
    			else {
    				if (stringToInt(splitted1[0]) == 12) {
    					up = true;
    					which = 2;
    				}
    				splitted1[0] = intToString(stringToInt(splitted1[0])-amount);
    			}
    		}
    		//MIN
    	}else if (i == 1) {
    		if(j == 0) {
    			if(stringToInt(splitted1[1])+amount > 59) {
    				if (k == 0) {
    					splitted1[1] = intToString(stringToInt(splitted1[1])+amount-60);
    				}else {
    					splitted1[1] = intToString(stringToInt(splitted1[1])+amount-60);
    					//System.out.println("Hour +1");
    					up = true;
    					which = 0;
    				}
    			}
    			else
    				splitted1[1] = intToString(stringToInt(splitted1[1])+amount);
    			
    			
    		}else {
    			if(stringToInt(splitted1[1])-amount < 0) {
    				if (k == 0) {
    					splitted1[1] = intToString(stringToInt(splitted1[1])-amount+60);
    				}else {
    					splitted1[1] = intToString(stringToInt(splitted1[1])-amount+60);
    					
    				}
    			}
    			else
    				splitted1[1] = intToString(stringToInt(splitted1[1])-amount);
    		}
    		//MER
    	}else if (i==2) {
    		if (splitted[1].contains("A")) {
        		splitted[1]="PM";
        	}else if(splitted[1].contains("P")) {
        		splitted[1]="AM";
        	}
    	}
    	splitted[0]=splitted1[0]+":"+splitted1[1];
    	temp=splitted[0]+" "+splitted[1];
    	if (a == 0)
    		textParkUntil.setText(temp);
    	if (a == 1)
    		textParkUntil1.setText(temp);
    	if (up) {
    		changeTime(which, 0, 1, 1,a);
    	}
    	isInRange(a);
    	
    	updatePrice();
    }
    
    public static void payPrice(double amount) throws Exception {
    	if (amount > 0.0) {
        	totalDue1 = (float) (totalDue1-amount);
        	textProcessing.setText("Please Pay: $"+totalDue1+" using coin");
        	if (totalDue1 < 0.0) {
        		coinMachine.initiateCoinMachine();
        		coinMachine.showRefund(-totalDue1);
        		textProcessing.setText("Payment of $"+totalDue+" Successful!");
        		printTicket(1);
        		
        	}
    	}if (amount == 0.0) {
    		cardNumber = cardMachine.cardNumber;
    		printTicket(0);
    		cardMachine.Quit();
    		if (isRefund == 0)
    			textProcessing.setText("Payment of $"+totalDue+" Successful!");
    		if (isRefund == 1)
    			textProcessing.setText("Refund of $"+totalDue+" Successful!");
    		
    		
    	}if (amount < 0.0) {
    		coinMachine.initiateCoinMachine();
    		coinMachine.showRefund((float) -amount);
    		if (isRefund == 0)
        		showPurchasePage();
        	if (isRefund == 1)
        		showRefundPage();
    	}


    }
    public static void printTicket(int j) {
    	try {
        	//Hour/Minute, UP/DOWN
        	
        	Ticket.initiateTicket();
        	Ticket.cardNumber = cardNumber;

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Ticket.showRecipt(isRefund, j);
    }
    public static void updatePrice() {
    	float total=(float) 0.0;
    	String currentTime="";
    	String parkingTime="";
    	String purchaseTime = "";
    	if (isRefund == 0) {
    		currentTime = ClockPane.currentTime();
        	parkingTime = textParkUntil.getText();
    	}else if(isRefund == 1) {
    		currentTime = ClockPane.currentTime();
    		parkingTime = textParkUntil.getText();
    		purchaseTime = textParkUntil1.getText();
    	}
    	
    	if (isRefund == 0) {
    		total = calculatePrice(currentTime, parkingTime);
    	}else if (isRefund == 1) {
    		float paid = calculatePrice(purchaseTime, parkingTime);
    		float used = calculatePrice(purchaseTime, currentTime);
    		total = paid-used;
    	}
    	
    	if (total==0) {
    		buttonPayCard.setBackground(Color.BLACK);
			buttonPayCash.setBackground(Color.BLACK);
    	}
    	if (total != 0) {
    		buttonPayCard.setBackground(Color.GREEN);
	    	buttonPayCash.setBackground(Color.GREEN);
    	}
    	total = (float) (total+0.00);
		totalDue = total;
    	if (isRefund == 0)
    		textTotalDue.setText("Total : $"+total);
    	if (isRefund == 1)
    		textTotalDue.setText("Refund : $"+total);
    		
    		
    	
    		
    		
    }

	public static float calculatePrice(String currentTime, String parkingTime) {
		if (timeToMin(currentTime)>timeToMin(parkingTime)) {
			
			return (float) 0.0;
		}else {
			
			int difference = timeToMin(parkingTime)-timeToMin(currentTime);
			int hour = (difference/60);
			int min = (difference%60);
			int halfHour = 0;
			System.out.println("hour : "+hour+"min :"+min);
			if (min == 0.0)
				halfHour = 0;
			if (min > 0.0 && min <= 30.00)
				halfHour = 1;
			if (min > 30.00 && min <= 60.00) {
				halfHour = 0;
				hour += 1;
			}
			float total = (float) (hour*3.75)+(halfHour)*2;
			if (total > 30) {
				total = (float) 30.00;
			}
			return total;
		}
	}
	
	public static int timeToMin(String time) {
		int min = 0;
		String[] timeSplitted = time.split(" ");
		String[] timeSplitted1 =  timeSplitted[0].split(":");
		int times = 0;
		if (stringToInt(timeSplitted1[0])<12) {
			times = stringToInt(timeSplitted1[0]);
		}
		if (timeSplitted[1].contains("P")) {
			times=times+12;
		}
		min = times*60 + stringToInt(timeSplitted1[1]);
		return min;
	}
    public static void isInRange(int i) {
    	String temp = "";
    	if (i == 0)
    		temp = textParkUntil.getText();
    	if (i == 1)
    		temp = textParkUntil1.getText();
    	
    	
    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	/*
    	if (stringToInt(splitted1[0]) >7 && stringToInt(splitted1[0]) != 12 && splitted[1].contains("P")) {
    		splitted1[0]=intToString(8);
    		splitted1[1]="00";
    		splitted[1]="PM";
    	}
    	if (stringToInt(splitted1[0])<8 && splitted[1].contains("A")) {
    		splitted1[0]=intToString(8);
    		splitted1[1]="00";
    		splitted[1]="AM";
    	}
    	*/
    	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    	
    	//paid until
    	//시간 밤12시부터 몇분 지낫는지 알려주는 펑션 하나 만들기;;;;
    	if (i == 0) {
    		if (timeToMin(temp)<timeToMin(ClockPane.currentTime())) {
    			temp=ClockPane.currentTime();
    		}
    		
    	}
    	if (i == 1) {
    		if (timeToMin(temp)>timeToMin(ClockPane.currentTime())) {
    			temp=ClockPane.currentTime();
    		}
    		
    	}
    	if (timeToMin(temp)<480) {
			temp="08:00 AM";
		}
    	if (timeToMin(temp)>1200) {
			temp="08:00 PM";
		}
    	if (i == 0)
    		textParkUntil.setText(temp);
    	if (i == 1)
    		textParkUntil1.setText(temp);
    }
    public static void showStartPage() {
    	buttonStart.setVisible(false);
    	buttonPurchase.setVisible(true);
    	buttonRefund.setVisible(true);
    }
    
    public static void showHomePage() throws Exception{
    	textTotalDue.setLocation(new Point(timex+50, timey+600));
		buttonHome.setVisible(false);
		textHoursOfOperation.setVisible(false);
		buttonPurchase.setVisible(true);
		buttonRefund.setVisible(true);
        textParkUntil.setText(ClockPane.currentTime());
        isInRange(0);
        buttonPayCash.setVisible(false);
        buttonPayCard.setVisible(false);
        textTotalDue.setVisible(false);
        textProcessing.setVisible(false);
		showClock(false);
		showClock1(false);
		buttonPreSetTicket1.setVisible(false);
		buttonPreSetTicket2.setVisible(false);
		buttonPreSetTicket3.setVisible(false);
		textTotalDue.setText("Total: $0.00");
		textInfo.setVisible(false);
		
	}
    
    public static void showPurchasePage() {
    	buttonPayCash.setLocation(new Point(timex+75, timey+715));
    	buttonPayCard.setLocation(new Point(timex+325, timey+715));
    	buttonPreSetTicket1.setVisible(false);
		buttonPreSetTicket2.setVisible(false);
		buttonPreSetTicket3.setVisible(false);
    	textHoursOfOperation.setVisible(true);
    	buttonHome.setVisible(true);
    	buttonPurchase.setVisible(false);
		buttonRefund.setVisible(false);
		buttonPayCash.setVisible(true);
		buttonPayCard.setVisible(true);
		textTotalDue.setVisible(true);
		textProcessing.setVisible(false);
		cardMachine.cardNumber ="";
		cardMachine.pinNumber="";
		showClock1(false);
		showClock(true);
		isRefund = 0;
		totalDue1 = totalDue;
		textInfo.setVisible(true);
		textInfo.setText("Park Until :");
		buttonPayCard.setText("Pay With Card");
		buttonPayCash.setText("Pay With Coin");
    	
    }
    
    public static void showRefundPage() {
    	buttonPayCash.setLocation(new Point(timex+75, timey+765));
    	buttonPayCard.setLocation(new Point(timex+325, timey+765));
    	textTotalDue.setLocation(new Point(timex+50, timey+650));
    	buttonPreSetTicket1.setVisible(true);
		buttonPreSetTicket2.setVisible(true);
		buttonPreSetTicket3.setVisible(true);
    	isRefund = 1;
    	buttonHome.setVisible(true);
    	textTotalDue.setText("Refund: $0.00");
    	buttonPurchase.setVisible(false);
		buttonRefund.setVisible(false);
		textProcessing.setVisible(false);
		textTotalDue.setVisible(true);
		cardMachine.cardNumber ="";
		cardMachine.pinNumber="";
		showClock(true);
		showClock1(true);
		totalDue1 = totalDue;
		textInfo.setVisible(true);
		textInfo.setText("Enter Time Paid Until");
		button30Min.setVisible(false);
		button1Hour.setVisible(false);
		buttonMaximum.setVisible(false);
		buttonPayCash.setVisible(true);
		buttonPayCard.setVisible(true);
		buttonPayCard.setText("Refund Via Card");
		buttonPayCash.setText("Refund Via Coin");
    }
    	
    public static void showClock(boolean isIt) {
    	textParkUntil.setVisible(isIt);
    	buttonHourUp.setVisible(isIt);
		buttonMinUp.setVisible(isIt);
		buttonMerUp.setVisible(isIt);
		buttonHourDown.setVisible(isIt);
		buttonMinDown.setVisible(isIt);
		buttonMerDown.setVisible(isIt);
		button30Min.setVisible(isIt);
		button1Hour.setVisible(isIt);
		buttonMaximum.setVisible(isIt);
    }
 
    public static void showClock1(boolean isIt) {
    	textParkUntil1.setVisible(isIt);
    	buttonHourUp1.setVisible(isIt);
		buttonMinUp1.setVisible(isIt);
		buttonMerUp1.setVisible(isIt);
		buttonHourDown1.setVisible(isIt);
		buttonMinDown1.setVisible(isIt);
		buttonMerDown1.setVisible(isIt);
		textInfo1.setVisible(isIt);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
					initiateParkingMeter();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
}

