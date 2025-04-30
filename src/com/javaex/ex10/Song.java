package com.javaex.ex10;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;

	// 생성자
	// 기본생성자()
	public Song() {//메모리
		System.out.println("Song()");
	}
	
	//생성자 구분 규칙   Song(String, String)
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	/*
	//생성자 구분 규칙   Song(String, String)
	public Song(String title, String album) {
		this.title = title;
		this.artist = artist;
	}
	*/
	
	//생성자 구분 규칙 Song(int, String)
	//생성자 구분 규칙 Song(String, int)
	public Song(String title, int track) {
		this.title = title;
		this.track = track;  
	}
	
	
	//생성자(5개)
	public Song(String title, String artist, String album, String composer, String year) {
		//메모리
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year; //복잡한 로직2이 있다
		System.out.println("Song(5)");
	}
	
	
	// 생성자(6개)
	public Song(String title, String artist, String album, String composer, String year, int track) {
		//this(5) --> Song(5) 를 호출
		this(title, artist, album, composer, year);	//메모리
		
		this.track = track;  //일반적인 업무는 메모리에 올라간후에 해야한다
		
		System.out.println("Song(6)");
		
	}
	
	
	
	
	// 메소드 gs
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메도스 일반
	public void showInfo() {
		System.out.println(artist + ", " + title +
				"(" + album + ", " + year + ", " + 
				track + "번 track, " + composer + " 작곡)" );
	}
	
	
}
