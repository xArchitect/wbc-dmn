package xprogrammer.wbc.dmn.dba.dvo;

import java.io.Serializable;

public class DbaDvo implements Serializable {

	private static final long serialVersionUID = 4799922528544795432L;

	private String sql	;	// SQL

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}
	
	
}
