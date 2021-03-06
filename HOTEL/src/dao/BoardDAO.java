package board;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import common.JdbcUtil;

public class BoardDAO {
	private JdbcUtil ju;
	
	public BoardDAO() {
		ju = JdbcUtil.getInstance();
	}
	//삽입(C)
	public int insert(BoardDTO dto) {
		Connection conn  = null;
		PreparedStatement pstmt  = null;
		String sql = "insert into board (title,writer,content,regdate,hit) values ( ?, ?, ?,now(),0)";
		int rs = -1;
		try {
			conn = ju.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getWriter());
			pstmt.setString(3, dto.getContent());
			rs = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
			if(conn != null) {
				try {
					conn.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return rs;
	}	
	
	//조회(R)
	public List<BoardDTO> selectAll(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select board_id,title,writer,content,regdate,hit from board order by board_id desc";
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		try {
			conn = ju.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				BoardDTO dto = new BoardDTO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						new Date(rs.getDate(5).getTime()),
						rs.getInt(6));
						list.add(dto);						
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}

			if(stmt != null) {
				try {
					stmt.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
			
			if(conn != null) {
				try {
					conn.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return list;		
	}
	
	//조회(R)
	public BoardDTO selectOne(int board_id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select board_id,title,writer,content,regdate,hit from board where board_id=?";
		BoardDTO dto = null;
		try {
			conn = ju.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board_id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				updateHit(board_id); // 조회수 증가
				dto = new BoardDTO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						new Date(rs.getDate(5).getTime()),
						rs.getInt(6) + 1 );	// 조회수 증가	 		
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}

			if(pstmt != null) {
				try {
					pstmt.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
			
			if(conn != null) {
				try {
					conn.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return dto;		
	}
		
	//수정(U)
	public int update(BoardDTO dto) {
		Connection conn  = null;
		PreparedStatement pstmt  = null;
		String sql = "update board set title=?, content=? where board_id=?";
		int rs = -1;
		try {
			conn = ju.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());
			pstmt.setInt(3, dto.getBoard_id());
			rs = pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
			if(conn != null) {
				try {
					conn.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return rs;
	}	
	
	public int updateHit(int board_id) {
		Connection conn  = null;
		PreparedStatement pstmt  = null;
		String sql = "update board set hit=hit+1 where board_id=?";
		int rs = -1;
		try {
			conn = ju.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board_id);
			rs = pstmt.executeUpdate();		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
			if(conn != null) {
				try {
					conn.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return rs;
	}		
		
	//삭제(D)
	
	public int delete(int board_id) {
		Connection conn  = null;
		PreparedStatement pstmt  = null;
		String sql = "delete from board where board_id=?";
		int rs = -1;
		try {
			conn = ju.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board_id);
			rs = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close(); // 커넥션 풀에 반환
				} catch (SQLException e) {
					e.printStackTrace();
				} 
			}
		}
		return rs;
		
	}
}