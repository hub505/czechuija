import java.util.Scanner;

class Source {

    static int leftUpperDiagonal(int x, int y, int n) {
        int sum = 0;
        int x_pos = x - 1;
        int y_pos = y + 1;
        while (true) {
            if (x_pos >= 1 && y_pos <= n) {
                sum += 1;
                x_pos -= 1;
                y_pos += 1;
            } else {
                return sum;
            }
        }
    }

    static int rightLowerDiagonal(int x, int y, int n) {
        int sum = 0;
        int x_pos = x + 1;
        int y_pos = y - 1;

        while (true) {
            if (x_pos <= n && y_pos >= 1) {
                sum += 1;
                x_pos += 1;
                y_pos -= 1;
            } else {
                return sum;
            }
        }
    }

    static int rightUpperDiagonal(int x, int y, int n) {
        int sum = 0;
        int x_pos = x + 1;
        int y_pos = y + 1;
        while (true) {
            if (x_pos <= n && y_pos <= n) {
                sum += 1;
                x_pos += 1;
                y_pos += 1;
            } else {
                return sum;
            }
        }
    }

    static int leftLowerDiagonal(int x, int y, int n) {
        int sum = 0;
        int x_pos = x - 1;
        int y_pos = y - 1;

        while (true) {

            if (x_pos >= 1 && y_pos >= 1) {
                sum += 1;
                x_pos -= 1;
                y_pos -= 1;
            } else {
                return sum;
            }
        }
    }

    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            int sumOfColumnsAndRowsFields = 2 * (size - 1);

            int finalSum = 0;
            finalSum += leftUpperDiagonal(x, y, size);
            finalSum += rightLowerDiagonal(x, y, size);
            finalSum += rightUpperDiagonal(x, y, size);
            finalSum += leftLowerDiagonal(x, y, size);
            finalSum += sumOfColumnsAndRowsFields;

            System.out.println("Wynik: " + finalSum);

        }

    }
}