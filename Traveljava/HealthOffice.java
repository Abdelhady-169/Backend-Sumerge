public class HealthOffice extends Place {

    private String officeName;

    @Override
    public void displaySeen(Person PersonArrived) {
        System.out.println(PersonArrived.getName()+" reached "+getOfficeName()+"...");
        System.out.println("Data seen: ");
        System.out.println("Name: "+PersonArrived.getName());
        System.out.println("PCR Status: "+PersonArrived.getPCR());
        System.out.println("Special Conditions: " +PersonArrived.getSpecial());
        System.out.println("4- Places Visited: " +PersonArrived.getPlace());
        System.out.println("5- Has fever: " +PersonArrived.getFever());
        System.out.println("6- Has Cough: " +PersonArrived.getCough());
        System.out.println("7- Allergies: " +PersonArrived.getListedMedAllergies());

        if(PersonArrived.getFever())
        {
            PersonArrived.currentPlace = new PCROffice();
            PersonArrived.currentPlace.displaySeen(PersonArrived);
        }
        PersonArrived.currentPlace = new ImmigrationOffice();
        PersonArrived.currentPlace.displaySeen(PersonArrived);
    }

    HealthOffice(){
        officeName = "Health Office";
    }
        
    }

}
