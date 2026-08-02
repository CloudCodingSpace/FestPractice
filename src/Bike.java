public class Bike implements Vehicle {
    private String vendorName = "";
    private String modelName = "";
    private int id = 0, price = 0;

    public Bike(int id, int price, String modelName, String vendorName) {
        this.id = id;
        this.price = price;
        this.modelName = modelName;
        this.vendorName = vendorName;
    }

    @Override
    public String getVendorName() {
        return vendorName;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getId() {
        return id;
    }
}
