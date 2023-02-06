
public class DataBase {
	// 1.학번 따로, 이름 따로 // 2. 학번 이름 같이
	
	
	private String AIinterview[][];
	
	public DataBase() {
		AIinterview = new String[7][4];
	}
	
	public void setAIinterview(int n, int time, String inform) {
		AIinterview[n][time] = inform;
		
		//테스트를 위해 DB 출력
		for(int i=0; i<7; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(AIinterview[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
