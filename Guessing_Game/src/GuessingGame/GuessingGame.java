package GuessingGame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GuessingGame extends JFrame {
        private JPanel mainWindow;
        private JTextField txtGuess;
        private JLabel lblOutput;
        private int theNumber;
        private int tries = 0;
        public void checkGuess() {
            String guessText = txtGuess.getText();
            String message = "";
            txtGuess.setText("");
            txtGuess.requestFocus();
            try {
                int guess = Integer.parseInt(guessText);
                if (guess < theNumber) {
                    message = guess + " is too low. Try again.";
                    tries++;
                } else if (guess > theNumber) {
                    message = guess + " is too high. Try again.";
                    tries++;
                } else {
                    message = guess + " is correct. I GUESS you won in " + tries + " tries! Let's play again!";
                    tries = 0;
                    newGame();
                }
            } catch (Exception e){
                message = "Please enter a whole number between 1 and 100";
            } finally {
                lblOutput.setText(message);
            }
        }
        public void newGame(){
            theNumber = (int)(Math.random() * 100 + 1);
        }
        private JButton guessButton;

        public GuessingGame() {
            // Button listener
            guessButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    checkGuess();
                }
            });
            // Text field listener for the Enter key
            txtGuess.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER){
                        checkGuess();
                    };
                }
            });
        }
    public static void main(String[] args){
        GuessingGame theGame = new GuessingGame();
        theGame.newGame();
        theGame.setTitle("Number Guessing Game");
        theGame.setContentPane(theGame.mainWindow);
        theGame.setSize(new Dimension(450, 300));
        theGame.setVisible(true);
        theGame.setDefaultCloseOperation(GuessingGame.DISPOSE_ON_CLOSE);
    }
}