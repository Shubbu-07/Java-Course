        // Array in java

public class practice15{
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 7;
        nums[1] = 9;
        nums[2] = 5;
        nums[3] = 3;
        
        // Not much efficient
        //System.out.println(nums[0]);
        //System.out.println(nums[1]);
        //System.out.println(nums[2]);
        //System.out.println(nums[3]);

        // Made it efficient!
        for(int i = 0; i < 4; i++){
            System.out.println(nums[i]);
        }
    }
}