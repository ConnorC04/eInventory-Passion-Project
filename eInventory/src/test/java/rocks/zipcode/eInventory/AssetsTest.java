package java.rocks.zipcode.eInventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rocks.zipcode.eInventory.Assets;
import rocks.zipcode.eInventory.Sizes;
import rocks.zipcode.eInventory.ageClassification;

import static org.junit.jupiter.api.Assertions.*;

public class AssetsTest {

    private Assets asset;

    @BeforeEach
    public void setUp() {
        asset = new Assets();
    }

    @Test
    public void testSetAndGetEquipmentSize() {
        asset.setEquipmentSize(Sizes.MEDIUM);
        assertEquals(Sizes.MEDIUM, asset.getEquipmentSize());
    }

    @Test
    public void testSetAndGetEquipmentType() {
        String type = "Elbow Pad";
        asset.setEquipmentType(type);
        assertEquals(type, asset.getEquipmentType());
    }

    @Test
    public void testSetAndGetEquipmentAge() {
        asset.setEquipmentAge(ageClassification.SENIOR);
        assertEquals(ageClassification.SENIOR, asset.getEquipmentAge());
    }
}
