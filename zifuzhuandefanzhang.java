import  java.util.Scanner;//反转字符串
public class zifuzhuandefanzhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        String line =sc.nextLine();
        String ad =myserve(line);
        System.out.println(ad);
    }
    public  static  String myserve(String s){
        StringBuilder sb =new StringBuilder( s);
        sb.reverse();

        String ac = sb.toString();
        return  ac;
    }

}
