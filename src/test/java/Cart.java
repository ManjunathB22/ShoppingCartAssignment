import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Products> list;
    double totalAmount=0;

    public List<Products> getList() {
        return list;
    }

    public Cart() {
        list= new ArrayList<>();
    }

    public void addProduct(Products product){
        list.add(product);
    }

    public double subTotal(Products product){
        totalAmount= product.quantity()* product.prodPrice();
        return totalAmount;
    }

    public double total(){
        double total=0;
        for (Products products : getList()) {
            total= total+subTotal(products);
        }
        System.out.println("Total Cart Price is "+total);
        if (total>=100){
            total = total-(total*0.05);
        }
        System.out.println("Total Cart Price after discount is "+ total);
        return total;
    }
}
