class RomanToInteger {
    public static void main(String[] args) {
        String romanNum = "IX";
        int result = romanToInt(romanNum);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = getValue(s.charAt(i));
            if (i + 1 < s.length() && currentVal < getValue(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
