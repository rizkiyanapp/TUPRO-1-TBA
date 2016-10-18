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

    public Word(String word, String type, int state) {
        this.word = word;
        this.type = type;
        this.state = state;

        switch (state) {
            case 1: tokenLexic = 1;
            case 4: tokenLexic = 2;
            case 7: tokenLexic = 3;
            case 9: {
                if(word.length() == 3) { tokenLexic = 5;}
                else if(word.length() == 2) {tokenLexic = 4;}
            }
            case 12 : tokenLexic = 6;
            case 16 : tokenLexic = 7;
            case 17 : tokenLexic = 8;
            case 18 : tokenLexic = 9;
            case 19 : tokenLexic = 10;
            default : tokenLexic = 0;
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
