public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        String arr[] = array.inputStringArray();
        array.printArray(arr);
        System.out.println();
        System.out.println("Số lần 'Java' xuât hiện trong mảng là : " + array.count(arr));
        array.checkIndex(arr);
    }
}
