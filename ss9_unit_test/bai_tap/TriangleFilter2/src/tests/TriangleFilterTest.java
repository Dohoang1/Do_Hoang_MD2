package tests;

import classes.TriangleFilter;
import org.junit.Test;


public class TriangleFilterTest {
    @Test
    public void triangleFilterTest01() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 2;

        String expected = "Tam giac deu";

        TriangleFilter triangleFilter = new TriangleFilter();
        String actual = triangleFilter.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(expected);
    }

    @Test
    public void triangleFilterTest02() {
        double sideA = 2;
        double sideB = 2;
        double sideC = 3;

        String expected = "Tam giac can";

        TriangleFilter triangleFilter = new TriangleFilter();
        String actual = triangleFilter.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(expected);
    }

    @Test
    public void triangleFilterTest03() {
        double sideA = 3;
        double sideB = 4;
        double sideC = 5;

        String expected = "Tam giac thuong";

        TriangleFilter triangleFilter = new TriangleFilter();
        String actual = triangleFilter.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(expected);
    }

    @Test
    public void triangleFilterTest05() {
        double sideA = 8;
        double sideB = 2;
        double sideC = 3;

        String expected = "Khong phai la tam giac";

        TriangleFilter triangleFilter = new TriangleFilter();
        String actual = triangleFilter.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(expected);
    }

    @Test
    public void triangleFilterTest06() {
        double sideA = -1;
        double sideB = 2;
        double sideC = 0;

        String expected = "Khong phai la tam giac";

        TriangleFilter triangleFilter = new TriangleFilter();
        String actual = triangleFilter.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(expected);
    }

    @Test
    public void triangleFilterTest07() {
        double sideA = 0;
        double sideB = 1;
        double sideC = 1;

        String expected = "Khong phai la tam giac";

        TriangleFilter triangleFilter = new TriangleFilter();
        String actual = triangleFilter.triangleFilter(sideA, sideB, sideC);
        assert actual.equals(expected);
    }
}
