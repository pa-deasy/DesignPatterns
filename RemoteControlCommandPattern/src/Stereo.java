
public class Stereo {
	private int volume;
	
	public Stereo(){
		this.volume = 5;
	}
	
	public void on(){
		System.out.println("Stereo turned on");
	}
	
	public void off(){
		System.out.println("Stereo turned off");
	}
	
	public void setCd(){
		System.out.println("Stereo cd set");
	}
	
	public void setDvd(){
		System.out.println("Stereo dvd set");
	}
	
	public void setRadio(){
		System.out.println("Stereo radio set");
	}
	
	public void setVolumne(int volume){
		this.volume = volume;
		System.out.println("Stereo volume set to: " + volume);
	}
}
