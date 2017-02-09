
public class CeilingFanHighCommand implements Command{
	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	public void execute(){
		this.prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
	
	public void undo(){
		if (prevSpeed == ceilingFan.HIGH){
			ceilingFan.high();
		}
		
		else if (prevSpeed == ceilingFan.MEDIUM){
			ceilingFan.medium();
		}
		
		else if (prevSpeed == ceilingFan.LOW){
			ceilingFan.low();
		}
	}
}
