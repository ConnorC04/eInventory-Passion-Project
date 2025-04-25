package rocks.zipcode.eInventory.Classes;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String locationName;
    @Column
    private String locationAddress;
    @Column
    private String locationManager;
    @Column
    private String contactInfo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Assets> assetList = new ArrayList<>();

    public Locations() {}

    public Long getId() {
        return id;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationManager() {
        return locationManager;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public void setLocationManager(String locationManager) {
        this.locationManager = locationManager;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public ArrayList<Assets> getAssetList() {
        return assetList;
    }

    public void setAssetList(ArrayList<Assets> assetList) {
        this.assetList = assetList;
    }

    public void addAssetToList(ArrayList<Assets> assetList, Assets asset){
        assetList.add(asset);
    }

    public void removeAssetFromList(ArrayList<Assets> assetList, Assets asset){
        assetList.remove(asset);
    }

    public void transferAssetToNewLocation(Locations newLocation, ArrayList<Assets> assetList, Assets asset){
        assetList.remove(asset);
        newLocation.addAssetToList(newLocation.getAssetList(), asset);
    }
}
