package Proyecto1.src;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener, ItemListener, ChangeListener{
  
  private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
  private JButton botonc, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8;
  private JTextField textfield1, textfield2, textfield3;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3;
  private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6, menuitem7;
  private JComboBox<String> combo1, combo2, combo3, combo4;
  private JCheckBox check1, check2, check3, check4;
  private JRadioButton radio1, radio2, radio3;
  private ButtonGroup bg;
  String texto = "";
  String texto2 = "";
  String seleccion = "";
  
  public Formulario(){
    
    setLayout(null);
    
    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menu2 = new JMenu("Tamaño de la ventana");
    menu1.add(menu2);

    menu3 = new JMenu("Color de fondo");
    menu1.add(menu3);

    menuitem1 = new JMenuItem("300*200");
    menu2.add(menuitem1);
    menuitem1.addActionListener(this);
  
    menuitem2 = new JMenuItem("640*480");
    menu2.add(menuitem2);
    menuitem2.addActionListener(this);

    menuitem3 = new JMenuItem("800*600");
    menu2.add(menuitem3);
    menuitem3.addActionListener(this);

    menuitem4 = new JMenuItem("1024*768");
    menu2.add(menuitem4);
    menuitem4.addActionListener(this);

    menuitem5 = new JMenuItem("Rojo");
    menu3.add(menuitem5);
    menuitem5.addActionListener(this);

    menuitem6 = new JMenuItem("Verde");
    menu3.add(menuitem6);
    menuitem6.addActionListener(this);

    menuitem7 = new JMenuItem("Azul");
    menu3.add(menuitem7);
    menuitem7.addActionListener(this);

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

    label11 = new JLabel("Aceptar terminos y condiciones");
    label11.setBounds(10,10,400,30);
    add(label11);
    
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

    boton8 = new JButton("Continuar");
    boton8.setBounds(10,480,100,30);
    add(boton8);
    boton8.addActionListener(this);
    boton8.setEnabled(false);

    botonc = new JButton("Cerrar");
    botonc.setBounds(235,250,100,30);
    add(botonc);
    botonc.addActionListener(this);

    bg = new ButtonGroup();

    radio1 = new JRadioButton("640*480");
    radio1.setBounds(200,300,100,30);
    radio1.addChangeListener(this);
    add(radio1);
    bg.add(radio1);

    radio2 = new JRadioButton("800*600");
    radio2.setBounds(200,340,100,30);
    radio2.addChangeListener(this);
    add(radio2);
    bg.add(radio2);

    radio3 = new JRadioButton("1024*768");
    radio3.setBounds(200,380,100,30);
    radio3.addChangeListener(this);
    add(radio3);
    bg.add(radio3);

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

    check1 = new JCheckBox("Inglés");
    check1.setBounds(10,350,150,30);
    check1.addChangeListener(this);
    add(check1);

    check2 = new JCheckBox("Francés");
    check2.setBounds(10,390,150,30);
    check2.addChangeListener(this);
    add(check2);

    check3 = new JCheckBox("Alemán");
    check3.setBounds(10,430,150,30);
    check3.addChangeListener(this);
    add(check3);

    check4 = new JCheckBox("Acepto");
    check4.setBounds(10,520,100,30);
    check4.addChangeListener(this);
    add(check4);
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
      texto = textfield1.getText();
      setTitle(texto);
    }
    if(e.getSource() == boton5){
      texto2 += textfield1.getText() + "\n";
      textarea1.setText(texto2);
      textfield1.setText("");
    }
    if(e.getSource() == menuitem1){
      setSize(300,200);
    }
    if(e.getSource() == menuitem2){
      setSize(640,480);
    }
    if(e.getSource() == menuitem3){
      setSize(800,600);
    }
    if(e.getSource() == menuitem4){
      setSize(1024,768);
    }
    if(e.getSource() == menuitem5){
      getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == menuitem6){
      getContentPane().setBackground(new Color(0,255,0));
    }
    if(e.getSource() == menuitem7){
      getContentPane().setBackground(new Color(0,0,255));
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
    if(e.getSource() == boton8){
      System.exit(0);
    }
  }

  public void itemStateChanged(ItemEvent s){
    
    if(s.getSource() == combo1){
      seleccion = combo1.getSelectedItem().toString();
      setTitle(seleccion);
    }
  } 

  public void stateChanged(ChangeEvent t){
    
    String cad="";

    if(check1.isSelected() == true){
      cad = cad + "Inglés-";
    }
    if(check2.isSelected() == true){
      cad = cad + "Francés-";
    }
    if(check3.isSelected() == true){
      cad = cad + "Alemán-";
    }
    setTitle("Hola " + texto + " tu eleccion es " + seleccion + " idioma/s " + cad);
    if(check4.isSelected() == true){
      boton8.setEnabled(true);
   } else {
      boton8.setEnabled(false);
   }
   if(radio1.isSelected()){
    setSize(640,480);
    }
    if(radio2.isSelected()){
        setSize(800,600);
    }
    if(radio3.isSelected()){
        setSize(1024,768);
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