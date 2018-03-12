package com.cts.hc.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee person = new Employee();
		person.setClaim_id(rs.getInt("claim_id"));
		person.setDoc(rs.getString("doc"));
		person.setAmount(rs.getInt("amount"));
		person.setPolicyholder_name(rs.getString("policyholder_name"));
		return person;
	}

}
