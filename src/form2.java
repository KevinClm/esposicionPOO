import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class form2 {
    public JPanel pantalla;
    private JMenu archivo;
    private JMenu acciones;
    private JMenuItem subir;
    private JMenuItem cerrarSesion;

    public form2(){
        cerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.setVisible(true);
                form1.frame2.dispose();
            }
        });
    }
}
