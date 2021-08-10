package Proyecto1.src;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener, ItemListener{
  
  private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
  private JButton botonc, boton1, boton2, boton3, boton4, boton5, boton6, boton7;
  private JTextField textfield1, textfield2, textfield3;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JMenuBar menubar;
  private JMenu menu1;
  private JMenuItem menuitem1, menuitem2, menuitem3;
  private JComboBox<String> combo1, combo2, combo3, combo4;
  String texto = "";
  String texto2 = "";
  String seleccion = "";

  public Formulario(){
    
    setLayout(null);
    
    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menuitem1 = new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("Verde");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Azul");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);

    label1 = new JLabel("Interfaz gráfica.");
    label1.setBounds(800,0,300,30);
    add(label1);
    
    label2 = new JLabel("Versión 1.0");
    label2.setBounds(900,0,300,30);
    add(label2);
    
    label3 = new JLabel("Usuario:");
    label3.setBounds(670,20,300,30);
    add(label3);
    
    label4 = new JLabel("");
    label4.setBounds(640,0,300,30);
    add(label4);

    label5 = new JLabel("Rojo:");
    label5.setBounds(10,10,100,30);
    add(label5);

    label6 = new JLabel("Verde:");
    label6.setBounds(10,50,100,30);
    add(label6);

    label7 = new JLabel("Azul:");
    label7.setBounds(10,90,100,30);
    add(label7);

    label8 = new JLabel("Valor 1:");
    label8.setBounds(670,170,100,30);
    add(label8);

    label9 = new JLabel("Valor 2:");
    label9.setBounds(670,200,100,30);
    add(label9);

    label10 = new JLabel("Resultado:");
    label10.setBounds(790,230,100,30);
    add(label10);
    
    textfield1 = new JTextField();
    textfield1.setBounds(670,45,300,30);
    add(textfield1);

    textfield2 = new JTextField();
    textfield2.setBounds(730,175,150,20);
    add(textfield2);

    textfield3 = new JTextField();  
    textfield3.setBounds(730,205,150,20);
    add(textfield3);
    
    boton1 = new JButton("1");
    boton1.setBounds(10,200,100,30);
    add(boton1);
    boton1.addActionListener(this);
    
    boton2 = new JButton("2");
    boton2.setBounds(125,200,100,30);
    add(boton2);
    boton2.addActionListener(this);
    
    boton3 = new JButton("3");
    boton3.setBounds(235,200,100,30);
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

    boton6 = new JButton("Fijar color");
    boton6.setBounds(10,130,100,30);
    add(boton6);
    boton6.addActionListener(this);

    boton7 = new JButton("Sumar");
    boton7.setBounds(670,230,100,30);
    add(boton7);
    boton7.addActionListener(this);

    botonc = new JButton("Cerrar");
    botonc.setBounds(235,250,100,30);
    add(botonc);
    botonc.addActionListener(this);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(670,85,300,80);
    add(scrollpane1);

    combo1 = new JComboBox<String>();
    combo1.setBounds(10,300,80,20);
    add(combo1);

    combo1.addItem("rojo");
    combo1.addItem("verde");
    combo1.addItem("azul");
    combo1.addItem("amarillo");
    combo1.addItem("negro");
    combo1.addItemListener(this);

    combo2 = new JComboBox<String>();
    combo2.setBounds(80,10,100,30);
    for(int i = 0; i<=255; i++){
      combo2.addItem(String.valueOf(i));
    }
    add(combo2);

    combo3 = new JComboBox<String>();
    combo3.setBounds(80,50,100,30);
    for(int i = 0; i<=255; i++){
      combo3.addItem(String.valueOf(i));
    }
    add(combo3);

    combo4 = new JComboBox<String>();
    combo4.setBounds(80,90,100,30);
    for(int i = 0; i<=255; i++){
      combo4.addItem(String.valueOf(i));
    }
    add(combo4);
  }
  public void actionPerformed(ActionEvent e){
  
    Container fondo = this.getContentPane();

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
      texto = textfield1.getText();
      setTitle("Hola: " + texto + " tu eleccion es: " + seleccion);
    }
    if(e.getSource() == boton5){
      texto2 += textfield1.getText() + "\n";
      textarea1.setText(texto2);
      textfield1.setText("");
    }
    if(e.getSource() == menuitem1){
      fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem2){
      fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem3){
      fondo.setBackground(new Color(0,0,255));
    }
    if(e.getSource() == boton6){
      String cad1 = combo2.getSelectedItem().toString();
      String cad2 = combo3.getSelectedItem().toString();
      String cad3 = combo4.getSelectedItem().toString();
  
      int rojo = Integer.parseInt(cad1);
      int verde = Integer.parseInt(cad2);
      int azul = Integer.parseInt(cad3);
  
      Color color1 = new Color(rojo,verde,azul);
      boton6.setBackground(color1);
    }
    if(e.getSource() == boton7){
      
      double valor1 = 0.0, valor2 = 0.0, resultado = 0.0;
      valor1 = Double.parseDouble(textfield2.getText());
      valor2 = Double.parseDouble(textfield3.getText());
      resultado = valor1 + valor2;
      label10.setText("Resultado: " + resultado);
    }
  }  
  public void itemStateChanged(ItemEvent s){
    
    if(s.getSource() == combo1){
      seleccion = combo1.getSelectedItem().toString();
      setTitle("Hola: " + texto + " tu eleccion es: " + seleccion);
    }
  }    
  public static void main(String args[]){
    
    Formulario formulario1 = new Formulario();
    formulario1.setBounds(0,0,1000,700);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
  }
}