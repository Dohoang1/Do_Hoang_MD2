import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        FullTimeStaff staff0 = new FullTimeStaff(
                "ft0",
                "Founder",
                55,
                "043xx",
                "founder@",
                0,
                0,
                5500
        );


        FullTimeStaff staff1 = new FullTimeStaff(
                "ft2",
                "Kevin",
                27,
                "034xxx",
                "kevin@",
                1200,
                0,
                3900
        );

        FullTimeStaff staff2 = new FullTimeStaff(
                "ft1",
                "Bob",
                25,
                "033xxx",
                "bob@",
                1000,
                50,
                4000
        );

        FullTimeStaff staff3 = new FullTimeStaff(
                "ft3",
                "James",
                23,
                "036xxx",
                "jame@",
                500,
                100,
                3000
        );

        PartTimeStaff staff4 = new PartTimeStaff(
                "pt1",
                "Bruno",
                20,
                "037xxx",
                "bruno@",
                100
        );

        PartTimeStaff staff5 = new PartTimeStaff(
                "pt2",
                "Antony",
                19,
                "039xxx",
                "antony@",
                95
        );

        Staff [] workingStaffs = {staff0, staff1, staff2, staff3, staff4, staff5};

        PartTimeStaff [] partTimeStaffs = {staff4,staff5};

        double averageSalary = Staff.calculateAverageSalary(workingStaffs);
        System.out.println("Average salary: " + averageSalary);

        System.out.println("Number of low salary staff is :" + Staff.lowSalaryStaff(workingStaffs));

        double totalPartTimeSalary = PartTimeStaff.getTotalSalary(partTimeStaffs);
        System.out.println("Total salary Parttime Staff: " + totalPartTimeSalary);


        FullTimeStaff[] fullTimeStaffs = {staff0, staff1, staff2, staff3};
        Arrays.sort(fullTimeStaffs, new FullTimeStaffSalaryComparator());

        System.out.println("Sorted full time staffs by salary from low to high :");
        for (FullTimeStaff fullTimeStaff : fullTimeStaffs) {
            System.out.println(fullTimeStaff.getName() + ": " + fullTimeStaff.calculateSalary());
        }
    }
}