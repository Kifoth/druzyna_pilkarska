import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {

        lekarz user = new lekarz("Jan", "Kowalski", 12, "Kardiolog");


        psycholog user1 = new psycholog("Jan", "Kowalski", 15, "Terapeuta");


        druzyna user2 = new druzyna("GKS Tychy", "Tychy arena", "stadionowa");

        Trener user3 = new Trener("Robert", "Lewandowski", 666);

        Sezon user4 = new Sezon(15, 28, 10, 78);

        Mecz user5 = new Mecz("Wieczor", "Warszawa", 2, "Cztery", "Dwie", 5);

        Zawodnik user6 = new Zawodnik("Karim", "Benzema");

        System.out.println(user.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        System.out.println(user6.toString());
    }

}