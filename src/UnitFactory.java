
public class UnitFactory {
	static UnitFactory INSTANCE;
	private UnitFactory(){
		UnitFactory.INSTANCE = new UnitFactory();
	}

	public static UnitFactory getInstance() { 
		return UnitFactory.INSTANCE;
	}
	
	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}
	
	public Unit[] getUnits(UnitType ut) {
		return ut.getUnit();
	}
	
}
