package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import sql.DB; 

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = sql.DB.getConnection();
		Statement st = null;
		ResultSet rs = null;
		try { 
			conn = sql.DB.getConnection();
			st = (Statement) conn.createStatement();
			rs = st.executeQuery("select * from people");
		
			ArrayList<JSONObject> list = new ArrayList<JSONObject>();
			Integer index=0;
			while(rs.next()) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("id", rs.getInt("id"));
				jsonObject.put("name", rs.getString("name"));
				jsonObject.put("email", rs.getString("email"));
				list.add(index, (JSONObject) jsonObject);
			}
			System.out.println(JSONArray.toJSONString(list));
		}catch ( SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
