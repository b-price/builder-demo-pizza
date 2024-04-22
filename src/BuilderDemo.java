public class BuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        System.out.println("Customer: I want a hawaiian pizza!");
        waiter.setPizzaBuilder(new HawaiianPizzaBuilder());
        System.out.println("Waiter: OK! Your order's in!");
        waiter.constructPizza();
        System.out.println("Waiter: Here comes your pizza!");
        System.out.println(waiter.getPizza());
        System.out.println("Customer: Now I want a spicy pizza!");
        waiter.setPizzaBuilder(new SpicyPizzaBuilder());
        System.out.println("Waiter: OK! Your order's in!");
        waiter.constructPizza();
        System.out.println("Waiter: Here comes your pizza!");
        System.out.println(waiter.getPizza());
    }
}