
public class MainApp {
	
	public static void main(String [] args){
		Malard malard = new Malard();
		malard.fly();
		malard.quack();
		
		WildTurkey wildTurkey = new WildTurkey();
		wildTurkey.fly();
		wildTurkey.gobble();
		
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
		turkeyAdapter.fly();
		turkeyAdapter.quack();
	}
}
