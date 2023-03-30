import java.util.*;
public class Launcher {

    public static void main(String[] args) {
        System.out.println("Bienvenue. Commandes : quit, fibo, freq");

        List<Command> commands = new ArrayList<>();
        commands.add(new Quit());
        commands.add(new Fibo());
        commands.add(new Freq());

        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while (run) {
            String mot = scanner.nextLine();
            boolean connu = false;
            for(Command command: commands) {
                if (command.name().equals(mot)) {
                    connu = true;
                    run = !command.run(scanner);
                    break;
                }
            }
            if (!connu) {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}