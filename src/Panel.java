import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public void paintComponent (Graphics g) {
        Image image = new ImageIcon("src/geekbrains_logo.png").getImage();
        g.drawImage(image, 45, 20, this);

    }

}
