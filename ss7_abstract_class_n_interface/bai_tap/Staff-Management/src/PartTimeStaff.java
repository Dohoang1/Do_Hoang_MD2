public class PartTimeStaff extends Staff{
    private double workingHours;

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeStaff(String id, String name, int age, String phone, String email, double workingHours) {
        super(id, name, age, phone, email);
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "PartTimeStaff{" +
                "workingHours=" + workingHours +
                '}';
    }

    @Override
    public double calculateSalary() {
        return workingHours * 40;
    }

    public static double getTotalSalary(Staff[] arrayStaff) {
    double totalSalary = 0;
    for (Staff staff : arrayStaff) {
        totalSalary += staff.calculateSalary();
    }
    return totalSalary;
    }
}