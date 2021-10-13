import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_ID", unique = true , updatable = false)
	private int Id;
	
	@Column(name = "employee_name", nullable = false)
    private String Name;
    
    @Column(name = "age", nullable = false)
    private int Age;
    
    @Column(name = "national_ID", unique = true , nullable=false)
    private int NationalID;
    
    @Column(name = "mobilee", unique = true , nullable=false)
    private int Mobile;
    
    @Column(name = "email", unique = true , nullable=false)
    private String Email;
    
    @Column(name = "role", nullable=false)
    private String Role;
    
    @ManyToMany
    Set<Project> projects = new HashSet<>();
    
    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getEmpName() {
		return Name;
	}

	public void setEmpName(String EmpName) {
		this.Name = EmpName;
	}
	
	public int getNationalID() {
		return NationalID;
	}

	public void setNationalID(int nationalID) {
		this.NationalID = nationalID;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public int getMobile() {
		return Mobile;
	}

	public void setMobile(int Number) {
		this.Mobile = Number;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		this.Role = role;
	}
    
	public Employee(String EmpName, int age, int nationalID, int Number, String email, String role) {
		super();
		this.Name = EmpName;
		this.Age = age;
		this.Id = nationalID;
		this.Mobile = Number;
		this.Email = email;
		this.Role = role;
	}

	public Employee(Employee newEmp) {
		this.Name = newEmp.Name;
		this.Age = newEmp.Age;
		this.Id = newEmp.Id;
		this.Mobile = newEmp.Mobile;
		this.Email = newEmp.Email;
		this.Role = newEmp.Role;
	}
	
	public Employee(){
		
	}
}
