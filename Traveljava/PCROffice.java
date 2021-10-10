public class PCROffice extends Place{
    
    private String officeName;

    @Override
    public void displaySeen(Person PersonArrived) {
        System.out.println(PersonArrived.getName()+" reached "+getOfficeName()+"...");
        System.out.println("Data seen: ");
        System.out.println("Name: "+PersonArrived.getName());
        System.out.println("Has fever: " +PersonArrived.getFever());
        System.out.println("Has Cough: " +PersonArrived.getCough());
    }

    PCROffice(){
        officeName="PCR Office";
    }
        
    }



}
