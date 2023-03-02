/** 
 * @brief CCuenta file
 * @author Javier Lara Ochoa
 * @version 1.0
 */
public class CCuenta {
    
    /** 
     * @brief attributes
     * @param nombre  the nombre
     * @param cuenta  the cuenta
     * @param saldo  the saldo
     * @param tipoInterés  the tipoInteres
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** 
     *
     * @brief It is a constructor. 
     *
     */
    public CCuenta()
    {
    }
    
    /** 
     *
     * @brief It is a constructor. 
     *
     * @param nom  the nom
     * @param cue  the cue
     * @param sal  the sal
     * @param tipo  the tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /** 
     *
     * @brief Estado
     *
     * @return double
     */
    public double estado()
    {
        return saldo;
    }

    /** 
     *
     * @brief Ingresar
     *
     * @param cantidad  the cantidad
     * @throws   Exception
        
    */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /** 
     *
     * @brief Retirar
     *
     * @param cantidad  the cantidad
     * @throws   Exception
        
    */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
