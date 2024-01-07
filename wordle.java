package Game;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class wordle extends JFrame {
    JPanel container,main;
    Font f1=new Font("Tahoma",Font.BOLD,16);
    ArrayList<JTextField> tf=new ArrayList<>();
    JButton check,cancel;
    wordle(){
        setSize(500,500);
        main=new JPanel();
        setContentPane(main);
        main.setBackground(Color.BLACK);

        container = new JPanel();
        container.setBackground(Color.pink);
        container.setBounds(100,100,300,70);
//        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        container.setLayout(new BoxLayout(container,BoxLayout.X_AXIS));
        add(container);
        generator();

        check = new JButton("Check");
        check.setBounds(100,350,100,70);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    void generator(){
        for (int i = 0; i < 5; i++) {
            tf.add(new JTextField());
            tf.get(i).setFont(f1);
            tf.get(i).setBackground(Color.lightGray);
            tf.get(i).setForeground(Color.white);
            tf.get(i).setHorizontalAlignment(JTextField.CENTER);
        }
        for (int i = 0; i < 5; i++) {
            container.add(tf.get(i));
        }
    }

    public static void main(String[] args) {
        new wordle();
    }
}
