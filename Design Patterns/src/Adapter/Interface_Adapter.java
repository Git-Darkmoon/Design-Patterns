
package Adapter;

/* Creamos una interface que define los métodos que implementará el objeto 
de tipo Adaptador, mediante los cuales éste redirigirá 
la comunicación hacia el objeto. */ 

public interface Interface_Adapter {
    public abstract int Times(int num,int byNum);
    public abstract int Sum(int a, int b);
}
