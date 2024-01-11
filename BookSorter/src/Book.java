import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class Book {
    private String name;
    private int pageNum;
    private String author;
    private Date publishDt;

    public Book(String name, int pageNum, String author, String publishDt) {
        this.name = name;
        this.pageNum = pageNum;
        this.author = author;
        this.publishDt = castDate(publishDt);
    }

    public static Date castDate(String userDt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        try {
            return dateFormat.parse(userDt);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublishDt() {
        return publishDt;
    }

}
