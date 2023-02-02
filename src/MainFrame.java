import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	JButton b1 =new JButton("●  크리에이티브 스튜디오");
	JButton b2 =new JButton("●  모션트래킹 스튜디오");
	JButton b3 =new JButton("●  C&C 스튜디오");
	JButton b4 =new JButton("●  소모임실");
	JButton b5 =new JButton("●  AI&빅데이터 실습실");
	JButton b6 =new JButton("●  세미나실");
	JButton b7 =new JButton("●  AI면접실");
	
	JLabel jTitle = new JLabel("◈  Hansung University");
	JLabel jSubTitle = new JLabel("-  공간 대여");
	
	JLabel j1 = new JLabel("상상파크");
	JLabel j2 = new JLabel("상상파크 플러스");
	JLabel j3 = new JLabel("상상관");
	
	JLabel imgLb1 = new JLabel();
	JLabel imgLb2 = new JLabel();
	JLabel imgLb3 = new JLabel();
	
	
		
	public MainFrame() {
		
		//제목,부제목
		add(jTitle);
		jTitle.setBounds(50, 30, 300, 50);
		jTitle.setFont(new Font("Serif", Font.BOLD, 25));
		
		add(jSubTitle);
		jSubTitle.setBounds(85, 50, 200, 50);
		jSubTitle.setForeground(Color.GRAY);
		
		//JLabel관련
		add(j1);
		j1.setBounds(100, 100, 200, 50);
		
		add(j2);
		j2.setBounds(400, 100, 200, 50);
		
		add(j3);
		j3.setBounds(700, 100, 200, 50);
		
		//JLabel로 받은 이미지
		ImageIcon firstImg = new ImageIcon("./images/img01.png");
		ImageIcon secondImg = new ImageIcon("./images/img02.png");
		ImageIcon thirdImg = new ImageIcon("./images/img03.png");
		
		imgLb1.setIcon(firstImg);
		imgLb2.setIcon(secondImg);
		imgLb3.setIcon(thirdImg);
		
		imgLb1.setBounds(100, 150, 200, 200);
		imgLb1.setHorizontalAlignment(JLabel.CENTER);
		getContentPane().add(imgLb1);
		
		imgLb2.setBounds(400, 150, 200, 200);
		imgLb2.setHorizontalAlignment(JLabel.CENTER);
		getContentPane().add(imgLb2);
		
		imgLb3.setBounds(700, 150, 200, 200);
		imgLb3.setHorizontalAlignment(JLabel.CENTER);
		getContentPane().add(imgLb3);
		
		//JButton관련
		b1.setBounds(100, 350, 200, 40);
		add(b1);
		setSize(300, 400);
		setLayout(null);
		
		b2.setBounds(100, 400, 200, 40);
		add(b2);
		setSize(300, 400);
		setLayout(null);
		
		b3.setBounds(100, 450, 200, 40);
		add(b3);
		setSize(300, 400);
		setLayout(null);
		
		b4.setBounds(400, 350, 200, 40);
		add(b4);
		setSize(300, 400);
		setLayout(null);
		
		b5.setBounds(400, 400, 200, 40);
		add(b5);
		setSize(300, 400);
		setLayout(null);
		
		b6.setBounds(700, 350, 200, 40);
		add(b6);
		setSize(300, 400);
		setLayout(null);
		
		b7.setBounds(700, 400, 200, 40);
		add(b7);
		setSize(300, 400);
		setLayout(null);
		
		//JFrame관련
		setSize(1000, 600); //가로1000 x 세로600 크기
		setTitle("HSU Reservation System");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	

}
