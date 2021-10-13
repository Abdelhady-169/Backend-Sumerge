import java.util.List;
import javax.persistence.*;

public class Queries {
	
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_pu");

	public static void main(String[] args) {
		
		getEmployees();	
		//getEmployeeinProject("Mondolez");
		//addEmployeetoProject();
		//getEmployeewithoutProject();
		entityManagerFactory.close();	
	}
	
	//private static void //getEmployeewithoutProject() {
		// TODO Auto-generated method stub
		
	//}

	//private static void //addEmployeetoProject() {
		// TODO Auto-generated method stub
		
	//}

	/*private static void getEmployeeinProject(String ProjName) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
    	String strQueryFind = "SELECT e FROM Project p JOIN p.employees e WHERE p.projectName =: targetedProject ";
    	List<Employee> employees;
    	try {
    		employees = entityManager.createQuery(strQueryFind).setParameter("targetedProject", ProjName).getResultList();
    		employees.forEach(emp->System.out.println("Employee id: "+emp.getId() +"\tEmployee Name: "+emp.getName());
    	}
    	catch(NoResultException ex) {
    		ex.printStackTrace();
    	}
    	finally {
    		entityManager.close();
    	}
    }
		
	}
*/
	public static void getEmployees() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
    	String strQuery = "SELECT e FROM Employee e WHERE e.id IS NOT NULL";
    	TypedQuery<Employee> tq = entityManager.createQuery(strQuery, Employee.class);
    	List<Employee> employees;
    	try {
    		employees = tq.getResultList();
    		employees.forEach(emp->System.out.println("Employee id: "+emp.getId() +"\tEmployee Name: "+emp.geName());
    	}
    	catch(NoResultException ex) {
    		ex.printStackTrace();
    	}
    	finally {
    		entityManager.close();
    	}
    }

}
