
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANON
 */
public class Controller extends MouseAdapter implements ActionListener{
    
    private Application model;
    private String stringinput;
    
    public Controller() {
        model = new Application();
        ViewGUI view = new ViewGUI();
        view.setVisible(true);
        view.addListener(this);
        view.addAdapter(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        ViewGUI view = new ViewGUI();
        if(source.equals(view.getBtnProcess())) {
            stringinput = view.getInputString();
            
        } else if(source.equals(view.getBtnReset())) {
            view.reset();
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        ViewGUI view = new ViewGUI();
        if(source.equals(view.getJTextFieldString())) {
            view.getJTextFieldString().setText("");
        } else {
            view.getJTextFieldString().setText("Type here ... ... ...");
        }
    }
    
}
