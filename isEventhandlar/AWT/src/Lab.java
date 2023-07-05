import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab extends JFrame implements ActionListener {
    JButton jbl;
    JTextField jt1, jt2;
    JLabel lbl;

    public Lab() {
        jt1 = new JTextField();
        jt1.setBounds(100, 50, 150, 40);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(100, 100, 150, 40);
        add(jt2);

        lbl = new JLabel("Result");
        lbl.setBounds(100, 150, 150, 40);
        add(lbl);

        jbl = new JButton("Division");
        jbl.setBounds(100, 200, 150, 40);
        add(jbl);

        jbl.addActionListener(this);
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = 0, b = 0;

        try {
            a = Integer.parseInt(jt1.getText());
            b = Integer.parseInt(jt2.getText());
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }

        double c = 0;
        if (e.getSource().equals(jbl)) {
            try {
                c = (double) a / b;
            } catch (ArithmeticException ae) {
                System.out.println(ae);
            }
            lbl.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        new Lab();
    }
}

