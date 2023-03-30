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
            else if (mot.equals("freq")){
                path(scanner);
            }
            else{
                System.out.println("Unknow command");
            }
            mot = scanner.nextLine();
        }
    }
    public static int fibo(int n){
        if (n <= 1) return n;
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }

    public static void path(Scanner scanner) {
        System.out.println("Veuillez saisir le chemin du fichier à analyser:.");
        Path filePath = Paths.get(scanner.nextLine());
        try {
            String[] words = Files.readString(filePath).replaceAll("[.\n]", " ").split(" ");
            Map<String, Long> counter = Arrays.stream(words).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            counter.entrySet().stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .limit(3).forEach((obj) -> System.out.print(obj.getKey() + " "));
        } catch (IOException e) {
            System.out.println("Unreadable file: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
