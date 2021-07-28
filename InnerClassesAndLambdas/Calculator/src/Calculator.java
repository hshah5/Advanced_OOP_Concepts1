public class Calculator {
    public DoMath toOperation(String op){
        DoMath res;
        switch (op) {
            case "+": res= /* TODO */
//Use a lambda expression to set "res" to the correct function.
                    (x1, x2) -> x1 + x2;
                break;
            case "-": res = (x1, x2)-> x1 - x2;
            /* TODO */
//Use a lambda expression to set "res" to the correct function.
                break;
            case "*" : res = (x1, x2) -> x1 * x2;
                /* TODO */
//Use a lambda expression to set "res" to the correct function.
                break;
            case "/" : res = (x1, x2)-> x2 ==0? Double.POSITIVE_INFINITY:x1/x2;
                /* TODO */
//Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.
                break;
          /* TODO */
//In the default value, the res function should return the minimun possible value.
            default: res = (x1, x2) -> Double.MIN_VALUE;
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){
      /* TODO */
//set calc to the correct function calling the method above.
        DoMath calc = toOperation(op);

/* TODO */
return calc.compute(n1,n2);
        //the result of calc.compute with the numbers given.
    }
}
