// Create PricedItem interface here
public interface PricedItem <T extends Number>{
    T getPrice();
            
    abstract T price setPrice(){

    }
}
