package Jogo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame{    
  JLabel bg, scoreLbl, bestLbl;     
  JLabel P00, P01, P02, P03, P10, P11, P12, P13, P20, P21, P22, P23, P30, P31, P32, P33; 
  JLabel[] labels = {P00, P01, P02, P03, P10, P11, P12, P13, P20, P21, P22, P23, P30, P31, P32, P33};   
  JLabel scoreText;
  JLabel bestText;
  JButton newGameBtn;    
  
  
  JButton listener;    
  Font font = new Font("Arial",Font.BOLD, 25);   
  int aux = 0;
  int score, best = 0;  
    
  Main(){                  
    getContentPane().setLayout(null);    
  }     
    
  public void init(){         
      
    for(int i=0; i<4; i++){            
      for(int j=0; j<4; j++){
        labels[(i*4)+j] = new JLabel();
        labels[(i*4)+j].setBounds(65+(j*121),167+(i*122),200,200);
        add(labels[(i*4)+j]);
      }
    }                          
         
    listener = new JButton();
    add(listener);
         
    bg = new JLabel();
    bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("recursos/bg.png")));
    bg.setBounds(50, 200, 500, 500);
    add(bg);                          
                                                                                              
    scoreText = new JLabel("0"); 
    scoreText.setHorizontalAlignment(JLabel.CENTER);
    scoreText.setForeground(Color.white);
    scoreText.setFont(font);
    scoreText.setBounds(361, 135, 80, 50);
    add(scoreText);
         
    bestText = new JLabel("0");
    bestText.setHorizontalAlignment(JLabel.CENTER);
    bestText.setForeground(Color.white);
    bestText.setFont(font);
    bestText.setBounds(447, 130, 100, 60);
    add(bestText);
         
    scoreLbl = new JLabel();
    scoreLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("recursos/score.png")));
    scoreLbl.setBounds(360, 120, 100, 60);
    add(scoreLbl);
         
    bestLbl = new JLabel();
    bestLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("recursos/best.png")));
    bestLbl.setBounds(450, 120, 100, 60);
    add(bestLbl);         
         
    newGameBtn = new JButton();
    newGameBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("recursos/new-game.png")));
    newGameBtn.setBounds(60, 135, 130, 40);
    add(newGameBtn);                                
  }
     
  public void setSprites(int values[][], JLabel labels[]){
    int i, j;
    String sprite;
    for(i=0;i<4;i++){
      for(j=0; j<4; j++){
        if(values[i][j] != 0) {
          sprite = String.valueOf(values[i][j]);
          sprite = "recursos/" + sprite + ".png";
          labels[(i*4)+j].setIcon(new javax.swing.ImageIcon(getClass().getResource(sprite)));               
        } else {
            labels[(i*4)+j].setIcon(null);               
        }               
      }
    }
  }
          
  public int setValue(){
    int x = (int)(1+3*Math.random());
    if (x<3){
      x=2;
    } else {
      x=4;
    }      
    return x;
  }
    
  public void addBlock(int array[][]){
    int i = (int)(4*Math.random());
    int j = (int)(4*Math.random());                
    int x = setValue();
        
    if(array[i][j] != 0){
      while(array[i][j] != 0){
        i = (int)(4*Math.random());
        j = (int)(4*Math.random());
      }
    }        
    array[i][j] = x;
  }
    
  public void clean(int array[][]){
    for (int i=0; i<4; i++){ 
      for (int j=0; j<4; j++){
        array[i][j] = 0;                    
      }                
    }
  }
    
  public void newGame(int array[][]){
    clean(array);
    addBlock(array);
    addBlock(array);                             
    score = 0;
    scoreText.setText(String.valueOf(score));             
    setSprites(array, labels);
  }
     
  public void updateBest(){
    if (score>best){
      best=score;
      bestText.setText(String.valueOf(best));
    }   
  }      
   
  public void update(int array[][]){
    addBlock(array);
    setSprites(array, labels);          
    scoreText.setText(String.valueOf(score));
    updateBest();
  }
      
  public void pushTop(int array[][]){
    for(int i=0; i<3; i++){            
      for(int j=0; j<4; j++){ 
        if (array[i][j]==0 && array[i+1][j]!=0) {
          array[i][j] = array[i+1][j];
          array[i+1][j] = 0;
          aux = 1;
        }
      } 
    }
  }
      
  public void combineTop(int array[][]){       
    for(int i=0; i<3; i++) {
      for(int j=0; j<4; j++) {
        if (array[i][j] != 0) {
          if (array[i][j] == array[i+1][j]) {
            array[i][j] = (array[i][j]*2);
            array[i+1][j] = 0;
            score+=(int)array[i][j];
            aux = 1;
          }
        }
      }  
    }
  }
   
  public void pushBottom(int array[][]){
    for(int i=3; i>0; i--){            
      for(int j=0; j<4; j++){ 
        if (array[i][j]==0 && array[i-1][j]!=0) {
          array[i][j] = array[i-1][j];
          array[i-1][j] = 0;
          aux = 1;
        }
      } 
    }
  }
      
  public void combineBottom(int array[][]){       
    for(int i=3; i>0; i--) {
      for(int j=0; j<4; j++) {
        if (array[i][j] != 0) {
          if (array[i][j] == array[i-1][j]) {
            array[i][j] = (array[i][j]*2);
            array[i-1][j] = 0;
            score+=(int)array[i][j];
            aux = 1;
          }
        }
      }  
    }
  }
    
  public void pushRight(int array[][]){
    for(int i=3; i>0; i--){            
      for(int j=0; j<4; j++){ 
        if (array[j][i]==0 && array[j][i-1]!=0) {
          array[j][i] = array[j][i-1];
          array[j][i-1] = 0;
          aux = 1;
        }
      } 
    }
  }
      
  public void combineRight(int array[][]){       
    for(int i=3; i>0; i--) {
      for(int j=0; j<4; j++) {
        if (array[j][i] != 0) {
          if (array[j][i] == array[j][i-1]) {
            array[j][i] = (array[j][i]*2);
            array[j][i-1] = 0;
            score+=(int)array[j][i];
            aux = 1;
          }
        }
      }  
    }
  }
   
  public void pushLeft(int array[][]){
    for(int i=0; i<3; i++){            
      for(int j=0; j<4; j++){ 
        if (array[j][i]==0 && array[j][i+1]!=0) {
          array[j][i] = array[j][i+1];
          array[j][i+1] = 0;
          aux = 1;
        }
      } 
    }
  }
      
  public void combineLeft(int array[][]){       
    for(int i=0; i<3; i++) {
      for(int j=0; j<4; j++) {
        if (array[j][i] != 0) {
          if (array[j][i] == array[j][i+1]) {
            array[j][i] = (array[j][i]*2);
            array[j][i+1] = 0;
            score+=(int)array[j][i];
            aux = 1;
          }
        }
      }  
    }
  }  
    
  public void activateTriggers(final int array[][]){ 
    listener.addKeyListener(new KeyAdapter() {           
      @Override
      public void keyPressed( KeyEvent e) {            
        if (e.getKeyCode() == KeyEvent.VK_UP){
          pushTop(array);
          pushTop(array);
          combineTop(array);
          pushTop(array);
          if(aux == 1){              
            update(array);
            aux=0;              
          }      
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN){  
          pushBottom(array);
          pushBottom(array);
          combineBottom(array);
          pushBottom(array);
          if(aux == 1){              
            update(array);
            aux=0;              
          }                    
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT){
          pushLeft(array);
          pushLeft(array);
          combineLeft(array);
          pushLeft(array);
          if(aux == 1){              
            update(array);
            aux=0;              
          }
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
          pushRight(array);
          pushRight(array);
          combineRight(array);
          pushRight(array);
          if(aux == 1){              
            update(array);
            aux=0;              
          }
        }
      }
    });       
         
    newGameBtn.addActionListener((ActionEvent e) -> {
      newGame(array);
      newGameBtn.setFocusable(false);
    });                
  }                 
     
  public static void main(String[] args) {       
    int array[][] = new int[4][4];                  
    Main screen = new Main();
    screen.init();
    screen.setTitle("2048");
    screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    screen.setSize(1010,1010);
    screen.setBounds(500,500,600,785);
    Dimension screenDim = Toolkit.getDefaultToolkit().getScreenSize();
    screen.setLocation((screenDim.width-screen.getSize().width)/2, (screenDim.height-screen.getSize().height)/2);
    screen.setResizable(false);
    screen.setVisible(true);
    screen.activateTriggers(array);
    screen.newGame(array);
  }
}