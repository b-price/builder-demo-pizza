public class HawaiianPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        pizza.setDough("Standard Dough");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Hawaiian Sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Pineapple");
    }
}
