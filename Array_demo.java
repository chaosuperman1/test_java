public class Array_demo {
    public static void main(String[] args) {

        int [] arr = {137,322,24,66};
        int max =arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (max <arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);

    }
}
