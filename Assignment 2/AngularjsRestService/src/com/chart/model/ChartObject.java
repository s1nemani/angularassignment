package com.chart.model;



public class ChartObject {
	private int time;
	private int maxMemory;
	private int memoryAvailable;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public long getMaxMemory() {
		return maxMemory;
	}
	public void setMaxMemory(int maxMemory) {
		this.maxMemory = maxMemory;
	}
	public long getMemoryAvailable() {
		return memoryAvailable;
	}
	public void setMemoryAvailable(int memoryAvailable) {
		this.memoryAvailable = memoryAvailable;
	}
	

}
