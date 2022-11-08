import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {

        lekarz user = new lekarz("Jan", "Kowalski", 12, "Kardiolog");


        psycholog user1 = new psycholog("Jan", "Kowalski", 15, "Terapeuta");


        druzyna user2 = new druzyna("GKS Tychy", "Tychy arena","stadionowa");

        Trener user3 = new Trener("Robert", "Lewandowski", 666);

        System.out.println(user.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
    }

}