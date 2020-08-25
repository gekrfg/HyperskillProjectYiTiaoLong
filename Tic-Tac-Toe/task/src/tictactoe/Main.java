package tictactoe;
import java.util.Scanner;

public class Main {

    public static String winner = "";
    public static String zx = "";
    public static char[][] matrix = new char[3][3];
    public static int Ocount = 0;
    public static int Xcount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cells = "_________";

        print(cells);


        boolean repeat = true;
        while (repeat){
            try{
                System.out.print("Enter the coordinates: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if(x<0 || x>3||y<0 || y>3){
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                String t = changeCells(x, y, cells);
                if (t.equals("1")) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                if (Ocount+Xcount==9) {
                    repeat = false;
                }
                cells = t;
                print(cells);
            } catch (java.util.InputMismatchException e) {
                System.out.println("You should enter numbers!");
            }
        }



    }


    public static String changeCells(int x, int y, String cells) {
        int po = (3 - y) * 3 + x - 1;
        char[] cellsChar = cells.toCharArray();
        if(cellsChar[po]!='_'){
            return "1";
        }
        cellsChar[po] = nextMove();
        cells="";
        for (int i = 0; i<9;i++){
            cells = cells.concat(String.valueOf(cellsChar[i]));
        }
        return cells;
    }


    public static char nextMove() {
        if(Ocount==Xcount){
            Xcount++;
            return  'X';
        }
        else {
            Ocount++;
            return 'O';
        }
    }


    public static void print(String str) {
        System.out.println("---------");

        int strc = 0;

        for(int i = 0;i < 3;i++) {
            System.out.print("| ");
            for(int j = 0;j < 3;j++) {

                matrix[i][j] = str.charAt(strc);
                if(i==j){
                    zx = zx.concat(String.valueOf(matrix[i][j]));
                }
                if (str.charAt(strc)=='_') {
                    System.out.print("  ");
                }
                else {
                    System.out.print(str.charAt(strc));
                    System.out.print(" ");
                }
                strc++;
                if (matrix[0][j]!='_' && matrix[0][j] == matrix[1][j] && matrix[0][j] == matrix[2][j]) {  //检测竖行胜利
                    winner=winner.concat(String.valueOf(matrix[0][j]));
                }
                if(i ==2 && j==2) {    //遍历完全部矩阵后
                    if(matrix[0][2]!='_' && matrix[0][2]==matrix[1][1]&&matrix[0][2]==matrix[2][0]){
                        winner=winner.concat(String.valueOf(matrix[0][2]));
                    }
                }
            }
            System.out.println("|");
            if (matrix[i][0]!='_' && matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2]) {  //检测横行胜利
                winner=winner.concat(String.valueOf(matrix[i][0]));
            }
        }

        System.out.println("---------");




        for (int i = 1;i< zx.length();i++) {  //判断正斜胜利
            if(zx.charAt(0)=='_' || zx.charAt(0) != zx.charAt(i)){
                break;
            }
            if (i==zx.length()-1){
                winner=winner.concat(String.valueOf(matrix[0][0]));
            }
        }


        if(winner.length()>0){
            System.out.print(winner.charAt(0));
            System.out.println(" wins");
            System.exit(0);
        }


        if(Ocount+Xcount==9){
            System.out.println("Draw");
            System.exit(0);
        }


    }
}