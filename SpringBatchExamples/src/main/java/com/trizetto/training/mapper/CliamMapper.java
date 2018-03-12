package com.trizetto.training.mapper;
/*
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;*/

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.trizetto.training.model.Claim;

public class CliamMapper implements FieldSetMapper<Claim> {
	public Claim mapFieldSet(FieldSet fieldset) throws BindException{
		Claim claim = new Claim();
		claim.setClaim_id(fieldset.readInt(0));
		
		/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d");
		String date = fieldset.readString(1);
		
		LocalDate ld = LocalDate.parse(date, formatter);*/
		
		claim.setDoc(fieldset.readString(1));
		claim.setAmount(fieldset.readInt(2));
		claim.setPolicyholder_name(fieldset.readString(3));
		return claim;
	}
}
