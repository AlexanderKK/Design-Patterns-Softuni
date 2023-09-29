package _05Command;

public class VolumeDown implements Command {

    private RemoteControl remoteControl;

    public VolumeDown(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        remoteControl.setVolume(remoteControl.getVolume() - 1);
    }

}
