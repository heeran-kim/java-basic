package access;

import access.a.*;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        // access it directly
        // speaker.volume = 200;
        // if a member variable is private,
        // accessing it directly from outside the class causes a compile error.
        speaker.showVolume();

        // DefaultClass clas = new DefaultClass();
        // default class cannot be accessed even if it is imported.
        // public class can be accessed if it is imported.
    }
}
