package leetcode;

public class ConvertANumberToHexadecimal {
    public static String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if (num > 0) {
            while (num > 0) {
                result.append(toHexHelper(num % 16));
                num = num / 16;
            }
            return result.reverse().toString();
        } else {
            num = -num - 1;
            while (num > 0) {
                result.append(toHexHelper(num % 16));
                num = num / 16;
            }
            for (int i = 0; i < result.length(); i++) {
                result.setCharAt(i, complement(result.charAt(i)));
            }
            int digits = result.length();
            for (int i = digits; i < 8; i++) {
                result.append('f');
            }
            return result.reverse().toString();
        }
    }

    public static char toHexHelper(int digit) {
        if (digit < 10) {
            return (char) (digit + '0');
        } else {
            switch (digit) {
            case 10:
                return 'a';
            case 11:
                return 'b';
            case 12:
                return 'c';
            case 13:
                return 'd';
            case 14:
                return 'e';
            case 15:
                return 'f';
            default:
                return '0';
            }
        }
    }

    public static char complement(char digit) {
        switch (digit) {
        case '0':
            return 'f';
        case '1':
            return 'e';
        case '2':
            return 'd';
        case '3':
            return 'c';
        case '4':
            return 'b';
        case '5':
            return 'a';
        case '6':
            return '9';
        case '7':
            return '8';
        case '8':
            return '7';
        case '9':
            return '6';
        case 'a':
            return '5';
        case 'b':
            return '4';
        case 'c':
            return '3';
        case 'd':
            return '2';
        case 'e':
            return '1';
        case 'f':
            return '0';
        default:
            return '0';
        }
    }
    
    public String toHexEfficient(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) return sb.append(0).toString();
        int sign = 1;
        int bitNum = 8;
        if (num < 0) {
            num = -num - 1;
            sign = -1;
        }
        
        while (sign == 1 && num != 0) {  // num is positive
            int rest = num % 16;
            if (rest < 10) {
                sb.append(rest);
            }
            else {
                sb.append((char)('a' + rest - 10));
            }
            num /= 16;
        }
        
        while (sign == -1 && bitNum > 0) {  // num is negative
            int rest = num % 16;
            if (rest < 6) {
                sb.append((char)('f' - rest));
            }
            else {
                sb.append(15 - rest);
            }
            num /= 16;
            bitNum--;
        }
        
        return sb.reverse().toString();
    }
    

    public static void main(String[] args) {
        System.out.println(toHex(-2));
    }
}
