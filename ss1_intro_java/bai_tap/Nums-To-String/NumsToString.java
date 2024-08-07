import java.util.Scanner;

public class NumsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (maximum four digít): ");
        int num = scanner.nextInt();

        if (num < 0 || num > 9999) System.out.println("Out of ability!");
        else System.out.println("Number is " + readNumber(num));
    }

    public static String readNumber(int num) {
        if (num < 10) return read1digit(num);
        else if (num < 20) return readTeens(num);
        else if (num < 100) return read2digits(num);
        else if (num < 1000) return read3digits(num);
        else return read4digits(num);
    }

    public static String read1digit(int num) {
        switch (num) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "Out of ability!";
        }
    }

    public static String readTeens(int num) {
        switch (num) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "Out of ability!";
        }
    }

    public static String read2digits(int num) {
        int tenGrade = num / 10;
        int oneGrade = num % 10;
        String tenGradeText = "";
        switch (tenGrade) {
            case 2: tenGradeText = "twenty"; break;
            case 3: tenGradeText = "thirty"; break;
            case 4: tenGradeText = "forty"; break;
            case 5: tenGradeText = "fifty"; break;
            case 6: tenGradeText = "sixty"; break;
            case 7: tenGradeText = "seventy"; break;
            case 8: tenGradeText = "eighty"; break;
            case 9: tenGradeText = "ninety"; break;
            default: tenGradeText = ""; break;
        }
        return oneGrade == 0 ? tenGradeText : tenGradeText + " " + read1digit(oneGrade);
    }

    public static String read3digits(int num) {
        int hundredGrade = num / 100;
        int theRestOf3 = num % 100;
        String hundredGradeText = read1digit(hundredGrade) + " hundred";
        return theRestOf3 == 0 ? hundredGradeText : hundredGradeText + " and " + readNumber(theRestOf3);
    }

    public static String read4digits(int num) {
        int thounsandGrade = num / 1000;
        int theRestOf4 = num % 1000;
        String thounsandGradeText = read1digit(thounsandGrade) + " thousand";
        return theRestOf4 == 0 ? thounsandGradeText : thounsandGradeText + ", " + read3digits(theRestOf4);
    }
}