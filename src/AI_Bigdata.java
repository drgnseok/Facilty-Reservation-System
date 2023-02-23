import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AI_Bigdata extends AIinterview {

	public AI_Bigdata(int width, int height) {
		super(width, height);
		setTitle("AI&빅데이터 실습실");

	}

	public void addLabel() {

		// 방 이름 라벨 - 상단에 위치
		roomLabel = new JLabel();
		// roomLabel.setOpaque(true);
		roomLabel.setBounds(45, 20, 120, 30);
		// roomLabel.setBackground(Color.LIGHT_GRAY);
		roomLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		roomLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(roomLabel);

		// 공간 라벨
		JLabel jSpace = new JLabel("        상상파크 플러스");
		JLabel jStudio = new JLabel("❍  AI&빅데이터 실습실");

		// 상상관
		this.add(jSpace);
		jSpace.setBounds(110, 5, 300, 100);
		jSpace.setForeground(Color.GRAY);
		jSpace.setFont(new Font("맑은고딕", Font.BOLD, 15));

		// AI 면접실
		this.add(jStudio);
		jStudio.setBounds(125, 50, 300, 70);
		jStudio.setFont(new Font("Serif", Font.BOLD, 16));

		// 달력 이미지
		JLabel imgLb4 = new JLabel();
		ImageIcon CalendarImg = new ImageIcon("images/imgCalendar.png");
		imgLb4.setIcon(CalendarImg);
		imgLb4.setBounds(345, 30, 330, 330);
		// imgCalendar.setHorizontalAlignment(JLabel.CENTER);
		this.add(imgLb4);

		// 오늘 날짜
		todayLabel = new JLabel(formatedNow + " (" + dayString[dayOfWeekValue] + ")");
		todayLabel.setOpaque(true);
		todayLabel.setBounds(825, 50, 120, 30);
		todayLabel.setBackground(Color.WHITE);
		roomLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		todayLabel.setHorizontalAlignment(JLabel.CENTER);
		this.add(todayLabel);

		// 요일 라벨
		Color sunday = new Color(255, 77, 77);
		Color saturday = new Color(102, 217, 255);
		for (int i = 0; i < 7; i++) {
			dayLabel[i] = new JLabel(dayString[i]);
			dayLabel[i].setOpaque(true);
			dayLabel[i].setBounds(btnStartX + ((btnWidth + 3) * i), btnStartY - 70, btnWidth, btnHeight);
			dayLabel[i].setBackground(Color.LIGHT_GRAY);
			dayLabel[i].setFont(new Font("맑은 고딕", Font.PLAIN, 15));
			if (i == 0)
				dayLabel[i].setBackground(sunday);
			if (i == 6)
				dayLabel[i].setBackground(saturday);
			dayLabel[i].setHorizontalAlignment(JLabel.CENTER);
			this.add(dayLabel[i]);
		}
	}
}
