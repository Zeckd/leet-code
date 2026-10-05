class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int previous = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = value(s.charAt(i));
            result += value < previous ? -value : value;
            previous = value;
        }
        return result;
    }

    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }
}
