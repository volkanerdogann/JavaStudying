package AbstractClasses.Question_1.java;

import java.util.Scanner;

public abstract class Athlete {
    Scanner input = new Scanner(System.in);

    public int income, ranking;
    public String club;

    public abstract void print();


    public Athlete() {
    }

    public final void getInfo() {
        System.out.println("--------------------");
        System.out.println("Bilgiler alınıyor...");
        System.out.println("--------------------");
    }

    public void setInfo() {
        System.out.print("Please enter the player's income: ");
        income = input.nextInt();
        System.out.print("Please enter the player's ranking: ");
        ranking = input.nextInt();
        System.out.print("Please enter the player's club: ");
        club = input.next();
    }

    public void information() {
        System.out.println("--------------------");
        System.out.println("Income: " +income+ "\nRanking: " +ranking+"\nClub: " +club);
        System.out.println("--------------------");
    }
}
