package javarunner.core.javaeight.conceptoftheday.realtimequeries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestComparingThenComparing {
    public static void main(String[] args) {
        Supplier<List<Player>> suplierPlayerList = () -> getUnsortedEmployeeList();
        List<Player> playerList = suplierPlayerList.get();

        //sort the player list by first name ,if first name is same then sort by last name
        List<Player> sortedPlayerList = playerList.stream().sorted(Comparator.comparing((Player p) -> p.getFirstName()).thenComparing((Player p) ->p.getLastName())).collect(Collectors.toList());
        sortedPlayerList.forEach(s -> System.out.println(s));

    }


    private static ArrayList<Player> getUnsortedEmployeeList()
    {
        ArrayList<Player> list = new ArrayList<>();
        list.add( new Player(2, "Lokesh", "Gupta") );
        list.add( new Player(1, "Alex", "Gussin") );
        list.add( new Player(4, "Brian", "Wux") );
        list.add( new Player(5, "Neon", "Piper") );
        list.add( new Player(3, "David", "Beckham") );
        list.add( new Player(7, "Alex", "Beckham") );
        list.add( new Player(6, "Brian", "Tuxena") );
        return list;
    }
}
