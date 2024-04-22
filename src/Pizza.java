class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(){

    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String toString(){
        return String.format("Pizza with %s, %s, and %s.", getDough(), getSauce(), getTopping());
    }
}
