public class Main {
    public static void main(String[] args) {
        //4 Phép tính +-x:
        Calculator cal = new Calculator();
        cal.a = 14;
        cal.b = 22;
        System.out.println("Tổng : " + cal.tinh_tong());
        System.out.println("Hiệu : " + cal.tinh_hieu());
        System.out.println("Tích : " + cal.tinh_tich());
        System.out.println("Thương : " + cal.tinh_thuong());


        BMI bmi = new BMI();
        bmi.height = 1.77;
        bmi.weight = 75;
        //tính BMI có kiểu trả về là void
        bmi.tinh_bmi();

        //tính BMI có kiểu trả về là double
        System.out.println("chỉ số bmi là : " + bmi.tinh_bmi_1() );

        //tính BMI có kiểu trả về là double và truyền tham số

        double weight = 75;
        double height = 1.77;
        System.out.println("chỉ số bmi là : " + bmi.tinh_bmi_2(weight,height));


    }
}
