package ua.hillel.lesson10;

public enum ProductStatus {
    DRAFT("Draft"),
    ACTIVE("Active"),
    AVAILABLE("Available"),
    OUT_OF_STOCK("Out of stock");

    private String status;

    private ProductStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
