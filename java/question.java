import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class question {

	public static void main(String[] args) {
		List<employee> employees = Arrays.asList(
				new employee("SE","Yomna",123456),
	            new employee("SE","Nada",234561),
                new employee("ASE","Farah",345612),
	            new employee("WD","Nouran",456123),
	            new employee("SE","Sara",561234),
	            new employee("ASE","Marwa",612345)
		);

        List<jobtitle> jobtitleArray = Arrays.asList();

        //create array with different job titles and count number of employees
        checkAll(employees, jobtitleArray);

        printFinal();
	}

    //for every jobtitle in jobtitleArray checks entire employees list and preforms functions
    private static void checkAll(List<employee> employees, List<jobtitle> jobtitleArray){
        for (int i = 0; i < jobtitleArray.size(); i++ ){
            for (int j = 0; j <employees.size(); j++){
                if (!jobtitleExist(jobtitleArray.get(i))){ //jobtitleExist checks if jobtitle already entered in jtArray
                    jobtitleArray.get(i).jobtitleCreate(employees.get(i).title); //if it doesn't exist them it creates jobtitle object with given title and counts first employee
                }
                jobtitleUpdate(jobtitleArray.get(i)); //if jobtitle already exists in array then it adds employee to number of count
            }
        }
    }

    //prints required output format
    private static void printFinal(){
        for (int i = 0; i < jobtitleArray.size(); i++ ){
            System.out.prinln("Title: "+ jobtitle.title+ "count"+ jobtitle.count);
            for (int j = 0; j <employees.size(); j++){
                if (jobtitleArray.get(i).jobtitle()==employees.get(i).title){
                    System.out.println("Name:"+ employee.get(j).name + " -Mobile:"+ employee.get(j).mobile)
                }
            }
        }
    }
}