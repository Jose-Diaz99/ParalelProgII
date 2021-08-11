/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosProgII;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Sistemas11
 */
public class Componentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ejercicio03 ej3=new ejercicio03();
    }

    private static class ejercicio03 {

        public ejercicio03() {
            TextField micampoTexto=new  TextField("Texto inicial");
            micampoTexto.addActionListener(new MiActionListener(micampoTexto));
            
            Frame Frm=new Frame("Programaciòn II");
            Frm.setLayout(new FlowLayout());
            Frm.add(micampoTexto);
            Frm.setSize(250, 150);
            Frm.setVisible(true);
            
            Frm.addWindowListener(new Conclusion());
}

    private static class MiActionListener implements ActionListener {
        TextField oCampoTexto;
        public MiActionListener(TextField micampoTexto) {
            oCampoTexto=micampoTexto;
        }

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Texto Seleccionado: "+oCampoTexto.getSelectedText());
                System.out.println("Texto Completo: "+oCampoTexto.getText());
            }
        }
    
    private static class Conclusion extends WindowAdapter{
        public void WindowClosing (WindowEvent evt){
            System.exit(0);
        }
    }
    }
    }
