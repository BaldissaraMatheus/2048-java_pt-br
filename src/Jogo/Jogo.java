package Jogo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Jogo extends JFrame{
    
//Criando Componentes
    JLabel Fundo;
    JLabel score;
    JLabel Best;
    JLabel eggLabel;
    JLabel msg;
       
    JLabel P00;
    JLabel P01;
    JLabel P02;
    JLabel P03;
    JLabel P10;
    JLabel P11;
    JLabel P12;
    JLabel P13;
    JLabel P20;
    JLabel P21;
    JLabel P22;
    JLabel P23;
    JLabel P30;
    JLabel P31;
    JLabel P32;
    JLabel P33;    
       
    JLabel scoreText;
    JLabel BestText;
    JButton NewGame;
    
    JButton w;
    JButton s;
    JButton a;
    JButton d;   
    
    
    Font fonte = new Font("Arial",Font.BOLD, 25);
    Font fonteegg = new Font("Arial",Font.ITALIC, 25);
    
   int i=0; int j=0; int v=0; int l;
   int pontos=0; int best=0; int egg=0;
    
    
    Jogo(){                  
        getContentPane().setLayout(null);      
    }     
    
     public void inicializaComponentes(){         
         //Colocando Imagens
         
         P00 = new JLabel();
         P01 = new JLabel();
         P02 = new JLabel();
         P03 = new JLabel();
         P10 = new JLabel();
         P11 = new JLabel();
         P12 = new JLabel();
         P13 = new JLabel();
         P20 = new JLabel();
         P21 = new JLabel();
         P22 = new JLabel();
         P23 = new JLabel();
         P30 = new JLabel();
         P31 = new JLabel();
         P32 = new JLabel();
         P33 = new JLabel();
         
         P00.setBounds(65, 167, 200, 200);         
         P01.setBounds(186, 167, 200, 200);
         P02.setBounds(307, 167, 200, 200);
         P03.setBounds(428, 167, 200, 200);
         P10.setBounds(65, 289, 200, 200);
         P11.setBounds(186, 289, 200, 200);
         P12.setBounds(307, 289, 200, 200);
         P13.setBounds(428, 289, 200, 200);
         P20.setBounds(65, 411, 200, 200);
         P21.setBounds(186, 411, 200, 200);
         P22.setBounds(307, 411, 200, 200);
         P23.setBounds(428, 411, 200, 200);
         P30.setBounds(65, 532, 200, 200);
         P31.setBounds(186, 532, 200, 200);
         P32.setBounds(307, 532, 200, 200);
         P33.setBounds(428, 532, 200, 200);
                         
         add(P00);
         add(P01);
         add(P02);
         add(P03);
         add(P10);
         add(P11);
         add(P12);
         add(P13);
         add(P20);
         add(P21);
         add(P22);
         add(P23);
         add(P30);
         add(P31);
         add(P32);
         add(P33);
                  
         w = new JButton();
         s = new JButton();
         a = new JButton();
         d = new JButton();
         
         
         msg = new JLabel();        
         msg.setBounds(150, 670, 1000, 100);
         msg.setForeground(Color.white);
         msg.setFont(fonteegg);
         add(msg);
         
         Fundo = new JLabel();
         Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/Fundo.png")));
         Fundo.setBounds(50, 200, 500, 500);
         add(Fundo);
         
                                                                                              
         scoreText = new JLabel("0"); 
         scoreText.setHorizontalAlignment(JLabel.CENTER);
         scoreText.setForeground(Color.white);
         scoreText.setFont(fonte);
         scoreText.setBounds(361, 135, 80, 50);
         add(scoreText);
         
         BestText = new JLabel("0");
         BestText.setHorizontalAlignment(JLabel.CENTER);
         BestText.setForeground(Color.white);
         BestText.setFont(fonte);
         BestText.setBounds(447, 130, 100, 60);
         add(BestText);
         
         score = new JLabel();
         score.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/Score.png")));
         score.setBounds(360, 120, 100, 60);
         add(score);
         
         Best = new JLabel();
         Best.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/Best.png")));
         Best.setBounds(450, 120, 100, 60);
         add(Best);         
         
         NewGame = new JButton();
         NewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/New Game.png")));
         NewGame.setBounds(60, 135, 130, 40);
         add(NewGame);
         
         eggLabel = new JLabel();        
         eggLabel.setBounds(0, 0, 1000, 1000);
         add(eggLabel);
                  
         
         s = new JButton();
         add(s);                
     }
     
     public void vetor (int vet[][]){     
        //Vet[0][0]
        if (vet[0][0] == 2){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[0][0] == 4){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[0][0] == 8){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[0][0] == 16){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[0][0] == 32){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[0][0] == 64){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[0][0] == 128){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[0][0] == 256){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[0][0] == 512){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[0][0] == 1024){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[0][0] == 2048){
          P00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P00.setIcon(null);  
        } } } } } } } } } } } 
        
        //Vet[0][1]
        if (vet[0][1] == 2){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[0][1] == 4){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[0][1] == 8){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[0][1] == 16){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[0][1] == 32){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[0][1] == 64){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[0][1] == 128){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[0][1] == 256){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[0][1] == 512){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[0][1] == 1024){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[0][1] == 2048){
          P01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P01.setIcon(null);  
        } } } } } } } } } } }
        
        //Vet[0][2]
        if (vet[0][2] == 2){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[0][2] == 4){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[0][2] == 8){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[0][2] == 16){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[0][2] == 32){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[0][2] == 64){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[0][2] == 128){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[0][2] == 256){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[0][2] == 512){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[0][2] == 1024){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[0][2] == 2048){
          P02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P02.setIcon(null);   
        } } } } } } } } } } } 
        
       //Vet[0][3]
        if (vet[0][3] == 2){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[0][3] == 4){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[0][3] == 8){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[0][3] == 16){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[0][3] == 32){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[0][3] == 64){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[0][3] == 128){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[0][3] == 256){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[0][3] == 512){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[0][3] == 1024){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[0][3] == 2048){
          P03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P03.setIcon(null);   
        } } } } } } } } } } } 
        
        //Vet[1][0]
        if (vet[1][0] == 2){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[1][0] == 4){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[1][0] == 8){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[1][0] == 16){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[1][0] == 32){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[1][0] == 64){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[1][0] == 128){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[1][0] == 256){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[1][0] == 512){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[1][0] == 1024){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[1][0] == 2048){
          P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P10.setIcon(null);  
        } } } } } } } } } } } 
        
        //Vet[1][1]
        if (vet[1][1] == 2){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[1][1] == 4){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[1][1] == 8){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[1][1] == 16){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[1][1] == 32){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[1][1] == 64){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[1][1] == 128){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[1][1] == 256){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[1][1] == 512){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[1][1] == 1024){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[1][1] == 2048){
          P11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P11.setIcon(null);   
        } } } } } } } } } } } 
        
        //Vet[1][2]
        if (vet[1][2] == 2){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[1][2] == 4){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[1][2] == 8){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[1][2] == 16){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[1][2] == 32){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[1][2] == 64){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[1][2] == 128){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[1][2] == 256){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[1][2] == 512){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[1][2] == 1024){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[1][2] == 2048){
          P12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P12.setIcon(null);  
        } } } } } } } } } } } 
        
        //Vet[1][3]
        if (vet[1][3] == 2){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[1][3] == 4){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[1][3] == 8){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[1][3] == 16){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[1][3] == 32){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[1][3] == 64){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[1][3] == 128){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[1][3] == 256){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[1][3] == 512){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[1][3] == 1024){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[1][3] == 2048){
          P13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P13.setIcon(null);  
        } } } } } } } } } } } 
        
        //Vet[2][0]
        if (vet[2][0] == 2){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[2][0] == 4){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[2][0] == 8){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[2][0] == 16){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[2][0] == 32){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[2][0] == 64){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[2][0] == 128){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[2][0] == 256){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[2][0] == 512){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[2][0] == 1024){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[2][0] == 2048){
          P20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P20.setIcon(null); 
        } } } } } } } } } } } 
        
        //Vet[2][1]
        if (vet[2][1] == 2){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[2][1] == 4){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[2][1] == 8){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[2][1] == 16){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[2][1] == 32){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[2][1] == 64){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[2][1] == 128){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[2][1] == 256){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[2][1] == 512){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[2][1] == 1024){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[2][1] == 2048){
          P21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P21.setIcon(null); 
        } } } } } } } } } } } 
        
        //Vet[2][2]
        if (vet[2][2] == 2){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[2][2] == 4){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[2][2] == 8){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[2][2] == 16){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[2][2] == 32){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[2][2] == 64){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[2][2] == 128){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[2][2] == 256){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[2][2] == 512){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[2][2] == 1024){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[2][2] == 2048){
          P22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P22.setIcon(null); 
        } } } } } } } } } } } 
       
        //Vet[2][3]
        if (vet[2][3] == 2){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[2][3] == 4){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[2][3] == 8){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[2][3] == 16){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[2][3] == 32){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[2][3] == 64){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[2][3] == 128){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[2][3] == 256){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[2][3] == 512){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[2][3] == 1024){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[2][3] == 2048){
          P23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P23.setIcon(null);  
        } } } } } } } } } } } 
        
        //Vet[3][0]
        if (vet[3][0] == 2){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[3][0] == 4){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[3][0] == 8){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[3][0] == 16){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[3][0] == 32){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[3][0] == 64){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[3][0] == 128){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[3][0] == 256){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[3][0] == 512){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[3][0] == 1024){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[3][0] == 2048){
          P30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P30.setIcon(null); 
        } } } } } } } } } } } 
        
        //Vet[3][1]
        if (vet[3][1] == 2){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[3][1] == 4){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[3][1] == 8){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[3][1] == 16){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[3][1] == 32){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[3][1] == 64){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[3][1] == 128){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[3][1] == 256){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[3][1] == 512){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[3][1] == 1024){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[3][1] == 2048){
          P31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P31.setIcon(null); 
        } } } } } } } } } } }
        
        //Vet[3][2]
        if (vet[3][2] == 2){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[3][2] == 4){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[3][2] == 8){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[3][2] == 16){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[3][2] == 32){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[3][2] == 64){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[3][2] == 128){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[3][2] == 256){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[3][2] == 512){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[3][2] == 1024){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[3][2] == 2048){
          P32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P32.setIcon(null);  
        } } } } } } } } } } } 
        
        //Vet[3][3]
        if (vet[3][3] == 2){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2.png"))); 
        } else {
        if (vet[3][3] == 4){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/4.png")));        
        } else {
        if (vet[3][3] == 8){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/8.png")));
        } else {
        if (vet[3][3] == 16){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/16.png")));
        } else {
        if (vet[3][3] == 32){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/32.png")));
        } else {
        if (vet[3][3] == 64){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/64.png")));
        } else {
        if (vet[3][3] == 128){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/128.png")));
        } else {
        if (vet[3][3] == 256){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/256.png")));
        } else {
        if (vet[3][3] == 512){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/512.png")));
        } else {
        if (vet[3][3] == 1024){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/1024.png")));
        } else {
        if (vet[3][3] == 2048){
          P33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/2048.png")));
          } else {
          P33.setIcon(null);  
        } } } } } } } } } } } 
                
  }
     
     public void newgame(int vet[][]){
         int x; int x1; int x2; int y1=0; int y2=0; int v=0;
        
        x1 = (int)(4*Math.random());
        x2 = (int)(4*Math.random());
        
        x = (int)(1+3*Math.random());
        if (x<3){x=2;}else{x=4;}
                
        vet[x1][x2] = x;
        
        
        while (v==0){
        y1 = (int)(0+3*Math.random());
        y2 = (int)(0+3*Math.random());
        if(y1!=x1 && y2==x2||y1==x1 && y2!=x2||y1!=x1 && y2!=x2){
           v=1; 
       } }
        
        x = (int)(1+3*Math.random());
        if (x<3){x=2;}else{x=4;}
        
        vet[y1][y2] = x;
        pontos = 0;
        scoreText.setText(String.valueOf(pontos));
        egg=0;
     }
     
     public void verbest(){
      if (pontos>best){
          best=pontos;
          BestText.setText(String.valueOf(best));
      }   
     }
     
     
   void w1(int vet[][]){
i=0;j=0;
while (i<3){j=0;
while (j<=3){ 
if (vet[2][j]==0 && vet[3][j]!=0) {
vet[2][j] = vet[3][j];
vet[3][j] = 0;
v=1;
}  
if ( vet[0][j]==0 && vet[1][j]!=0) {
vet[0][j] = vet[1][j];
vet[1][j] = 0;
v=1;
} 
    if ( vet[1][j]==0 && vet[2][j]!=0) {
vet[1][j] = vet[2][j];
vet[2][j] = 0;
v=1;
   } 
j = j+1;
} i = i+1;
   }
   }
      
   void w2(int vet[][]){       
       i=0;j=0;
while (i<=2) {
 while (j<=3) {
if (vet[i][j] != 0) {
if (vet[i][j] == vet[i+1][j]) {
vet[i][j] = (vet[i][j]*2);
vet[i+1][j] = 0;
pontos=pontos+(int)vet[i][j];
v=1;
}
} j=j+1;
} i=i+1; j=0;  
   } }
   
   
   void s1(int vet[][]){
i=0;j=0;
while (i<3){j=0;
while (j<=3){ 
if (vet[3][j]==0 && vet[2][j]!=0) {
vet[3][j] = vet[2][j];
vet[2][j] = 0;
v=1;
} 
if ( vet[1][j]==0 && vet[0][j]!=0) {
vet[1][j] = vet[0][j];
vet[0][j] = 0;
v=1;
} 
    if ( vet[2][j]==0 && vet[1][j]!=0) {
vet[2][j] = vet[1][j];
vet[1][j] = 0;
v=1;
   } 
j = j+1;
} i = i+1;
   }
   }
      
   void s2(int vet[][]){       
       i=3;j=0;
while (i>=1) {
 while (j<=3) {
if (vet[i][j] != 0) {
if (vet[i][j] == vet[i-1][j]) {
vet[i][j] = (vet[i][j]*2);
vet[i-1][j] = 0;

pontos=pontos+vet[i][j];
v=1;
}
} j=j+1;
} i=i-1; j=0;  
   } }
   
   
   void d1(int vet[][]){
i=0;j=0;
while (j<3){i=0;
while (i<=3){ 
if (vet[i][3]==0 && vet[i][2]!=0) {
vet[i][3] = vet[i][2];
vet[i][2] = 0;
v=1;
} 
if ( vet[i][2]==0 && vet[i][1]!=0) {
vet[i][2] = vet[i][1];
vet[i][1] = 0;
v=1;
} 
    if ( vet[i][1]==0 && vet[i][0]!=0) {
vet[i][1] = vet[i][0];
vet[i][0] = 0;
v=1;
   } 
i = i+1;
} j = j+1;
   }
   }
      
   void d2(int vet[][]){       
       j=3;i=0;
while (j>=1) {
 while (i<=3) {
if (vet[i][j] != 0) {
if (vet[i][j] == vet[i][j-1]) {
vet[i][j] = (vet[i][j]*2);
vet[i][j-1] = 0;
pontos=pontos+vet[i][j];
v=1;
}
} i=i+1;
} j=j-1; i=0;  
   } }
   
   
   void a1(int vet[][]){
i=0;j=0;
while (j<3){i=0;
while (i<=3){ 
if (vet[i][2]==0 && vet[i][3]!=0) {
vet[i][2] = vet[i][3];
vet[i][3] = 0;
v=1;
} 
if ( vet[i][0]==0 && vet[i][1]!=0) {
vet[i][0] = vet[i][1];
vet[i][1] = 0;
v=1;
} 
    if ( vet[i][1]==0 && vet[i][2]!=0) {
vet[i][1] = vet[i][2];
vet[i][2] = 0;
v=1;
   } 
i = i+1;
} j = j+1;
   }
   }
      
   void a2(int vet[][]){       
       j=0;i=0;
while (j<=2) {
 while (i<=3) {
if (vet[i][j] != 0) {
if (vet[i][j] == vet[i][j+1]) {
vet[i][j] = (vet[i][j]*2);
vet[i][j+1] = 0;
pontos=pontos+vet[i][j];
v=1;
}
} i=i+1;
} j=j+1; i=0;  
   } }  
   
   
   //Randonizando Posições
   void addp (int vet[][]){
       if (vet[0][0]==0||vet[0][1]==0||vet[0][2]==0||vet[0][3]==0||
           vet[1][0]==0||vet[1][1]==0||vet[1][2]==0||vet[1][3]==0||
           vet[2][0]==0||vet[2][1]==0||vet[2][2]==0||vet[2][3]==0||
           vet[3][0]==0||vet[3][1]==0||vet[3][2]==0||vet[3][3]==0){
   int d=0; int x; int y; int i;
   i= (int)(1+3*Math.random());
        if (i<3){i=2;}else{i=4;}
   while (d==0){
   x=(int)(4*Math.random());
   y=(int)(4*Math.random());
   if (vet[x][y]==0){
      vet[x][y]=i;
      d=1;
   }
   }                        
       } 
   }
   
    
      
     
     public void tratarEventos(final int vet[][]){ 
         s.addKeyListener(new KeyAdapter() {           
        @Override
        public void keyPressed( KeyEvent e) {            
        if (e.getKeyCode() == KeyEvent.VK_UP){
            if (l==1){
            msg.setText("");
            l=2;
            }
            if (egg==0){
                egg=1;
            } else if(egg==1){
                egg=2;
            } else{
                egg=1000;
            }
          w1(vet);w2(vet);w1(vet);if(v==1){addp(vet);v=0;}scoreText.setText(String.valueOf(pontos));verbest();vetor(vet);          
          } else if(e.getKeyCode() == KeyEvent.VK_DOWN){  
              if (l==1){
            msg.setText("");
            l=2;
            }
            if (egg==2){
                egg=3;
            } else if(egg==3){
                egg=4;
            } else{
                egg=1000;
            }     
          s1(vet);s2(vet);s1(vet);if(v==1){addp(vet);v=0;}scoreText.setText(String.valueOf(pontos));verbest();vetor(vet);    
          }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
              if (l==1){
            msg.setText("");
            l=2;
            }
              if (egg==4){
                egg=5;
            } else if(egg==6){
                egg=7;
            } else{
                egg=1000;
            }
              
          a1(vet);a2(vet);a1(vet);if(v==1){addp(vet);v=0;}scoreText.setText(String.valueOf(pontos));verbest();vetor(vet);    
          }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
              if (l==1){
            msg.setText("");
            l=2;
            }
              if (egg==5){
                egg=6;
            } else if(egg==7){
                egg=8;
            } else{
                egg=1000;
            }  
          d1(vet);d2(vet);d1(vet);if(v==1){addp(vet);v=0;}scoreText.setText(String.valueOf(pontos));verbest();vetor(vet);    
          }else if(e.getKeyCode() == KeyEvent.VK_B){
             if (egg==8){
                egg=9;
             } else {
                 egg=1000;
             }
          }else if(e.getKeyCode() == KeyEvent.VK_A){
              if (egg==9){
                  l=1;
                eggLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jogo/recursos/egg.png")));                
                add(eggLabel);
                msg.setText("Isto não é um Easter Egg");                                
              } else {                                   
                  egg=1000;
              }
          }
     }
         } );
         
         
          NewGame.addActionListener((ActionEvent e) -> {
              i=0;
              while (i<=3){ j=0;
              while (j<=3){
                  vet[i][j] = 0;
                  j = j+1;
              }i = i+1;}
              newgame(vet);
              vetor(vet);
              NewGame.setFocusable(false);
         });                
                 }
            
     
     
    public static void main(String[] args) {
        
    int vet[][] = new int[4][4];     
    
    
//Montando a Janela      
  Jogo tela = new Jogo();
  tela.inicializaComponentes();
  tela.setTitle("2048");
  tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  tela.setSize(1010,1010);
  tela.setBounds(500,500,600,785);
  Dimension teletela = Toolkit.getDefaultToolkit().getScreenSize();
  tela.setLocation((teletela.width-tela.getSize().width)/2, (teletela.height-tela.getSize().height)/2);
  tela.setResizable(false);
  tela.setVisible(true);
  tela.tratarEventos(vet);
  tela.newgame(vet);
  tela.vetor(vet);
  
  
    }
 
}