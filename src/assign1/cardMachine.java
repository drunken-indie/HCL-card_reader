package assign1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
 
public class cardMachine {
	public static String cardNumber = "";
	public static String pinNumber = "";
	public static String fakePinNumber = "";

	
	static JFrame frame = new JFrame("Card Machine");
    static JLabel cardReaderPicture = new JLabel();
    static JButton buttonOne = new JButton("");
    static JButton buttonTwo = new JButton("");
    static JButton buttonThree = new JButton("");
    static JButton buttonFour = new JButton("");
    static JButton buttonFive = new JButton("");
    static JButton buttonSix = new JButton("");
    static JButton buttonSeven = new JButton("");
    static JButton buttonEight = new JButton("");
    static JButton buttonNine = new JButton("");
    static JButton buttonZero = new JButton("");
    
    static JButton buttonF1 = new JButton("");
    static JButton buttonF2 = new JButton("");
    static JButton buttonF3 = new JButton("");
    static JButton buttonF4 = new JButton("");
    
    static JButton buttonOK = new JButton("");
    static JButton buttonBack = new JButton("");
    static JButton buttonCancel = new JButton("");
    
    static JButton fillCardNumber = new JButton("insert/swipe card");
    
    static JTextPane textBox = new JTextPane();
    static JTextPane textInstruction = new JTextPane();
    
    
    public static void initialize(Container pane) throws Exception {
    	URL url = ParkingMeter.class.getResource("cardReader.jpg");           
    	ImageIcon cardReaderImage = new ImageIcon(url);
    	Image cardReaderImage1 = cardReaderImage.getImage();
    	Image cardReaderImageFinal = cardReaderImage1.getScaledInstance(500,1000, 0);
        pane.setLayout(null);
        
        cardReaderPicture.setIcon(new ImageIcon(cardReaderImageFinal));// your image here
        
        //pane.setBackground(Color.WHITE);
        
        
        
        SimpleAttributeSet textCenter = new SimpleAttributeSet();
        StyleConstants.setAlignment(textCenter, StyleConstants.ALIGN_CENTER);
        
      
        
        pane.add(cardReaderPicture);
        pane.add(fillCardNumber);
        pane.add(textInstruction);
       
        
        cardReaderPicture.setVisible(true);
        cardReaderPicture.setSize(500, 1000);
        
        //cardReaderPicture.setLayout( new GridBagLayout() );
        cardReaderPicture.add(buttonOne, new GridBagConstraints());
        cardReaderPicture.add(buttonTwo, new GridBagConstraints());
        cardReaderPicture.add(buttonThree, new GridBagConstraints());
        cardReaderPicture.add(buttonFour, new GridBagConstraints());
        cardReaderPicture.add(buttonFive, new GridBagConstraints());
        cardReaderPicture.add(buttonSix, new GridBagConstraints());
        cardReaderPicture.add(buttonSeven, new GridBagConstraints());
        cardReaderPicture.add(buttonEight, new GridBagConstraints());
        cardReaderPicture.add(buttonNine, new GridBagConstraints());
        cardReaderPicture.add(buttonZero, new GridBagConstraints());
        cardReaderPicture.add(buttonOK, new GridBagConstraints());
        cardReaderPicture.add(buttonBack, new GridBagConstraints());
        cardReaderPicture.add(buttonCancel, new GridBagConstraints());
        cardReaderPicture.add(buttonF1, new GridBagConstraints());
        cardReaderPicture.add(buttonF2, new GridBagConstraints());
        cardReaderPicture.add(buttonF3, new GridBagConstraints());
        cardReaderPicture.add(buttonF4, new GridBagConstraints());
        cardReaderPicture.add(textBox, new GridBagConstraints());
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        
        textBox.setSize(new Dimension(320, 260));
        textBox.setVisible(true);
        textBox.setLocation(new Point(80, 140));
        textBox.setEditable(false);
        if (ParkingMeter.isRefund==0) 
        	textBox.setText("Purchase : $"+ParkingMeter.totalDue+"\n\n\nPlease insert/swipe card \n\nfor manual card number entry, press F4");
        if (ParkingMeter.isRefund==1)
        	textBox.setText("Refund : $"+ParkingMeter.totalDue+"\n\n\nPlease insert/swipe card \n\nfor manual card number entry, press F4");
        textBox.setFont(new Font("Arial", Font.PLAIN, 20));
        
        textInstruction.setSize(new Dimension(300, 500));
        textInstruction.setVisible(true);
        textInstruction.setLocation(new Point(500, 500));
        textInstruction.setEditable(false);
        textInstruction.setText("press insert/swipe card button \nto simulate inserting/swiping card");
        textInstruction.setFont(new Font("Arial", Font.PLAIN, 20));
        
        buttonF1.setSize(new Dimension(80, 70));
        buttonF1.setVisible(true);
        buttonF1.setBackground(Color.BLACK);
        buttonF1.setContentAreaFilled(false);
        buttonF1.setLocation(new Point(60, 425));
        buttonF1.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonF1.setOpaque(false);
        buttonF1.setContentAreaFilled(false);
        buttonF1.setBorderPainted(false);
        
        buttonF2.setSize(new Dimension(80, 70));
        buttonF2.setVisible(true);
        buttonF2.setBackground(Color.BLACK);
        buttonF2.setContentAreaFilled(false);
        buttonF2.setLocation(new Point(152, 430));
        buttonF2.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonF2.setOpaque(false);
        buttonF2.setContentAreaFilled(false);
        buttonF2.setBorderPainted(false);
        
        buttonF3.setSize(new Dimension(80, 70));
        buttonF3.setVisible(true);
        buttonF3.setBackground(Color.BLACK);
        buttonF3.setContentAreaFilled(false);
        buttonF3.setLocation(new Point(244, 430));
        buttonF3.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonF3.setOpaque(false);
        buttonF3.setContentAreaFilled(false);
        buttonF3.setBorderPainted(false);
        
        buttonF4.setSize(new Dimension(80, 70));
        buttonF4.setVisible(true);
        buttonF4.setBackground(Color.BLACK);
        buttonF4.setContentAreaFilled(false);
        buttonF4.setLocation(new Point(337, 425));
        buttonF4.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonF4.setOpaque(false);
        buttonF4.setContentAreaFilled(false);
        buttonF4.setBorderPainted(false);
        
        buttonOne.setSize(new Dimension(110, 70));
        buttonOne.setVisible(true);
        buttonOne.setBackground(Color.BLACK);
        buttonOne.setContentAreaFilled(false);
        buttonOne.setLocation(new Point(60, 530));
        buttonOne.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonOne.setOpaque(false);
        buttonOne.setContentAreaFilled(false);
        buttonOne.setBorderPainted(false);
        
        buttonTwo.setSize(new Dimension(110, 70));
        buttonTwo.setVisible(true);
        buttonTwo.setBackground(Color.BLACK);
        buttonTwo.setContentAreaFilled(false);
        buttonTwo.setLocation(new Point(185, 530));
        buttonTwo.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonTwo.setOpaque(false);
        buttonTwo.setContentAreaFilled(false);
        buttonTwo.setBorderPainted(false);
        
        
        
        buttonThree.setSize(new Dimension(110, 70));
        buttonThree.setVisible(true);
        buttonThree.setBackground(Color.BLACK);
        buttonThree.setContentAreaFilled(false);
        buttonThree.setLocation(new Point(310, 530));
        buttonThree.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonThree.setOpaque(false);
        buttonThree.setContentAreaFilled(false);
        buttonThree.setBorderPainted(false);
        
        buttonFour.setSize(new Dimension(110, 70));
        buttonFour.setVisible(true);
        buttonFour.setBackground(Color.BLACK);
        buttonFour.setContentAreaFilled(false);
        buttonFour.setLocation(new Point(60, 610));
        buttonFour.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonFour.setOpaque(false);
        buttonFour.setContentAreaFilled(false);
        buttonFour.setBorderPainted(false);
        
        buttonFive.setSize(new Dimension(110, 70));
        buttonFive.setVisible(true);
        buttonFive.setBackground(Color.BLACK);
        buttonFive.setContentAreaFilled(false);
        buttonFive.setLocation(new Point(185, 615));
        buttonFive.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonFive.setOpaque(false);
        buttonFive.setContentAreaFilled(false);
        buttonFive.setBorderPainted(false);
        
        buttonSix.setSize(new Dimension(110, 70));
        buttonSix.setVisible(true);
        buttonSix.setBackground(Color.BLACK);
        buttonSix.setContentAreaFilled(false);
        buttonSix.setLocation(new Point(310, 610));
        buttonSix.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonSix.setOpaque(false);
        buttonSix.setContentAreaFilled(false);
        buttonSix.setBorderPainted(false);
        
        buttonSeven.setSize(new Dimension(110, 70));
        buttonSeven.setVisible(true);
        buttonSeven.setBackground(Color.BLACK);
        buttonSeven.setContentAreaFilled(false);
        buttonSeven.setLocation(new Point(60, 690));
        buttonSeven.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonSeven.setOpaque(false);
        buttonSeven.setContentAreaFilled(false);
        buttonSeven.setBorderPainted(false);
        
        buttonEight.setSize(new Dimension(110, 70));
        buttonEight.setVisible(true);
        buttonEight.setBackground(Color.BLACK);
        buttonEight.setContentAreaFilled(false);
        buttonEight.setLocation(new Point(185, 695));
        buttonEight.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonEight.setOpaque(false);
        buttonEight.setContentAreaFilled(false);
        buttonEight.setBorderPainted(false);
        
        buttonNine.setSize(new Dimension(110, 70));
        buttonNine.setVisible(true);
        buttonNine.setBackground(Color.BLACK);
        buttonNine.setContentAreaFilled(false);
        buttonNine.setLocation(new Point(310, 690));
        buttonNine.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonNine.setOpaque(false);
        buttonNine.setContentAreaFilled(false);
        buttonNine.setBorderPainted(false);
        
        buttonZero.setSize(new Dimension(110, 70));
        buttonZero.setVisible(true);
        buttonZero.setBackground(Color.BLACK);
        buttonZero.setContentAreaFilled(false);
        buttonZero.setLocation(new Point(185, 775));
        buttonZero.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonZero.setOpaque(false);
        buttonZero.setContentAreaFilled(false);
        buttonZero.setBorderPainted(false);
        
        buttonCancel.setSize(new Dimension(110, 70));
        buttonCancel.setVisible(true);
        buttonCancel.setBackground(Color.RED);
        buttonCancel.setContentAreaFilled(false);
        buttonCancel.setLocation(new Point(60, 850));
        buttonCancel.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonCancel.setOpaque(false);
        buttonCancel.setContentAreaFilled(false);
        buttonCancel.setBorderPainted(false);
        
        buttonBack.setSize(new Dimension(110, 70));
        buttonBack.setVisible(true);
        buttonBack.setBackground(Color.YELLOW);
        buttonBack.setContentAreaFilled(false);
        buttonBack.setLocation(new Point(185, 855));
        buttonBack.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonBack.setOpaque(false);
        buttonBack.setContentAreaFilled(false);
        buttonBack.setBorderPainted(false);
        
        buttonOK.setSize(new Dimension(110, 70));
        buttonOK.setVisible(true);
        buttonOK.setBackground(Color.GREEN);
        buttonOK.setContentAreaFilled(false);
        buttonOK.setLocation(new Point(310, 850));
        buttonOK.setFont(new Font("Arial", Font.PLAIN, 30));
        buttonOK.setOpaque(false);
        buttonOK.setContentAreaFilled(false);
        buttonOK.setBorderPainted(false);
        ///////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////
        fillCardNumber.setSize(new Dimension(300, 70));
        fillCardNumber.setVisible(true);
        fillCardNumber.setBackground(Color.BLACK);
        fillCardNumber.setContentAreaFilled(false);
        fillCardNumber.setOpaque(true);
        fillCardNumber.setLocation(new Point(500, 300));
        fillCardNumber.setFont(new Font("Arial", Font.PLAIN, 20));
         
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	frame.setVisible(false);
            	buttonCancel.removeActionListener(this);
            	if (ParkingMeter.isRefund == 0)
					try {
						ParkingMeter.showPurchasePage();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	if (ParkingMeter.isRefund == 1)
					try {
						ParkingMeter.showRefundPage();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	
            }
        });
        buttonF4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	fillCardNumber.setVisible(false);
                manualNumberEnter();
                buttonF4.removeActionListener(this);
            }
        });
        
        fillCardNumber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	cardNumber = "4520020027280361";
            	enterPinNumber();
            	fillCardNumber.removeActionListener(this);
            	fillCardNumber.setVisible(false);
            }
        });
    }
 
    public static void updateCardNumber(int i) {
    	if (cardNumber.length()<16 && i > -1) {
    		cardNumber = cardNumber+i;
    	}if(cardNumber.length() > 0 && i==-1) {
    		cardNumber = cardNumber.substring(0, cardNumber.length()-1);
    	}
    	if (ParkingMeter.isRefund==0) 
    		textBox.setText("Purchase : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber);
        if (ParkingMeter.isRefund==1)
        	textBox.setText("Refund : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber);
    	
    }
    public static void manualNumberEnter() {
    	if (ParkingMeter.isRefund==0) 
    		textBox.setText("Purchase : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber);
    	if (ParkingMeter.isRefund==1)
        	textBox.setText("Refund : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber);
    	
    	ActionListener temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp0, tempBack;
		buttonOne.addActionListener(temp1 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(1);
            }
        });
    	buttonTwo.addActionListener(temp2 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(2);
            }
        });
    	buttonThree.addActionListener(temp3 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(3);
            }
        });
    	buttonFour.addActionListener(temp4 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(4);
            }
        });
    	buttonFive.addActionListener(temp5 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(5);
            }
        });
    	buttonSix.addActionListener(temp6 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(6);
            }
        });
    	buttonSeven.addActionListener(temp7 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(7);
            }
        });
    	buttonEight.addActionListener(temp8 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(8);
            }
        });
    	buttonNine.addActionListener(temp9 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(9);
            }
        });
    	buttonZero.addActionListener(temp0 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(0);
            }
        });
    	buttonBack.addActionListener(tempBack = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updateCardNumber(-1);
            	
            }
        });
    	buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	frame.setVisible(false);
            	buttonCancel.removeActionListener(this);
            	if (ParkingMeter.isRefund == 0)
					try {
						ParkingMeter.showPurchasePage();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	if (ParkingMeter.isRefund == 1)
					try {
						ParkingMeter.showRefundPage();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            }
    	});
    	buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	if (cardNumber.length()==16) {
            		buttonOne.removeActionListener(temp1);
            		buttonTwo.removeActionListener(temp2);
            		buttonThree.removeActionListener(temp3);
            		buttonFour.removeActionListener(temp4);
            		buttonFive.removeActionListener(temp5);
            		buttonSix.removeActionListener(temp6);
            		buttonSeven.removeActionListener(temp7);
            		buttonEight.removeActionListener(temp8);
            		buttonNine.removeActionListener(temp9);
            		buttonZero.removeActionListener(temp0);
            		buttonBack.removeActionListener(tempBack);
            		buttonOK.removeActionListener(this);
            		enterPinNumber();
            	}
            	
            	
            	
            }
        });
    	
    }
    
    public static void enterPinNumber() {
    	if (ParkingMeter.isRefund==0) 
    		textBox.setText("Purchase : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber+ "\n\n Please Enter Pin :\n"+pinNumber);
    	if (ParkingMeter.isRefund==1) 
        	textBox.setText("Refund : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber+ "\n\n Please Enter Pin :\n"+pinNumber);
    	
    	ActionListener temp1, temp2, temp3, temp4, temp5, temp6, temp7, temp8, temp9, temp0, tempBack;
		buttonOne.addActionListener(temp1 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(1);
            }
        });
    	buttonTwo.addActionListener(temp2 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(2);
            }
        });
    	buttonThree.addActionListener(temp3 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(3);
            }
        });
    	buttonFour.addActionListener(temp4 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(4);
            }
        });
    	buttonFive.addActionListener(temp5 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(5);
            }
        });
    	buttonSix.addActionListener(temp6 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(6);
            }
        });
    	buttonSeven.addActionListener(temp7 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(7);
            }
        });
    	buttonEight.addActionListener(temp8 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(8);
            }
        });
    	buttonNine.addActionListener(temp9 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(9);
            }
        });
    	buttonZero.addActionListener(temp0 = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(0);
            }
        });
    	buttonBack.addActionListener(tempBack = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	updatePinNumber(-1);
            	
            }
        });
    	buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	frame.setVisible(false);
            	buttonCancel.removeActionListener(this);
            	if (ParkingMeter.isRefund == 0)
					try {
						ParkingMeter.showPurchasePage();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	if (ParkingMeter.isRefund == 1)
					try {
						ParkingMeter.showRefundPage();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	
            }
        });
    	buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	if (pinNumber.length()==4) {
            		buttonOne.removeActionListener(temp1);
            		buttonTwo.removeActionListener(temp2);
            		buttonThree.removeActionListener(temp3);
            		buttonFour.removeActionListener(temp4);
            		buttonFive.removeActionListener(temp5);
            		buttonSix.removeActionListener(temp6);
            		buttonSeven.removeActionListener(temp7);
            		buttonEight.removeActionListener(temp8);
            		buttonNine.removeActionListener(temp9);
            		buttonZero.removeActionListener(temp0);
            		buttonBack.removeActionListener(tempBack);
            		buttonOK.removeActionListener(this);
            		try {
						ParkingMeter.payPrice(0.0);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	}
            	
            	
            	
            }
        });
    	
    }
    	
    	
   public static void Quit() {
	   frame.setVisible(false);
   }
    	//fakePinNumber
    public static void updatePinNumber(int i) {
    	if (pinNumber.length()<4 && i > -1) {
    		pinNumber = fakePinNumber+i;
    		fakePinNumber = fakePinNumber+"*";
    	}if(pinNumber.length() > 0 && i==-1) {
    		pinNumber = pinNumber.substring(0, pinNumber.length()-1);
    		fakePinNumber = fakePinNumber.substring(0, fakePinNumber.length()-1);
    	}
    	if (ParkingMeter.isRefund==0) 
    		textBox.setText("Purchase : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber+ "\n\n Please Enter Pin :\n"+pinNumber);
    	if (ParkingMeter.isRefund==1)
        	textBox.setText("Refund : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber+ "\n\n Please Enter Pin :\n"+pinNumber);
    	
    	//textBox.setText("Purchase : $"+ParkingMeter.totalDue+"\n\n\nPlease enter card number : \n"+cardNumber+ "\n\n Please Enter Pin :\n"+fakePinNumber);
    }
  
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * @throws Exception 
     */
  
    public static void initiateCardMachine() throws Exception {
        //Create and set up the window.
    	
        
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        initialize(frame.getContentPane());
 
        frame.setSize(800,1000);
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
  
   
}

