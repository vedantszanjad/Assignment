package com.yash.programone;

public class Movie {
	
	private String movieName;
	private String movieTime;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieName, String movieTime) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public void show()
	{
		System.out.println("MovieName:- "+movieName);
		System.out.println("MovieTime :-  "+movieTime);
	
	}
	

}
