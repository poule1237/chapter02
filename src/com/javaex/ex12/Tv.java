package com.javaex.ex12;

public class Tv {

	//필드
	
	private int Channel ;
	private int volume;
	private boolean power;
	
	
	//생성자
	public void Tv () {
		
	}
	public Tv() {
		
	}
	//메소드
	public void setPower(boolean p) {
		this.power = p;
	}
	public void  setVolume(int v) {
		this.volume = v;
	}
	public void setChannel(int c) {
		this.Channel=c;
	}
	
	
	public boolean getPower() {
		return power;
	}
	public int getVolume() {
		return volume;
	}
	public int getChannel() {
		return Channel;
	}
	
	
	
	
}
