import java.util.Comparator;

public class FullTimeStaffSalaryComparator implements Comparator <FullTimeStaff> {
    @Override
    public int compare(FullTimeStaff staff1, FullTimeStaff staff2) {
        double salary1 = staff1.calculateSalary();
        double salary2 = staff2.calculateSalary();

        return Double.compare(salary1, salary2);
    }
}