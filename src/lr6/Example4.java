package lr6;

public class Example4 {
    public static void main(String[] args) {
        DoubleFactorial f = new DoubleFactorial();
        int fact = f.fact(4);
        System.out.println("Factoral ="+fact);
    }
}
 class DoubleFactorial {
    int fact(int n) {
        //это рекурсивный метод
        int result;
        if (n == 1) return 1;//проверка входного параметра, если павен 1, то выход из метода
        result = fact(n - 1) * n;
        return result;
    }

}