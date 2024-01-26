import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class form1 {
    public JPanel login;
    private JLabel user;
    private JLabel password;
    public JTextField userField;
    public JPasswordField passwordField;
    private JButton sigIn;
    private JLabel encabezadoLbl;
    static JFrame frame2 = new JFrame("pantalla");
    public form1() {
        sigIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Datos*/
                String user = "Admin";
                String password = "123";
                try{
                    if(Objects.equals(userField.getText(), user ) && Objects.equals(String.valueOf(passwordField.getPassword()), password)){
                        System.out.println("Ingresó al sistema");
                        Main.frame.dispose();
                        frame2.setContentPane(new form2().pantalla);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setSize(800, 600);
                        frame2.setLocationRelativeTo(null);
                        frame2.setVisible(true);
                        userField.setText("");
                        passwordField.setText("");
                    }
                    else {
                        System.out.println("Fallo de credenciales");
                        encabezadoLbl.setText("Datos Incorrectos");
                    }
                }
                catch (Exception ex){
                    System.out.println(ex);
                }
            }
        });
    }
}
