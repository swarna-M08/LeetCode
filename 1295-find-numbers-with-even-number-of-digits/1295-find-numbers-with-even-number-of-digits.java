class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Even(num)) {
                count++;
            }
        }
        return count;
    }
    boolean Even(int num) {
        int noOfdigit = Digits(num);
        return noOfdigit % 2 == 0;

    }
    int Digits(int num) {
        if (num < 0) {
            return num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}