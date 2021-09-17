class Vehicle1{
	private String engine;
	private int wheel;
	
	private int airbags;
	
	public String getEngine() {
		return this.engine;
	}
	
	public int getWheel() {
		return this.wheel;
	}
	
	public int getAirbags() {
		return this.airbags;
	}
	private Vehicle1(VehicleBuilder builder) {
		this.engine=builder.engine;
		this.wheel=builder.wheel;
		this.airbags=builder.airbags;
	}
	public static class VehicleBuilder{
		private String engine;
		private int wheel;
		
		private int airbags;
		
		public VehicleBuilder(String engine, int wheel)
		{
			this.engine=engine;
			this.wheel= wheel;
		}
		public VehicleBuilder setAirbags(int airbags)
		{
			this.airbags = airbags;
			return this;
		}
		
		public Vehicle1 build() {
			return new Vehicle1(this);
		}
	}
}

public class BuilderPatternExample {
	public static void main(String[] args)
	{
		Vehicle1 car =new Vehicle1.VehicleBuilder("abc345", 4).setAirbags(2).build();
		Vehicle1 bike = new Vehicle1.VehicleBuilder("nvbhg87",2).build();
		System.out.println(car.getEngine());
		System.out.println(car.getWheel());
		System.out.println(car.getAirbags());
		
		System.out.println(bike.getEngine());
		System.out.println(bike.getWheel());
		System.out.println(bike.getAirbags());
	}
}
