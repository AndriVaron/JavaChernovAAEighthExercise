import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ListenerButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       JOptionPane.showMessageDialog(null, "Хотел вставить сюда гиперссылку на сайт, но не успешно.\n ¯\\_(ツ)_/¯","Message", JOptionPane.ERROR_MESSAGE);
       System.exit(-1);

    }
}
