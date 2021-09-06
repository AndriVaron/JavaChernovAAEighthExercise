import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showUI();
    }
    public void showUI(){
        JFrame frame = new JFrame();
        Panel panel = new Panel();
        //База
        frame.getContentPane().add(panel);
        frame.setLocation(300, 300);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //Кнопка
        JButton myButton = new JButton("GeekBrains");
        frame.add(myButton, BorderLayout.SOUTH);
        ActionListener myButtonListener = new ListenerButton();
        myButton.addActionListener(myButtonListener);

        }

}
