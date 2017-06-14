package com.tsrtc.tracker;

import java.util.ArrayList;
import java.util.List;

public class FetchFilesSchedule implements Runnable{
	private List<String> filesPath = new ArrayList<String>();
	public void run() {
		FileLocDetPropUtil.load();
		System.out.println(FileLocDetPropUtil.getValue("INPUTLOCATION"));
		System.out.println(FileLocDetPropUtil.getValue("INBOX"));
		System.out.println(FileLocDetPropUtil.getValue("ARCHIVE"));
		System.out.println(FileLocDetPropUtil.getValue("FAILED"));
	}
	public List<String> getFilesPath() {
		return filesPath;
	}
	public void setFilesPath(List<String> filesPath) {
		this.filesPath = filesPath;
	}

}
