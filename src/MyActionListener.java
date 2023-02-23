import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//버튼 이벤트 처리를 위한 클래스
//없애고 클래스에 하나하나 추가할 예정
public class MyActionListener implements ActionListener {

	private int n; //오늘 날짜+n 으로 해당 날짜 표시
	private String name; //name은 예약할 방 이름
	
	//생성자
	MyActionListener(int n, String name){
		this.n=n;
		this.name = name;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new TimeTable(250,350,n, name); //예약 타임 테이블
		//지금은 버튼 누를때 마다 새 TimeTable 클래스가 생성되니
		//미리 클래스를 만들어 놓고 버튼을 누르면 해당 날짜의 클래스를 불러오는 식으로 변경
	}

}
