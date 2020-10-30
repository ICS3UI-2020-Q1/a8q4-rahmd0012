import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JLabel secondLabel;

  JTextField firstInput;
  JTextField secondInput;

  JButton firstButton;
  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Factorial");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main JPanel
    mainPanel = new JPanel();
    // disable any layout helpers
    mainPanel.setLayout(null);

    // initialize the labels
    firstLabel = new JLabel("n");
    secondLabel = new JLabel("factorial(n)"); 

    // set the size and location of the labels
    firstLabel.setBounds(10, 10, 100, 30);
    secondLabel.setBounds(230, 10, 250, 30);

    // initialize the text fields
    firstInput = new JTextField();
    secondInput = new JTextField();

    // set the location and size of text fields
    firstInput.setBounds(50, 10, 100, 30);
    secondInput.setBounds(350, 10, 100, 30);

    // initialize the button
    firstButton = new JButton("CALC");

    // set the location and size of the button
    firstButton.setBounds(500, 10, 100, 30);

    // add an action listener to the button
    firstButton.addActionListener(this);

    // add an action command to the button
    firstButton.setActionCommand("CALC");

    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);

    mainPanel.add(firstInput);
    mainPanel.add(secondInput);

    mainPanel.add(firstButton);

 
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    // do something depending on what button is pressed
    if(command.equals("CALC")){
      // get the text from the text box
      String firstText = firstInput.getText();

      // change the string into an integer
      int firstNum = Integer.parseInt(firstText);

      // create an accumulator variable to add into
      int total = 1;

      // create a for loop to find the factorial
      for(int count = firstNum; count >= 1; count--){
        // create a total for the numbers decsending
        total = total * count;
    }
    // show the user the factorial
    secondInput.setText("" + total);
  }
  }
  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
