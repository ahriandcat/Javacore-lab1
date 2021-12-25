public class Bai2 {
    public static void bai_2 () {
        System.out.println("Bài 2");
        String chuoi= "You only live once, but if you do it right, once is enough.";
        char character = 'o';
        int count = 0;
        for (int i=0;i<chuoi.length();i++) {
            if (chuoi.charAt(i) == character){
                count++;
                System.out.println("Vị trí của ký tự 'o' lần thứ "+count+" là : "+i);
            }
        }
        System.out.println("Số lần xuất hiện ký tự " + character + " là : " + count+" lần ");
        System.out.println();
    }


}
