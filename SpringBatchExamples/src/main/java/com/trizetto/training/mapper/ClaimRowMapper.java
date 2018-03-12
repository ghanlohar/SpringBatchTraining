package com.trizetto.training.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.trizetto.training.model.Claim;

public class ClaimRowMapper implements RowMapper<Claim>{

	public Claim mapRow(ResultSet rs, int rowNum)  throws SQLException {
		// TODO Auto-generated method stub
		 Claim result = new Claim();
	     result.setClaim_id(rs.getInt("claim_id"));
	     result.setDoc(rs.getString("doc"));
	     result.setAmount(rs.getInt("amount"));
	     result.setPolicyholder_name(rs.getString("policyholder_name"));
	     return result;
	}

}
