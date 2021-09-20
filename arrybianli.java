public class arrybianli {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i <100 ; i++) {
            if (i%2 == 0) {
                sum +=i;
            }
        }
        System.out.println(sum);

    }

   /* public static void arry1() {
        int[] arr = {111, 22, 33, 44, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}*/
}