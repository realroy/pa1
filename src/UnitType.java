
public enum UnitType {
	LENGTH(Length.values()),
	AREA(Area.values()),
	WEIGHT(Weight.values());
	
	private Unit[] unit;
	
	private UnitType(Unit[] unit) {
		this.setUnit(unit);
	}

	public Unit[] getUnit() {
		return unit;
	}

	private void setUnit(Unit[] unit) {
		this.unit = unit;
	}
}
