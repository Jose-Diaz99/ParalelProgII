/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosProgII;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Sistemas11
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Imenu ej4=new Imenu();
    }

    private static class Imenu {

        public Imenu() {
            MenuShortcut miAcelerador=new MenuShortcut(KeyEvent.VK_R,true);
            
            MenuItem primerElementoDeA=new MenuItem("Primer elemento del menu A",miAcelerador);
            MenuItem segundoElementoDeA=new MenuItem("Segundo elemento del menu a");
            MenuItem primerElementoDeB=new MenuItem("primer elemento del menu B");
            MenuItem segundoElementoDeB=new MenuItem("segundo elemento del menu B");
            MenuItem TercerElementoDeB=new MenuItem("Tercer elemento del menu B");
            
            Menu menuA=new Menu("Menu A");
            menuA.add(primerElementoDeA);
            menuA.add(segundoElementoDeA);
            
            Menu menuB=new Menu("Menu B");
            menuB.add(primerElementoDeB);
            menuB.add(segundoElementoDeB);
            menuB.add(TercerElementoDeB);
            
            MenuBar menuBar=new MenuBar();
            menuBar.add(menuA);
            menuBar.add(menuB);
            
            Frame frm=new Frame("Programación II");
            frm.setMenuBar(menuBar);
            frm.setSize(250, 100);
            frm.setVisible(true);
            
            frm.addWindowListener(new conclusion());
        }
        
    }

    class MigestorMenu implements ActionListener{
        
        

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getSource());
        }
        
    }
    
    public static class conclusion extends WindowAdapter{
        public void WindowClosing (WindowEvent evt){
            System.exit(0);
        }
    }
    
}
