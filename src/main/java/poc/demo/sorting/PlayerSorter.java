package poc.demo.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import poc.demo.model.Player;

public class PlayerSorter {

	public static void main(String[] args) {

		List<Player> footballTeam = new ArrayList<>();
		Player player1 = new Player(59, "John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Steven", 24);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		// Comparable example
		System.out.println("Before Sorting :");
		footballTeam.forEach(t->System.out.println(t.getRanking()));
		//Collections.sort(footballTeam);
		
		// comparator example

		PlayerRankingComparator rankingComparator = new PlayerRankingComparator();
		Collections.sort(footballTeam, rankingComparator);
		
		System.out.println("After Sorting : ");
		footballTeam.forEach(t->System.out.println(t.getRanking()));


	}

}
