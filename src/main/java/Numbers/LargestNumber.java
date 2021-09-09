package Numbers;

class LargestNumber {
    public String largestNumber(int[] nums) {
        StringBuilder s = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            s.append(nums[i]);
        }

        return s.toString();
    }

    public static void main(String[] args) {

    }
}