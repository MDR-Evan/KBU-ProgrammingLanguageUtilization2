public class Television2_Remote {
    private Television2_Object tv;
    private int battery;

    public Television2_Remote(Television2_Object tv) {
        this.tv = tv;
    }

    public Television2_Remote(int battery) {
        this.battery = battery;
    }

    public Television2_Object getTv() {
        return tv;
    }

    public void setTv(Television2_Object tv) {
        this.tv = tv;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void powerBT(){
        if (battery >= 1) {
            if (tv.isPower()){
                tv.setPower(false);
            } else {
                tv.setPower(true);
            }
        } else {
            System.out.println("리모콘 배터리 교체해주세요.");
        }
    }

    public void volumeUp(){
        if (battery >= 1) {
            if (tv.isPower()) {
                tv.setVolume(tv.getVolume() + 1);
                if (tv.getVolume() >= 10) {
                    tv.setVolume(10);
                }
            }
        }
    }

    public void volumeDown(){
        if (battery >= 1) {
            if (tv.isPower()){
                tv.setVolume(tv.getVolume() - 1);
                if (tv.getVolume() <= 0) {
                    tv.setVolume(0);
                }
            }
        } else {
            System.out.println("리모콘 배터리 교체해주세요.");
        }
    }

    public void channelUp(){
        if (battery >= 1) {
            if (tv.isPower()) {
                tv.setChannel(tv.getChannel() + 1);
                if (tv.getChannel() >= 350) {
                    tv.setChannel(1);
                }
            }
        } else {
            System.out.println("리모콘 배터리 교체해주세요.");
        }
    }

    public void channelDown(){
        if (battery >= 1){
            if (tv.isPower()){
                tv.setChannel(tv.getChannel() - 1);
                if (tv.getChannel() <= 1) {
                    tv.setChannel(350);
                }
            }
        } else {
            System.out.println("리모콘 배터리 교체해주세요.");
        }
    }
}
