package main;

public class Calculadora {

    public Double somar(Double num1, Double num2) {

        if(num1 == null){
            return num2;
        }

        if(num2 == null){
            return num1;
        }

        if(num1 == null && num2 == null){
            return null;
        }

        return num1 + num2;
    }

    public Double subtrair(Double num1, Double num2) {
        return num1 - num2;
    }

    public Double multiplicar(Double num1, Double num2) {

        if(num1 == null && num2 == null){
            return null;
        }

        return num1 * num2;
    }

    public Double dividir(Double num1, Double num2) {

        if(num1 == null){
            return num2;
        }

        if(num2 == null){
            return num1;
        }

        if(num2 == 0){
            throw new ExcecaoDeDivisaoPorZero();
        }

        return num1 / num2;
    }
}
