public class Main {
    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();
        myCalculator.add(5, 8);
        System.out.println("The sum is "+myCalculator.add(5,8));

        myCalculator.subtract(9,7);
        System.out.println("The difference is "+myCalculator.subtract(9,7));


        System.out.println("The product is "+myCalculator.multiply(10,12));

        System.out.println("The quotient is "+myCalculator.divide(21,2));

        System.out.println("The squaredResult is "+myCalculator.squared(4));

        System.out.println("The cubedResult is "+myCalculator.cubed(3));

        System.out.println("The result is "+myCalculator.power(2, 8));
    }
}
