import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class RecyclingEvent implements Serializable {
    private String materialType;
    private double weight;
    private LocalDate dateOfRecycling;
    private double ecoPoints;

    public RecyclingEvent(String materialType, double weight, LocalDate dateOfRecycling){
        this.materialType = materialType;
        this.weight = weight;
        this.dateOfRecycling = dateOfRecycling;
        this.ecoPoints = weight * 10;

    }

    public String getMaterialType(){
        return this.materialType;
    }
    public double getWeight(){
        return weight;
    }

    public LocalDate getDateOfRecycling(){
        return dateOfRecycling;
    }

    public double getEcoPoints(){
        return ecoPoints;
    }
}
