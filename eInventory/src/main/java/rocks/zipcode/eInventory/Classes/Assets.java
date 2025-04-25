package rocks.zipcode.eInventory.Classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import rocks.zipcode.eInventory.Enums.Sizes;
import rocks.zipcode.eInventory.Enums.ageClassification;

@Entity
@Table(name = "AssetsTable")
public class Assets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String equipmentType;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private ageClassification equipmentAge;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Sizes equipmentSize;

    // Constructors, Getters, Setters
    public Assets(String equipmentType, ageClassification equipmentAge, Sizes equipmentSize) {
        this.equipmentType = equipmentType;
        this.equipmentAge = equipmentAge;
        this.equipmentSize = equipmentSize;
    }

    public Assets(){}

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public ageClassification getEquipmentAge() {
        return equipmentAge;
    }

    public void setEquipmentAge(ageClassification equipmentAge) {
        this.equipmentAge = equipmentAge;
    }

    public Sizes getEquipmentSize() {
        return equipmentSize;
    }

    public void setEquipmentSize(Sizes equipmentSize) {
        this.equipmentSize = equipmentSize;
    }
}