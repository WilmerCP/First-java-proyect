import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

 private JLabel label1, label2, label3, label4, imagen;
 private JTextField textfield1;
 private JButton boton1;
 public static String nombre = "";

 public Bienvenida(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  getContentPane().setBackground(new Color(224,30,20));

  ImageIcon icono = new ImageIcon("images/icono.png");

  setIconImage(icono.getImage());

  ImageIcon arte = new ImageIcon("images/logouno.png");
  imagen = new JLabel(arte);
  imagen.setBounds(25,10,350,175);
  add(imagen);  

  label1 = new JLabel("Te damos la Bienvenida");
  label1.setBounds(94,175,200,30);
  label1.setFont(new Font("Verdana", 1, 15));
  label1.setForeground(new Color(0,0,0));
  add(label1);

  label2 = new JLabel("al Sistema de Control Vacacional");
  label2.setBounds(59,195,290,30);
  label2.setFont(new Font("Verdana", 1, 15));
  label2.setForeground(new Color(0,0,0));
  add(label2);

  label3 = new JLabel("Ingresa tu nombre:");
  label3.setBounds(122,240,200,20);
  label3.setForeground(new Color(0,0,0));
  label3.setFont(new Font("Helvetica", 1, 14));
  add(label3);

  textfield1 = new JTextField();
  textfield1.setBounds(84,270,220,30);
  add(textfield1);

  boton1 = new JButton("Siguiente");
  boton1.setBounds(135,320,120,50);
  boton1.setFont(new Font("Verdana", 1, 14));
  boton1.addActionListener(this);
  add(boton1);

  label4 = new JLabel("©2020 The Coca-Cola Company. Todos los derechos reservados.");
  label4.setBounds(12,445,370,20);
  label4.setFont(new Font("Helvetica", 1, 12));
  label4.setForeground(new Color(255,255,255));
  add(label4);

 }


 public void actionPerformed(ActionEvent e){

 if(e.getSource() == boton1){

   nombre = textfield1.getText().trim();

   if(nombre.equals("") == true){
     JOptionPane.showMessageDialog(null,"Debes ingresar tu nombre.","Que gafo", JOptionPane.WARNING_MESSAGE);
   }else{
       
      Acepto ventanaacepto = new Acepto();

    ventanaacepto.setBounds(0,0,600,440);
    ventanaacepto.setLocationRelativeTo(null);
    ventanaacepto.setVisible(true);
    ventanaacepto.setResizable(false);
     
    this.setVisible(false); 
   }

  }

 }


 public static void main(String args[]){

  Bienvenida ventana1 = new Bienvenida();
  ventana1.setBounds(0,0,400,500);
  ventana1.setVisible(true);
  ventana1.setLocationRelativeTo(null);
  ventana1.setResizable(false);


 }

}