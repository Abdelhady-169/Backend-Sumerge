import java.util.List;

public class Person {

    private int Id;
    private String Name;
    private List<String> Place14Days;
    private boolean Fever;
    private boolean Cough;
    private boolean pcrStatus;
    private Disabled DisabledPerson;

    public Person(int id, String name){
        this.Id = id;
        this.Name = name;
    }

    public Person(int id, String name, List<String> place, boolean fever, boolean cough, boolean pcr, Disabled disable){
        this.Id = id;
        this.Name = name;
        this.Place14Days = place;
        this.Fever = fever;
        this.Cough = cough;
        this.pcrStatus = pcr;
        this.DisabledPerson = disable;
    }

    public int getId() {return this.Id;}
    public String getName() {return this.Name;}
    public List<String> getPlace() {return this.Place14Days;}
    public boolean getFever() {return this.Fever;}
    public boolean getCough() {return this.Cough;}
    public boolean getPCR() {return this.pcrStatus;}
    public String getSpecial() {return DisabledPerson.getSpecialCond();}
    public List<String> getListedMedAllergies() {return DisabledPerson.getListedMedAllergies();}

    Place currentPlace;
    public void position(){
        currentPlace = new PortOffice();
        currentPlace.displaySeen(null);
    }

}
