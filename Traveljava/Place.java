public abstract class Place {

    //place object could be used for both places visited before or offices in airport?
    //simillar to a location parent object

   private String officeName;
   private String location;

   public Place(String name){
    this.location = name;
}

   public abstract void displaySeen(Person PersonArrived);
   
   public String getOfficeName(){
       return this.officeName;
   }

   Place(){
       this.officeName = "Abstract Office";
   }
}
