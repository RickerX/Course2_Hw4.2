public class Recipes {
    private String lotsOfProducts;
    private int sum;
    private String name;

    public Recipes(String lotsOfProducts, int sum, String name) {
        this.lotsOfProducts = lotsOfProducts;
        this.sum = sum;
        this.name = name;
    }

    public String getLotsOfProducts() {
        return lotsOfProducts;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Продукты: " + lotsOfProducts + " цена: " + sum + " рецепт: " + name;
    }
}
