//
//    Shane Harrington
//
//    Ithaca College
//
//    Test Game - Main Class
//
//    May 30, 2016
//

import javax.swing.JFrame;

public class Main{
  
  static int WIDTH = 800;
  static int HEIGHT = 650;
  static JFrame frame;
  static boolean resetGame = false;
  
  public static Game reset(){
	  //Creates a new game
	  return new Game();
  }
  public static void main(String[] args){
    //Main
    frame = new JFrame("Coin Getter");
    frame.pack();
    frame.setSize(WIDTH, HEIGHT);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	frame.add(new Game());
    Game.playBackgroundMusic();
    frame.setVisible(true);
  }
}