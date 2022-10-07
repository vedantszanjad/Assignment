package com.yash.assignmenettwo;
import java.time.LocalDate;
class Atheltics 
{
	int aid; 
	String aname; 
	String address;
	private LocalDate dob;
	
	public Atheltics(int aid, String aname, String address, LocalDate dob) 
	{
		super();
		this.aid = aid;
		this.aname = aname;
		this.address = address;
		this.dob = dob;
	}
}

class Cricket_Player extends Atheltics
{
	String teamname; 
	int jersyno; 
	int totalruns; 
	int highestscore;
	double avg; 
	int totalmatchedplayed;
	
	public Cricket_Player(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalruns, int highestscore, double avg, int totalmatchedplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalruns = totalruns;
		this.highestscore = highestscore;
		this.avg = avg;
		this.totalmatchedplayed = totalmatchedplayed;
	}

	@Override
	public String toString() {
		return "Cricket_Player [teamname=" + teamname + ", jersyno=" + jersyno + ", totalruns=" + totalruns
				+ ", highestscore=" + highestscore + ", avg=" + avg + ", totalmatchedplayed=" + totalmatchedplayed
				+ ", aid=" + aid + ", aname=" + aname + ", address=" + address + "]";
	}
}
class Football_Players extends Atheltics
	{

		
		public Football_Players(int aid, String aname, String address, LocalDate dob) 
		{
			super(aid, aname, address, dob);
			// TODO Auto-generated constructor stub
		}
		
		String teamname;
		int jersyno;
		int totalgoals;
		int highestgoal_in_a_match; 
		int totalmatchedplayed;
		
		public Football_Players(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
				int totalgoals, int highestgoal_in_a_match, int totalmatchedplayed) {
			super(aid, aname, address, dob);
			this.teamname = teamname;
			this.jersyno = jersyno;
			this.totalgoals = totalgoals;
			this.highestgoal_in_a_match = highestgoal_in_a_match;
			this.totalmatchedplayed = totalmatchedplayed;
		}

		@Override
		public String toString() {
			return "Football_Players [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
					+ ", highestgoal_in_a_match=" + highestgoal_in_a_match + ", totalmatchedplayed=" + totalmatchedplayed
					+ ", aid=" + aid + ", aname=" + aname + ", address=" + address + "]";
		}
		
	}
	

class Hockey_Player extends Atheltics
{
	String teamname; 
	int jersyno; 
	int totalgoals; 
	int highest_goal_in_a_match; 
	int total_matched_played;
	
	public Hockey_Player(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalgoals, int highest_goal_in_a_match, int total_matched_played) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.highest_goal_in_a_match = highest_goal_in_a_match;
		this.total_matched_played = total_matched_played;
	}

	@Override
	public String toString() {
		return "Hockey_Player [teamname=" + teamname + ", jersyno=" + jersyno + ", totalgoals=" + totalgoals
				+ ", highest_goal_in_a_match=" + highest_goal_in_a_match + ", total_matched_played="
				+ total_matched_played + ", aid=" + aid + ", aname=" + aname + ", address=" + address + "]";
	}	
	
}



public class Program_Seven 
{
	
		public static void main(String[] args) 
	{
		 Cricket_Player cr = new Cricket_Player(01, "Virat kohali", "mumbai", LocalDate.of(1996, 10, 06), "RCB", 07, 20000, 139, 73, 400);
	     Football_Players fb = new Football_Players(02, "Ronaldo", "Pune", LocalDate.of(1990, 01, 01),"Indian national football team", 07, 1000, 1000, 0);
	     Hockey_Player hp = new Hockey_Player(3, "Dhanchand", "Hyd", LocalDate.of(1960, 05, 07), "Indian Hockey", 2, 700, 11, 1000);
	
	     System.out.println(cr);
	     System.out.println(fb);
	     System.out.println(hp);
	
	
	}
}
