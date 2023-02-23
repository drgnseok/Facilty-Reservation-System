package faciltyDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.MysqlConnetion;
import faciltyVO.DataVO;

//DB의 data에 접근하기 위한 클래스 연결 해서 CRUD 하는 기능한다.
public class DataDAO {
	
	private Connection con;
    PreparedStatement pstmt = null; //인자값 전달을 가능하게 해주는 객체
    ResultSet rs = null;
    
    public DataDAO() throws ClassNotFoundException, SQLException {
       con = new MysqlConnetion().getConnection();
    }
    
    void insertId(DataVO vo) {
    	String sql = "insert into space values(?, ?, ?, ?, ?)";
    	
    	try {
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, vo.getId());
	    	pstmt.setString(2, vo.getName());
	    	pstmt.setString(3, vo.getPlace());
	    	pstmt.setInt(4, vo.getStartTime());
	    	pstmt.setString(5, vo.getDate());
	    	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("insertId error");
		}    	
    }

}
