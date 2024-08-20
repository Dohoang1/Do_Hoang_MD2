package classes;

public class TriangleClassifier {

    public String triangleFilter(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC
                && sideB + sideC > sideA 
                && sideC + sideA > sideB) {
            if (sideA == sideB && sideA == sideC) {
                return "Tam giac deu";
            }

            if (sideA == sideB || sideB == sideC) {
                return "Tam giac can";
            }
            return "Tam giac binh thuong";
        }
        return "Khong la tam giac";
    }
}
