
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        int[] maxseat = new int[row];
        for (int i=0;i<row;i++) {
            int[] count = new int[2];
            int k = 0;
            for (int j=0;j<column;j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 0) {
                    if (count[0] != 0){
                        k = 1;
                    }
                    count[k]=1;
                    int jj = j;
                    jj = jj-1;
                    if (jj<0){
                        continue;
                    }
                    while (matrix[i][jj] == 0) {
                        count[k]++;
                        jj=jj-1;
                        if (jj<0){
                            break;
                        }
                    }
                    if (k == 1) {
                        if(count[k]>=count[0]){
                            count[0]=count[k];
                        }
                    }
                }
            }
            maxseat[i] = count[0];
        }
        int seat = scanner.nextInt();
        for (int i=0;i<row;i++) {
            if (maxseat[i]>=seat) {
                System.out.println(i+1);
                System.exit(0);
            }
        }
        System.out.println("0");
    }
}