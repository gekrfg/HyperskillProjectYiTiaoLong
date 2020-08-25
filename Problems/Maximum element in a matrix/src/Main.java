import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int max = 0,maxi=0,maxj=0;
        int[][] matrix = new int[row][column];
        for (int i=0;i<row;i++) {
            for (int j=0;j<column;j++) {
                if (i==0 & j==0) {
                    matrix[i][j] = scanner.nextInt();
                    max = matrix[i][j];
                    maxi = i;
                    maxj = j;
                }
                else {
                    matrix[i][j] = scanner.nextInt();
                    if (max < matrix[i][j]) {
                        max = matrix[i][j];
                        maxi = i;
                        maxj = j;
                    }
                }
            }
        }
        System.out.println(maxi + " " + maxj);
    }
}