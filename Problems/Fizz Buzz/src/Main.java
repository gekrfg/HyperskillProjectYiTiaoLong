import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        for (int num=int1;num<=int2;num++) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }

            if (num % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }

            if (num % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(num);
        }
    }
}

/*
        for (int i = 0;i< str.length();i++) {  //判断
            if(str.charAt(i) == 'O'){
                Ocount++;
            }
            else if(str.charAt(i) == 'X'){
                Xcount++;
            }

            if (i==str.length()-1){
                if(Math.abs(Ocount-Xcount)>=2){
                    System.out.println("Impossible");
                    System.exit(0);
                }
            }
        }



        for (int i = 1;i< zx.length();i++) {  //判断正斜胜利
            if(zx.charAt(0) != zx.charAt(i)){
                break;
            }
            if (i==zx.length()-1){
                winner=winner.concat(String.valueOf(matrix[0][0]));
            }
        }


        if(winner.length()==0){

            System.out.println("Draw");
            System.exit(0);
        }

        if (winner.length()>1) {  //判断是否有多个胜利
            for(int i=1;i<winner.length();i++) {
                if(winner.charAt(0)!=winner.charAt(i)) {
                    System.out.println("Impossible");
                    System.exit(0);
                }
            }
        }

        System.out.print(winner.charAt(0));
        System.out.print(" wins");
        System.exit(0);
 */