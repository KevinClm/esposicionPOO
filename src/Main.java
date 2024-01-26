import javax.swing.*;

public class Main {
    static JFrame frame = new JFrame("Login");
    public static void main(String[] args) {
        frame.setContentPane(new form1().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setLocationRelativeTo(null); /*Centrar el Jpanel*/
        frame.setVisible(true);
    }
}