//
//    Shane Harrington
//
//    Ithaca College
//
//    Test Game - Score Class
//
//    June 1, 2016
//

import java.awt.Graphics2D;
import java.io.IOException;
import java.io.InputStream;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Color;

public class Score{
  
  static int currentScore;
  Font retroComputer;
  
  public Score(){
    currentScore = 0;

    // Setup font
    try {
      InputStream is = getClass().getResourceAsStream("/fonts/RetroComputer.ttf");
      retroComputer = Font.createFont(Font.TRUETYPE_FONT, is);
    } catch (FontFormatException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public void update(){
	currentScore = Player.s;
  }
  
  public void draw(Graphics2D g2d){
    Font font = retroComputer.deriveFont(Font.PLAIN, 40);
    g2d.setFont(font);
    g2d.setColor(Color.white);
    if(Player.playerAlive)
      g2d.drawString("SCORE: " + currentScore, 430, 60); 
    else{
      g2d.drawString("FINAL SCORE", 250, 300);
      g2d.drawString(Integer.toString(currentScore), 350, 400);
    }
  }
  
  public static int getScore(){
    return currentScore;
  }
}