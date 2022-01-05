import java.text.DecimalFormat;

public class Kitchen extends Employee {
    private double serviceCharge;

    public Kitchen(int id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        return super.toString() + " Service charge : "+formatter.format(serviceCharge)+" vnđ, Total salary : "+calculatorSalary()+ " vnđ";
    }

    @Override
    public String calculatorSalary() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        return formatter.format(getBasicSalary()+serviceCharge);
    }
}
