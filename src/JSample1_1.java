import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.ZonedDateTime;

// class JSample1_1 extends JFrame implements ActionListener{
class JSample1_1 extends JFrame implements ActionListener{
    JButton button;

    JLabel label = new JLabel();
    


    public static void main(String args[]){
        JSample1_1 frame = new JSample1_1("exercise 13");
        frame.setVisible(true);
    }

    JSample1_1(String title){
        setTitle(title);
        setBounds(100, 100, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton button1 = new JButton("Date");
        button = new JButton("Date");
        button.addActionListener(this);
        
        
        String dateAndTime = ZonedDateTime.now().toString();
        // JLabel label = new JLabel(dateAndTime);
        JPanel p = new JPanel();
        label.setText(dateAndTime);
        p.add(label);
        p.add(button);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.NORTH);
        contentPane.add(label,BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e){
        String dateAndTime = ZonedDateTime.now().toString();
        label.setText(dateAndTime);
    }
}