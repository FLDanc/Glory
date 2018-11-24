package com.captain.demo.crazy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/*
 * עˮ�߳�
 */
public class InputThread implements Callable<Object>{
	private BlockingQueue<String> queue;
	
	public InputThread(BlockingQueue queue) {
		this.queue=queue;
	}
	
	public Object call() throws InterruptedException{
		while(true) {
			boolean flag= true;
			for(int cnt =0;cnt<5;cnt++) {
				flag=queue.offer("1������");
				if(!flag) {
					break;
				}
			}
			System.out.println("עˮ5�����ף���ǰˮ���� "+queue.size());
			if(!flag) {
				break;
			}
			TimeUnit.MILLISECONDS.sleep(1);
		}
		return "success";
	}
	
}
