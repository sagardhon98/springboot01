package com.ci;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {

	// save Student
	public void saveStudent(Student s1) {
		try {
			//connectivity
			Connection con = DbConnection.dbConnect();
			
			//sql
			String sql = "insert into student(id,name,email) values(?,?,?)";
			
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, s1.getId());
			stmt.setString(2, s1.getName());
			stmt.setString(3, s1.getEmail());
			
			//execute
			stmt.executeUpdate();
			System.out.println("Data insert successfully.");
		} catch (Exception e) {
			System.out.println("Data not insert " + e.getMessage());
		}

	}

	// update Student
	public void updateStudent(Student s1) {
		try {
			//connectivity
			Connection con = DbConnection.dbConnect();
			//sql
			String sql = "update student set email=? where id=?";
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, s1.getEmail());
			stmt.setInt(2, s1.getId());
			//execute
			stmt.executeUpdate();
			System.out.println("Data update successfully");
		} catch (Exception e) {
			System.out.println("Data not update " + e.getMessage());
		}

	}

	// delete Student
	public void deleteStudent(Integer id) {
		try {
			//connectivity
			Connection con = DbConnection.dbConnect();
			
			//sql
			String sql = "delete from student where id=?";
			
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			
			//execute
			stmt.executeUpdate();
			System.out.println("Data delete successfully");
		} catch (Exception e) {
			System.out.println("Data not delete " + e.getMessage());
		}
	}

	// get all Student
	public void getAllStudent() {
		try {
			//connectivity
			Connection con = DbConnection.dbConnect();
			
			//sql
			String sql = "select * from student";
			
			//statement
			PreparedStatement stmt = con.prepareStatement(sql);
			
			//execute
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("email"));
			}
			System.out.println("All data fetch successfully");
		} catch (Exception e) {
			System.out.println("Data not fetch " + e.getMessage());
		}
	}
}
