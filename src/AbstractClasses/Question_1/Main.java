package AbstractClasses.Question_1;

import AbstractClasses.Question_1.java.BasketballPlayer;
import AbstractClasses.Question_1.java.FootballPlayer;
import AbstractClasses.Question_1.java.VolleyballPlayer;

public  class Main {
    public static void main(String[] args) {
        BasketballPlayer player1 = new BasketballPlayer();
        FootballPlayer player2 = new FootballPlayer();
        VolleyballPlayer player3 = new VolleyballPlayer();

        player1.setInfo();
        player1.getInfo();
        player1.print();

        player2.setInfo();
        player2.getInfo();
        player2.print();

        player3.setInfo();
        player3.getInfo();
        player3.print();


    }
}
