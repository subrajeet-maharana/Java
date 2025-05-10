public class CalculatorGeneric<T extends Number> {

    private T operand1;
    private T operand2;

    public CalculatorGeneric(T operand1, T operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public T add() {
        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() + operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() + operand2.doubleValue());
        } else {
            throw new UnsupportedOperationException("Addition not supported for the given data type");
        }
    }

    public T subtract() {
        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() - operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() - operand2.doubleValue());
        } else {
            throw new UnsupportedOperationException("Subtraction not supported for the given data type");
        }
    }

    public T multiply() {
        if (operand1 instanceof Integer) {
            return (T) Integer.valueOf(operand1.intValue() * operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) Double.valueOf(operand1.doubleValue() * operand2.doubleValue());
        } else {
            throw new UnsupportedOperationException("Multiplication not supported for the given data type");
        }
    }

    public T divide() {
        if (operand1 instanceof Integer) {
            if (operand2.intValue() == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return (T) Integer.valueOf(operand1.intValue() / operand2.intValue());
        } else if (operand1 instanceof Double) {
            if (operand2.doubleValue() == 0.0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return (T) Double.valueOf(operand1.doubleValue() / operand2.doubleValue());
        } else {
            throw new UnsupportedOperationException("Division not supported for the given data type");
        }
    }

    public int modulus() {
        if (operand1 instanceof Integer) {
            if (operand2.intValue() == 0) {
                throw new ArithmeticException("Modulus operation with zero divisor");
            }
            return operand1.intValue() % operand2.intValue();
        } else {
            throw new UnsupportedOperationException("Modulus operation not supported for non-integer data type");
        }
    }

    public static void main(String[] args) {
        CalculatorGeneric<Integer> intCalculator = new CalculatorGeneric<>(10, 3);
        System.out.println("Addition: " + intCalculator.add());
        System.out.println("Subtraction: " + intCalculator.subtract());
        System.out.println("Multiplication: " + intCalculator.multiply());
        System.out.println("Division: " + intCalculator.divide());
        System.out.println("Modulus: " + intCalculator.modulus());

        CalculatorGeneric<Double> doubleCalculator = new CalculatorGeneric<>(5.5, 2.0);
        System.out.println("Addition: " + doubleCalculator.add());
        System.out.println("Subtraction: " + doubleCalculator.subtract());
        System.out.println("Multiplication: " + doubleCalculator.multiply());
        System.out.println("Division: " + doubleCalculator.divide());
    }
}
