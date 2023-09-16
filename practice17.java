        // Jagged Array

public class practice17 {
    public static void main(String[] args) {
        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[9];
        nums[2] = new int[7];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < nums.length; j++) {
                // for random numbers
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
