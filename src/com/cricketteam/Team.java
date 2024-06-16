package com.cricketteam;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Team {

	public static void main(String[] args) {

		ArrayList<Player> mi = new ArrayList();
		ArrayList<Player> csk = new ArrayList();
		ArrayList<Player> rcb = new ArrayList();
		ArrayList<Player> gt = new ArrayList();

		HashMap<String, ArrayList<Player>> IPLTeams = new HashMap();

		mi.add(new Player(45, "Rohit Sharma", 5000));
		mi.add(new Player(91, "Hardik Pandya", 1500));
		mi.add(new Player(55, "Shams Mulani", 3000));
		mi.add(new Player(93, "Jasprit Bumrah", 2000));
		mi.add(new Player(23, "Ishan Kishan", 2100));
		mi.add(new Player(63, "Suryakumar Yadav", 80));
		mi.add(new Player(4, "Mohammed Nabi", 1000));
		mi.add(new Player(24, "Tim David", 1000));
		mi.add(new Player(9, "Tilak Verma", 200));

		csk.add(new Player(7, "MS Dhoni", 5121));
		csk.add(new Player(3, "Suresh Raina", 5528));
		csk.add(new Player(8, "Ravindra Jadeja", 2776));
		csk.add(new Player(13, "Ambati Rayudu", 281));
		csk.add(new Player(33, "Shane Watson", 2682));
		csk.add(new Player(9, "Faf du Plessis", 398));
		csk.add(new Player(47, "Dwayne Bravo", 1560));
		csk.add(new Player(11, "Deepak Chahar", 2158));
		csk.add(new Player(10, "Shardul Thakur", 2622));

		rcb.add(new Player(18, "Virat Kohli", 7284));
		rcb.add(new Player(17, "AB de Villiers", 5162));
		rcb.add(new Player(32, "Glenn Maxwell", 2500));
		rcb.add(new Player(15, "Devdutt Padikkal", 1546));
		rcb.add(new Player(03, "Yuzvendra Chahal", 1200));
		rcb.add(new Player(26, "Mohammed Siraj", 2556));
		rcb.add(new Player(55, "Washington Sundar", 1279));
		rcb.add(new Player(84, "Kyle Jamieson", 65));
		rcb.add(new Player(23, "Navdeep Saini ", 379));

		gt.add(new Player(77, "Shubman Gill", 2990));
		gt.add(new Player(10, "David Miller", 2791));
		gt.add(new Player(13, "Matthew Wade", 337));
		gt.add(new Player(6, "Wriddhiman Saha", 2851));
		gt.add(new Player(64, "BR Sharath", 328));
		gt.add(new Player(22, "Kane Williamson", 2158));
		gt.add(new Player(18, "Abhinav Manohar", 231));
		gt.add(new Player(66, "B.Sai Sudharsan", 362));
		gt.add(new Player(4, "Darshan Nalkande", 1184));

		IPLTeams.put("MI", mi);
		IPLTeams.put("CSK", csk);
		IPLTeams.put("RCB", rcb);
		IPLTeams.put("GT", gt);

		System.out.println("HashMap:");
		System.out.println(IPLTeams);
		System.out.println();

		char ch;
		do {
			System.out.println("Select a team to display:");
			System.out.println("1. MI");
			System.out.println("2. CSK");
			System.out.println("3. RCB");
			System.out.println("4. GT");
			System.out.println("5. Players with Runs > 4000");

			System.out.println();
			System.out.println("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				displayTeamPlayers("MI", IPLTeams.get("MI"));
				break;
			case 2:
				displayTeamPlayers("CSK", IPLTeams.get("CSK"));
				break;
			case 3:
				displayTeamPlayers("RCB", IPLTeams.get("RCB"));
				break;
			case 4:
				displayTeamPlayers("GT", IPLTeams.get("GT"));
				break;
			case 5:
				displayPlayersWithRunsAbove(IPLTeams, 4000);
				break;
			default:
				System.out.println("Invalid choice!");

			}
			System.out.println();
			System.out.println("Do you want to continue? (YES/No)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Exit..");
	}

	public static void displayTeamPlayers(String teamName, ArrayList<Player> team) {

		String j = "JerseyNo";
		String n = "Name";
		String r = "Runs";

		System.out.println("**************** " + teamName + " Team Players ****************");
		System.out.println();
		System.out.println("|-----------|------------------|----------------|");
		System.out.printf("|%10s |%17s | %-15s|\n", j, n, r);
		System.out.println("|-----------|------------------|----------------|");
		for (Player p : team) {
			System.out.printf("|%10d |%17s | %-15d|\n", p.getJerseyNumber(), p.getName(), p.getRuns());
			System.out.println("|-----------|------------------|----------------|");
		}
	}

	public static void displayPlayersWithRunsAbove(HashMap<String, ArrayList<Player>> IPLTeams, int runs) {
		{
			String j = "JerseyNo";
			String n = "Name";
			String r = "Runs";

			System.out.println("***************** Players with Runs > " + runs + "***************");
			System.out.println();
			System.out.println("|-----------|------------------|----------------|");
			System.out.printf("|%10s |%17s | %-15s|\n", j, n, r);
			System.out.println("|-----------|------------------|----------------|");
			for (String team : IPLTeams.keySet()) {
				ArrayList<Player> players = IPLTeams.get(team);
				for (Player p : players) {
					if (p.getRuns() > runs) {
						System.out.printf("|%10d |%17s | %-15d|\n", p.getJerseyNumber(), p.getName(), p.getRuns());
						System.out.println("|-----------|------------------|----------------|");
					}
				}
			}

		}
	}
}
