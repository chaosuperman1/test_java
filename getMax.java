public class getMax {
    public static void main(String[] args) {
        getMax(18,19);
    }
    public static void getMax(int number1,int number2) {
        int max;
        max = number1 > number2 ? number1:number2;
        System.out.println(max);
    }
}

