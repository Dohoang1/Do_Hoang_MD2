package classes;

public class TriangleFilter {

    public String triangleFilter(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC && sideA + sideB > sideB && sideB + sideC > sideA) {
            if (sideA == sideB && sideA == sideC) {
                return "Tam giac deu";
            } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
                return "Tam giac can";
            } else return "Tam giac thuong";
        } else return "Khong phai la tam giac";
    }
}
