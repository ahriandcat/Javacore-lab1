public class Service {
    public Waiter[] waiterArr(){
        Waiter[] waiters = new Waiter[3];
        waiters[0] = new Waiter(1,"Tom",24,8000000,600000);
        waiters[1] = new Waiter(2,"John",22,8000000,900000);
        waiters[2] = new Waiter(3,"Taylor",21,8000000,1000000);
        return waiters;
    }

    public void printWaiter(Waiter[] waiters){
        for (Waiter w: waiters){
            System.out.println(w);
        }
    }

    public Kitchen[] KitchenArr(){
        Kitchen[] kitchens = new Kitchen[3];
        kitchens[0] = new Kitchen(1,"Thomas",30,12000000,900000);
        kitchens[1] = new Kitchen(2,"Jason",32,12000000,1500000);
        kitchens[2] = new Kitchen(3,"Lyly",29,12000000,1200000);
        return kitchens;
    }

    public void printKitchen(Kitchen[] kitchens){
        for (Kitchen k: kitchens){
            System.out.println(k);
        }
    }

    public String[] arrPosition(){
        String[] arr = new String[3];
        arr[0] = "1 - Waiters";
        arr[1] = "2 - Kitchens";
        arr[2] = "3 - end program";
        return arr;
    }
    public void printPosition(String[] arr){
        for (String s : arr) {
            System.out.println(s);
        }
    }

}
