package ExercicioPolimorfismo;

public class OutsourceEmployees extends Employees{
	private Double additionalCharge;
	
	public OutsourceEmployees() {
	}
	
	public OutsourceEmployees(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public double payment() {
		return super.payment()+additionalCharge*1.1;
	}
}