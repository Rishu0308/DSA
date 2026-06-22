class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int rev = 0;
        int copy = x;

        while (x != 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x /= 10;
        }

        return rev == copy;
    }
}