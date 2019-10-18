public class Pizza {
    private String base;
    private String topping;

    public Pizza(String base, String topping){
        this.base = base;
        this.topping = topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }
}
