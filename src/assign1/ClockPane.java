package assign1;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
class ClockPane extends JPanel {

	  private static JLabel clock = new JLabel();

	  public ClockPane() {
	    setLayout(new BorderLayout());
	    tickTock();
	    add(clock);
	    Timer timer = new Timer(500, new ActionListener() {
	      @Override
	      public void actionPerformed(ActionEvent e) {
	        tickTock();
	      }
	    });
	    timer.setRepeats(true);
	    timer.setCoalesce(true);
	    timer.setInitialDelay(0);
	    timer.start();
	  }

	  public void tickTock() {
	    clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
	    clock.setFont(new Font("Arial", Font.PLAIN, 40));
	  }
	  public static String currentTime() {
		  String currentString = clock.getText();
		  String[] splitted = currentString.split(" ");
		  splitted[1] = splitted[1].split(":")[0]+":"+splitted[1].split(":")[1];
		  String outputString = splitted[1]+" "+splitted[2];
		  return(outputString);
	  }
	  public static String currentDate() {
		  String currentString = clock.getText();
		  String[] splitted = currentString.split(" ");
		  return(splitted[0]);
	  }
	  public static String getTime() {
		  return clock.getText();
	  }
	}