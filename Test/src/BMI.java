public class BMI {
    double weight;
    double height;

    public void tinh_bmi(){
        System.out.println("chỉ số bmi là : " + weight/(height*height));
    }

    public double tinh_bmi_1 () {
        return weight/(height*height);
    }

    public double tinh_bmi_2 (double weight, double height) {
        return weight/(height * height);
    }

}
