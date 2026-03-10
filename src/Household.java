import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Household implements Serializable {
    private String id;
    private String name;
    private String address;
    private LocalDate joinDate;
    private List<RecyclingEvent> events;


    public  Household(String id, String name,String address, LocalDate joinDate ){
        this.id = id;
        this.name = name;
        this.address = address;
        this.joinDate = joinDate;
        this.events = new ArrayList<>();

    }


}
