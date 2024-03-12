public class RPSgame_Manager {
    private RPSgame_Computer com;
    private RPSgame_man man;

    public RPSgame_Manager(RPSgame_Computer com, RPSgame_man man) {
        this.com = com;
        this.man = man;
    }
    public RPSgame_Computer getCom() {
        return com;
    }
    public void setCom(RPSgame_Computer com) {
        this.com = com;
    }
    public RPSgame_man getMan() {
        return man;
    }
    public void setMan(RPSgame_man man) {
        this.man = man;
    }

    private String result() {
        String result;
        int bump = man.getNum() - com.getNum();

        if (bump == 0) {
            result = "무승부";
        } else if (bump == -1 || bump == -2){
            result = "COM 승리";
        } else {
            result = "User 승리";
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n%s\n", com.toString(), man.toString(), result());
    }
}
