package board.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("BoardDao")
public class BoardDao {

	
	private final String namespace="board.model.Board";
	
	@Autowired
	private SqlSessionTemplate sqlsessionTemplate;

	public int insertBoard(BoardBean board) {
		
		int cnt =0;
		cnt =sqlsessionTemplate.insert(namespace+".InsertBoard", board);
		
		System.out.println("insert cnt:"+cnt);
		return cnt;
	}
	

	
}
