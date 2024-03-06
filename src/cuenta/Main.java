package cuenta;

/**
 * Clase main del programa, que define un objeto
 * CuentaFernandezCabezonFranciscoJose2324T4 con unos parámetros y realiza
 * acciones de ingresaDineroFernandezCabezonFranciscoJose y
 * retiraDineroFernandezCabezonFranciscoJose
 *
 * @author Francisco José Fernández Cabezón
 */
public class Main {

    /**
     * Método main.
     *
     * Este método es el principal de ejecución del programa
     *
     */
    public static void main(String[] args) {
        CuentaFernandezCabezonFranciscoJose2324T4 miCuentaFernandezCabezonFraciscoJose2324T4;
        double saldoActual;

        miCuentaFernandezCabezonFraciscoJose2324T4 = new CuentaFernandezCabezonFranciscoJose2324T4("Antonio Sánchez", "ES55-3058-2365-8522-1234-5678", 2500, 0);
        System.out.println("Saldo inicial de la cuenta: " + miCuentaFernandezCabezonFraciscoJose2324T4.estado() + "€");
        retiraDineroFernandezCabezonFranciscoJose(miCuentaFernandezCabezonFraciscoJose2324T4);

        ingresaDineroFernandezCabezonFranciscoJose(miCuentaFernandezCabezonFraciscoJose2324T4);
        saldoActual = miCuentaFernandezCabezonFraciscoJose2324T4.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Método ingresar dinero.
     *
     * En este método se añaden 100 Euros  a la cuenta bancaria 
     *
     * @param miCuentaFernandezCabezonFranciscoJose2324T4objeto cuenta
     * con el que se va a ingresar dinero.
     * @throws Exception si la cantidad de dinero a ingresar es un numero
     * negativo arroja un fallo al ingresar
     */
    
    private static void ingresaDineroFernandezCabezonFranciscoJose(CuentaFernandezCabezonFranciscoJose2324T4 miCuentaFernandezCabezonFraciscoJose2324T4) {
        int x;
        try {
            x = 100;
            System.out.println("Ingreso en cuenta de " + x + "€");
            miCuentaFernandezCabezonFraciscoJose2324T4.ingresar(x, Ingreso);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
    /**
     * Método retirar dinero.
     *
     * En este método se retiran 1500 Euros  de la cuenta bancaria 
     *
     * @param miCuentaFernandezCabezonFranciscoJose2324T4 objeto cuenta
     * con el que se va a retirar el dinero.
     * @throws Exception si la cantidad de dinero a retirar es un numero
     * negativo o cero o si la si es superior o igual al saldo actual arroja 
     * un fallo al retirar
     */
    

    private static void retiraDineroFernandezCabezonFranciscoJose(CuentaFernandezCabezonFranciscoJose2324T4 miCuentaFernandezCabezonFraciscoJose2324T4) {
        int x;
        try {
            x = 1500;
            System.out.println("Retirada en cuenta de " + x + "€");
            miCuentaFernandezCabezonFraciscoJose2324T4.retirar(x);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }

}
