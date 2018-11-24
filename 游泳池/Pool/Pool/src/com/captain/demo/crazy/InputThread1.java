package com.captain.demo.crazy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/*
 * 注水线程
 */
public class InputThread1 implements Callable<Object>{
	private BlockingQueue<String> queue;
	
	public InputThread1(BlockingQueue queue) {
		this.queue=queue;
	}
	
	public Object call() throws InterruptedException{
		while(true) {
			boolean flag= true;
			for(int cnt =0;cnt<4;cnt++) {
				flag=queue.offer("1立方米");
				if(!flag) {
					break;
				}
			}
			System.out.println("注水5立方米，当前水量： "+queue.size());
			if(!flag) {
				break;
			}
			TimeUnit.MILLISECONDS.sleep(1);
		}
		return "success";
	}
	
}

