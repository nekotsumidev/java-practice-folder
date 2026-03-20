import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<String> carList = new ArrayList<>();

    public static void main(String[] args) {
        userIdentify();
    }

    public static void userIdentify() {
        System.out.print("Type password: ");
        int password = sc.nextInt();
        sc.nextLine();

        switch (password) {
            case 123:
                System.out.println("Welcome Luccas!");
                userText();
                userEngine();
                break;
            case 666:
                System.out.println("Welcome Admin!");
                adminText();
                adminEngine();
                break;
            default:
                System.out.println("No mode has found!");
                break;
        }
    }
    public static void userText() {
            System.out.println("""
                    ///////////////////////////
                    ---------------------------
                    Welcome to Newel's Car Shop
                    ---------------------------
                    Type in terminal what do u
                    want to do!
                    ---------------------------
                    [1] - View all cars
                    [2] - Wish list
                    [3] - On the way
                    [4] - My cart
                    [5] - Exit
                    ---------------------------
                    ///////////////////////////
                    """);
    }
    public static void userEngine() {

        ArrayList<String> wishList = new ArrayList<>();
        ArrayList<String> onWay = new ArrayList<>();
        ArrayList<String> myCart = new ArrayList<>();

        int userSelection;

        System.out.print("Choose what you want: ");
        userSelection = sc.nextInt();
        sc.nextLine();

        switch (userSelection) {
            case 1:
                System.out.print(carList);
                break;
            case 2:
                System.out.print(wishList);
                break;
            case 3:
                System.out.print(onWay);
                break;
            case 4:
                System.out.print(myCart);
                break;
            default:
                System.out.println("No category has found!");
                break;
        }
    }
    public static void adminText() {
        System.out.println("""
                    ///////////////////////////
                    ---------------------------
                    Welcome to Newel's Admin Panel
                    ---------------------------
                    Type in terminal what do u
                    want to do!
                    ---------------------------
                    [1] - Add/Remove cars
                    [2] - Outstock
                    [3] - Upcomming
                    [4] - Exit
                    ---------------------------
                    ///////////////////////////
                    """);
    }
    public static void adminEngine() {

        int userSelection;

        System.out.print("Choose what you want: ");
        userSelection = sc.nextInt();
        sc.nextLine();

        switch (userSelection) {
            case 1:
                System.out.print(carList);
                System.out.println("""
                    ///////////////////////////
                    ---------------------------
                    [1] - Add car
                    [2] - Remove car
                    [3] - Exit
                    ---------------------------
                    ///////////////////////////
                    """);
                adminSwitch();
            case 2:
            case 3:

            default:
                System.out.println("See you next time!");
        }
    }
    public static void adminSwitch() {
        int option = sc.nextInt();
        sc.nextLine();
        String car;

        switch (option) {
            case 1:
                System.out.print("Type car's name: ");
                car = sc.nextLine();
                carList.add(car);
                System.out.print(carList);
                break;
            case 2:
                System.out.print("Type vehicle's name to delete from system: ");
                car = sc.nextLine();
                carList.remove(car);
                System.out.print(carList);
                break;
            case 3:
                adminText();
                adminEngine();
                sc.nextLine();
                break;
            default:
                System.out.println("No option has found!");
                break;
        }
    }
}