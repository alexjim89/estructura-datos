package Proyecto1.src;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  
  private JLabel label1, label2, label3, label4;
  private JButton botonc, boton1, boton2, boton3, boton4, boton5;
  private JTextField textfield1;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  String texto2 = "";

  public Formulario(){
    
    setLayout(null);
    
    label1 = new JLabel("Interfaz gráfica.");
    label1.setBounds(200,0,300,30);
    add(label1);
    
    label2 = new JLabel("Versión 1.0");
    label2.setBounds(300,0,300,30);
    add(label2);
    
    label3 = new JLabel("Usuario:");
    label3.setBounds(10,20,300,30);
    add(label3);
    
    label4 = new JLabel("");
    label4.setBounds(10,0,300,30);
    add(label4);
    
    textfield1 = new JTextField();
    textfield1.setBounds(10,45,300,30);
    add(textfield1);
    
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
    boton4.setBounds(10,250,100,30);
    add(boton4);
    boton4.addActionListener(this);

    boton5 = new JButton("Agregar");
    boton5.setBounds(125,250,100,30);
    add(boton5);
    boton5.addActionListener(this);

    botonc = new JButton("Cerrar");
    botonc.setBounds(235,250,100,30);
    add(botonc);
    botonc.addActionListener(this);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,85,300,80);
    add(scrollpane1);
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == botonc){
     System.exit(0);
   }
   if(e.getSource() == boton1){
      label4.setText("Has presionado el botón 1");
    }
    if(e.getSource() == boton2){
      label4.setText("Has presionado el botón 2");
    }
    if(e.getSource() == boton3){
      label4.setText("Has presionado el botón 3");
    }
    if(e.getSource() == boton4){
      String texto = textfield1.getText();
      setTitle("Hola: " + texto);
     }
    if(e.getSource() == boton5){
      texto2 += textfield1.getText() + "\n";
      textarea1.setText(texto2);
      textfield1.setText("");
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