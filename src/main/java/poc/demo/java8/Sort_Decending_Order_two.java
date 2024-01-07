package poc.demo.java8;

import java.util.Comparator;
import java.util.List;

import poc.demo.model.Player;
import poc.demo.utill.CommonUtill;

public class Sort_Decending_Order_two {

	public static void main(String[] args) {
		
		List<Player> players=CommonUtill.createPlayerObj();
		
		Comparator<Player> rankComparator=Comparator.comparing(Player::getRanking);
		
		players.stream().sorted(rankComparator.reversed()).forEach(System.out::println);

	}

}
