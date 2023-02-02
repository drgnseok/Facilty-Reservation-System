import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import java.util.Calendar;

public class TimeTable extends JFrame {
	private Dimension frameSize, screenSize;
	private JPanel panel = new JPanel();
	private int width;
	private int height;
	private String dayString[] = { "일", "월", "화", "수", "목", "금", "토" };
	public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	public LocalDate now = LocalDate.now();
	public String formatedNow = now.format(formatter);
	public int dayOfWeekValue = now.getDayOfWeek().getValue();
	
	
	private String year;	private String month;
	private String day;		private String today;
	private int dayGap;
	
	private JLabel todayLabel;
	
	private JTextField TF1_1;	private JTextField TF1_2;	
	private JTextField TF2_1;	private JTextField TF2_2;	
	private JTextField TF3_1;	private JTextField TF3_2;	
	private JTextField TF4_1;	private JTextField TF4_2;
	
	private JLabel time1;		private JLabel time2;
	private JLabel time3;		private JLabel time4;

	// 생성자. n은 해당 날짜를 나타내기 위해 추가.(now + n)
	public TimeTable(int width, int height, int n) {
		setTitle("예약페이지");
		this.width = width;
		this.height = height;
		
		Calendar cal = Calendar.getInstance();
		this.dayGap = n-dayOfWeekValue;
		
		//해당 날짜 초기화
		this.year = Integer.toString(cal.get(Calendar.YEAR));
		this.month = Integer.toString(cal.get(Calendar.MONTH)+1);
		this.day = Integer.toString(cal.get(Calendar.DAY_OF_MONTH)+this.dayGap);
		this.today = this.year + "년 " + this.month + "월 " + this.day + "일 " + dayString[(dayOfWeekValue + dayGap)%7];

		
		setSize(this.width, this.height); // 가로 세로 1000 560 크기 - 이미지 크기에 맞춤
		setContentPane(panel);
		screenSizeLocation(); // 창 화면 중앙에 위치
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null); // 절대좌표 사용하기 위해 레이아웃 null

		addTodayLabel(n);
		addTimeLabel();
		addTextField();
		this.repaint();
	}

	public void addTodayLabel(int n) {
		
		//오늘 날짜	
		todayLabel = new JLabel(this.today); //String + Integer라 안됨
		todayLabel.setOpaque(true);
		todayLabel.setBounds(45,0,150,30);
		todayLabel.setBackground(Color.LIGHT_GRAY);
		todayLabel.setHorizontalAlignment(JLabel.CENTER); //가운데정렬
		panel.add(todayLabel);
	}
	
	public void addTimeLabel() {
		int TLStartX = 10;	int TLStartY = 70;	//TimeLabel 시작 좌표
		int TLSizeX = 57;	int TLSizeY = 30;	//TimeLabel 크기
		
		//라벨 생성
		time1 = new JLabel("10:00~12:00");	time2 = new JLabel("12:00~14:00");
		time3 = new JLabel("14:00~16:00");	time4 = new JLabel("16:00~18:00");
		
		//라벨 보이게
		time1.setOpaque(true);	time2.setOpaque(true);
		time3.setOpaque(true); 	time4.setOpaque(true);
		
		//라벨 폰트 설정
		time1.setFont(new Font("고딕체",Font.BOLD,10));	time2.setFont(new Font("고딕체",Font.BOLD,10));
		time3.setFont(new Font("고딕체",Font.BOLD,10));	time4.setFont(new Font("고딕체",Font.BOLD,10));
		
		//라벨 글자 가운데 정렬
		time1.setHorizontalAlignment(JLabel.CENTER);	time2.setHorizontalAlignment(JLabel.CENTER);
		time3.setHorizontalAlignment(JLabel.CENTER);	time4.setHorizontalAlignment(JLabel.CENTER);
		
		//라벨 배치
		time1.setBounds(TLStartX,TLStartY,TLSizeX,TLSizeY);		time2.setBounds(TLStartX,TLStartY+40,TLSizeX,TLSizeY);
		time3.setBounds(TLStartX,TLStartY+80,TLSizeX,TLSizeY);	time4.setBounds(TLStartX,TLStartY+120,TLSizeX,TLSizeY);
		
		//라벨 배경색
		time1.setBackground(Color.LIGHT_GRAY);	time2.setBackground(Color.LIGHT_GRAY);
		time3.setBackground(Color.LIGHT_GRAY);	time4.setBackground(Color.LIGHT_GRAY);
		
		//라벨 추가
		panel.add(time1);	panel.add(time2);
		panel.add(time3);	panel.add(time4);
	}
	
	//텍스트필드 생성
	public void addTextField() {
		int TFStartX = 80;		int TFStartY = 70;	//텍스트필드 시작 좌표
		int TFSizeX = 70;		int TFSizeY = 30;	//텍스트필드 크기
		
		TF1_1 = new JTextField("학번",8);		TF1_2 = new JTextField("이름",12);
		TF2_1 = new JTextField("학번",8);		TF2_2 = new JTextField("이름",12);
		TF3_1 = new JTextField("학번",8);		TF3_2 = new JTextField("이름",12);
		TF4_1 = new JTextField("학번",8);		TF4_2 = new JTextField("이름",12);
		
		TF1_1.setFont(new Font("고딕체",Font.PLAIN,8));		TF1_2.setFont(new Font("고딕체",Font.PLAIN,8));
		TF2_1.setFont(new Font("고딕체",Font.PLAIN,8));		TF2_2.setFont(new Font("고딕체",Font.PLAIN,8));
		TF3_1.setFont(new Font("고딕체",Font.PLAIN,8));		TF3_2.setFont(new Font("고딕체",Font.PLAIN,8));
		TF4_1.setFont(new Font("고딕체",Font.PLAIN,8));		TF4_2.setFont(new Font("고딕체",Font.PLAIN,8));
		
		TF1_1.setBounds(TFStartX,TFStartY,TFSizeX,TFSizeY);			TF1_2.setBounds(TFStartX+80,TFStartY,TFSizeX,TFSizeY);
		TF2_1.setBounds(TFStartX,TFStartY+40,TFSizeX,TFSizeY);		TF2_2.setBounds(TFStartX+80,TFStartY+40,TFSizeX,TFSizeY);
		TF3_1.setBounds(TFStartX,TFStartY+80,TFSizeX,TFSizeY);		TF3_2.setBounds(TFStartX+80,TFStartY+80,TFSizeX,TFSizeY);
		TF4_1.setBounds(TFStartX,TFStartY+120,TFSizeX,TFSizeY);		TF4_2.setBounds(TFStartX+80,TFStartY+120,TFSizeX,TFSizeY);
		
		panel.add(TF1_1);		panel.add(TF1_2);
		panel.add(TF2_1);		panel.add(TF2_2);
		panel.add(TF3_1);		panel.add(TF3_2);
		panel.add(TF4_1);		panel.add(TF4_2);
	}

	// 창 화면 중앙에 위치
	private void screenSizeLocation() {
		frameSize = getSize();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}

	/*
	 * public static void main(String[] args) { new TimeTable(200, 350, 0); }
	 */
}
