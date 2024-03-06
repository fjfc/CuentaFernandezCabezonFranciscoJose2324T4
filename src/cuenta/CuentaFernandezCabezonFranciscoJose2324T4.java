package cuenta;

 /**
 * 
 * @author Francisco José Fernández Cabezón
 */

public class CuentaFernandezCabezonFranciscoJose2324T4 {

    /** 
    * Esta es la clase CuentaFernandezCabezonFranciscoJose2324T4 que define las
    * caracteristicas, y metodos constructores de la clase 
    * 
    * @param nom nombre del titular de la cuenta
    * @param cue numero de cuenta bancaria
    * @param sal saldo actual de la cuenta bancaria
    * @param tipoInteres tipo de cuenta bancaria
    */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

   
    public CuentaFernandezCabezonFranciscoJose2324T4 ()
    {
    }
   
    /**
     * Este es el metodo constructor que define el objeto 
     * CuentaFernandezCabezonFranciscoJose2324T4.
     *
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta bancaria
     * @param sal saldo actual de la cuenta bancaria
     * @param tipo tipo de cuenta bancaria
     */
    public CuentaFernandezCabezonFranciscoJose2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
    
     /**
     * Este es el metodo asignarNombre que se encarga de cambiar el nombre del
     * titular de la cuenta
     *
     * @param nom nombre del titular de la cuenta
     */
    
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Este es el metodo obterner nombre que se encarga de facilitar el nombre 
     * del titular de la cuenta bancaria
     * 
     * @return String Devuelve el nombre del titular de la cuenta bancaria
     */   
   
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
    * Este es el metodo estado que se encarga de facilitar el estado de la
    * cuenta bancaria
    * 
    * @return double Devuelve el estado acutal de la cuenta bancaria
    */ 
    
    public double estado ()
    {
        return getSaldo();
    }

    /** 
    * @param cantidad double define la cantidad a ingresar
    * @param concepto String define el concepto del ingreso
    * @throws Exception si la cantidad de dinero a ingresar es un numero
    * negativo arroja un fallo al ingresar
    */
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * @param cantidad double define la cantidad a retirar
     * @throws Exception si la cantidad de dinero a retirar es un numero
     * negativo o cero o si la si es superior o igual al saldo actual arroja 
     * un error
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
    * @return String devuelve el numero de cuenta
    */
    public String obtenerCuenta ()
    {
        return getCuenta();
    }

    /**
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta 
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
