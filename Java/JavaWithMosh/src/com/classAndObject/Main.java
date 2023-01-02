package com.classAndObject;

// import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        // var TextBox1 = new TextBox();
        
        TextBox textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);

        UIControl c = new TextBox();
        TextBox t = (TextBox)c;
    }

}
