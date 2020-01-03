package marathon;

public class Participant {

    private String name;
    private int time;

    public Participant(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }


    @Override
    public String toString() {
        return String.format("Partricipant: name %s, time: %d", name, time);
    }


}