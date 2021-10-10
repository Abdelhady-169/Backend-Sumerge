public class ImmigrationOffice extends Place {

    private String officeName;

    @Override
    public void displaySeen(Person PersonArrived) {
        System.out.println(PersonArrived.getName()+" reached "+getOfficeName()+"...");
        System.out.println("Data seen: ");
        System.out.println("Name: "+PersonArrived.getName());
        System.out.println("PCR Status: "+PersonArrived.getPCR());
        System.out.println("Special Conditions: " +PersonArrived.getSpecial());
        System.out.println("Places Visited: " +PersonArrived.getPlace());
    }

    ImmigrationOffice(){
        officeName="Immigration Office";
    }
        
    }
}
