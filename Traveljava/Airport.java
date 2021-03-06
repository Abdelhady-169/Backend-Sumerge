import java.util.Arrays;
import java.util.List;

public class Airport {
    public static void main(String[] args) throws Exception {

        List<Place> places = Arrays.asList(
            new Place("Lebanon"),
            new Place("Dubai"),
            new Place("London"),
            new Place("Canada"),
            new Place("Mexico"));
        List<String> allergies = Arrays.asList("Pollen","Peanuts","Pets","Food","Latex");

        List<Person> people = Arrays.asList(
            new Person(611 , "Farah" , places , false , false , false , new Disabled( "ADHD", allergies) ), //will not go through all officers
            new Person(456 , "Ahmed" , places , true , true , false ,new Disabled( "None", allergies) ), //goes through all officers
        );

        for (Person person : people) {
            person.position();
            System.out.println();
        }

    }
}