package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("Music player on");

        volume++;
        System.out.println("Volume: " + volume);
        volume++;
        System.out.println("Volume: " + volume);
        volume--;
        System.out.println("Volume: " + volume);

        System.out.println("Status");
        System.out.println("isOn = " + isOn);
        System.out.println("volume = " + volume);

        isOn = false;
        System.out.println("Music player off");
    }
}
