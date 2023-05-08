
class Solution {
    public static int calculater(String s) {
        int count = 0;
        int balance = 0;
        int cal = 0;
        for (char c :s.toCharArray()) {
            if(c == 'R') {
                cal = 1;
            } else {
                cal = -1;
            }
            balance += cal;

            if(balance == 0) {
                count ++;
            }

        }
        return count;
    }
}