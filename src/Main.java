import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Main {
    static JFrame frame = new JFrame("ATM");
    static Font fontEnglishText = new Font("Times New Roman", Font.BOLD, 15);
    static Font fontEnglishButton = new Font("Times New Roman", Font.ITALIC, 19);
    static Font fontFarsiText = new Font("B Titr", Font.BOLD, 15);
    static Font fontFarsiButton = new Font("B Titr", Font.ITALIC, 19);


    static JPanel panel1 = new JPanel();
    static JButton button1 = new JButton("English");
    static JButton button2 = new JButton("فارسی");
    static JLabel text1 = new JLabel("Choose Language");
    static JLabel text2 = new JLabel("زبان خود را انتخاب کنید");

    static JPanel panel2 = new JPanel();
    static JButton button3 = new JButton("ثبت");
    static JLabel text3 = new JLabel("رمز خود را وارد کنید");
    static JTextField textField1 = new JTextField();

    static JPanel panel3 = new JPanel();
    static JButton button4 = new JButton("تغییر رمز");
    static JButton button5 = new JButton("اعلام موجودی");
    static JButton button6 = new JButton("برداشت وجه");
    static JButton button7 = new JButton("کارت به کارت");
    static JButton button8 = new JButton("لغو");

    static JPanel panel4 = new JPanel();
    static JButton button9 = new JButton("تایید");
    static JLabel text4 = new JLabel("رمز جدید را وارد کنید");
    static JTextField textField2 = new JTextField();

    static JPanel panel5 = new JPanel();
    static JLabel text5 = new JLabel("موجودی حساب شما 51460000 ریال است");
    static JButton button15 = new JButton("خروج");

    static JPanel panel6 = new JPanel();
    static JButton button10 = new JButton("150000");
    static JButton button11 = new JButton("50000");
    static JButton button12 = new JButton("100000");
    static JButton button13 = new JButton("200000");

    static JPanel panel7 = new JPanel();
    static JLabel text6 = new JLabel("مبلغ مورد نظر را وارد کنید:");
    static JLabel text7 = new JLabel("شماره کارت مقصد را وارد کنید:");
    static JTextField textField3 = new JTextField();
    static JTextField textField4 = new JTextField();
    static JButton button14 = new JButton("ثبت");

    static JPanel panel8 = new JPanel();
    static JLabel text8 = new JLabel("عملیات با موفقیت انجام شد.");

    public static void main(String[] args) {
        Dimension frameSize = new Dimension(512, 360);
        frame.setSize(frameSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        initPanel1();
        initPanel2();
        initPanel3();
        initPanel4();
        initPanel5();
        initPanel6();
        initPanel7();
        initPanel8();

        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void initPanel1() {
        //////panel1
        panel1.setBounds(0, 0, 512, 360);
        panel1.setBackground(Color.ORANGE);
        panel1.setLayout(null);


        button1.setBounds(20, 130, 128, 45);
        button1.setFont(fontEnglishButton);
        panel1.add(button1);


        button2.setBounds(348, 130, 128, 45);
        button2.setFont(fontFarsiButton);
        panel1.add(button2);


        text1.setBounds(78, 200, 160, 45);
        text1.setFont(fontEnglishText);
        panel1.add(text1);

        text2.setBounds(285, 200, 160, 45);
        text2.setFont(fontFarsiText);
        panel1.add(text2);

        frame.add(panel1);

    }

    public static void initPanel2() {
        /////panel2

        panel2.setBounds(0, 0, 512, 360);
        panel2.setBackground(Color.ORANGE);
        panel2.setLayout(null);


        button3.setBounds(185, 240, 128, 45);
        button3.setFont(fontFarsiButton);
        panel2.add(button3);


        text3.setBounds(195, 100, 128, 45);
        text3.setFont(fontFarsiText);
        panel2.add(text3);


        textField1.setBounds(150, 150, 200, 45);
        textField1.setFont(fontFarsiText);
        panel2.add(textField1);


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.add(panel2);
                frame.repaint();
                frame.revalidate();

            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel1);
                frame.add(panel2);
                frame.repaint();
                frame.revalidate();
            }
        });
    }

    public static void initPanel3() {
        ////panel3

        panel3.setBounds(0, 0, 512, 360);
        panel3.setBackground(Color.ORANGE);
        panel3.setLayout(null);


        button4.setBounds(340, 85, 140, 45);
        button4.setFont(fontFarsiButton);
        panel3.add(button4);


        button5.setBounds(340, 200, 140, 45);
        button5.setFont(fontFarsiButton);
        panel3.add(button5);


        button6.setBounds(20, 85, 140, 45);
        button6.setFont(fontFarsiButton);
        panel3.add(button6);


        button7.setBounds(20, 200, 140, 45);
        button7.setFont(fontFarsiButton);
        panel3.add(button7);


        button8.setBounds(200, 260, 100, 35);
        button8.setFont(fontFarsiButton);
        panel3.add(button8);


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(textField1.getText(), "")) {
                    //TODO: CHECK
                    JOptionPane.showMessageDialog(null, "رمز خود را وارد کنید.", "خطا کاربر", JOptionPane.WARNING_MESSAGE);
                } else {
                    frame.remove(panel2);
                    frame.add(panel3);
                    frame.repaint();
                    frame.revalidate();
                }
            }
        });
    }

    public static void initPanel4() {
        ////panel4

        panel4.setBounds(0, 0, 512, 360);
        panel4.setBackground(Color.ORANGE);
        panel4.setLayout(null);


        button9.setBounds(185, 240, 128, 45);
        button9.setFont(fontFarsiButton);
        panel4.add(button9);


        text4.setBounds(195, 100, 128, 45);
        text4.setFont(fontFarsiText);
        panel4.add(text4);


        textField2.setBounds(150, 150, 200, 45);
        textField2.setFont(fontFarsiText);
        panel4.add(textField2);


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel4);
                frame.repaint();
                frame.revalidate();
            }
        });
    }

    public static void initPanel5() {
        ////panel5
        panel5.setBounds(0, 0, 512, 360);
        panel5.setBackground(Color.ORANGE);
        panel5.setLayout(null);

        text5.setBounds(140, 120, 300, 50);
        text5.setFont(fontFarsiText);
        panel5.add(text5);
        //دکمه زیر ضروری نیست -

        button15.setBounds(180, 260, 128, 45);
        button15.setFont(fontFarsiButton);
        panel5.add(button15);

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel5);
                frame.repaint();
                frame.revalidate();

            }
        });
    }

    public static void initPanel6() {
        ////panel6
        panel6.setBounds(0, 0, 512, 360);
        panel6.setBackground(Color.ORANGE);
        panel6.setLayout(null);

        button10.setBounds(340, 85, 140, 45);
        button10.setFont(fontEnglishButton);
        panel6.add(button10);


        button11.setBounds(340, 200, 140, 45);
        button11.setFont(fontEnglishButton);
        panel6.add(button11);


        button12.setBounds(20, 85, 140, 45);
        button12.setFont(fontEnglishButton);
        panel6.add(button12);


        button13.setBounds(20, 200, 140, 45);
        button13.setFont(fontEnglishButton);
        panel6.add(button13);

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel6);
                frame.repaint();
                frame.revalidate();

            }
        });
    }

    public static void initPanel7() {
        ////panel7
        panel7.setBounds(0, 0, 512, 360);
        panel7.setBackground(Color.ORANGE);
        panel7.setLayout(null);

        text6.setBounds(172, 70, 300, 45);
        text6.setFont(fontFarsiText);
        panel7.add(text6);


        text7.setBounds(160, 160, 300, 45);
        text7.setFont(fontFarsiText);
        panel7.add(text7);

        textField3.setBounds(140, 110, 200, 35);
        textField3.setFont(fontFarsiText);
        panel7.add(textField3);


        textField4.setBounds(140, 200, 200, 35);
        textField4.setFont(fontFarsiText);
        panel7.add(textField4);

        button14.setBounds(170, 260, 128, 45);
        button14.setFont(fontFarsiButton);
        panel7.add(button14);

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel7);
                frame.repaint();
                frame.revalidate();

            }
        });


        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel3);
                frame.add(panel1);
                frame.repaint();
                frame.revalidate();

            }
        });
    }

    public static void initPanel8() {

        /////panel8 - صفحه نتیجه

        panel8.setBounds(0, 0, 512, 360);
        panel8.setBackground(Color.ORANGE);
        panel8.setLayout(null);


        text8.setBounds(180, 150, 300, 45);
        text8.setFont(fontFarsiText);
        panel8.add(text8);

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(textField2.getText(), "")) {
                    //TODO: CHECK
                    JOptionPane.showMessageDialog(null, "رمز جدید را وارد کنید.", "خطا کاربر", JOptionPane.WARNING_MESSAGE);
                } else {
                    frame.remove(panel4);
                    frame.add(panel8);
                    frame.repaint();
                    frame.revalidate();
                }
            }
        });

        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Objects.equals(textField4.getText(), "")) {
                    //TODO: CHECK
                    JOptionPane.showMessageDialog(null, "شماره کارت مقصد را وارد کنید.", "خطا کاربر", JOptionPane.WARNING_MESSAGE);
                } else if (Objects.equals(textField3.getText(), "")) {
                    //TODO: CHECK
                    JOptionPane.showMessageDialog(null, "مبلغ واریزی را وارد کنید.", "خطا کاربر", JOptionPane.WARNING_MESSAGE);
                } else {
                    frame.remove(panel7);
                    frame.add(panel8);
                    frame.repaint();
                    frame.revalidate();
                }
            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel5);
                frame.add(panel8);
                frame.repaint();
                frame.revalidate();

            }
        });

        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel6);
                frame.add(panel8);
                frame.repaint();
                frame.revalidate();

            }
        });

        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel6);
                frame.add(panel8);
                frame.repaint();
                frame.revalidate();

            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel6);
                frame.add(panel8);
                frame.repaint();
                frame.revalidate();

            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(panel6);
                frame.add(panel8);
                frame.repaint();
                frame.revalidate();

            }
        });
    }
}