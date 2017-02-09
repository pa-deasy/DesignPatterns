
public class TurkeyAdapter implements Duck{
	private WildTurkey wildTurkey;
	
	public TurkeyAdapter(WildTurkey wildTurkey){
		this.wildTurkey = wildTurkey;
	}
	
	public void quack(){
		wildTurkey.gobble();
	}
	
	public void fly(){
		for(int i=0; i<5; i++) {
			wildTurkey.fly();
		}
	}

}
