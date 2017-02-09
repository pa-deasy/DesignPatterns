
public class StereoOffWithCDCommand implements Command{
	private Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	
	public void execute(){
		stereo.off();
	}
	
	public void undo(){
		stereo.on();
		stereo.setCd();
		stereo.setVolumne(11);
	}
}
