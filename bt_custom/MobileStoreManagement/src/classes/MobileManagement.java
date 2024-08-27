package classes;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileManagement {
    public static void main(String[] args) {
        final String CSV_FILE_PATH = "MobileStoreManagement.csv";
        File csvFile = new File(CSV_FILE_PATH);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        if (!csvFile.exists()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE_PATH))) {
                bw.write("");
                bw.newLine();
                System.out.println("CSV file created successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\t\t--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
            System.out.println("Chọn chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    int importChoice;
                    System.out.println("Thêm mới loại điện thoại");
                    System.out.println("1. Chính hãng");
                    System.out.println("2. Xách tay");
                    importChoice = input.nextInt();
                    input.nextLine();
                    switch (importChoice) {
                        case 1:
                            System.out.println("Thêm mới điện thoại chính hãng");
                            System.out.println("Nhập ID: ");
                            String id = input.nextLine();
                            System.out.println("Nhập tên điện thoại: ");
                            String name = input.nextLine();
                            System.out.println("Nhập giá bán: ");
                            double price = input.nextDouble();
                            input.nextLine();
                            System.out.println("Nhập số lượng: ");
                            int stock = input.nextInt();
                            input.nextLine();
                            System.out.println("Nhập hãng sản xuất: ");
                            String brand = input.nextLine();
                            System.out.println("Nhập thời gian bảo hành: ");
                            String warrantyPeriod = input.nextLine();
                            System.out.println("Nhập phạm vi bảo hành: ");
                            String warrantyScope = input.nextLine();
                            Mobile officialMobile = new OfficialMobile(id, name, decimalFormat.format(price), stock,
                                    brand, warrantyPeriod, warrantyScope);
                            writeMobileToCSV(CSV_FILE_PATH, officialMobile);
                            break;
                        case 2:
                            System.out.println("Thêm mới điện thoại xách tay");
                            System.out.println("Nhập ID: ");
                            id = input.nextLine();
                            System.out.println("Nhập tên điện thoại: ");
                            name = input.nextLine();
                            System.out.println("Nhập giá bán: ");
                            price = input.nextDouble();
                            input.nextLine();
                            System.out.println("Nhập số lượng: ");
                            stock = input.nextInt();
                            input.nextLine();
                            System.out.println("Nhập hãng sản xuất: ");
                            brand = input.nextLine();
                            System.out.println("Nhập Xuất xứ xách tay: ");
                            String importCountry = input.nextLine();
                            System.out.println("Nhập tình trạng: ");
                            String status = input.nextLine();
                            Mobile importedMobile = new ImportedMobile(id, name, decimalFormat.format(price), stock,
                                    brand, importCountry, status);
                            writeMobileToCSV(CSV_FILE_PATH, importedMobile);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Nhập ID điện thoại cần xóa: ");
                    String deleteMobile = input.nextLine();
                    System.out.println("Bạn có chắc chắn muốn xóa điện thoại ID: " + deleteMobile + " ?");
                    System.out.println("1. Xóa");
                    System.out.println("2. Hủy xóa");
                    int deleteChoice = input.nextInt();
                    input.nextLine();
                    switch (deleteChoice) {
                        case 1:
                            List<String[]> allPhones = new ArrayList<>();
                            try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
                                String line;
                                while ((line = br.readLine()) != null) {
                                    String[] record = line.split(",");
                                    if (!record[0].equals(deleteMobile)) {
                                        allPhones.add(record);
                                    }
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE_PATH))) {
                                for (String[] record : allPhones) {
                                    bw.write(String.join(",", record));
                                    bw.newLine();
                                }
                                System.out.println("Xóa thành công!");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2:
                            System.out.println("Đã hủy bỏ thao tác xóa");
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                            break;
                    }
                    break;
                case 3:
                    try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] record = line.split(",");
                            System.out.println(record[0] + ", " + record[1] + ", " + record[2] + ", " +
                                    record[3] + ", " + record[4] + ", " + record[5] + ", " + record[6] + ".");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:


                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }

        } while (choice != 5);
        input.close();
    }

    private static void writeMobileToCSV(String filePath, Mobile mobile) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            String line;
            if (mobile instanceof OfficialMobile) {
                OfficialMobile officialMobile = (OfficialMobile) mobile;
                line = String.join(",",
                        "ID: " + officialMobile.getId(),
                        "Tên máy: " + officialMobile.getName(),
                        "Giá bán: " + String.valueOf(officialMobile.getPrice()),
                        "Tồn kho: " + String.valueOf(officialMobile.getStock()),
                        "Thương hiệu: " + officialMobile.getBrand(),
                        "Bảo hành: " + officialMobile.getWarrantyPeriod(),
                        "Phạm vi bảo hành: " + officialMobile.getWarrantyScope()
                );
            } else if (mobile instanceof ImportedMobile) {
                ImportedMobile importedMobile = (ImportedMobile) mobile;
                line = String.join(",",
                        "ID: " + importedMobile.getId(),
                        "Tên máy: " + importedMobile.getName(),
                        "Giá bán: " + String.valueOf(importedMobile.getPrice()),
                        "Tồn kho: " + String.valueOf(importedMobile.getStock()),
                        "Thương hiệu: " + importedMobile.getBrand(),
                        "Xuất xứ xách tay: " + importedMobile.getImportCountry(),
                        "Tình trạng: " + importedMobile.getStatus()
                );
            } else {
                throw new IllegalArgumentException("Unknown mobile type");
            }
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
