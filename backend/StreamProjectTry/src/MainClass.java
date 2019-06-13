import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utils utils = new Utils();
		League league = utils.setSerieA();
		
//		
//		Scanner scan= new Scanner(System.in);
//
//		System.out.println("Inserire squadra");
//
//		String str=scan.nextLine();
//		
//		System.out.println("The String is:"+str);
		
		String str = "Napoli";
		
		league.teams.stream()
			.filter(team -> team.name == str)
			.flatMap(team -> team.getRosters().stream())
			.map(p -> p.getAge() + ", name: " + p.getName() + " " + p.getSurname())
			.sorted()
			.forEach(System.out::println);
		
		
		//SOMMA ETA'
		int sum = league.teams.stream()
			.filter(team -> team.name == str)
			.flatMap(team -> team.getRosters().stream())
			.map(roster -> roster.getAge())
			.reduce((acc, elem) -> acc + elem).get();
		System.out.println("-------\nSomma eta': " + sum);
		
		
		//MEDIA
		Double avg = league.teams.stream()
				.filter(team -> team.name == str)
				.flatMap(team -> team.getRosters().stream())
				.mapToInt(roster -> roster.getAge())
				.summaryStatistics().getAverage();
		System.out.println("-------\nMedia eta': " + avg);
		
	}	

}
