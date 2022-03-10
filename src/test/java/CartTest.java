import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartTest {
    EWallet wallet;

    @BeforeTest
    public void initialize() {
        wallet = new EWallet(1000);
    }

    @Test
    public void totalPriceOfProducts() {
        CustomerCart customer1 = new CustomerCart(wallet);
        Cart cart1 = new Cart();
        Apple apple1 = new Apple(3, 30.00, "Red");
        Newspaper newspaper1 = new Newspaper(2, 5.00, "TOI");
        Milk milk1 = new Milk(2, 10, "Dairy");
        cart1.addProduct(apple1);
        cart1.addProduct(newspaper1);
        cart1.addProduct(milk1);

        System.out.println("Items in the Cart" + customer1 + cart1.getList());

        System.out.println("Apple Total is :"+cart1.subTotal(apple1));

        System.out.println("NewsPaper Total is :"+cart1.subTotal(newspaper1));

        System.out.println("Milk Total is :"+cart1.subTotal(milk1));

        cart1.total();
        wallet.deductBalance(cart1.total());
        System.out.println("Your Wallet balance is "+wallet.getWalletBalance());

        wallet.addBalance(100);
        System.out.println("Your Wallet balance after adding balance: "+wallet.getWalletBalance());
    }

    @AfterClass
    public void welcomeMessage(){
        System.out.println("Thank you for Shopping");
    }
}
