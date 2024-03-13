public class Television2_Object {
    private int channel;    //1 ~ 350
    private int volume;     //0 ~ 10
    private boolean power;  //true : on, false : off

    public Television2_Object() {
    }
    public Television2_Object(int channel, int volume) {
        this.channel = channel;
        this.volume = volume;
        power = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    // active
    public void powerBT(){
        if (power) {
            power = false;
        } else {
            power = true;
        }
    }

    @Override
    public String toString() {
        return String.format("TV의 채널은 %d번, 볼륨은 %d, 전원상태는 %s상태 입니다.", channel, volume, power ? "On" : "Off");
    }
}