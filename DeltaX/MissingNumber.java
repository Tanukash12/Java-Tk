class MissingNumber{
    public static int findMissingNumber(int[] arr, int N){
        // for elements 1 to N
        int xor1 = 0, xor2 = 0;
        int n = N-1;
        for(int i = 0; i < n; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ N;
        System.out.println("xorAll: " + xor1 + ", xorArr: " + xor2); // debug
        return (xor1 ^ xor2);

    }
    public static void main(String[] args){
        int[] arr = {101, 102, 104, 105, 106, 107, 109, 110};

        System.out.println("Missing number is: " + findMissingNumber(arr, 8));
    }
}