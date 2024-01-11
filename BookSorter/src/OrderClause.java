import java.util.Comparator;

public class OrderClause implements Comparator<Book> {

    private Integer ordTyp;

    public OrderClause(Integer ordTyp) {
        this.ordTyp = ordTyp;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if (ordTyp == 1) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getPageNum() - o2.getPageNum();
        }
    }
}

