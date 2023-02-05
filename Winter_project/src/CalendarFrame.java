
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class CalendarFrame extends JFrame implements ActionListener {
	Container c = getContentPane();
   
   
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
	
	JLabel jSpace = new JLabel("        상상파크");
	JLabel jStudio = new JLabel("❍  크리에이티브 스튜디오");
	JLabel label = new JLabel("2023  /  1");
	JLabel imgLb4 = new JLabel();
	JLabel jReserve = new JLabel("  예약 날짜를 선택하세요.");
	
	
	JButton[] calBtn = new JButton[49];
	String [] days = {"일","월","화","수","목","금","토"};
	
    CalendarFunction cF = new CalendarFunction();
	
	//달력의 월 넘기는 버튼
	private ImageIcon rightIcon = new ImageIcon("img05.png");
	private JButton rightBtn = new JButton(rightIcon); 
	private ImageIcon leftIcon = new ImageIcon("img06.png");
	private JButton leftBtn = new JButton(leftIcon); 
	
	
	public CalendarFrame() {
		
		setSize(1000, 600); //가로1000 x 세로600 크기
		setTitle("HSU Reservation System");
        c.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//컴포넌트에 추가 
		c.add(jSpace);
		jSpace.setBounds(130, 5, 100, 100);
		jSpace.setForeground(Color.GRAY);
		jSpace.setFont(new Font("Calibri (본문)", Font.PLAIN, 15));
		//jSpace.setFont(jSpace.getFont().deriveFont(200));
		
		
		c.add(jStudio);
		jStudio.setBounds(145, 50, 300, 70);
		jStudio.setFont(new Font("Serif", Font.BOLD, 20));
		
		c.add(jReserve);
		jReserve.setBounds(660, 140, 200, 100);
		jReserve.setForeground(Color.DARK_GRAY);
		
		ImageIcon thirdImg = new ImageIcon("img07.png");  //"상상파크" 라벨 옆 이미지 
		imgLb4.setIcon(thirdImg);
		imgLb4.setBounds(40, 30, 100, 100);
		imgLb4.setHorizontalAlignment(JLabel.CENTER);
		c.add(imgLb4);
		
		
		
		//버튼 배경을 투명하게 설정(화살표 모양만 나오도록) 
		rightBtn.setBorderPainted(false);
		rightBtn.setFocusPainted(false);
		leftBtn.setBorderPainted(false);
		leftBtn.setFocusPainted(false);
		
		//달력 버튼 추가 
		rightBtn.setBounds(630,140,50,50);
		c.add(rightBtn);
		leftBtn.setBounds(330,143,50,50);
		c.add(leftBtn);
	
		
		init();
		start();
	
	}
	
	private void init() {
		
		//년월 panel 
		panel1.setBounds(365,141,300,70);
		c.add(panel1);
		label.setFont(new Font("Gill Sans", Font.BOLD, 35));
		panel1.add(label);
		
		//날짜 panel 
		panel2.setBounds(215, 200, 600, 800);
		c.add(panel2);
		
		//날짜 버튼 붙이기 
		for( int i=0; i < calBtn.length; i++) {
			calBtn[i] = new JButton();
			panel2.add(calBtn[i]);
			
			calBtn[i].setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
			
			if(i<7) calBtn[i].setText(days[i]);
			
			//토,일 색상 설정 
			if(i%7 == 0) calBtn[i].setForeground(Color.RED);
			if(i%7 == 6) calBtn[i].setForeground(Color.BLUE);
		}
		cF.setButtons(calBtn);
		cF.calSet();
	}
	
	private void start() {
		rightBtn.addActionListener(this);
		leftBtn.addActionListener(this);
	}
	
	//화살표 버튼 클릭시 생기는 이벤트 
	@Override
	public void actionPerformed(ActionEvent e) {
		int gap = 0;
		if(e.getSource() == rightBtn) {
			gap = 1;
		} else if (e.getSource() == leftBtn) {
			gap = -1;
		}
		cF.allInit(gap);
		label.setText(cF.getCalText()); 
	}

}
