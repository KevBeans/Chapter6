package com.Chapter6;

public class Ch66 {

    public static void main(String[] args) {
        System.out.println(prod(1, 4));
    }

    public static int prod(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return (n * (prod(m, n - 1)));
        }
    }
}

/*Stack diagram
 ___________________________________________________________________
|main|
|prod|m = 1|n = 3| recurse = 1, 3|result =
|prod|m = 1|n = 2| recurse = 1, 2|result =
|prod|m = 1|n = 1| recurse = 1, 1|result =
 ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅ ̅
 Prod checks if the first integer equals the second. If not, it performs
 a recursive reduction until the results match.
 */