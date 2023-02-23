import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame{
	private Dimension frameSize, screenSize;
	private MyPanel panel = new MyPanel();
	int width, height; //창 너비, 높이
	
	private RoundedButton btn1 = new RoundedButton("• 크리에이티브 스튜디오");
	private RoundedButton btn2 = new RoundedButton("• 모션 트래킹 스튜디오");
	private RoundedButton btn3 = new RoundedButton("• C&C 스튜디오");
	private RoundedButton btn4 = new RoundedButton("• 소모임실");
	private RoundedButton btn5 = new RoundedButton("• AI&빅데이터 실습실");
	private RoundedButton btn6 = new RoundedButton("• 세미나실");
	private RoundedButton btn7 = new RoundedButton("• AI 면접실");
	
	//생성자
	public MainPage(int width, int height) {
		setTitle("한성대학교 시설물 예약 시스템");
		this.width = width;	this.height = height;
		
		setSize(this.width, this.height); //가로 세로 1000 560 크기 - 이미지 크기에 맞춤
		setContentPane(panel);
		screenSizeLocation(); //창 화면 중앙에 위치
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); //절대좌표 사용하기 위해 레이아웃 null

		addButton(); //초기화(버튼 생성)
	}
	
	//초기화 함수. 버튼 생성
	public void addButton() {
		
		btn1.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		btn2.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		btn3.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		btn4.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		btn5.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		btn6.setFont(new Font("맑은 고딕", Font.PLAIN, 9));
		btn7.setFont(new Font("맑은 고딕", Font.PLAIN, 9));

		btn1.setBounds(120,340,150,30);
		btn2.setBounds(120,392,150,30);
		btn3.setBounds(120,443,150,30);
		btn4.setBounds(420,364,150,30);
		btn5.setBounds(420,418,150,30);
		btn6.setBounds(730,364,150,30);
		btn7.setBounds(730,418,150,30);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(btn6);
		this.add(btn7);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreativeStudio(width, height);
				setVisible(false);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MotionTracking(width, height);
				setVisible(false);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CC_Studio(width, height);
				setVisible(false);
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Smallroom(width, height);
				setVisible(false);
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AI_Bigdata(width, height);
				setVisible(false);
			}
		});
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Seminarroom(width, height);
				setVisible(false);
			}
		});
		
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AIinterview(width, height);
				setVisible(false);
			}
		});
	}
	
	//이미지를 배경으로 넣는 패널
	class MyPanel extends JPanel {
		private ImageIcon mainImg = new ImageIcon("images/MainPage.jpg");
		private Image img = mainImg.getImage();
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,getWidth(),getHeight(),this);
			panel.repaint();
		}
	}

	//창 화면 중앙에 위치
	private void screenSizeLocation() {
		frameSize = getSize();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);
	}
	
}