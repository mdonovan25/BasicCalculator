import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutCalculator implements ActionListener{


        private JFrame mainFrame;
        private JPanel panel;
        private JLabel label;
        private JButton button1;
        private JButton button2;
        private JButton button3;
        private JButton button4;
        private JButton button5;
        private JButton button6;
        private JButton button7;
        private JButton button8;
        private JButton button9;
        private JButton button10;
        private JButton button11;
        private JButton button12;
        private JButton button13;
        private JButton button14;
        private JButton button15;
        private JButton button16;
        private JButton button17;
        private JButton button18;
        private JButton button19;
  //      private JTextField textField1;
        private JPanel panel2;


        //   private int nClicks = 0;

        public static void main(String[] args) {
            LayoutCalculator myLayout= new LayoutCalculator();
        }
        public LayoutCalculator(){
            mainFrame = new JFrame();

            //     label = new JLabel("Clicks: 0");

            button1 = new JButton ("=");
            button2 = new JButton ("+");
            button3 = new JButton ("-");
            button4 = new JButton ("x");
            button5 = new JButton ("/");
            button6 = new JButton ("0");
            button7 = new JButton ("1");
            button8 = new JButton ("2");
            button9 = new JButton ("3");
            button10 = new JButton ("4");
            button11 = new JButton ("5");
            button12 = new JButton ("6");
            button13 = new JButton ("7");
            button14 = new JButton ("8");
            button15 = new JButton ("9");
            button16 = new JButton ("x^2");
            button17 = new JButton ("x^3");
            button18 = new JButton ("+/-");
            button19 = new JButton (" ");
     //       textField1 = new JTextField(" ");
            panel2 = new JPanel ();
            button1.addActionListener(this); //makes button clickable
            button2.addActionListener(this);
            button3.addActionListener(this);
            button4.addActionListener(this);
            button5.addActionListener(this);
            button6.addActionListener(this);
            button7.addActionListener(this);
            button8.addActionListener(this);
            button9.addActionListener(this);
            button10.addActionListener(this);
            button11.addActionListener(this);
            button12.addActionListener(this);
            button13.addActionListener(this);
            button14.addActionListener(this);
            button15.addActionListener(this);
    //        textField1.addActionListener(this);




            panel = new JPanel();
            panel2 = new JPanel();
            int borderSize = 1;
            panel.setBorder(BorderFactory.createEmptyBorder(borderSize,borderSize,borderSize,borderSize));
            panel.setLayout(new GridLayout(2,3));
            //panel.add(label);
            panel.setLayout(new BorderLayout());
            panel.add(label, BorderLayout.NORTH);
            panel.add(button1, BorderLayout.SOUTH);
       //     panel.add(button);
            panel.add(button1);
            panel.add(button2);
            panel.add(button3);
            panel.add(button4);


            mainFrame.add(panel);

//        mainFrame.pack();
            mainFrame.setSize(500,200);
            mainFrame.setVisible(true);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Object buttonClicked = e.getSource();
            if (buttonClicked == button1){
                System.out.println("button clicked");
                nClicks++;

            }
            //      System.out.println("button clicked");
            //       nClicks ++;
            //     label.setText("clicks: " + nClicks);
        }
    }

