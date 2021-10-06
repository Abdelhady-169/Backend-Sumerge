import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

public class jobtitleArray {
    List<jobtitle> jobtitleArray = Arrays.asList();

    public void jobtitleCreate(String stringa){
        jobtitleArray.add(new jobtitle(stringa,1));
    }
    

    public boolean jobtitleExist(jobtitle e){
        for (int i = 0; i < jobtitleArray.size(); i++ ){
            if (e.title==jobtitletitle.get(i).title){
                return true;
            }
            return false;
        }
    }

    public void jobtitleUpdate(Target(jobtitle.employee.title)){
                jobtitle.count++;
    }
}
