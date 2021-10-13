import javax.persistence.*;

public class Main {

	private static final EntityManagerFactory entityManagerFactory = Persistance.createEntityManagerFactory("test_pu");
	
	public static void main (String[] args) {
		addEmployee(new Employee ("Farah Abdelhady", 22, 123456789, 111, "farah@gmail.com", "developer"));
		addEmployee(new Employee ("Doaa Gaafar", 32, 987654321, 555, "doaa@gmail.com", "quality tester"));
		System.out.println("added employees");
		
		addProject(new Project (1, "Mondelez", "11/5/2021", 111));
		addProject(new Project (2, "Fresh", "6/11/2019", 555));
		System.out.println("added projects");
		
		entityManagerFactor.close();
	}

	private static void addProject(Project project) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = null;
		
		try {
			entitytransaction = entityManager.getTransaction();
        	entitytransaction.begin();
        	Project proj = new Project(project);
        	entityManager.persist(proj);
            entitytransaction.commit();
		}
		catch (Exception ex) {
            if (entitytransaction != null) {
            	entitytransaction.rollback();
            }
            ex.printStackTrace();
		}
		finally {
			entityManager.close();
		}
		
	}

	private static void addEmployee(Employee employee) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entitytransaction = null;
		
		try {
			entitytransaction = entityManager.getTransaction();
        	entitytransaction.begin();
        	Employee emp = new Employee(employee);
        	entityManager.persist(emp);
            entitytransaction.commit();
		}
		catch (Exception ex) {
            if (entitytransaction != null) {
            	entitytransaction.rollback();
            }
            ex.printStackTrace();
		}
		finally {
			entityManager.close();
		}
		
	}
	
}
