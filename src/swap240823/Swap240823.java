
package swap240823;

public class Swap240823 {

    /* Al siguiente ejercicio se le conoce como SWAP es un intercambio de valores
ya que no han visto muchos temas es lo único que se me ocurre que hagan con los 
conocimientos que ya tienen Para intercambiar los valores de dos variables, 
es común emplear una variable auxiliar para almacenar temporalmente uno de los valores
También es posible intercambiar los valores entre dos variables sin necesidad 
de utilizar una variable auxiliar, Deben hacer el intercambio de ambas formas
     */
    public static void main(String[] args) {
        System.out.println("------con variable auxiliar------");
        int a = 10, b = 20; 
        System.out.println("Al principio");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        System.out.println("despues");
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        
        System.out.println("----------sin variable auxiliar-------");
        
        int d = 7, e = 8;
        System.out.println("antes de los cambios");
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        
        d = e - d;
        e = e - d;
        d = e + d;
        
        System.out.println("despues");
        System.out.println("valor de d = "+d);
        System.out.println("valor de e = "+e);
    }
    
}
