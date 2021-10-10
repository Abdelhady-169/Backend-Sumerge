public class PortOffice extends Place{

    private String officeName;

    @Override
    public void displaySeen(Person personArrived) {
        System.out.println(personArrived.getName()+" reached "+getOfficeName()+"...");
        System.out.println("Data seen: ");
        System.out.println("Name: "+personArrived.getName());
        System.out.println("PCR Status: "+personArrived.getPCR());
        System.out.println("Special Conditions: " +personArrived.getSpecial());

        personArrived.currentPlace = new HealthOffice();
        personArrived.currentPlace.displaySeen(personArrived);
        
    }

    PortOffice(){
        officeName = "Port Office";
    }

}
