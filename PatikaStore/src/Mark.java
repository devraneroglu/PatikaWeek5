import java.util.TreeSet;

public class Mark implements Comparable<Mark> {

    private int id;
    private String name;
    private static int counter = 1;
    private static TreeSet<Mark> markList = new TreeSet<>();   // We should keep registered brands using collection - TreeSet

    public Mark(String name) {
        this.id = counter++;
        this.name = name;
    }

    public Mark() {
    }

    public void printMark(){
        for(Mark m : markList){
            System.out.println("- "+ m.getName());
        }
    }
    static {
        markList.add(new Mark("Samsung"));
        markList.add(new Mark("Lenovo"));
        markList.add(new Mark("Apple"));
        markList.add(new Mark("Huawei"));
        markList.add(new Mark("Casper"));
        markList.add(new Mark("Asus"));
        markList.add(new Mark("HP"));
        markList.add(new Mark("Xiaomi"));
        markList.add(new Mark("Monster"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Mark o) {           // Sort marks alphabetically
        return this.name.compareTo(o.getName());

    }
}
