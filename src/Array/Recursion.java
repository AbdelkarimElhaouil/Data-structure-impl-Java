package Array;

public class Recursion {
    public static int fac(int n) {
        if (n == 1)
            return 1;
        return n * fac(n - 1);
    }

    public static int fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int sumOfN(int n) {
        if (n == 1)
            return 1;
        return n + sumOfN(n - 1);
    }

    public static int pow(int b, int e) {
        if (e == 0)
            return 1;
        else if (e == 1)
            return b;
        return b * pow(b, e - 1);
    }

    public static int fastPow(int b, int e) {
        if (b == 0)
            return 1;
        else if (e == 1)
            return b;
        else if (e % 2 == 0)
            return fastPow(b * b, e / 2);
        else
            return b * fastPow(b, e - 1);
    }

    public static void printReversedStr(String s) {
        if (s == null || s.isEmpty())
            return;
        else {
            printReversedStr(s.substring(1));
            System.out.print(s.charAt(0));
        }
    }

    public static void printHello(int n) {
        if (n != 0) {
            System.out.println("Hello");
            printHello(n - 1);
        }
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("hello");
    }

    public static int fibo(int n) {
        int s = 0;
        for (int i = 1; i <= n; ++i) {//0 1 1 2 3 5 8 13 21 34 55
            s = s + i;
            System.out.println(s);
        }
        return s;
    }

    public static boolean bi_search(int[] n, int t) {
        int high = n.length - 1, low = 0;
        while (high >= low){
            int mid = (high + low)/2;
//            if(n[mid] == t)
//                return true;
            if(n[mid] > t)
                high = mid - 1;
            else if(n[mid] < t)
                low = mid + 1;
            else
                return true;
        }
        return false;
    }
    public static boolean bi_Search_rec(int[] n, int high, int low, int val){
        int mid;
        if(high >= low) {
            mid = (high + low)/2;
            if (n[mid] == val)
                return true;
            else if (n[mid] > val) // 1 2 3 4 5 6 7 8 9
                return bi_Search_rec(n, mid - 1, low, val);
            else
                return bi_Search_rec(n, high, mid + 1, val);

        }
        return false;
    }
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char by_rod){
        // still Incomprehensible --> look for tracing t understand
       if(n == 1)
           System.out.println("Move disk " + n + " from " + from_rod + " to rod " + to_rod);
       else{
           towerOfHanoi(n - 1, from_rod, by_rod, to_rod);
           System.out.println("Move disk " + n + " from " + from_rod + " to rod " + to_rod);
           towerOfHanoi(n - 1, by_rod, to_rod, from_rod);
       }
    }
    public static String parentBit(String s)
    {

        if (s.charAt(0) != '(') {
             return parentBit(s.substring(1));
         }
         if(s.charAt(s.length() - 1) != ')') {
             return parentBit(s.substring(0, s.length() - 1));
         }
         return s;
    }
    public static int bunnyEar(int n){
        if(n == 0)
            return 0;
        else
            return 2 + bunnyEar(n-1);
    }
    public static int bunnyEar2(int n){
        if(n == 0)
            return 0;
        else if(n % 2 == 0)
            return 2 + bunnyEar2(n-1);
        return 3 + bunnyEar2(n-1);
    }
    public static String NoX(String s){
        if(s.isEmpty())
            return "";
        if (s.charAt(0) == 'x')
            return NoX(s.substring(1));
        return s.charAt(0) + NoX( s.substring(1));
    }
    public static String cleanString(String s){
        if(s.length() == 1)
            return s;
        if(s.charAt(0) == s.charAt(1))
            return cleanString(s.substring(1));
        return s.charAt(0) + cleanString(s.substring(1));

    }
    public static int countHi(String s){
        if(s.length() < 2) return 0;
        if(s.startsWith("hi")) return 1 + countHi(s.substring(2));
        if(s.startsWith("xhi")) return countHi(s.substring(3));
        return countHi(s.substring(1));
    }
    public static int strdist(String str, String sub){
        if(!str.contains(sub))
            return 0;
        if(str.startsWith(sub) && str.endsWith(sub))
            return str.length();
        if(!str.startsWith(sub))
            return strdist(str.substring(1), sub);
        return strdist(str.substring(0, str.length() - 1), sub);
    }
}
