public class ElectricBill implements Calculate {
    private double electricityUsageNumber;

    public ElectricBill(double electricityUsageNumber) {
        this.electricityUsageNumber = electricityUsageNumber;
    }

    public double getElectricityUsageNumber() {
        return electricityUsageNumber;
    }

    @Override
    public double calculate() {
        double eletricFee;
        if (getElectricityUsageNumber() <= 50)
            eletricFee = getElectricityUsageNumber() * 1806;
        else if (getElectricityUsageNumber() <= 100)
            eletricFee = (getElectricityUsageNumber() - 50) * 1866 + 50 * 1806;
        else if (getElectricityUsageNumber() <= 200)
            eletricFee = (getElectricityUsageNumber() - 100) * 2167 + 50 * 1866 + 50 * 1806;
        else if (getElectricityUsageNumber() <= 300)
            eletricFee = (getElectricityUsageNumber() - 200) * 2729 + 100 * 2167 + 50 * 1866 + 50 * 1806;
        else if (getElectricityUsageNumber() <= 400)
            eletricFee = (getElectricityUsageNumber() - 300) * 3050 + 100 * 2729 + 100 * 2167 + 50 * 1866 + 50 * 1806;
        else
            eletricFee = (getElectricityUsageNumber() - 400) * 3151 + 100 * 3050 + 100 * 2729 + 100 * 2167 + 50 * 1866 + 50 * 1806;
        return eletricFee;
    }
}