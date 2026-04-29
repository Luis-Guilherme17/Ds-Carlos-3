package com.mycompany.JPasswordFieldExemplo;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class JPasswordFieldExemplo extends JFrame{

JPasswordField caixa;

JLabel rotulo;

public JPasswordFieldExemplo(){

super("Exemplo com JPasswordField");

Container tela = getContentPane();

setLayout(null);

rotulo = new JLabel("Senha: ");

caixa = new JPasswordField(10);

rotulo.setBounds(50,20,100,20);

caixa.setBounds(50,60,100,20);

tela.add(rotulo);

tela.add(caixa);

setSize(400, 250);

setVisible(true);

}

public static void main(String args[]){

JPasswordFieldExemplo app = new JPasswordFieldExemplo();

app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

}