package com.service;

import java.sql.SQLException;
import java.sql.Statement;

import com.db.Database;
import com.model.Area;

public class  AreaServiceImpl implements AreaService{

	
	
	public void CalculateArea(Area a) {
		String sql= "insert into area(length,breadth) value('"+a.getLength()+"','"+a.getBreadth()+"')";
		try {
			Statement stm= Database.getConnection().createStatement();
			stm.execute(sql);
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
}
