public class Bai1 {
    public String[][] array () {
        String a[][]= {{"* ","* ","* ","*"},{"* ","* ","* ","*"},{"* ","* ","* ","*"},{"* ","* ","* ","*"},};
        for (int i=0;i<4;i++){
            for (int j =0;j<4;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }

    public String[][] array2 () {
        String a[][]= {{"* ",""," ",""},{"* ","* ","",""},{"* ","* ","* "," "},{"* ","* ","* ","*"},};
        for (int i=0;i<4;i++){
            for (int j =0;j<4;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }
}
