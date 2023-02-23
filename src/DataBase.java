
public class DataBase {
	private static String AIinterview[][]; // Ai인터뷰실의 7일치 예약 정보 배열
	private static String CreativeStudio[][];
	private static String CC_Studio[][];
	private static String AI_Bigdata[][];
	private static String MotionTracking[][];
	private static String Seminarroom[][];
	private static String Smallroom[][];

	public DataBase() {
		AIinterview = new String[7][4];
	}

	public void setAIinterview(int n, int time, String inform) {
		AIinterview[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (AIinterview[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(AIinterview[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void setCreativeStudio(int n, int time, String inform) {
		CreativeStudio[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (CreativeStudio[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(CreativeStudio[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void setCC_Studio(int n, int time, String inform) {
		CC_Studio[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (CC_Studio[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(CC_Studio[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void setAI_Bigdata(int n, int time, String inform) {
		AI_Bigdata[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (AI_Bigdata[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(AI_Bigdata[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void setMotionTracking(int n, int time, String inform) {
		MotionTracking[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (MotionTracking[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(MotionTracking[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void setSeminarroom(int n, int time, String inform) {
		Seminarroom[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (Seminarroom[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(Seminarroom[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void setSmallroom(int n, int time, String inform) {
		Smallroom[n][time] = inform;

		// 테스트를 위해 DB 출력
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				if (Smallroom[i][j] == null)
					System.out.print("   -----   \t");
				else
					System.out.print(Smallroom[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
