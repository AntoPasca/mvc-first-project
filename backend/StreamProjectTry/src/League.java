import java.util.List;

public class League {
	String name;
	String country;
	String president;
	List<Team> teams;
	
	public League(String name, String country, String president, List<Team> teams) {
		super();
		this.name = name;
		this.country = country;
		this.president = president;
		this.teams = teams;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	@Override
	public String toString() {
		return "League [name=" + name + ", country=" + country + ", president=" + president + ", teams=" + teams + "]";
	}
	
	
	
}
