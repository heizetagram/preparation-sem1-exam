package sorting.comparableSimple;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerSorter {
    public static void main(String[] args) {
        new PlayerSorter().run();
    }

    private void run() {
        ArrayList<Player> players = new ArrayList<>();
        Player p1 = new Player("Mikkel", 14, 98);
        Player p2 = new Player("Anker", 12, 95);
        Player p3 = new Player("Draco", 15, 70);

        players.add(p1);
        players.add(p2);
        players.add(p3);

        System.out.println("Before sort:");
        printPlayers(players);

        // Using enums
        Player.setSortCriteria(Player.SortCriteria.NAME);
        System.out.println("\n" + Player.getSortCriteria() + " again: ");
        Collections.sort(players);
        printPlayers(players);

        Player.setSortCriteria(Player.SortCriteria.AGE);
        System.out.println("\n" + Player.getSortCriteria() + " again: ");
        Collections.sort(players);
        printPlayers(players);

        Player.setSortCriteria(Player.SortCriteria.NAME);

        Player.setSortCriteria(Player.SortCriteria.RANKING);
        System.out.println("\n" + Player.getSortCriteria() + " again:");
        Collections.sort(players);
        printPlayers(players);
    }

    private void printPlayers(ArrayList<Player> players) {
        for (Player player : players) {
            System.out.println(player.getName() + ", " + player.getAge() + ": " + player.getRanking());
        }
    }
}
