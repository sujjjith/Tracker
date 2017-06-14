package com.tsrtc.tracker;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerPool {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
		//schedule to run after sometime
			FetchFilesSchedule worker = new FetchFilesSchedule();
			scheduledThreadPool.scheduleAtFixedRate(worker, 0, 5, TimeUnit.SECONDS);
	}
}
