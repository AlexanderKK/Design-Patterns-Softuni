package _04CommandPattern;

public class DodgeAttack implements PlayerCommand {

    private Player player;

    public DodgeAttack(Player player) {
        this.player = player;
    }

    @Override
    public String execute() {
        //Notify RECEIVER depending on the implementation
        player.setX(player.getX() - 3);
        player.setY(player.getY() + 3);

        return player.getPosition();
    }

}
