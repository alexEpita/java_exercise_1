import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Launcher {
    public static void main(String[] args){

        System.out.println("Bienvenue");
        Scanner scanner = new Scanner(System.in);
        String mot = scanner.nextLine();
        while (!mot.equals("quit")){
            if (mot.equals("fibo")) {
                System.out.println("Rentrez un nopmbre pour faire fibo");
                int nombre = scanner.nextInt();
                scanner.nextLine();
                System.out.println(fibo(nombre));
            }
            else{
                System.out.println("Unknow command");
            }
            System.out.println("Rentrez une nouvelle commande");
            mot = scanner.nextLine();
        }
    }
    public static int fibo(int n){
        if (n <= 1) return n;
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

}
