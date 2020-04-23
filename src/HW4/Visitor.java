interface Visitor {
	public void visit(Wheel e);
	public void visit(Camera e);
	public void visit(Arm e);
	public void visit(Battery e);
	public void visit(Motor e);
	public void visit(SolarEnergyCollector e);
}