package rocks.zipcode.eInventory;

import jakarta.persistence.*;

@Entity
public class Assets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String equipmentType;
    @Enumerated(EnumType.STRING)
    private Sizes equipmentSize;
    @Enumerated(EnumType.STRING)
    private ageClassification equipmentAge;


    public Assets() {}

    public Assets(String equipmentType, ageClassification ageClassification, Sizes size) {
        this.equipmentType = equipmentType;
        this.equipmentAge = ageClassification;
        this.equipmentSize = size;
    }

    public Long getId() {
        return id;
    }

    public Sizes getEquipmentSize() {
        return equipmentSize;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public ageClassification getEquipmentAge() {
        return equipmentAge;
    }

    public void setEquipmentSize(Sizes equipmentSize) {
        this.equipmentSize = equipmentSize;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public void setEquipmentAge(ageClassification equipmentAge) {
        this.equipmentAge = equipmentAge;
    }

    public void setId(Long id){
        this.id = id;
    }
}