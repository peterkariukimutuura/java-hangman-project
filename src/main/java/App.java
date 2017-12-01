import java.io.Console;

public class App{
    public static void main(String[] peterkariukimutuura){
        System.out.println("This IS the Starting of a very Big Project");

        Console myconsole = System.console();

        System.out.println("Whats Your Name??");
        String Username = myconsole.readLine();
        System.out.println(" Your Username is " + Username);

    }
}