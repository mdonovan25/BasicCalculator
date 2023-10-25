public class Calculator {



    public Calculator(){

    }

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        int product;
        product=a*b;
        return product;

}
    public double divide(double a, double b){
        double quotient;
        quotient=a/b;
        return quotient;

    }
    public int squared(int a){
        int squaredResult;
        squaredResult=a*a;
        return squaredResult;
    }
    public int cubed(int a){
        int cubedResult;
        cubedResult=a*a*a;
        return cubedResult;
    }
    public int power(int a, int b) {
        int result=a;
        for (int i = 1; i < b; i++) {
            result = result * a;
        }
        return result;
    }
}


