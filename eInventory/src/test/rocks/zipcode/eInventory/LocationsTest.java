package rocks.zipcode.eInventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rocks.zipcode.eInventory.Assets;
import rocks.zipcode.eInventory.Locations;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LocationsTest {

    private Locations location;
    private Assets asset1;

    @BeforeEach
    public void setUp() {
        location = new Locations();
        asset1 = new Assets();
    }

    @Test
    public void testSetAndGetLocationName() {
        String name = "East Rink Equipment Room";
        location.setLocationName(name);
        assertEquals(name, location.getLocationName());
    }

    @Test
    public void testSetAndGetLocationAddress() {
        String address = "123 Hockey Lane, Philadelphia, PA";
        location.setLocationAddress(address);
        assertEquals(address, location.getLocationAddress());
    }

    @Test
    public void testSetAndGetLocationManager() {
        String manager = "Jamie Benn";
        location.setLocationManager(manager);
        assertEquals(manager, location.getLocationManager());
    }

    @Test
    public void testSetAndGetContactInfo() {
        String contact = "jbenn@rinkops.com";
        location.setContactInfo(contact);
        assertEquals(contact, location.getContactInfo());
    }

    @Test
    public void testSetAndGetAssetList() {
        ArrayList<Assets> assets = new ArrayList<>();
        assets.add(asset1);
        location.setAssetList(assets);
        assertEquals(1, location.getAssetList().size());
        assertEquals(asset1, location.getAssetList().get(0));
    }

    @Test
    public void testAddAssetToList() {
        location.addAssetToList(location.getAssetList(), asset1);
        assertTrue(location.getAssetList().contains(asset1));
        assertEquals(1, location.getAssetList().size());
    }

    @Test
    public void testRemoveAssetFromList() {
        location.addAssetToList(location.getAssetList(), asset1);
        location.removeAssetFromList(location.getAssetList(), asset1);
        assertFalse(location.getAssetList().contains(asset1));
    }

    @Test
    public void testTransferAssetToNewLocation() {
        // Set up original location with asset1
        location.addAssetToList(location.getAssetList(), asset1);

        // Create a new location to receive the asset
        Locations newLocation = new Locations();
        newLocation.setAssetList(new ArrayList<>());

        // Transfer asset
        location.transferAssetToNewLocation(newLocation, location.getAssetList(), asset1);

        // Assert it was removed from old location and added to new one
        assertFalse(location.getAssetList().contains(asset1));
        assertTrue(newLocation.getAssetList().contains(asset1));
    }
}
