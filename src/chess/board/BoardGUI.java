package chess.board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by steve on 12/27/16.
 */
public class BoardGUI implements ActionListener{

    public BoardGUI()
    {
        JFrame frame = new JFrame("chess");

        JButton black = new JButton();
        black.setBackground(Color.black);
       // black.setBorder(null);
        black.addActionListener(this);

        JButton white = new JButton();
        white.setBackground(Color.white);
        //white.setBorder(null);
        white.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(9, 8));

        boolean alternate;
        for (int i = 0; i < 8; i++)
        {
            if(i%2 != 0)
            {
                alternate = true;
            }
            else
            {
                alternate = false;
            }
            for(int j = 0; j < 8; j++)
            {
                JButton b = new JButton();
                mainPanel.add(b);
                if(alternate)
                {
                    b.setBackground(Color.black);
                    alternate = false;
                }
                else
                {
                    b.setBackground(Color.white);
                    alternate = true;
                }

            }
        }
        mainPanel.add(new JButton("Next Move"));
        frame.setContentPane(mainPanel);
        frame.setSize(1000,1000); //Temporary value to adjust for high resolution screen.

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
