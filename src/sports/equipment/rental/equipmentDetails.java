
package sports.equipment.rental;


public class equipmentDetails {
    
    String equipmentName;
    int pricePerHour;
    int quantityInStock;
    int currentlyRented;

    public equipmentDetails(String equipmentName, int pricePerHour, int quantityInStock, int currentlyRented) {
        this.equipmentName = equipmentName;
        this.pricePerHour = pricePerHour;
        this.quantityInStock = quantityInStock;
        this.currentlyRented = currentlyRented;
    }
    
    
    
}
