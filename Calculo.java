import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calculo extends JFrame implements ActionListener{

 private JLabel label1, imagen, label2, label3, label4, label5, label6;
 private JTextArea area1;
 private JTextField field1, field2;
 private String nombre;
 private JMenuBar barra;
 private JMenu menu1, menu2, menu3, menu4;
 private JMenuItem item1, item2, item3, item4, item5, item6, item7;
 private JRadioButton boton1, boton2, boton3, boton4, boton5, boton6;
 private ButtonGroup grupo, grupo2;
 private JComboBox combo1;
 private JScrollPane pane1;


 public Calculo(){
   
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  getContentPane().setBackground(new Color(224,30,20));

  ImageIcon iconito = new ImageIcon("images/icono.png");

  setIconImage(iconito.getImage());

  ImageIcon foto = new ImageIcon("images/logoblanco.png");

  Acepto objetoa = new Acepto();
  nombre = objetoa.nombre1;

  grupo2 = new ButtonGroup();

  barra = new JMenuBar();
  setJMenuBar(barra);

  menu1 = new JMenu("Opciones");
  barra.add(menu1);

  menu2 = new JMenu("Calcular");
  barra.add(menu2);

  menu3 = new JMenu("Acerca de");
  barra.add(menu3);

  menu4 = new JMenu("Color de Fondo");
  menu1.add(menu4);

  item1 = new JMenuItem("Rojo");
  menu4.add(item1);
  item1.addActionListener(this);

  item2 = new JMenuItem("Negro");
  menu4.add(item2);
  item2.addActionListener(this);

  item3 = new JMenuItem("Morado");
  menu4.add(item3);
  item3.addActionListener(this);

  item4 = new JMenuItem("Limpiar");
  menu1.add(item4);
  item4.addActionListener(this);

  item5 = new JMenuItem("Cerrar Sesión");
  menu1.add(item5);
  item5.addActionListener(this);

  item6 = new JMenuItem("Vacaciones");
  menu2.add(item6);
  item6.addActionListener(this);

  item7 = new JMenuItem("El Desarrollador");
  menu3.add(item7);
  item7.addActionListener(this);

  label1 = new JLabel(nombre);
  label1.setBounds(20,20,250,30);
  label1.setFont(new Font("Verdana", 1, 20));
  label1.setForeground(new Color(255,255,255));
  add(label1);

  imagen = new JLabel(foto);
  imagen.setBounds(10,290,200,100);
  add(imagen);

  label2 = new JLabel("Ingrese su nombre:");
  label2.setBounds(20,100,225,30);
  label2.setFont(new Font("Verdana", 1, 20));
  label2.setForeground(new Color(255,255,255));
  add(label2);

  field1 = new JTextField();
  field1.setBounds(20,150,220,40);
  field1.setFont(new Font("Verdana", 1, 14));
  field1.setForeground(new Color(0,0,0));
  add(field1);

  label3 = new JLabel("Ingrese su apellido:");
  label3.setBounds(20,205,225,30);
  label3.setFont(new Font("Verdana", 1, 20));
  label3.setForeground(new Color(255,255,255));
  add(label3);

  field2 = new JTextField();
  field2.setBounds(20,250,220,40);
  field2.setFont(new Font("Verdana", 1, 14));
  field2.setForeground(new Color(0,0,0));
  add(field2);

  label4 = new JLabel("Años de servicio:");
  label4.setBounds(260,40,225,30);
  label4.setFont(new Font("Verdana", 1, 20));
  label4.setForeground(new Color(255,255,255));
  add(label4);

  grupo = new ButtonGroup(); 

  boton1 = new JRadioButton("Menos de un año");
  grupo.add(boton1);
  boton1.setBounds(270,95,170,25);
  boton1.setFont(new Font("Verdana", 1, 15));
  boton1.setForeground(new Color(255,255,255));
  boton1.setBackground(new Color(224,30,20));
  add(boton1);

  boton2 = new JRadioButton("Mas de un año");
  grupo.add(boton2);
  boton2.setBounds(440,95,210,25);
  boton2.setFont(new Font("Verdana", 1, 15));
  boton2.setForeground(new Color(255,255,255));
  boton2.setBackground(new Color(224,30,20));
  add(boton2);

  boton3 = new JRadioButton("2 a 6 años");
  grupo.add(boton3);
  boton3.setBounds(270,140,120,25);
  boton3.setFont(new Font("Verdana", 1, 15));
  boton3.setForeground(new Color(255,255,255));
  boton3.setBackground(new Color(224,30,20));
  add(boton3);

  boton4 = new JRadioButton("A partir de 7 años");
  grupo.add(boton4);
  boton4.setBounds(410,140,210,25);
  boton4.setFont(new Font("Verdana", 1, 15));
  boton4.setForeground(new Color(255,255,255));
  boton4.setBackground(new Color(224,30,20));
  add(boton4);

  label5 = new JLabel("Departamento:");
  label5.setBounds(265,175,225,30);
  label5.setFont(new Font("Verdana", 1, 20));
  label5.setForeground(new Color(255,255,255));
  add(label5);

  combo1 = new JComboBox();
  combo1.setBounds(270,220,200,40);
  combo1.setFont(new Font("Verdana", 1, 16));
  combo1.setForeground(new Color(0,0,0));
  add(combo1);

  combo1.addItem("");
  combo1.addItem("Atención al Cliente");
  combo1.addItem("Logística");
  combo1.addItem("Gerencia");

  area1 = new JTextArea();
  pane1 = new JScrollPane(area1);
  area1.setEditable(false);
  area1.setFont(new Font("Helvetica", 1, 15));
  pane1.setBounds(260,270,315,100);
  add(pane1);

  label6 = new JLabel("Sexo:");
  label6.setBounds(480,170,80,30);
  label6.setFont(new Font("Verdana", 1, 18));
  label6.setForeground(new Color(255,255,255));
  add(label6);

  boton5 = new JRadioButton("Hombre");
  grupo2.add(boton5);
  boton5.setBounds(480,205,150,25);
  boton5.setFont(new Font("Verdana", 1, 15));
  boton5.setForeground(new Color(255,255,255));
  boton5.setBackground(new Color(224,30,20));
  add(boton5);

  boton6 = new JRadioButton("Mujer");
  grupo2.add(boton6);
  boton6.setBounds(480,230,150,25);
  boton6.setFont(new Font("Verdana", 1, 15));
  boton6.setForeground(new Color(255,255,255));
  boton6.setBackground(new Color(224,30,20));
  add(boton6);
 
 }

 public void actionPerformed(ActionEvent e){

  if(e.getSource() == item1){
    getContentPane().setBackground(new Color(224,30,20));
    boton1.setBackground(new Color(224,30,20));
    boton2.setBackground(new Color(224,30,20));
    boton3.setBackground(new Color(224,30,20));
    boton4.setBackground(new Color(224,30,20));
  }

  if(e.getSource() == item2){
    getContentPane().setBackground(new Color(0,0,0));
    boton1.setBackground(new Color(0,0,0));
    boton2.setBackground(new Color(0,0,0));
    boton3.setBackground(new Color(0,0,0));
    boton4.setBackground(new Color(0,0,0));
    boton5.setBackground(new Color(0,0,0));
    boton6.setBackground(new Color(0,0,0));
  }

  if(e.getSource() == item3){
    getContentPane().setBackground(new Color(80,0,255));
    boton1.setBackground(new Color(80,0,255));
    boton2.setBackground(new Color(80,0,255));
    boton3.setBackground(new Color(80,0,255));
    boton4.setBackground(new Color(80,0,255));
    boton5.setBackground(new Color(80,0,255));
    boton6.setBackground(new Color(80,0,255));
  }

  if(e.getSource() == item6){
   String nombres = field1.getText().trim();
   String apellidos = field2.getText().trim();
   int tiempo = 0;
   String depto = combo1.getSelectedItem().toString();
   int sexo = 3;
    if(boton1.isSelected()){
      tiempo = 0;
    }
    if(boton2.isSelected()){
      tiempo = 1;
    }
    if(boton3.isSelected()){
      tiempo = 2;
    }
    if(boton4.isSelected()){
      tiempo = 7;
    }
    if(boton5.isSelected()){
      sexo = 1;
    }
    if(boton6.isSelected()){
      sexo = 0;
    }

   if(depto.equals("") || nombres.equals("") || apellidos.equals("") || boton1.isSelected()==false && boton2.isSelected()==false &&
      boton3.isSelected()==false && boton4.isSelected()==false  || boton5.isSelected()==false && boton6.isSelected()==false){
    
    JOptionPane.showMessageDialog(null,"Debe llenar todos los campos","Que gafo", JOptionPane.WARNING_MESSAGE);

   }else{

   if(depto.equals("Atención al Cliente")){
    if(tiempo == 0){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" no le corresponden"+"\n"+"días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" no le corresponden"+"\n"+"días de vacaciones");
     }
    }
    if(tiempo == 1){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"6 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"6 días de vacaciones");
     }
    }
    if(tiempo == 2){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"14 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"14 días de vacaciones");
     }
    }
    if(tiempo == 7){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"20 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"20 días de vacaciones");
     }
    }

   }

   if(depto.equals("Logística")){
    if(tiempo == 0){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" no le corresponden"+"\n"+"días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" no le corresponden"+"\n"+"días de vacaciones");
     }
    }
    if(tiempo == 1){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"7 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"7 días de vacaciones");
     }
    }
    if(tiempo == 2){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"15 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"15 días de vacaciones");
     }
    }
    if(tiempo == 7){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"22 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"22 días de vacaciones");
     }
    }

   }

   if(depto.equals("Gerencia")){
    if(tiempo == 0){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" no le corresponden"+"\n"+"días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" no le corresponden"+"\n"+"días de vacaciones");
     }
    }
    if(tiempo == 1){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"10 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"10 días de vacaciones");
     }
    }
    if(tiempo == 2){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"20 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"20 días de vacaciones");
     }
    }
    if(tiempo == 7){
     if(sexo==1){
      area1.setText("Al empleado "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"30 días de vacaciones");
     }else{
      area1.setText("A la empleada "+nombres+"\n"+apellidos+" le corresponden"+"\n"+"30 días de vacaciones");
     }
    }

   }

   }
  }

  if(e.getSource() == item4){

   field1.setText("");
   field2.setText("");
   combo1.setSelectedIndex(0);
   area1.setText("");
   grupo.clearSelection();
   grupo2.clearSelection();
  }

 if(e.getSource() == item5){

     Bienvenida objetob = new Bienvenida();
     objetob.setBounds(0,0,400,500);
     objetob.setVisible(true);
     objetob.setLocationRelativeTo(null);
     objetob.setResizable(false);
     this.setVisible(false);
  }

 if(e.getSource() == item7){
   JOptionPane.showMessageDialog(null,"Programa desarrollado por Wilmer Cuevas","El Desarrollador",JOptionPane.PLAIN_MESSAGE);
  }

 }


 public static void main(String args[]){

  Calculo ventana3 = new Calculo();
  ventana3.setBounds(0,0,600,440);
  ventana3.setLocationRelativeTo(null);
  ventana3.setVisible(true);
  ventana3.setResizable(false);

 }
}