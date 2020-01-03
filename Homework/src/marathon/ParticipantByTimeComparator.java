package marathon;

import java.util.Comparator;

public class ParticipantByTimeComparator implements Comparator<Participant> {

    @Override
    public int compare(Participant p1, Participant p2) {
        return Integer.compare(p1.getTime(), p2.getTime());
    }
}
