/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANON
 */
public class mainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Controller controller = new Controller();

        Application model = new Application();
        String stringinput = "p and   q ore r";
        model.process(stringinput);
        for(Word w : model.getWordList()) {
            System.out.println("Word : " + w.getWord());
            System.out.println("Type : " + w.getType());
            System.out.println("State : " + w.getState());
            System.out.println("Token Lexic : " + w.getTokenLexic());
            System.out.println("");
        }
    }
    
}
