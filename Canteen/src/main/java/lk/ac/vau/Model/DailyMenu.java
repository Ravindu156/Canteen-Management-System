package lk.ac.vau.Model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class DailyMenu {
	@Id
	private int id;
	private LocalDate date;
	@ManyToOne
	@JoinColumn(name = "canteen_id")
	private Canteen canteen;

	@ManyToMany
	@JoinTable(
	    name = "daily_menu_food",
	    joinColumns = @JoinColumn(name = "daily_menu_id"),
	    inverseJoinColumns = @JoinColumn(name = "food_id")
	)
	private List<Food> foodItems;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Canteen getCanteen() {
		return canteen;
	}
	public void setCanteen(Canteen canteen) {
		this.canteen = canteen;
	}
	public List<Food> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<Food> foodItems) {
		this.foodItems = foodItems;
	}
	
	
	
	
	
	
}
