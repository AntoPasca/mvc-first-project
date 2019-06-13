import java.util.List;

public class Team {
	String name;
	String coach;
	String stadium;
	List<Player> rosters;
	
	
	public Team(String name, String coach, String stadium, List<Player> rosters) {
		super();
		this.name = name;
		this.coach = coach;
		this.stadium = stadium;
		this.rosters = rosters;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCoach() {
		return coach;
	}


	public void setCoach(String coach) {
		this.coach = coach;
	}


	public String getStadium() {
		return stadium;
	}


	public void setStadium(String stadium) {
		this.stadium = stadium;
	}


	public List<Player> getRosters() {
		return rosters;
	}


	public void setRosters(List<Player> rosters) {
		this.rosters = rosters;
	}


	@Override
	public String toString() {
		return "Team [name=" + name + ", coach=" + coach + ", stadium=" + stadium + ", rosters=" + rosters + "]";
	}
	
	
	
	
}
