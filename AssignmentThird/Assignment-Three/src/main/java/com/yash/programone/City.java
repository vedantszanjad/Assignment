package com.yash.programone;


public class City {
 
	private  String cityName;
	private  String cityPincode;
	private CinemaHall cinemaHall;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String cityName, String cityPincode, CinemaHall cinemaHall) {
		super();
		this.cityName = cityName;
		this.cityPincode = cityPincode;
		this.cinemaHall = cinemaHall;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityPincode() {
		return cityPincode;
	}
	public void setCityPincode(String cityPincode) {
		this.cityPincode = cityPincode;
	}
	public CinemaHall getCinemaHall() {
		return cinemaHall;
	}
	public void setCinemaHall(CinemaHall cinemaHall) {
		this.cinemaHall = cinemaHall;
	}
	public void show()
	{
		System.out.println("CityName :-"+cityName);
		System.out.println("CityPincode :-  "+cityPincode);
		System.out.println("CinemaHall :-  ");
		cinemaHall.show();
		System.out.println("");
	}
}
