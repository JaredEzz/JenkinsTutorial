public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        String output = "";
        if(args.length < 1 || args.length > 3) {
            System.out.println("usage: add, subtract, multiply, divide, fibonacci, binary # (#)");

        } else {
            if(args[0].equals("add")){
                output = Integer.toString(calculator.add(Integer.parseInt(args[1]),Integer.parseInt(args[2])));
            } else if (args[0].equals("subtract")){
                output = Integer.toString(calculator.subtract(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

            }else if (args[0].equals("multiply")){
                output = Integer.toString(calculator.multiply(Integer.parseInt(args[1]),Integer.parseInt(args[2])));

            }else if (args[0].equals("divide")){
                output = Integer.toString(calculator.divide(Integer.parseInt(args[1]),Integer.parseInt(args[2])));


            }else if (args[0].equals("fibonacci")){
                output = Integer.toString(calculator.fibonacciNumberFinder(Integer.parseInt(args[1])));


            }else if (args[0].equals("binary")){
                output = calculator.intToBinaryNumber(Integer.parseInt(args[1]));

            }
        }
        System.out.println(output);
    }
}
