import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDemo implements MouseListener {
    JFrame frame;
    JLabel label;

    MouseDemo() {
        frame = new JFrame("Mouse Demonstration!");

        label = new JLabel();
        label.setBounds(200, 150, 100, 30);
        label.setForeground(new Color(192,192,192));

        frame.add(label);

        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(0, 0,0));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setVisible(true);
        frame.addMouseListener(this);

    }


    public void mousePressed(MouseEvent me) {
        label.setText("Mouse Pressed!");

    }

    public void mouseClicked(MouseEvent me) {
        label.setText("Mouse Clicked!");
    }

    public void mouseReleased(MouseEvent me) {
        label.setText("Mouse Released!");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        label.setText("Mouse is here!");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        label.setText("Mouse is Gone!");
    }

    public static void main(String[] args) {

        new MouseDemo();
    }
}