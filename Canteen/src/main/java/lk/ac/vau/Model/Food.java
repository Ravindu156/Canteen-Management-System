package lk.ac.vau.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Food {
	@Id
	private int id;
	private String name;
	private int price;
	private int weight;
	
	@OneToMany(mappedBy="food")
	private List <OrderLine> orderLines;
	
	@ManyToMany(mappedBy="foodItems")
	private List<DailyMenu> dailyMenus;

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public List<DailyMenu> getDailyMenus() {
		return dailyMenus;
	}

	public void setDailyMenus(List<DailyMenu> dailyMenus) {
		this.dailyMenus = dailyMenus;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
