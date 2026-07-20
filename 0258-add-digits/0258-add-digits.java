class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        return addDigits(sumofDigits(num));
    }
    private int sumofDigits(int num){
            if(num == 0){
            return 0;
        }
        return num%10 + addDigits(num/10);
        }
}