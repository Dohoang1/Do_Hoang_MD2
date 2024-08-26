package classes;

public class OfficialMobile extends Mobile {
    private String warrantyPeriod ;
    private String warrantyScope ;

    public OfficialMobile(String id, String name, String price, int stock,
                          String brand, String warrantyPeriod, String warrantyScope) {
        super(id, name, price, stock, brand);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    @Override
    public String toString() {
        return "OfficialMobile{" +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyScope='" + warrantyScope + '\'' +
                "} " + super.toString();
    }
}
