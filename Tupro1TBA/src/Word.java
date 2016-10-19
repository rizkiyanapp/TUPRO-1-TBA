/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANON
 */
public class Word {

    private String word;
    private String type;
    private int state;
    private int tokenLexic;

    public Word(String word, int state) {
        this.word = word;
        this.type = type;
        this.state = state;

        switch (state) {
            case 1: this.tokenLexic = 1; this.type = "Operand"; break;
            case 4: this.tokenLexic = 2; this.type = "Operator"; break;
            case 7: this.tokenLexic = 3; this.type = "Operator"; break;
            case 9: {
                if(word.length() == 3) { this.tokenLexic = 5; this.type = "Operator";}
                else if(word.length() == 2) {this.tokenLexic = 4; this.type = "Operator";}
                break;
            }
            case 12 : this.tokenLexic = 6; this.type = "Operator"; break;
            case 16 : this.tokenLexic = 7; this.type = "Operator"; break;
            case 17 : this.tokenLexic = 8; this.type = "Operator"; break;
            case 18 : this.tokenLexic = 9; this.type = "Grouping"; break;
            case 19 : this.tokenLexic = 10; this.type = "Grouping"; break;
            default : this.tokenLexic = 0; this.type = "ERROR!"; break;
        }
    }

    public int getTokenLexic() {
        return tokenLexic;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

}
