/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examappconsole;

import java.util.Scanner;

/**
 *
 * @author Tsiyon
 */
public class OutputQuestion {
 public void output(){
     Scanner input = new Scanner(System.in);
     Shuffle shu = new Shuffle();
 String [][] sh = shu.Shuffler();
 int i,j;
 int correctAns=0;
 String ans="";
 for(i =0;i<5;i++){
     for(j=0;j<4;j++){
         if(j==0){
             System.out.print(i+1+" . ");
         }
         if(j==1){
            System.out.print("A. "); 
         }
         if(j==2){
            System.out.print("B. "); 
         }
         if(j==3){
            System.out.print("C. "); 
         }
         System.out.println(sh[j][i]);
         
     }
     System.out.print("\033[45m Answer?   ");
     ans = input.nextLine();
     if(ans.equalsIgnoreCase(sh[4][i])){
         correctAns++;
     }
     
         }
             System.out.println("\n\033[46m YOU GOT   "+correctAns+"s"
                     + " out of 5");

 }
 
}
