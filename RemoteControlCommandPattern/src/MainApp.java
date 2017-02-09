
public class MainApp {
	public void go(){
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		Stereo stereo = new Stereo();
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setSlot(1, lightOnCommand, lightOffCommand);
		remoteControl.setSlot(2, stereoOnWithCDCommand, stereoOffWithCDCommand);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.undoButtonWasPressed();
	}
	
	public static void main(String [] args){
		new MainApp().go();
	}
}
