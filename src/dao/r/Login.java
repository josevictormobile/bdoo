/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.r;

import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Login {
    private HashMap<String,String> login = new HashMap();
    private String senha;
    private String usuario;
    public void Logon() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a password:");
        JLabel label2 = new JLabel("Matricula: ");
        JPasswordField pass = new JPasswordField(10);
        JTextField nome = new JTextField(10);
        
        panel.add(label2);
        panel.add(nome);
        panel.add(label);
        panel.add(pass);
        
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "The title",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        char[] cifra = pass.getPassword();
        this.senha = new String(cifra);
        this.usuario = "bdoo_".concat(nome.getText());
        
        System.out.println(usuario+" "+senha);
    }
    
    public  String getUsuario(){
        return usuario;
    }
    
    public String getSenha(){
        return senha;
    }
}
