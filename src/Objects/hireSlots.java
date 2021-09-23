
package Objects;

import java.time.*;

public class hireSlots {
    
    private int rentID;
    private LocalDate date;
    private int hoursRented;
    private LocalTime startTime;
    private equipmentDetails equipmentName;
    private userDetails username;

    public hireSlots(int rentID, LocalDate date, int hoursRented, LocalTime startTime, equipmentDetails equipmentName, userDetails username) {
        this.rentID = rentID;
        this.date = date;
        this.hoursRented = hoursRented;
        this.startTime = startTime;
        this.equipmentName = equipmentName;
        this.username = username;
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHoursRented() {
        return hoursRented;
    }

    public void setHoursRented(int hoursRented) {
        this.hoursRented = hoursRented;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public equipmentDetails getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(equipmentDetails equipmentName) {
        this.equipmentName = equipmentName;
    }

    public userDetails getUsername() {
        return username;
    }

    public void setUsername(userDetails username) {
        this.username = username;
    }
    
    
}
