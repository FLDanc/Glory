package com.captain.demo.crazy;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/*
 * ���ڷ�ˮ��
 */
public class WaterTimeTask extends TimerTask{
	public void run() {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(500);
		InputThread thread1=new InputThread(queue);
		InputThread thread2=new InputThread(queue);
		OutputThread thread3= new OutputThread(queue);
		
		List<Callable<Object>> threadList = new ArrayList<>(3);
		threadList.add(thread1);
		threadList.add(thread2);
		threadList.add(thread3);
		List<Object> returnValue = null;	
		
		try {
			returnValue = ThreadUtil.runCheckCallable(threadList,true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ӿ���Ѿ�ע��");
		System.out.println(returnValue.get(0));
		System.out.println(returnValue.get(1));
		System.out.println(returnValue.get(2));
		
	}

}
