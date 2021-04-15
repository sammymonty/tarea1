
public class Calculadora
{
    // instance variables - replace the example below with your own
    private int numeroA;
    private int numeroB;
    private int numerador;
    private int denominador;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora(int numeroA,int numeroB, int numerador, int denominador)
    {
        // initialise instance variables
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.numerador = numerador;
        this.denominador = denominador;
        
    }

    public int sumar(){
      int suma;
      suma = numeroA + numeroB;
      return suma; 
    }
    public int fraccionMultiplicar(Calculadora otro){
       int fraccionM;
       fraccionM = (numerador * otro.numerador) / (denominador * otro.denominador);
     
       return fraccionM;
    }
    public int getnumeroA(){
        return numeroA;
        
    }
    public int getnumeroB(){
        return numeroB;
        
    }
    public int getnumerador(){
        return numerador;
        
    }
    public int getdenominador(){
        return denominador;
        
    }
    public void setnumeroA(int numeroA){
        this.numeroA = numeroA;
        
    }
    public void setnumeroB(int numeroB){
        this.numeroB = numeroB;
     
    }
    public void setnumerador(int numerador){
        this.numerador = numerador;
        
    }
    public void setdenominador(int denominador){
        this.denominador = denominador;
    }
}
