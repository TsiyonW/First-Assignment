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
public class ExamAppConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReadQuestion rq = new ReadQuestion();
        //rq.returnQuestions();
        OutputQuestion oq = new OutputQuestion();
        oq.output();
    }
    
}
