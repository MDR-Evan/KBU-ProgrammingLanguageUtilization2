public class Television2_Main {
    public static void main(String[] args) {
        Television2_Object object = new Television2_Object(7, 6);
        Television2_Remote remote = new Television2_Remote(object);

        object.powerBT();
        System.out.println(object);

        object.setChannel(9);
        object.setVolume(object.getVolume() + 1);
        System.out.println(object);

        object.powerBT();
        System.out.println(object);
        
        /***************************/
        System.out.println("\n\n\n리모콘 동작");
        
        remote.powerBT();
        System.out.println(object);
        System.out.println("볼륨 조절");
        remote.volumeDown();
        System.out.println(object);
        remote.volumeUp();
        System.out.println(object);
        System.out.println("채널 조절");
        remote.channelDown();
        System.out.println(object);
        remote.channelUp();
        System.out.println(object);
        remote.powerBT();
        System.out.println(object);

        System.out.println("**********************");
        remote.setBattery(10);
        object.setChannel(350);
        remote.channelUp();
        remote.channelUp();
        remote.channelUp();
        System.out.println(object);
        System.out.println("**********************");
        remote.setBattery(0);
        remote.powerBT();
        System.out.println(object);
    }
}
