public class CustomerCart {
    public EWallet wallet;
    public Cart cart;

    public CustomerCart(EWallet wallet) {
        this.wallet = wallet;
        cart= new Cart();
    }

    public void addToCart(Products products){
        cart.addProduct(products);
    }

    public void getWalletAmount(){
        wallet.getWalletBalance();
    }

    public void addMoneyToWallet(double amount){
        wallet.addBalance(amount);
    }
}
