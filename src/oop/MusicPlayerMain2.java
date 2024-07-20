package oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("Music player on");

        data.volume++;
        System.out.println("Volume: " + data.volume);
        data.volume++;
        System.out.println("Volume: " + data.volume);
        data.volume--;
        System.out.println("Volume: " + data.volume);

        System.out.println("Status");
        System.out.println("isOn = " + data.isOn);
        System.out.println("volume = " + data.volume);

        data.isOn = false;
        System.out.println("Music player off");
    }
}
