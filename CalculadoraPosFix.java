/*
Java Posfix Calculator

 */
package posfixcalc;

public class CalculadoraPosFix implements IPosfixCalc {

    public static void main(String[] args) {
    }

    @Override
    public int Evaluate(String expresion) {
        String[] dataArray = expresion.split(" ");
        int resultado = 0;
        StackArrayList<Integer> stack = new StackArrayList<>();
        String operandos = "+*/*";
        for (String data : dataArray) {
            if (!(data.trim().equals(""))) {
                if (!(data.equals("+")) || !(data.equals("-")) || !(data.equals("/")) || !(data.equals("*"))) {
                    int numero = Integer.parseInt(data);
                    stack.push(numero);
                } else {
                    if (operandos.contains(data) == false) {
                        System.out.println("La operación es invalida");
                        throw new IllegalArgumentException();
                    } else if (stack.count() < 2 ){
                        System.out.println("La operacion es invalida, deben de haber mas de un operando");
                        throw new IllegalArgumentException();
                    } else {
                        int dato1 = stack.pull();
                        int dato2 = stack.pull();
                        if(data.equals("+")){
                            resultado = dato1 + dato2;
                            stack.push(resultado);
                        } else if (data.equals("-")){
                            resultado = dato1 - dato2;
                            stack.push(resultado);
                        } else if (data.equals("/")){
                            if(dato2 == 0){
                                System.out.println("No puede hacer una division sobre 0");
                                throw new IllegalArgumentException();
                            } else{
                                resultado = dato1 / dato2;
                                stack.push(resultado);
                            }
                        } else if (data.equals("*")){
                            resultado = dato1 * dato2;
                            stack.push(resultado);
                        }
                        
                    }
                }
            } else {
                System.out.println("Expresion invalida");
            }
        }
        return resultado;
    }

}
