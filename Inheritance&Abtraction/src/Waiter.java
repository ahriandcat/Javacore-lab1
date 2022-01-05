import java.text.DecimalFormat;

public class Waiter extends Employee {
    private double compensate;

    public Waiter(int id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;

    }

    public double getCompensate() {
        return compensate;
    }

    public void setCompensate(double compensate) {
        this.compensate = compensate;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        return super.toString()+ " compensate : "+formatter.format(compensate )+ " vnđ, Total salary : "+ calculatorSalary()+" vnđ";
    }

    @Override
    public String calculatorSalary() {
        DecimalFormat formatter = new DecimalFormat("###,###");
        return formatter.format(getBasicSalary()+compensate);
    }

}
