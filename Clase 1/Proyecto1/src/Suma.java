package Proyecto1.src;

import javax.swing.*;
import java.awt.event.*;

public class Suma extends JFrame implements ActionListener{

 private JTextField textfield1, textfield2;
 private JLabel label1, label2, label3;
 private JButton boton1;

 public Suma(){
  setLayout(null);

  label1 = new JLabel("Valor 1:");
  label1.setBounds(50,5,100,30);
  add(label1);

  label2 = new JLabel("Valor 2:");
  label2.setBounds(50,35,100,30);
  add(label2);

  label3 = new JLabel("Resultado:");
  label3.setBounds(120,80,100,30);
  add(label3);

  textfield1 = new JTextField();
  textfield1.setBounds(120,10,150,20);
  add(textfield1);

  textfield2 = new JTextField();  
  textfield2.setBounds(120,40,150,20);
  add(textfield2);

  boton1 = new JButton("Sumar");
  boton1.setBounds(10,80,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == boton1){
    double valor1 = 0.0, valor2 = 0.0, resultado = 0.0;
    
    valor1 = Double.parseDouble(textfield1.getText());
    valor2 = Double.parseDouble(textfield2.getText());

    resultado = valor1 + valor2;

    label3.setText("Resultado: " + resultado);
  }
 }

 public static void main(String args[]){
  Suma formulario1 = new Suma();
  formulario1.setBounds(0,0,300,150);
  formulario1.setVisible(true);
  formulario1.setResizable(false);
  formulario1.setLocationRelativeTo(null);
 }
}