public class sun {
    public static void main(String[] args) {
        int[] arr = {100,200,95,88,171,300,51,210};
        int sum =0;
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x]%10 != 7 && arr[x]/10%10!=7 && arr[x]%2 ==2) {
                System.out.println(arr[x]);
                sum = sum+arr[x];
            }

        }
        System.out.println(sum);
    }
}
