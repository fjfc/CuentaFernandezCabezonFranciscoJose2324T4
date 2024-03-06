package cuenta;


public class Main {

    
    public static void main(String[] args) {
        CuentaFernandezCabezonFranciscoJose2324T4 miCuentaFernandezCabezonFraciscoJose2324T4;
        double saldoActual;
        
        miCuentaFernandezCabezonFraciscoJose2324T4 = new CuentaFernandezCabezonFranciscoJose2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaFernandezCabezonFraciscoJose2324T4.estado()+"€");
        retiraDineroFernandezCabezonFranciscoJose(miCuentaFernandezCabezonFraciscoJose2324T4);
        
        ingresaDineroFernandezCabezonFranciscoJose(miCuentaFernandezCabezonFraciscoJose2324T4);
        saldoActual = miCuentaFernandezCabezonFraciscoJose2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    private static void ingresaDineroFernandezCabezonFranciscoJose(CuentaFernandezCabezonFranciscoJose2324T4 miCuentaFernandezCabezonFraciscoJose2324T4) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaFernandezCabezonFraciscoJose2324T4.ingresar(x, Ingreso);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void retiraDineroFernandezCabezonFranciscoJose(CuentaFernandezCabezonFranciscoJose2324T4 miCuentaFernandezCabezonFraciscoJose2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaFernandezCabezonFraciscoJose2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
