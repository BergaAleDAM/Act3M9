
package act3m9;


public class Principal {


    public static void main(String[] args) {


    }    
    public int calcPrecio(int uf){
        int precio = 380;
        if(uf > 0 && uf < 12){
            precio = uf * 30;
        } else if (uf <= 0){
            precio = 0;
        }
        return precio;
    }
    
}
