public abstract class Staff{
    private String id;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Staff(String id, String name, int age, String phone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double calculateSalary();


    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static double getTotalSalary(Staff[] staffArray) {
        double totalSalary = 0.0;
        for (Staff staff : staffArray) {
            totalSalary += staff.calculateSalary();
        }
        return totalSalary;
    }

    public static double calculateAverageSalary(Staff[] staffArray) {
        return getTotalSalary(staffArray) / staffArray.length;

    }

    public static int lowSalaryStaff(Staff[] staffArray) {
        int count = 0;
        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i].calculateSalary() < calculateAverageSalary(staffArray)) {
                count++;
            }
        }
        return count;
        }
    }