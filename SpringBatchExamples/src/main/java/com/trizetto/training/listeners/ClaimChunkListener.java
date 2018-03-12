package com.trizetto.training.listeners;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class ClaimChunkListener implements ChunkListener {

	public void afterChunk(ChunkContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("After chunk ..........."+ arg0);
	}

	public void afterChunkError(ChunkContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("After chunk error......"+ arg0);
	}

	public void beforeChunk(ChunkContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Before chunk .........."+ arg0);
	}

}
