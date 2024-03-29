public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + name + " for an extra " + price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger() + this.healthyExtra1Price + this.healthyExtra2Price;
    }
}
