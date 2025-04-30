package com.javaex.ex10;

public class SongApp {

	public static void main(String[] args) {
		/*
		Song s01 = new Song();
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		
		s01.showInfo();
		System.out.println("-----------------------------------");
		*/
		
		/*
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGN", "2007");     
		s02.showInfo();
		*/
		
		
		System.out.println("-----------------------------------");
		
		Song s03 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGN", "2007", 100);
		s03.showInfo();
	
		/*
		Song("거짓말", "빅뱅")
		Song("거짓말", "always")
		Song(노래제목, 트랙)
		*/
		
	}
	
}
