import java.util.Calendar;

import javax.swing.JButton;

public class CalendarFunction {
	JButton[] calBtn;
	Calendar cal = Calendar.getInstance();
	int year, month;
	
	public CalendarFunction() {
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
	}
	public void setButtons(JButton[] calBtn) {
		this.calBtn = calBtn;
	}
	
	public String getCalText() {
		return year + "  /  " + month ;
	}
	
	//달력 날짜 출력 함수 
	public void calSet() {
		cal.set(year, month-1, 1);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		firstDay--;
		
		//calBtn[7]부터 날짜 출력 
		for(int i=1; i<= cal.getActualMaximum(cal.DATE); i++) {
			calBtn[6 + firstDay + i].setText(String.valueOf(i));
		}
	}
	//달력 년월 출력 함수 
	public void allInit(int gap) {
		//날짜 지우기 
		for(int i=7; i < calBtn.length; i++) {
			calBtn[i].setText("");
		}
		
		month += gap;
		if(month <= 0) {
			year--;
			month = 12;
		} else if(month >= 13) {
			year++;
			month =1;
		}
		calSet();
	}
	
}
