package Ques3;

class UserMainCode {
    static int calculateNcr(int n, int r) {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
