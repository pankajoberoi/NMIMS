package Day4;

import java.util.Comparator;

public class RatingComparator implements Comparator<Customers> {

    @Override
    public int compare(Customers o1, Customers o2) {
        return o1.rating - o2.rating;
    }
}
