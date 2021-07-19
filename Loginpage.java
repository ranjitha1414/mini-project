	
import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

import java.awt.Graphics;

import java.awt.Image;

import java.awt.Toolkit;

import java.io.IOException;

import javax.swing.JPanel;

//********** Loginpage *************

class Loginpage

{

Loginpage()

{

JFrame f=new JFrame("HOME");

JLabel l11=new JLabel("**- - - - - ONLINE PORTAL FOR PET'S REGISTRATION - - - - -** ");

l11.setBounds(300,105,500,30);

f.add(l11);

JButton resPets =new JButton("NGO'S Rescued Pets");

f.add(resPets);

resPets.setBounds(670,40,200,30);

resPets.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

Ngos n=new Ngos();

n.ngos();

}

});

JLabel l1=new JLabel("User name");

l1.setBounds(340,200,95,30);

f.add(l1);

JLabel l2=new JLabel("Password");

l2.setBounds(340,250,95,30);

f.add(l2);

JLabel l3=new JLabel("Don't have a account..?");

l3.setBounds(340,370,140,50);

f.add(l3);

JTextField t1=new JTextField("");

t1.setBounds(440,200,130,30);

f.add(t1);

JPasswordField t2=new JPasswordField("");

t2.setBounds(440,250,130,30);

f.add(t2);

JButton b=new JButton("Login");

b.setBounds(455,305,95,30);

f.add(b);

b.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

String uname=t1.getText();

String psd=t2.getText();

if (uname.equals("klu") && psd.equals("123"))

{

JOptionPane.showMessageDialog(f,"Succesfully logined");

}

else

{

JOptionPane.showMessageDialog(f,"Invalid username or password");

}

}

});

JButton b1=new JButton("Register");

b1.setBounds(475,385,85,20);

f.add(b1);

b1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

new Form();

}

});

f.setSize(900,600);

f.setLayout(null);

f.setVisible(true);

}

// *********** MAIN METHOD **********************

public static void main(String[] sri)

{

new Loginpage();

}

}

// *************** Registration FORM ******************

class Form {

private JFrame f = new JFrame("Registration form");

public Form() {

JLabel l=new JLabel("- - - - - REGISTRATION FORM - - - - -");

l.setBounds(150,70,250,30);

f.add(l);

JButton back=new JButton("Login page");

back.setBounds(300,705,100,20);

f.add(back);

back.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

new Loginpage();

}

});

JButton miss=new JButton("Missing pet's complaints");

miss.setBounds(250,620,200,25);

f.add(miss);

miss.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

new Missing();

}

});

JButton resPets =new JButton("Rescued Pets");

f.add(resPets);

resPets.setBounds(340,20,140,22);

resPets.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

Ngos n=new Ngos();

n.ngos();

}

});

JLabel l8=new JLabel("If you Aldready have account please login...");

l8.setBounds(50,700,500,30);

f.add(l8);

JLabel l9=new JLabel("If any pet is missing...");

l9.setBounds(125,615,500,30);

f.add(l9);

JLabel l1=new JLabel("Name :");

l1.setBounds(50,150,95,30);

f.add(l1);

JTextField t1=new JTextField("");

t1.setBounds(175,157,100,20);

f.add(t1);

JLabel l2=new JLabel("Age :");

l2.setBounds(50,200,95,30);

f.add(l2);

JTextField t2= new JTextField();

t2.setBounds(175,207,100,20);

f.add(t2);

JLabel l3=new JLabel("Breed :");

l3.setBounds(50,250,95,30);

f.add(l3);

JTextField t3=new JTextField("");

t3.setBounds(175,257,100,20);

f.add(t3);

JLabel l4=new JLabel("Colour :");

l4.setBounds(50,300,95,30);

f.add(l4);

JTextField t4=new JTextField("");

t4.setBounds(175,307,100,20);

f.add(t4);

JLabel l5=new JLabel("weight :");

l5.setBounds(50,350,95,30);

f.add(l5);

JTextField t5=new JTextField("");

t5.setBounds(175,357,100,20);

f.add(t5);

JLabel l6=new JLabel("unique features :");

l6.setBounds(50,400,100,30);

f.add(l6);

JTextField t6=new JTextField("");

t6.setBounds(175,407,100,20);

f.add(t6);

JLabel l7=new JLabel("Owner's name :");

l7.setBounds(50,450,95,30);

f.add(l7);

JTextField t7=new JTextField("");

t7.setBounds(175,457,100,20);

f.add(t7);

JButton b=new JButton("Submit");

b.setBounds(200,520,95,20);

f.add(b);

b.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

{

JOptionPane.showMessageDialog(f,"Succesfully Registered.");

}

}

});

f.setSize(500,800);

f.setLayout(null);

f.setVisible(true);

}

}

// *********** Missing Form **********

class Missing {

private JFrame f = new JFrame("Missing pet registration");

public Missing() {

JLabel l=new JLabel("- - - - - MISSING PET'S REGISTRATION FORM - - - - -");

l.setBounds(100,70,500,30);

f.add(l);

JButton back=new JButton("Login page");

back.setBounds(300,705,100,20);

f.add(back);

back.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

new Loginpage();

}

});

JButton Form=new JButton("Form");

Form.setBounds(285,620,100,20);

f.add(Form);

Form.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

new Form();

}

});

JButton resPets =new JButton("Rescued Pets");

f.add(resPets);

resPets.setBounds(340,20,140,22);

resPets.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

Ngos n=new Ngos();

n.ngos();

}

});

JTextField t8=new JTextField(" PET PHOTO");

t8.setBounds(350,130,100,100);

f.add(t8);

JLabel l8=new JLabel("If you Aldready have account please login...");

l8.setBounds(50,700,500,30);

f.add(l8);

JLabel l9=new JLabel("Back to Registration form...");

l9.setBounds(125,615,500,30);

f.add(l9);

JLabel l1=new JLabel("Name :");

l1.setBounds(50,150,95,30);

f.add(l1);

JTextField t1=new JTextField("");

t1.setBounds(175,157,100,20);

f.add(t1);

JLabel l2=new JLabel("Age :");

l2.setBounds(50,200,95,30);

f.add(l2);

JTextField t2= new JTextField("");

t2.setBounds(175,207,100,20);

f.add(t2);

JLabel l3=new JLabel("Breed :");

l3.setBounds(50,250,95,30);

f.add(l3);

JTextField t3=new JTextField("");

t3.setBounds(175,257,100,20);

f.add(t3);

JLabel l4=new JLabel("Colour :");

l4.setBounds(50,300,95,30);

f.add(l4);

JTextField t4=new JTextField("");

t4.setBounds(175,307,100,20);

f.add(t4);

JLabel l5=new JLabel("weight :");

l5.setBounds(50,350,95,30);

f.add(l5);

JTextField t5=new JTextField("");

t5.setBounds(175,357,100,20);

f.add(t5);

JLabel l6=new JLabel("unique features :");

l6.setBounds(50,400,100,30);

f.add(l6);

JTextField t6=new JTextField("");

t6.setBounds(175,407,100,20);

f.add(t6);

JLabel l7=new JLabel("Owner's name :");

l7.setBounds(50,450,95,30);

f.add(l7);

JTextField t7=new JTextField("");

t7.setBounds(175,457,100,20);

f.add(t7);

JButton b=new JButton("Submit");

b.setBounds(200,520,95,20);

f.add(b);

b.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

{

JOptionPane.showMessageDialog(f,"Succesfully Complaint Added.");

}

}

});

f.setSize(500,800);

f.setLayout(null);

f.setVisible(true);

}

}

// ********** Ngos ************

class Ngos extends Canvas{

public void paint(Graphics g) {

Toolkit t=Toolkit.getDefaultToolkit();

Image i=t.getImage("ax.jpg");

g.drawImage(i, 100,10,this);

Image j=t.getImage("ay.jpg");

g.drawImage(j, 140,300,this);

}

void ngos()

{

Ngos m=new Ngos();

JFrame f=new JFrame("pets rescued by NGO's");

// 1st pic details

JLabel l1=new JLabel("Name :Puppy");

l1.setBounds(340,140,95,30);

f.add(l1);

JLabel l2=new JLabel("Age :6");

l2.setBounds(340,160,95,30);

f.add(l2);

JLabel l3=new JLabel("Breed :Beagle");

l3.setBounds(340,180,95,30);

f.add(l3);

JLabel l4=new JLabel("Colour :White");

l4.setBounds(340,200,95,30);

f.add(l4);

JLabel l5=new JLabel("weight :60Pounds");

l5.setBounds(340,220,115,30);

f.add(l5);

// 2nd pic details

JLabel l11=new JLabel("Name :Akita");

l11.setBounds(150,520,95,30);

f.add(l11);

JLabel l21=new JLabel("Age :5");

l21.setBounds(150,540,95,30);

f.add(l21);

JLabel l31=new JLabel("Breed :pug");

l31.setBounds(150,560,95,30);

f.add(l31);

JLabel l41=new JLabel("Colour :brown");

l41.setBounds(150,580,95,30);

f.add(l41);

JLabel l51=new JLabel("weight :50Pounds");

l51.setBounds(150,600,115,30);

f.add(l51);

JButton back1=new JButton("Click here to go Login page");

back1.setBounds(150,700,300,30);

f.add(back1);

f.add(m);

f.setSize(600,800);

f.setVisible(true);

back1.addActionListener(new ActionListener() {

public void actionPerformed(ActionEvent ae) {

f.dispose();

new Loginpage();

}

});

}

}


