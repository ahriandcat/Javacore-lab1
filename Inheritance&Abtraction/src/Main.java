import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("Input employee position : ");
            String[] positionArray = service.arrPosition();
            service.printPosition(positionArray);
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Waiter list : ");
                    Waiter[] waiters = service.waiterArr();
                    service.printWaiter(waiters);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Kitchen list : ");
                    Kitchen[] kitchens = service.KitchenArr();
                    service.printKitchen(kitchens);
                    System.out.println();
                    break;
                case 3:
                    b = false;
                    break;
                default:
                    System.out.println("This position is not available, please re-enter");
                    System.out.println();
            }
        }

    }
}
