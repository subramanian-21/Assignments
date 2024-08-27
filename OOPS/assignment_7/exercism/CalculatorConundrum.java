package OOPS.assignment_7.exercism;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        try{
            if(operation.equals("+")){
                return operand1+" + "+operand2+" = "+(operand1+operand2);
            }else if(operation.equals("*")){
                return operand1+" * "+operand2+" = "+(operand1*operand2);
            }else if(operation.equals("/")){
                return operand1+" / "+operand2+" = "+(operand1/operand2);
            }else {
                throw new IllegalOperationException("Operation '"+operation+"' does not exist");
            }
        }catch(ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}