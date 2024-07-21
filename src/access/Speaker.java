package access;

public class Speaker {
    // A class can be public or default only; it cannot be private or protected.
    // If a class is declared public, the class name must match the file name.
    // This means there can be only one public class per file.

    // field
    private int volume;
    // This value shouldn't be over 100.
    // with `private`, it cannot be accessed directly from outside the class.

    /* For class, field, method, constructor
     private: cannot be accessed from outside the class
     default: cannot be accessed from outside the package
     protected: same as default, plus can be accessed from subclasses even if they are outside the package.
     public: can be accessed from anywhere
    */

    // constructor
    Speaker(int volume) {
        this.volume = volume;
    }

    // method
    void volumeUp() {
        if (volume < 100) {
            volume += 10;
        }else {
            System.out.println("Can't do.");
        }
    }

    void volumeDown() {
        if (volume >= 10) {
            volume -= 10;
        }else {
            System.out.println("Can't do.");
        }
    }
    
    void showVolume() {
        System.out.println("volume = " + volume);
    }
}
