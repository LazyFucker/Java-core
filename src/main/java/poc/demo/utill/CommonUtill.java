package poc.demo.utill;

import poc.demo.model.Employee;
import poc.demo.model.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonUtill {

	public static List<Employee> createEmployeeObj() {

		Employee e1 = new Employee(1, "rajeev", 1000.00);
		Employee e2 = new Employee(2, "rajeev", 2094.00);
		Employee e3 = new Employee(3, "rajeev", 3746.00);
		Employee e4 = new Employee(5, "rajeev", 4298.00);
		Employee e5 = new Employee(6, "rajeev", 5575.00);
		Employee e6 = new Employee(7, "rajeev", 6876.00);

		return Arrays.asList(e3, e2, e1, e4, e6, e5);
	}

	public static List<Player> createPlayerObj() {
		Player player1 = new Player(59, "John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Steven", 24);
		return Arrays.asList(player1, player2, player3);
	}
}
