public enum ProductType {
    JUICE("Сок"),
    MILK("Молоко"),
    TEA("Чай"),
    LEMONADE("Лимонад");

    private final String product;

    ProductType(String product) {
        this.product = product;

    }

    public String getProduct() {
        return product;
    }
}
