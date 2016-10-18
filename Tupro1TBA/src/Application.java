
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NANON
 */
public class Application {

    private String word = "";
    private int state = 0;
    private String type = "";
    private ArrayList<Word> wordList = new ArrayList();

    public void process(String stringinput) {
        for (int i = 0; i < stringinput.length(); i++) {
            switch (state) {
                case 0: {
                    if (stringinput.charAt(i) == ' ') {
                        word = "";
                        state = 0;
                        type = "";
                    } else if (stringinput.charAt(i) == 'p' || stringinput.charAt(i) == 'q' || stringinput.charAt(i) == 'r' || stringinput.charAt(i) == 's') {
                        word += stringinput.charAt(i);
                        state = 1;
                        type = "Operand";
                    } else if (stringinput.charAt(i) == 'n') {
                        word += stringinput.charAt(i);
                        state = 2;
                    } else if (stringinput.charAt(i) == 'a') {
                        word += stringinput.charAt(i);
                        state = 5;
                    } else if (stringinput.charAt(i) == 'o') {
                        word += stringinput.charAt(i);
                        state = 8;
                    } else if (stringinput.charAt(i) == 'x') {
                        word += stringinput.charAt(i);
                        state = 10;
                    } else if (stringinput.charAt(i) == 'i') {
                        word += stringinput.charAt(i);
                        state = 11;
                    } else if (stringinput.charAt(i) == 't') {
                        word += stringinput.charAt(i);
                        state = 13;
                    } else if (stringinput.charAt(i) == '(') {
                        word += stringinput.charAt(i);
                        state = 18;
                    } else if (stringinput.charAt(i) == ')') {
                        word += stringinput.charAt(i);
                        state = 19;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                        type = "ERROR!";
                    }
                    if (i == stringinput.length() - 1) {
                        wordList.add(new Word(word, type, state));
                    }
                }
                case 1: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, type, state));
                        word = "";
                        state = 0;
                        type = "";
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                        type = "ERROR!";
                    }
                    if (i == stringinput.length() - 1) {
                        wordList.add(new Word(word, type, state));
                    }
                }
                case 2: {
                    if(stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, type, state));
                        word = "";
                        state = 0;
                        type = "";
                    } else if(stringinput.charAt(i) == 'o') {
                        word += stringinput.charAt(i);
                        state = 3;
                        type = "Operator";
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                        type = "ERROR!";
                    }
                    if (i == stringinput.length() - 1) {
                        wordList.add(new Word(word, type, state));
                    }
                }
                case 3: {
                    if(stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, type, state));
                        word = "";
                        state = 0;
                        type = "";
                    } else if(stringinput.charAt(i) == 't') {
                        word += stringinput.charAt(i);
                        state = 4;
                        type = "Operator";
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                        type = "ERROR!";
                    }
                    if (i == stringinput.length() - 1) {
                        wordList.add(new Word(word, type, state));
                    }
                }
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
            }
        }
    }

    public ArrayList<Word> getWordList() {
        return wordList;
    }
}
