package classes;

public class ImportedMobile extends Mobile{
    private String importCountry;
    private String status;

    public ImportedMobile(String id, String name, String price, int stock,
                          String brand, String importCountry, String status) {
        super(id, name, price, stock, brand);
        this.importCountry = importCountry;
        this.status = status;
    }

    public String getImportCountry() {
        return importCountry;
    }

    public void setImportCountry(String importCountry) {
        this.importCountry = importCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ImportedMobile{" +
                "importCountry='" + importCountry + '\'' +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }
}
