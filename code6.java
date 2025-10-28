package Track.Day13;


class coffeeShop{
    private boolean coffeeReady = false;
    synchronized void makeCodfee(){
        System.out.println("Abhinanda: Making Coffee");
        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        coffeeReady = true;
        System.out.println("Abhinanda: coffee is ready notifying customer ");
        notify();
    }

    synchronized void drinkCoffee(){
        System.out.println("Customer: waiting for coffee");
        while (!coffeeReady) {
            try {
                wait();
            } catch (Exception e) {}
        }
        System.out.println("Customer: got the coffee! drinking now");
    }
}

public class code6 {
    public static void main(String[] args) {
        coffeeShop shop = new coffeeShop();

        Thread customer = new Thread(() -> shop.drinkCoffee());
        Thread BRU = new Thread(() -> shop.makeCodfee());

        customer.start();
        BRU.start();
    }
}
