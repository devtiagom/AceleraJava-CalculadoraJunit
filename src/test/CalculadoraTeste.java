package test;

import main.Calculadora;
import main.ExcecaoDeDivisaoPorZero;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTeste {

    @Test
    public void dadoNumerosPositivosQuandoExecutarSomarEntaoRetornaPositivo() {
        // dado
        Double num1 = 1.0;
        Double num2 = 5.0;
        Double esperado = 6.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double soma = calculadora.somar(num1, num2);

        // entao
        Assert.assertEquals(esperado, soma);
    }

    @Test
    public void dadoNumerosNegativosQuandoExecutarSomarEntaoRetornaNegativo() {
        // dado
        Double num1 = -1.0;
        Double num2 = -5.0;
        Double esperado = -6.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double soma = calculadora.somar(num1, num2);

        // entao
        Assert.assertEquals(esperado, soma);
    }

    @Test
    public void dadoNumeroNegativoEPositivoQuandoExecutarSomarEntaoRetornaOResultado() {
        // dado
        Double num1 = 1.0;
        Double num2 = -5.0;
        Double esperado = -4.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double soma = calculadora.somar(num1, num2);

        // entao
        Assert.assertEquals(esperado, soma);
    }

    @Test
    public void dadoNumeroPositivoENuloQuandoExecutarSomarEntaoRetornarPositivo() {
        // dado
        Double num1 = 1.0;
        Double num2 = null;
        Double esperado = 1.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double soma = calculadora.somar(num1, num2);

        // entao
        Assert.assertEquals(esperado, soma);
    }

    @Test
    public void dadoNuloENuloQuandoExecutarSomarEntaoRetornaNulo(){
        // dado
        Double num1 = null;
        Double num2 = null;

        // quando
        Calculadora calculadora = new Calculadora();
        Double soma = calculadora.somar(num1, num2);

        // entao
        Assert.assertEquals(null, soma);
    }

    @Test
    public void dadoNumerosPositivosQuandoExecutarSubtrairEntaoRetornaPositivo() {
        // dado
        Double num1 = 20.0;
        Double num2 = 7.0;
        Double esperado = 13.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double subtracao = calculadora.subtrair(num1, num2);

        // entao
        Assert.assertEquals(esperado, subtracao);
    }

    @Test
    public void dadoNumerosNegativosQuandoExecutarSubtrairEntaoRetornaNegativo() {
        // dado
        Double num1 = -20.0;
        Double num2 = -7.0;
        Double esperado = -13.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double subtracao = calculadora.subtrair(num1, num2);

        // entao
        Assert.assertEquals(esperado, subtracao);
    }

    @Test
    public void dadoNumerosNegativosQuandoExecutarSubtrairEntaoRetornaPositivo() {
        // dado
        Double num1 = -1.0;
        Double num2 = -2.0;
        Double esperado = 1.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double subtracao = calculadora.subtrair(num1, num2);

        // entao
        Assert.assertEquals(esperado, subtracao);
    }

    @Test
    public void dadoNumeroPositivoENegativoQuandoExecutarSubtrairEntaoRetornaResultado() {
        // dado
        Double num1 = 20.0;
        Double num2 = -7.0;
        Double esperado = 27.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double subtracao = calculadora.subtrair(num1, num2);

        // entao
        Assert.assertEquals(esperado, subtracao);
    }

    @Test
    public void dadoNumerosPositivosQuandoExecutarMultiplicacarEntaoRetornaPositivo() {
        // dado
        Double num1 = 5.0;
        Double num2 = 4.0;
        Double esperado = 20.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double multiplicar = calculadora.multiplicar(num1, num2);

        // entao
        Assert.assertEquals(esperado, multiplicar);
    }

    @Test
    public void dadoNumerosNegativosQuandoExecutarMultiplicacarEntaoRetornaPositivo() {
        // dado
        Double num1 = -5.0;
        Double num2 = -4.0;
        Double esperado = 20.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double multiplicar = calculadora.multiplicar(num1, num2);

        // entao
        Assert.assertEquals(esperado, multiplicar);
    }

    @Test
    public void dadoNumerosPosivoENegativoQuandoExecutarMultiplicacarEntaoRetornaNegativo() {
        // dado
        Double num1 = 5.0;
        Double num2 = -4.0;
        Double esperado = -20.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double multiplicar = calculadora.multiplicar(num1, num2);

        // entao
        Assert.assertEquals(esperado, multiplicar);
    }

    @Test
    public void dadoNuloENuloQuandoExecutarMultiplicarEntaoRetornaNulo(){
        // dado
        Double num1 = null;
        Double num2 = null;

        // quando
        Calculadora calculadora = new Calculadora();
        Double multiplicar = calculadora.multiplicar(num1, num2);

        // entao
        Assert.assertEquals(null, multiplicar);
    }

    @Test
    public void dadoPositivosQuandoExecutarDividirEntaoRetornaPositivo() {
        // dado
        Double num1 = 6.0;
        Double num2 = 3.0;
        Double esperado = 2.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double dividir = calculadora.dividir(num1, num2);

        // entao
        Assert.assertEquals(esperado, dividir);
    }

    @Test
    public void dadoNegativosQuandoExecutarDividirEntaoRetornaPositivo() {
        // dado
        Double num1 = -6.0;
        Double num2 = -3.0;
        Double esperado = 2.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double dividir = calculadora.dividir(num1, num2);

        // entao
        Assert.assertEquals(esperado, dividir);
    }

    @Test
    public void dadoPositivoENegativoQuandoExecutarDividirEntaoRetornaNegativo() {
        // dado
        Double num1 = 6.0;
        Double num2 = -3.0;
        Double esperado = -2.0;

        // quando
        Calculadora calculadora = new Calculadora();
        Double dividir = calculadora.dividir(num1, num2);

        // entao
        Assert.assertEquals(esperado, dividir);
    }

    @Test
    public void dadoPositivoENuloQuandoExecutarDividirEntaoRetornaPositivo() {
        // dado
        Double num1 = 6.0;
        Double num2 = null;
        Double esperado = num1;

        // quando
        Calculadora calculadora = new Calculadora();
        Double dividir = calculadora.dividir(num1, num2);

        // entao
        Assert.assertEquals(esperado, dividir);
    }

    @Test (expected = ExcecaoDeDivisaoPorZero.class)
    public void dadoPositivoEZeroQuandoExecutarDividirEntaoRetornaExcecao() {
        // dado
        Double num1 = 6.0;
        Double num2 = 0.0;

        // quando
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(num1, num2);
    }

}
