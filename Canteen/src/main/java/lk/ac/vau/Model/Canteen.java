package lk.ac.vau.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Canteen {

    @Id
    private int id;
    private String name;
    private String location;


    public Canteen() {}

    

   


	@ManyToMany(mappedBy="canteens")
    private List<Employee> employees;
    
    @OneToMany(mappedBy="canteen")
    private List<DailyMenu> dailyMenus;
    
    
    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<DailyMenu> getDailyMenus() {
		return dailyMenus;
	}

	public void setDailyMenus(List<DailyMenu> dailyMenus) {
		this.dailyMenus = dailyMenus;
	}
}

