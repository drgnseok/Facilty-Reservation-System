import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AIinterview extends JFrame {
	private Dimension frameSize, screenSize;
	private int width;
	private int height;

	private String year;
	private String month;
	private String day;
	private String today;
	private int dayGap;
	Calendar cal = Calendar.getInstance();

	private JPanel panel = new JPanel();

	private RoundedButton btnArray[] = new RoundedButton[14];
	private int btnStartX = 250;
	private int btnStartY = 400;
	private int btnWidth = 70;
	private int btnHeight = 25;

	private JLabel roomLabel;
	private JLabel todayLabel;
	private JLabel dayLabel[] = new JLabel[7];
	private String dayString[] = { "일", "월", "화", "수", "목", "금", "토" };
	public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	public LocalDate now = LocalDate.now();
	public String formatedNow = now.format(formatter);
	public int dayOfWeekValue = now.getDayOfWeek().getValue(); // arraybound exception -> %7 추가

	public AIinterview(int width, int height) {
		setTitle("AI면접실");
		this.width = width;
		this.height = height;

		this.year = Integer.toString(cal.get(Calendar.YEAR));
		this.month = Integer.toString(cal.get(Calendar.MONTH) + 1);
		this.day = Integer.toString(cal.get(Calendar.DAY_OF_MONTH) + this.dayGap);
		this.today = this.year + "년 " + this.month + "월 " + this.day + "일 " + dayString[(dayOfWeekValue + dayGap) % 7];

		setSize(this.width, this.height); // 가로 세로 1000 560 크기 - 이미지 크기에 맞춤

		setContentPane(panel);
		panel.setBackground(Color.WHITE);

		screenSizeLocation(); // 창 화면 중앙에 위치
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(null); // 절대좌표 사용하기 위해 레이아웃 null

		System.out.println(dayOfWeekValue);

		if (dayOfWeekValue == 7)
			dayOfWeekValue = 0;

		addButton(); // 버튼 삽입
		addLabel(); // 라벨 삽입

		panel.repaint();
	}

	// 버튼 삽입
	public void addButton() {

		// 버튼 생성
		for (int i = 0; i < 14; i++) {
			btnArray[i] = new RoundedButton();
			if (i > 6)
				btnStartY = 400 + btnHeight + 3; // 두번째 줄 y값
			btnArray[i].setBounds(btnStartX + ((btnWidth + 3) * (i % 7)), btnStartY, btnWidth, btnHeight); // 버튼 위치, 크기
																											// 설정
			btnArray[i].setBackground(Color.LIGHT_GRAY); // 버튼 색 설정
			panel.add(btnArray[i]); // 버튼 화면에 추가
		}

		// 오늘부터 일주일 뒤 까지 해당 날짜 버튼 색 변경
		for (int i = dayOfWeekValue; i < dayOfWeekValue + 7; i++) {
			btnArray[i].setBackground(Color.PINK);
			btnArray[i].setText(Integer.toString(Integer.parseInt(day) + i - dayOfWeekValue));
			btnArray[i].addActionListener(new AIinterviewActionListener(i));
		}
	}

	// 라벨 삽입
	public void addLabel() {

		// 방 이름 라벨 - 상단에 위치
		roomLabel = new JLabel("AI 면접실");
		roomLabel.setOpaque(true);
		roomLabel.setBounds(45, 20, 120, 30);
		roomLabel.setBackground(Color.LIGHT_GRAY);
		roomLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		roomLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(roomLabel);

		// 오늘 날짜
		todayLabel = new JLabel(formatedNow + " (" + dayString[dayOfWeekValue] + ")");
		todayLabel.setOpaque(true);
		todayLabel.setBounds(825, 50, 120, 30);
		todayLabel.setBackground(Color.LIGHT_GRAY);
		roomLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		todayLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(todayLabel);

		// 요일 라벨
		for (int i = 0; i < 7; i++) {
			dayLabel[i] = new JLabel(dayString[i]);
			dayLabel[i].setOpaque(true);
			dayLabel[i].setBounds(btnStartX + ((btnWidth + 3) * i), btnStartY - 70, btnWidth, btnHeight);
			dayLabel[i].setBackground(Color.LIGHT_GRAY);
			dayLabel[i].setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			if (i == 0)
				dayLabel[i].setBackground(Color.RED);
			if (i == 6)
				dayLabel[i].setBackground(Color.BLUE);
			dayLabel[i].setHorizontalAlignment(JLabel.CENTER);
			this.add(dayLabel[i]);
		}

	}

	// 창 화면 중앙에 위치
	private void screenSizeLocation() {
		frameSize = getSize();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	}

}
