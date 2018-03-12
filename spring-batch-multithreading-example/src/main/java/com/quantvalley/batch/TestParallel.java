package com.quantvalley.batch;

import java.util.concurrent.ForkJoinPool;

public class TestParallel {
	public static void main (String[] args){
		ForkJoinPool cp = ForkJoinPool.commonPool();
		System.out.println("Parallel is: "+cp.getParallelism());
		System.out.println("ActiveThreadCount is: "+cp.getActiveThreadCount());
		System.out.println("PoolSize is: "+cp.getPoolSize());
	}
}
