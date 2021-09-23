
package Objects;


public class equipmentDetails {
    
    private String equipmentName;
    private int pricePerHour;
    private int quantityInStock;
    private int currentlyRented;

    public equipmentDetails(String equipmentName, int pricePerHour, int quantityInStock, int currentlyRented) {
        this.equipmentName = equipmentName;
        this.pricePerHour = pricePerHour;
        this.quantityInStock = quantityInStock;
        this.currentlyRented = currentlyRented;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getCurrentlyRented() {
        return currentlyRented;
    }

    public void setCurrentlyRented(int currentlyRented) {
        this.currentlyRented = currentlyRented;
    }
    
    
    
    
}
