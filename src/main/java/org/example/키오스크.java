package org.example;
import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
public class 키오스크 {
    static JFrame frame = new JFrame("키오스크");
    static JPanel panel_north = new JPanel();
    static JPanel panel_center = new JPanel();


    static JButton button1 = new JButton("커피");

    static JButton button2 = new JButton("버블티");

    static JButton button3 = new JButton("주스");

    static JButton button4 = new JButton("차");

    static JButton button5 = new JButton("디저트");




    public static void northPanel() {

        panel_north.setLayout(new FlowLayout()); // 레이아웃을 FlowLayout으로 지정
        frame.add(panel_north);



        button1.setBackground(Color.white); // 버튼의 색깔지정
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);


        panel_north.add(button1);

        panel_north.add(button2);

        panel_north.add(button3);

        panel_north.add(button4);

        panel_north.add(button5);

        button1.setPreferredSize(new Dimension(90 ,40));
        button2.setPreferredSize(new Dimension(90 ,40));
        button3.setPreferredSize(new Dimension(90 ,40));
        button4.setPreferredSize(new Dimension(90 ,40));
        button5.setPreferredSize(new Dimension(90 ,40));

    }

    public static void centerPanel() {




    }



    public 키오스크 () {


        northPanel();
        centerPanel();



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 x버튼을 활성화하여 닫기버튼이 실행가능해짐

        frame.setLocation(600, 300); // 프레임 실행시 위치 지정

        frame.setSize(500, 600); // 프레임 사이즈 지정

        frame.setVisible(true); // 프레임을 보이게 함

    }




}
