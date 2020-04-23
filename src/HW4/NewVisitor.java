class NewVisitor implements Visitor {
	public void visit(Wheel e) {
		System.out.print("Checking Wheels... ");
		e.wheel();
	}
	public void visit(Camera e) {
		System.out.print("Checking Cameras... ");
		e.camera();
	}
	public void visit(Arm e) {
		System.out.print("Checking Arms... ");
		e.arm();
	}
	public void visit(Battery e) {
		System.out.print("Checking Batteries... ");
		e.battery();
	}
	public void visit(Motor e) {
		System.out.print("Checking Motors... ");
		e.motor();
	}
	public void visit(SolarEnergyCollector e) {
		System.out.print("Checking Solar Energy Collectors... ");
		e.solarEnergyCollector();
	}
}