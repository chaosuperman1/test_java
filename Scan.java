import  java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int week =  sc.nextInt();
        for (int i = 0; i < 20; i++) {
           int  count =0;
            if (i/3 == 0){
                count ++;
            }
            System.out.println(count);
        }


    }
}
