import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class MazeGame {
    public static void main(String[] args) {


        String[][] arr = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                arr[i][j] = " ";
        }

        int x_pos = 0, y_pos = 0;
        arr[x_pos][y_pos] = "*";

        for (int i = 0; i < 5; ) {
            Random random = new Random();
            int x = random.nextInt(5);
            int y = random.nextInt(5);
            if ((x!=0 && y!=0) && (x!=4 && y!=4)) {
                System.out.println("random : (" + x + "," + y + ")");
                arr[x][y] = "#";
                i++;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                    System.out.print("[" + arr[i][j] + "]");

            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        String order;
        while (true) {

            order = scanner.nextLine();

            if (order.equals("s")) {

                if (true == survey(x_pos+1, y_pos, arr)) {


                    arr[x_pos][y_pos] = " ";
                    x_pos++;
                    arr[x_pos][y_pos] = "*";

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++)
                            System.out.print("[" + arr[i][j] + "]");

                        System.out.println();
                    }
                }
                else {
                    System.out.println("can't move down");
                }

            } else if (order.equals("d")) {

                if (true == survey(x_pos, y_pos+1, arr)) {

                    arr[x_pos][y_pos] = " ";
                    y_pos++;
                    arr[x_pos][y_pos] = "*";

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++)
                            System.out.print("[" + arr[i][j] + "]");

                        System.out.println();
                    }
                }
                else {
                    System.out.println("can't move right");
                }

            } else if (order.equals("w")) {

               if ( true == survey(x_pos-1, y_pos, arr)) {

                   arr[x_pos][y_pos] = " ";
                   x_pos--;
                   arr[x_pos][y_pos] = "*";

                   for (int i = 0; i < 5; i++) {
                       for (int j = 0; j < 5; j++)
                           System.out.print("[" + arr[i][j] + "]");

                       System.out.println();
                   }
               }
               else {
                   System.out.println("can't move up");
               }

            } else if (order.equals("a")) {

                if (true == survey(x_pos, y_pos-1, arr)) {

                    arr[x_pos][y_pos] = " ";
                    y_pos--;
                    arr[x_pos][y_pos] = "*";

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++)
                            System.out.print("[" + arr[i][j] + "]");

                        System.out.println();
                    }
                }
                else {
                    System.out.println("can't move left");
                }

            }
            if (x_pos==4 && y_pos==4){
                System.out.println("You Win!!!");
            }
        }

    }
    public static boolean survey(int x,int y,String[][] arr){
        if ((x >= 0 && y >= 0 && x<5 && y<5)){
            if(arr[x][y].equals(" ")){
                return true;
            }else return false;

        }
        else return false;

    }



}


