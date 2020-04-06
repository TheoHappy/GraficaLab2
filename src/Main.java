
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        Canvas panel = new Canvas();
        Deplasare deplasare = new Deplasare();
        Scalare scalare = new Scalare();
        Rotire rotire = new Rotire();

        JButton b = new JButton("Rotire");
        JButton b2 = new JButton("Scalare");
        JButton b3 = new JButton("Deplasare");
        b.setBounds(175,350,140, 40);
        b2.setBounds(375,350,140, 40);
        b3.setBounds(575,350,140, 40);

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(b);
        application.add(b2);
        application.add(b3);
        application.add(panel);
        application.setSize(900, 450);
        application.setVisible(true);

        b.addActionListener(new ActionListener() {
            //Rotire
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame application1 = new JFrame("Rotire 70gr");
                application1.setSize(300, 300);
                application1.add(rotire);
                application1.setVisible(true);

            }
        });

        b2.addActionListener(new ActionListener() {
            //Scalare
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame application2 = new JFrame("Scalare 0.4");
                application2.setSize(300, 300);
                application2.add(scalare);
                application2.setVisible(true);
            }
        });

        b3.addActionListener(new ActionListener() {
            //Deplasare
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFrame application3 = new JFrame("Deplasare X : 30; Y : 40");
                application3.setSize(300, 300);
                application3.add(deplasare);
                application3.setVisible(true);
            }
        });

    }
}


