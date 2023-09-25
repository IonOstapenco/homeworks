package lectie;
import java.util.Scanner;
public class Services {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter choice");
        int choice = scanner.nextInt();

        String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
        System.out.println(categories[choice]);
        try {
            
        } catch (Exception e) {

        }
    }
}
