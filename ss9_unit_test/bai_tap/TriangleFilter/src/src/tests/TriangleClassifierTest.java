package tests;

import classes.TriangleClassifier;
import org.junit.Test;

public class TriangleClassifierTest {

    @Test
    public void testTriangleClassifier() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 2;

        String excepted = "Tam giac deu";

        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String actual = triangleClassifier.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(excepted);
    }

    @Test
    public void testTriangleClassifier02() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 3;

        String excepted = "Tam giac can";

        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String actual = triangleClassifier.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(excepted);
    }

    @Test
    public void testTriangleClassifier03() {
        double sideA = 2;
        double sideB = 6;
        double sideC = 5;

        String excepted = "Tam giac binh thuong";

        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String actual = triangleClassifier.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(excepted);
    }

    @Test
    public void testTriangleClassifier04() {
        double sideA = 1;
        double sideB = 6;
        double sideC = 5;

        String excepted = "Khong la tam giac";

        TriangleClassifier triangleClassifier = new TriangleClassifier();
        String actual = triangleClassifier.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(excepted);
    }
}
