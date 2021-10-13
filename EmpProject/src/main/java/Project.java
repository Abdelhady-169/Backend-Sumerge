import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true , updatable = false)
	private int Id;
	
	@Column(name = "project_name", nullable = false)
    private String ProjName;
	
	@Column(name = "start_date")
    private String StartDate;
	
	@Column(name = "manager_id", nullable = false)		//should link to empID in Employee table
    private int ProjManagerId;
	
	@ManyToMany
    @JoinTable(
            name = "works_on",
            joinColumns = @JoinColumn(name = "Id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )private Set<Employee> employees = new HashSet<>();
		
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getProjectName() {
		return ProjName;
	}

	public void setProjectName(String projectName) {
		this.ProjName = projectName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		this.StartDate = startDate;
	}

	public int getMngrID() {
		return ProjManagerId;
	}
	
	public void setMngrID(int mngrID) {
		this.ProjManagerId = mngrID;
	}
	
	public Project() {
		
	}

	public Project(int Id, String projectName, String startDate, int projmngrID) {
		super();
		this.Id = Id;
		this.ProjName = projectName;
		this.StartDate = startDate;
		this.ProjManagerId = projmngrID;
	}
	
	public Project(Project project) {
		this.Id = project.Id;
		this.ProjName = project.ProjName;
		this.StartDate = project.StartDate;
		this.ProjManagerId = project.ProjManagerId;
	}
}
