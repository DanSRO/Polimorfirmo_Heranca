package ExercicioPolimorfismo;

public class Employees {
	private String name;
	private Integer hours;
	private Double valuePerHours;
	
	public Employees() {
		super();
	}
	public Employees(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValuePerHours() {
		return valuePerHours;
	}
	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	public double payment() {
		return valuePerHours*hours;
	}
}