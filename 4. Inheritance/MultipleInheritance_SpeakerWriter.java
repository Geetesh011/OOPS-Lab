
// Multiple Inheritance (via Interfaces) - Speaker and Writer
interface Speaker {
    void speak();
}

interface Writer {
    void write();
}

class SpeakerWriter implements Speaker, Writer {
    String name;
    String topic;
    String genre;

    public SpeakerWriter(String name, String topic, String genre) {
        this.name = name;
        this.topic = topic;
        this.genre = genre;
    }

    @Override
    public void speak() {
        System.out.println(name + " is speaking about " + topic);
    }

    @Override
    public void write() {
        System.out.println(name + " is writing in the " + genre + " genre");
    }

    public void displayInfo() {
        speak();
        write();
    }
}

public class MultipleInheritance_SpeakerWriter {
    public static void main(String[] args) {
        SpeakerWriter speakerWriter = new SpeakerWriter("David", "Technology", "Science Fiction");
        speakerWriter.displayInfo();
    }
}