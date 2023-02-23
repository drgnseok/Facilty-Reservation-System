
public class DataBase {
	private static String AIinterview[][]; //Ai인터뷰실의 7일치 예약 정보 배열
	
	public DataBase() {
		AIinterview = new String[7][4];
	}
	
	public void setAIinterview(int n, int time, String inform) {
		AIinterview[n][time] = inform;
		
		//테스트를 위해 DB 출력
		System.out.println("");
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
				if(AIinterview[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(AIinterview[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
