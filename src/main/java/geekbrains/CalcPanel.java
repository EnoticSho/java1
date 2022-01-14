package geekbrains;

import javax.swing.*;

import java.awt.*;

import static java.lang.Integer.parseInt;

public class CalcPanel extends JPanel {
    int first = 0;
    int second = 0;
    char symb = ' ';

    JTextField text = new JTextField();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton a1 = new JButton("*");
    JButton a2 = new JButton("/");
    JButton a3 = new JButton("-");
    JButton a4 = new JButton("+");
    JButton a5 = new JButton("=");
    JButton a0 = new JButton("C");

    public CalcPanel() {
        setLayout(null);
        text.setBounds(10, 10, 380, 95);
        b7.setBounds(10, 105, 95, 95);
        b8.setBounds(105, 105, 95, 95);
        b9.setBounds(200, 105, 95, 95);
        a1.setBounds(295, 105, 95, 95);
        b4.setBounds(10, 200, 95, 95);
        b5.setBounds(105, 200, 95, 95);
        b6.setBounds(200, 200, 95, 95);
        a2.setBounds(295, 200, 95, 95);
        b1.setBounds(10, 295, 95, 95);
        b2.setBounds(105, 295, 95, 95);
        b3.setBounds(200, 295, 95, 95);
        a3.setBounds(295, 295, 95, 95);
        a0.setBounds(10, 390, 95, 95);
        b0.setBounds(105, 390, 95, 95);
        a5.setBounds(200, 390, 95, 95);
        a4.setBounds(295, 390, 95, 95);

        Font bigFont = new Font("serif", Font.BOLD, 24);
        Font font = new Font("Arial", Font.BOLD, 32);
        text.setFont(font);
        text.setEditable(false);
        a0.setFont(bigFont);
        a1.setFont(bigFont);
        a2.setFont(bigFont);
        a3.setFont(bigFont);
        a4.setFont(bigFont);
        a5.setFont(bigFont);
        add(text);
        add(b7);
        add(b8);
        add(b9);
        add(a1);
        add(b4);
        add(b5);
        add(b6);
        add(a2);
        add(b1);
        add(b2);
        add(b3);
        add(a3);
        add(b0);
        add(a4);
        add(a5);
        add(a0);

            b0.addActionListener(actionEvent -> {
            text.setText(text.getText() + 0);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 0);
            }
        });
        b1.addActionListener(actionEvent -> {
            text.setText(text.getText() + 1);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 1);
            }
        });
        b2.addActionListener(actionEvent -> {
            text.setText(text.getText() + 2);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 2);
            }
        });
        b3.addActionListener(actionEvent -> {
            text.setText(text.getText() + 3);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 3);
            }
        });
        b4.addActionListener(actionEvent -> {
            text.setText(text.getText() + 4);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 4);
            }
        });
        b5.addActionListener(actionEvent -> {
            text.setText(text.getText() + 5);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 5);
            }
        });
        b6.addActionListener(actionEvent -> {
            text.setText(text.getText() + 6);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 6);
            }
        });
        b7.addActionListener(actionEvent -> {
            text.setText(text.getText() + 7);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 7);
            }
        });
        b8.addActionListener(actionEvent -> {
            text.setText(text.getText() + 8);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 8);
            }
        });
        b9.addActionListener(actionEvent -> {
            text.setText(text.getText() + 9);
            if (symb == ' ') {
                first = parseInt(text.getText());
            } else {
                second = parseInt(Integer.toString(second) + 9);
            }
        });
        a0.addActionListener(actionEvent -> {
            text.setText("");
            first = 0;
            second = 0;
            symb = ' ';
        });
        a1.addActionListener(actionEvent -> {
            text.setText(first + "*");
            symb = '*';
        });
        a2.addActionListener(actionEvent -> {
            text.setText(first + "/");
            symb = '/';
        });
        a3.addActionListener(actionEvent -> {
            text.setText(first + "-");
            symb = '-';
        });
        a4.addActionListener(actionEvent -> {
            text.setText(first + "+");
            symb = '+';
        });
        a5.addActionListener(actionEvent -> {
            text.setText(text.getText() + "=" + Operation.arifmetic(symb, first, second));
            first = Operation.arifmetic(symb, first, second);
            second = 0;
            symb = ' ';
        });
    }
}
