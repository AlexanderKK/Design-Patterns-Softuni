package _05Command;

public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Command volumeUp = new VolumeUp(remoteControl);
        volumeUp.execute();
        volumeUp.execute();

        Command volumeDown = new VolumeDown(remoteControl);
        volumeDown.execute();

        System.out.println();
    }

}
