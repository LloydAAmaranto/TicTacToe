import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel title_panel = new JPanel();
  JPanel button_panel = new JPanel();
  JLabel textfield = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1_turn;

  public TicTacToe(){

    //frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //size of window
    frame.setSize(800,800);
    //background color
    frame.getContentPane().setBackground(new Color(70,30,50));
    frame.setLayout(new BorderLayout());
    frame.setVisible(true);

    //textfield
    textfield.setBackground(new Color(30,40,50));
    //text color
    textfield.setForeground(Color.GREEN);
    textfield.setFont(new Font("Ink Free", Font.BOLD, 60));
    textfield.setHorizontalAlignment(JLabel.CENTER);
    textfield.setText("Tic-Tac-Toe");
    textfield.setOpaque(true);

  }

  @Override
  public void actionPerformed(ActionEvent e){

  }

  public void firstTurn(){

  }

  public void check(){

  }
  public void xWins(int a, int b, int c){

  }
  public void oWins(int a, int b, int c){

  }
}
