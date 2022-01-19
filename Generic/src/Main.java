public class Main <T> {
    public static void main(String[] args) {
//        MyGeneric<Integer> myGeneric1 = new MyGeneric<>(1);
//        System.out.println(myGeneric1.getVariable());
//
//        MyGeneric<Double>myGeneric2 = new MyGeneric<>(6.9);
//        System.out.println(myGeneric2.getVariable());
//
//        MyGeneric<String> myGeneric3 = new MyGeneric<>("Hello");
//        System.out.println(myGeneric3.getVariable());

        String[] arrString = new String[]{"Java","HTML/CSS","Python","C++"};

        Integer[] arrInt = new Integer[]{1,2,3,4,5};

        Double[] arrDouble = new Double[]{2.5,4.8,5.0,4.1};

        Main<String> stringMain = new Main<>();
        Main<Integer> integerMain = new Main<>();
        Main<Double> doubleMain = new Main<>();
        System.out.println("Mảng chuỗi : ");
//        stringMain.showArray(arrString);
        show(arrString);
        System.out.println("Mảng Int :");
//        integerMain.showArray(arrInt);
        show(arrInt);
        System.out.println("Mảng double : ");
//        doubleMain.showArray(arrDouble);
        show(arrDouble);



    }
    public void showArray(T[] arr){
        for (T s : arr){
            System.out.println(s);
        }
    }

    public static  <T> void show(T[] arr){
        for (T s : arr){
            System.out.print(s+"\t");
        }
        System.out.println();
    }
}
