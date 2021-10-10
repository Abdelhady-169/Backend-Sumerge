import java.util.List;

public class Disabled {

    private String SpecialCond;
    private List<String> ListedMedAllergies;
    
    public Disabled(String stringA, List<String> stringB){
        this.SpecialCond = stringA;
        this.ListedMedAllergies = stringB;
    }

    public String getSpecialCond() {return this.SpecialCond;}
    public List<String> getListedMedAllergies() {return this.ListedMedAllergies;}

}
