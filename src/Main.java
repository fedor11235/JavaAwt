package sample;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;
import javax.swing.*;

class Main extends JFrame {

    public Main(String s){
        super(s);

        final int[] vib = {0};

        JButton button = new JButton("Обновить");
        JButton button2 = new JButton("==>");

        JButton button11 = new JButton();
        JButton button22 = new JButton();
        JButton button33 = new JButton();

        Label z=new Label("Задание 1:");
        Label v=new Label("Какой из рисунков илюстрируют строго выпуклую функцию f(x) ?");
        Label r=new Label("Для выбоа рисунка щёлкните на него мышкой");
        Label ot=new Label();

        Label y1=new Label("y");
        Label y2=new Label("y");
        Label y3=new Label("y");

        Label x1=new Label("x");
        Label x2=new Label("x");
        Label x3=new Label("x");

        Label fx=new Label("f(x)");
        Label fx2=new Label("f(x)");
        Label fx3=new Label("f(x)");

        r.setBounds(200,492, 400,20);
        r.setBackground(new Color(255,255,255,0));
        r.setForeground(new Color(227, 40, 181, 255));
        r.setFont(new Font("Helvetica", Font.BOLD, 15));

        v.setBounds(125,120, 500,20);
        v.setBackground(new Color(255,255,255,0));
        v.setForeground(new Color(5, 41, 127, 255));
        v.setFont(new Font("Helvetica", Font.BOLD, 15));

        z.setBounds(80,100, 100,20);
        z.setBackground(new Color(255,255,255,0));
        z.setForeground(new Color(127, 5, 33, 255));
        z.setFont(new Font("Helvetica", Font.BOLD, 15));

        fx.setBounds(215,150, 25,30);
        fx.setBackground(new Color(255,255,255,0));
        fx.setForeground(new Color(40, 93, 220, 255));
        fx.setFont(new Font("Helvetica", Font.PLAIN, 15));

        fx2.setBounds(415,150, 25,30);
        fx2.setBackground(new Color(255,255,255,0));
        fx2.setForeground(new Color(220, 40, 40, 255));
        fx2.setFont(new Font("Helvetica", Font.PLAIN, 15));

        fx3.setBounds(620,150, 25,30);
        fx3.setBackground(new Color(255,255,255,0));
        fx3.setForeground(new Color(103, 220, 40, 255));
        fx3.setFont(new Font("Helvetica", Font.PLAIN, 15));

        y1.setBounds(90,150, 10,30);
        y1.setBackground(new Color(255,255,255,0));
        y1.setForeground(new Color(0, 0, 0, 64));
        y1.setFont(new Font("Helvetica", Font.PLAIN, 15));

        x1.setBounds(230,283, 10,20);
        x1.setBackground(new Color(255,255,255,0));
        x1.setForeground(new Color(0, 0, 0, 64));
        x1.setFont(new Font("Helvetica", Font.PLAIN, 15));

        y2.setBounds(290,150, 10,30);
        y2.setBackground(new Color(255,255,255,0));
        y2.setForeground(new Color(0, 0, 0, 64));
        y2.setFont(new Font("Helvetica", Font.PLAIN, 15));

        x2.setBounds(430,283, 10,20);
        x2.setBackground(new Color(255,255,255,0));
        x2.setForeground(new Color(0, 0, 0, 64));
        x2.setFont(new Font("Helvetica", Font.PLAIN, 15));

        y3.setBounds(490,150, 10,30);
        y3.setBackground(new Color(255,255,255,0));
        y3.setForeground(new Color(0, 0, 0, 64));
        y3.setFont(new Font("Helvetica", Font.PLAIN, 15));

        x3.setBounds(630,283, 10,20);
        x3.setBackground(new Color(255,255,255,0));
        x3.setForeground(new Color(0, 0, 0, 64));
        x3.setFont(new Font("Helvetica", Font.PLAIN, 15));

        ot.setBounds(270,350, 150,20);
        ot.setBackground(new Color(255,255,255,0));
        ot.setForeground(new Color(201, 22, 22, 255));
        ot.setFont(new Font("Helvetica", Font.PLAIN, 20));

        button.setLayout(null);
        button.setLocation(230,540);
        button.setSize(100,30);
        button.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                ot.setText("");
                vib[0] = 0;
            }
        });

        button2.setLayout(null);
        button2.setLocation(370,540);
        button2.setSize(100,30);
        button2.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                if(vib[0] == 1) {
                    ot.setText("Неправильно");
                }
                if(vib[0] == 2)
                    ot.setText("Правильно");
                if(vib[0] == 3)
                    ot.setText("Не правильно");
                if(vib[0] == 0)
                    ot.setText("Вы не выбрали");
            }
        });

        button11.setLayout(null);
        button11.setLocation(60,150);
        button11.setSize(185,185);
        button11.setBackground(new Color(0, 0, 0, 0));
        button11.setBorderPainted(true);
        button11.setContentAreaFilled(false);

        button11.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                System.out.println("1 кнопка");
                vib[0] = 1;
            }
        });


        button22.setLayout(null);
        button22.setLocation(260,150);
        button22.setSize(185,185);

        button22.setBackground(new Color(0, 0, 0, 0));
        button22.setBorderPainted(true);
        button22.setContentAreaFilled(false);
        button22.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                System.out.println("2 кнопка");
                vib[0] = 2;
            }
        });

        button33.setLayout(null);
        button33.setLocation(460,150);
        button33.setSize(185,185);

        button33.setBackground(new Color(0, 0, 0, 0));
        button33.setBorderPainted(true);
        button33.setContentAreaFilled(false);
        button33.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                System.out.println("3 кнопка");
                vib[0] = 3;
            }
        });

        add(y1);
        add(y2);
        add(y3);

        add(x1);
        add(x2);
        add(x3);

        add(fx);
        add(fx2);
        add(fx3);

        add(button);
        add(button2);

        add(button11);
        add(button22);
        add(button33);

        add(v);
        add(z);
        add(r);
        add(ot);


        add(new MyComponent());
    }
    public static void main(String args[])
    {

        Main jFrame = new Main("lab8");

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(728,700);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);

    }



    static class MyComponent extends Container{
        double lastX = 160;
        double lastY = 300;
        @Override
        public void paint(Graphics g )
        {

            Graphics2D g2 = (Graphics2D) g;

            g2.setColor(new Color(0,0,200,50));
            for ( int x = 44; x <= 654; x += 10 )
                for ( int y = 90; y <= 520; y += 10 )
                    g2.drawRect( x, y, 12, 12 );

            g2.setColor(new Color(0,0,200,200));
            g2.drawRect( 60, 488, 584, 28 );//рамка для надписи надпись

            g2.setColor(new Color(255, 255, 255));//бэк для надписи
            g2.fillRect(62,490,582,26);

            g2.setColor(new Color(0,0,200,255));
            g.drawRect( 42, 88, 624, 444 );//рамка

            g2.setColor(new Color(255, 255, 255));
            g2.fillRect(60,150,185,185);

            g2.fillRect(260,150,185,185);

            g2.fillRect(460,150,185,185);

            g2.setColor(new Color(0, 0, 0, 255));


            g2.setStroke(new BasicStroke(2.0f));
//1111111111111111111111111
            g2.drawLine(60,310, 245, 310);
            g2.drawLine(240,307, 245, 310);
            g2.drawLine(240,313, 245, 310);

            g2.drawLine(85,335, 85, 151);
            g2.drawLine(82,156, 85, 151);
            g2.drawLine(88,156, 85, 151);

//2222222222222222222222222222
            g2.drawLine(260,310, 445, 310);
            g2.drawLine(440,307, 445, 310);
            g2.drawLine(440,313, 445, 310);

            g2.drawLine(285,335, 285, 151);
            g2.drawLine(282,156, 285, 151);
            g2.drawLine(288,156, 285, 151);
//333333333333333333333333333333
            g2.drawLine(460,310, 645, 310);
            g2.drawLine(640,307, 645, 310);
            g2.drawLine(640,313, 645, 310);

            g2.drawLine(485,335, 485, 151);
            g2.drawLine(482,156, 485, 151);
            g2.drawLine(488,156, 485, 151);

            for (int i=110; i<=210; i+=25){
                g2.drawLine(i,309, i, 311);
            }

            for (int i=310; i<=410; i+=25){
                g2.drawLine(i,309, i, 311);
            }

            for (int i=510; i<=610; i+=25){
                g2.drawLine(i,309, i, 311);
            }

            for (int i=310; i>=185; i-=25){
                g2.drawLine(84,i, 86, i);
            }

            for (int i=310; i>=185; i-=25){
                g2.drawLine(284,i, 286, i);
            }

            for (int i=310; i>=185; i-=25){
                g2.drawLine(484,i, 486, i);
            }

            g2.setColor(new Color(21, 65, 226, 255));

            QuadCurve2D quadCurve2D1 = new QuadCurve2D.Double(110, 151, 100, 300 , 160, 300);
            QuadCurve2D quadCurve2D2 = new QuadCurve2D.Double(210, 151, 220, 300 , 160, 300);

            QuadCurve2D quadCurve2D3 = new QuadCurve2D.Double(295, 335, 360, 0 , 425, 335);

            QuadCurve2D quadCurve2D4 = new QuadCurve2D.Double(500, 151, 560, 450 , 620, 151);
            g2.draw(quadCurve2D1);
            g2.draw(quadCurve2D2);

            JTextPane text = new JTextPane();
            Label l1=new Label("First Label.");
            l1.setBounds(50,100, 100,30);

            g2.setColor(new Color(255, 2, 3, 255));
            g2.draw(quadCurve2D3);

            g2.setColor(new Color(13, 236, 38, 255));
            g2.draw(quadCurve2D4);
        }

    }


}





