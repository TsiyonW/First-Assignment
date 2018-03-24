/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examappconsole;

/**
 *
 * @author Tsiyon
 */
public class Shuffle {
    
      public  String [][] Shuffler(){
          
          ReadQuestion readQuestion  = new ReadQuestion();
          String s [][] =readQuestion.returnQuestions();
          int [] shuffle = new int[5];
  for(int i = 0; i< shuffle.length; i++){
            int index =(int)(Math.random() * shuffle.length);
           
            String temp = s[0][i];
            String temp1 = s[1][i];
            String temp2 = s[2][i];
            String temp3 = s[3][i];
            String temp4 = s[4][i];
            s[0][i] = s[0][index];
           s[1][i] = s[1][index];
           s[2][i] = s[2][index];
           s[3][i] = s[3][index];
           s[4][i] = s[4][index];
           s[0][index] = temp;
           s[1][index] = temp1;
           s[2][index] = temp2;
           
           s[3][index] = temp3;
           s[4][index] = temp4;
           
            }   
    return s;
      }
      
}


