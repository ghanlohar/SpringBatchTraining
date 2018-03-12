package com.trizetto.training.processors;


import org.springframework.batch.item.ItemProcessor;

import com.trizetto.training.model.Claim;

public class ClaimProcessor implements ItemProcessor<Claim, Claim>{
	public Claim process( Claim claim) throws Exception{
		System.out.println("Claim object recieved as: " +claim);
		return claim;
	}

}
