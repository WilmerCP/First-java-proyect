import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;

public class Acepto extends JFrame implements ActionListener, ChangeListener{

 private JLabel imagen, label1;
 private JScrollPane pane1;
 private JTextArea terminos;
 private JCheckBox checkbox1;
 public static String nombre1 = "";
 private JButton boton1, boton2;

 public Acepto(){

  setLayout(null);
  getContentPane().setBackground(new Color(160,170,190));
  ImageIcon icono = new ImageIcon("images/icono.png");
  setIconImage(icono.getImage());
  setDefaultCloseOperation(EXIT_ON_CLOSE);

  Bienvenida objeto1 = new Bienvenida();
  nombre1 = objeto1.nombre;


  ImageIcon logo = new ImageIcon("images/logococa.png");

  imagen = new JLabel(logo);
  imagen.setBounds(410,260,150,150);
  add(imagen);
  
  label1 = new JLabel("Términos y Condiciones:");
  label1.setBounds(170,15,250,30);
  label1.setFont(new Font("Verdana", 1, 18)); 
  add(label1);

  terminos = new JTextArea();
  terminos.setEditable(false);
  pane1 = new JScrollPane(terminos);
  pane1.setBounds(70,60,440,200);
  terminos.setFont(new Font("Helvetica",1,12));
  add(pane1);

  terminos.setText("\n"+"     AL UTILIZAR ESTE SOFTWARE USTED DEBE ESTAR DE ACUERDO CON"+
  "\n"+"                          "+"LOS SIGUIENTES TÉRMINOS Y CONDICIONES:"+"\n"+
   "   1.Queda prohibida la reproducción parcial o completa de este material. \n"+
   "   2.El mal uso que pueda dar a la aplicación puede tener consecuencias"+"\n"+
   "      legales. "+"\n"+
   "   3.No nos hacemos responsables por muerte por asfixia o ahogamiento."+"\n"+
   "   4.Usted debe aceptar que, en efecto, el socialismo no funciona para"+"\n"+
   "      usar correctamente este programa."+"\n"+
   "   5.Se le pide no divulgar cualquier tipo de información interna de"+"\n"+
   "      la empresa."+"\n"+"\n"+
   "    AGRADECIMIENTOS ESPECIALES A LA GEEKIPEDIA DE ERNESTO POR"+"\n"+
   "                   SUS EXCELENTES CLASES DE PROGRAMACIÓN.");

  checkbox1 = new JCheckBox("Yo, "+nombre1+", acepto los Términos y Condiciones.");
  checkbox1.setBounds(20,275,370,30);
  checkbox1.setFont(new Font("Helvetica", 1, 15));
  checkbox1.setBackground(new Color(160,170,190));
  add(checkbox1);
  checkbox1.addChangeListener(this);

  boton1 = new JButton("Acepto");
  boton1.setBounds(30,330,140,50);
  boton1.setFont(new Font("Helvetica", 1, 15));
  boton1.setEnabled(false);
  add(boton1);
  boton1.addActionListener(this);

  boton2 = new JButton("No Acepto");
  boton2.setBounds(200,330,140,50);
  boton2.setFont(new Font("Helvetica", 1, 15));
  add(boton2);
  boton2.addActionListener(this);

 }

 public void actionPerformed(ActionEvent e){

  if(e.getSource() == boton1){
 
    Calculo ventanatres = new Calculo();
  ventanatres.setBounds(0,0,600,440);
  ventanatres.setLocationRelativeTo(null);
  ventanatres.setVisible(true);
  ventanatres.setResizable(false);
  this.setVisible(false);

   }else{  
    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,400,500);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setLocationRelativeTo(null);
    ventanabienvenida.setResizable(false); 

    this.setVisible(false);
   
  }
 }

 public void stateChanged(ChangeEvent e){
  
  if(checkbox1.isSelected() == true){
    boton1.setEnabled(true);
    boton2.setEnabled(false);
  }else{
    boton2.setEnabled(true);
    boton1.setEnabled(false);
  }

 }

 public static void main(String args[]){
  
  Acepto ventana2 = new Acepto();
  
  ventana2.setBounds(0,0,600,440);
  ventana2.setLocationRelativeTo(null);
  ventana2.setVisible(true);
  ventana2.setResizable(false);
  
 }

}