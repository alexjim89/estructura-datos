package src;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  private JLabel label1, label2, label3;
  JButton botonc, boton1, boton2, boton3, boton4;
  private JTextField textfield1;
  public Formulario(){
    setLayout(null);
    label1 = new JLabel("Interfaz gráfica.");
    label1.setBounds(10,20,300,30);
    add(label1);
    label2 = new JLabel("Versión 1.0");
    label2.setBounds(100,20,300,30);
    add(label2);
    label3 = new JLabel("Usuario:");
    label3.setBounds(10,30,300,30);
    add(label3);
    textfield1 = new JTextField();
    textfield1.setBounds(10,40,300,30);
    add(textfield1);
    botonc = new JButton("Cerrar");
    botonc.setBounds(150,250,100,30);
    add(botonc);
    botonc.addActionListener(this);
    boton1 = new JButton("1");
    boton1.setBounds(25,200,100,30);
    add(boton1);
    boton1.addActionListener(this);
    boton2 = new JButton("2");
    boton2.setBounds(150,200,100,30);
    add(boton2);
    boton2.addActionListener(this);
    boton3 = new JButton("3");
    boton3.setBounds(275,200,100,30);
    add(boton3);
    boton3.addActionListener(this);
    boton4 = new JButton("Aceptar");
    boton4.setBounds(50,250,100,30);
    add(boton4);
    boton4.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == botonc){
     System.exit(0);
   }
   if(e.getSource() == boton1){
    label1.setText("Has presionado el botón 1");
    }
    if(e.getSource() == boton2){
      label1.setText("Has presionado el botón 2");
    }
    if(e.getSource() == boton3){
      label1.setText("Has presionado el botón 3");
    }
    if(e.getSource() == boton4){
      String texto = textfield1.getText();
      setTitle(texto);
     }
  }
  public static void main(String args[]){
  Formulario formulario1 = new Formulario();
  formulario1.setBounds(0,0,400,350);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
  }
}