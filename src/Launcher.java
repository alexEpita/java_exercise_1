import java.util.Scanner;
public class Launcher {
    public static void main(String[] args){

        System.out.println("Bienvenue");
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.nextLine();
        if (!mot.equals("quit")){
            System.out.println("Unknow command");
        }
    }
}
