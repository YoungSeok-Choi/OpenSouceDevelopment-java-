package my.packages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Week9_1 extends JFrame{
    Week9_1(){
        setTitle("오픈소스 9주차 과제_최용석"); //윈도우 창 이름
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); 
        c.add(new NorthPanel(),BorderLayout.NORTH); 
        c.add(new CenterPanel(),BorderLayout.CENTER); 
        setSize(500,500);
        setVisible(true);
         
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week9_1();
	}

	class NorthPanel extends JPanel{ // north패널 클래스 정의
	    NorthPanel(){
	        setBackground(Color.LIGHT_GRAY);
	        this.add(new JButton("Open"));
	        this.add(new JButton("Read"));
	        this.add(new JButton("Close"));
	    }
	}
	
	class CenterPanel extends JPanel{ // 중앙패널 클래스 정의
	    CenterPanel(){
	        this.setLayout(null);
	        String text[] = {"Hello", "Java", "Love"};
	        int x;
	        int y;
	        JLabel label;
	        for(int i=0;i<3;i++) {
	            x = (int)(Math.random()*250); 
	            y = (int)(Math.random()*250);
	            label = new JLabel(text[i]);
	            label.setLocation(x, y); 
	            label.setSize(50,10); 
	            this.add(label);
	        }
	    }
	}
}
