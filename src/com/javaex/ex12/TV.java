package com.javaex.ex12;

public class TV {

	    // 필드
	    private int channel;
	    private int volume;
	    private boolean power;

	    // 생성자
	    public TV(int channel, int volume, boolean power) {
	        this.power = power;
	        this.channel = (channel >= 0 && channel <= 255) ? channel : 0;
	        this.volume = (volume >= 0 && volume <= 100) ? volume : 0;
	    }

	    // 메소드 gs (getter/setter)
	    public int getChannel() {
	        return channel;
	    }

	    public void setChannel(int channel) {
	        if (power && channel >= 0 && channel <= 255) {
	            this.channel = channel;
	        }
	    }

	    public void setChannel(boolean up) {
	        if (power) {
	            if (up && channel < 255) {
	                channel++;
	            } else if (!up && channel > 0) {
	                channel--;
	            }
	        }
	    }

	    public int getVolume() {
	        return volume;
	    }

	    public void setVolume(int volume) {
	        if (power && volume >= 0 && volume <= 100) {
	            this.volume = volume;
	        }
	    }

	    public void setVolume(boolean up) {
	        if (power) {
	            if (up && volume < 100) {
	                volume++;
	            } else if (!up && volume > 0) {
	                volume--;
	            }
	        }
	    }

	    public boolean getPower() {
	        return power;
	    }

	    public void setPower(boolean on) {
	        this.power = on;
	    }

	    // 메소드 일반 
	    public void status() {
	        System.out.printf("전원:%b 채널:%d 볼륨:%d%n", power, channel, volume);
	    }

	    public void togglePower() {
	        this.power = !this.power;
	    }
	}
