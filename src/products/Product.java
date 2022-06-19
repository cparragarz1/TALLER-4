
package products;
public class Product {
     public static void main(String arg){
        
    }
    public String nameproduct;
    protected double cod;
    protected double val;
    protected double fullval;
    public double amout;

    public Product() {
    }

    public Product(String nameproduct, double cod, double val, double fullval, double amout) {
        this.nameproduct = nameproduct;
        this.cod = cod;
        this.val = val;
        this.fullval = fullval;
        this.amout = amout;
        
    }

   
    public void mostraFullval()
    { 
        System.out.println("El valor total de la compra es :"+this.fullval);
} 
    
}
