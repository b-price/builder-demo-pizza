public class SpicyPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        pizza.setDough("Standard Dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato Sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("California Reapers");
    }
}
