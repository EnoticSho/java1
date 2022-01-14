package geekbrains;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Calculator");
        setBounds(500, 300, 400, 530);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        add(new CalcPanel());
        setVisible(true);
    }
}
