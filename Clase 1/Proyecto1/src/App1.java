import javax.swing.*;

public class App1 extends JFrame{
  private JLabel label1;
 
  public App1(){
   setLayout(null);
   label1 = new JLabel("La Geekipedia de Ernesto");
   label1.setBounds(10,20,200,300);
   add(label1);
  }

  public static void main(String args[]){
   App1 formulario1 = new App1();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
  }
}