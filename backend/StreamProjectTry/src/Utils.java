import java.util.ArrayList;
import java.util.List;

public class Utils {
	public League setSerieA() {
		
		//NAPOLI
		List<Player> rostersNaples = new ArrayList();
		rostersNaples.add(new Player("Arkadius", "Milik", "CF", 99, 25));
		rostersNaples.add(new Player("Dries", "Mertens", "LF", 14, 31));
		rostersNaples.add(new Player("Lorenzo", "Insigne", "AS", 24, 27));
		rostersNaples.add(new Player("Josè Maria", "Callejon", "AD", 7, 32));
		rostersNaples.add(new Player("Adam", "Ounas", "AD", 11, 22));
		rostersNaples.add(new Player("Simone", "Verdi", "ES", 9, 26));
		rostersNaples.add(new Player("Fabiàn", "Ruiz", "CC", 8, 23));
		rostersNaples.add(new Player("Marques Loureiro", "Allan", "CC", 5, 28));
		rostersNaples.add(new Player("Kalidou", "Koulibaly", "DC", 26, 27));
		Team naples = new Team("Napoli", "Ancelotti", "San Paolo", rostersNaples);
		
		
		//INTER
		List<Player> rostersInter = new ArrayList();
		rostersInter.add(new Player("Mauro", "Icardi", "CF", 9, 25));
		rostersInter.add(new Player("Matteo", "Politano", "FW", 16, 25));
		rostersInter.add(new Player("Joao", "Mario", "CC", 15, 26));
		rostersInter.add(new Player("Radja", "Nainggolan", "CC", 14, 30));
		rostersInter.add(new Player("Antonio", "Candreva", "AD", 87, 32));
		rostersInter.add(new Player("Marcelo", "Brozovic", "CC", 77, 26));
		rostersInter.add(new Player("Ivan", "Perisic", "AS", 44, 30));
		rostersInter.add(new Player("Samir", "Handanovic", "GK", 1, 34));
		rostersInter.add(new Player("Milan", "Skriniar", "DC", 37, 24));
		Team inter = new Team("Inter", "Spalletti", "San Siro", rostersInter);
		
		List<Team> teams = new ArrayList<>();
		teams.add(naples);
		teams.add(inter);
		return new League("SerieA", "Italy", "Gaetano Miccichè", teams);
	}
}
