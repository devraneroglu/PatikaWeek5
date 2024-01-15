public abstract class Product {
    private Integer id;
    private String name;
    private String mark;
    private Integer storage;
    private Integer displaySize;
    private Integer battery;
    private String color;
    private Integer ram;
    private Float price;
    private Float discount;
    private Integer stockQuantity;


    public Product() {

    }

    public Product(Integer id, String name, String mark, Integer storage, Integer displaySize, Integer battery, String color, Integer ram, Float price, Float discount, Integer stockQuantity) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.storage = storage;
        this.displaySize = displaySize;
        this.battery = battery;
        this.color = color;
        this.ram = ram;
        this.price = price;
        this.discount = discount;
        this.stockQuantity = stockQuantity;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMark() {
        return mark;
    }

    public Integer getStorage() {
        return storage;
    }

    public Integer getDisplaySize() {
        return displaySize;
    }

    public Integer getBattery() {
        return battery;
    }

    public String getColor() {
        return color;
    }

    public Integer getRam() {
        return ram;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
