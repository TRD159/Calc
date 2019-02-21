package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class CalcFrame extends JFrame {
    //JLabel lbl_operand1 = new JLabel("Operand1: ");
    JTextField txt_operand1 = new JTextField();
    //JLabel lbl_operand2 = new JLabel("Operand2: ");
    JTextField txt_operand2 = new JTextField();
    JTextField lbl_result = new JTextField("Result: ");

    StringBuffer operf = new StringBuffer();
    StringBuffer opert = new StringBuffer();
    StringBuffer opero = new StringBuffer();

    String opre;

    JLabel lbl_operation = new JLabel("");

    JButton btn_1 = new JButton("1");
    JButton btn_2 = new JButton("2");
    JButton btn_3 = new JButton("3");
    JButton btn_4 = new JButton("4");
    JButton btn_5 = new JButton("5");
    JButton btn_6 = new JButton("6");
    JButton btn_7 = new JButton("7");
    JButton btn_8 = new JButton("8");
    JButton btn_9 = new JButton("9");
    JButton btn_0 = new JButton("0");

    JButton btn_mult = new JButton("x");
    JButton btn_div = new JButton("/");
    JButton btn_sub = new JButton("-");
    JButton btn_add = new JButton("+");

    JButton btn_clear = new JButton("C");
    JButton btn_equ = new JButton("=");

    ButtonGroup oper = new ButtonGroup();

    boolean stringF = true;

    public CalcFrame(String name) {
        super(name);

        setSize(400, 500);

        lbl_result.setEditable(false);

        lbl_result.setBounds(20, 90, 240, 50);
        lbl_result.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        lbl_operation.setBounds(20, 30, 240, 50);

        btn_0.setBounds(90, 330, 170, 50);
        btn_1.setBounds(90, 270, 50,50);
        btn_2.setBounds(150, 270, 50, 50);
        btn_3.setBounds(210, 270, 50, 50);
        btn_4.setBounds(90, 210, 50, 50);
        btn_5.setBounds(150, 210, 50, 50);
        btn_6.setBounds(210, 210, 50, 50);
        btn_7.setBounds(90, 150, 50, 50);
        btn_8.setBounds(150, 150, 50, 50);
        btn_9.setBounds(210, 150, 50, 50);

        btn_clear.setBounds(270, 150, 50, 110);
        btn_equ.setBounds(270, 270, 50, 110);

        btn_0.addActionListener(e -> input(0));
        btn_1.addActionListener(e -> input(1));
        btn_2.addActionListener(e -> input(2));
        btn_3.addActionListener(e -> input(3));
        btn_4.addActionListener(e -> input(4));
        btn_5.addActionListener(e -> input(5));
        btn_6.addActionListener(e -> input(6));
        btn_7.addActionListener(e -> input(7));
        btn_8.addActionListener(e -> input(8));
        btn_9.addActionListener(e -> input(9));



        btn_add.addActionListener(e -> add());

        oper.add(btn_mult);
        oper.add(btn_div);
        oper.add(btn_add);
        oper.add(btn_sub);

        btn_mult.setBounds(20, 150, 50, 50);
        btn_div.setBounds(20, 210, 50, 50);
        btn_sub.setBounds(20, 270, 50, 50);
        btn_add.setBounds(20, 330, 50, 50);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(null);

        Border operB = BorderFactory.createLineBorder(Color.BLACK, 1);

        lbl_operation.setBorder(operB);

        /*
        lbl_operand1.setBounds(100, 100, 75, 25);
        txt_operand1.setBounds(175, 100, 125, 25);

        lbl_operand2.setBounds(100, 150, 75, 25);
        txt_operand2.setBounds(175, 150, 125, 25);

        btn_add.setBounds(150, 200, 41,20);

        lbl_result.setBounds(100, 250, 75, 25);

        btn_add.addActionListener(e -> add());

        add(lbl_operand1);
        add(txt_operand1);

        add(lbl_operand2);
        add(txt_operand2);

        add(btn_add);

        add(lbl_result);
        */

        add(btn_0);
        add(btn_1);
        add(btn_2);
        add(btn_3);
        add(btn_4);
        add(btn_5);
        add(btn_6);
        add(btn_7);
        add(btn_8);
        add(btn_9);

        add(btn_mult);
        add(btn_div);
        add(btn_sub);
        add(btn_add);

        add(btn_clear);
        add(btn_equ);

        add(lbl_result);

        add(lbl_operation);

        setUndecorated(true);

        setVisible(true);
    }

    public void input(int num) {
        lbl_operation.setText(lbl_operation.getText() + num);
        if(stringF) {
            operf.append(num);
        } else {
            opert.append(num);
        }
    }

    public void calc() {
        lbl_result.setText(lbl_result.getText() + comp());
    }

    public double comp() {
        Double num1 = Double.parseDouble(operf.toString());
        Double num2 = Double.parseDouble(opert.toString());

        switch (opre) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case "/":
                return num1/num2;
            default:
                return num1;

        }
    }

    public void add() {

    }

}
