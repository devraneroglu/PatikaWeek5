import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product implements Operation {

    private static ArrayList<Notebook> notebooksList = new ArrayList<>();
    private static int id = 1;
    Boolean isRunnigNotebookMenu = true;

    Scanner sc = new Scanner(System.in);

    public Notebook(Integer id, String name, String mark, Integer storage, Integer displaySize, Integer battery, String color, Integer ram, Float price, Float discount, Integer stockQuantity) {
        super(id, name, mark, storage, displaySize, battery, color, ram, price, discount, stockQuantity);
    }


    public Notebook() {
    }

    @Override
    public void runMenu() {

        while (isRunnigNotebookMenu) {
            Notebook n = new Notebook();
            System.out.println("--NOTEBOOK YÖNETİM PANELİ--");
            System.out.println("  \n" +
                    "1- Notebook ekle \n" +
                    "2- Notebook silme \n" +
                    "3- id ye göre filtrele \n" +
                    "4- markaya göre filtreleme \n" +
                    "5- Notebook listeleme \n" +
                    "6- Çıkış yap ");
            int iSelectionNotebook = sc.nextInt();
            switch (iSelectionNotebook) {
                case 1:
                    n.addProduct();
                    break;
                case 2:
                    n.delProduct();
                    break;
                case 3:
                    n.filterByProductId();
                    break;
                case 4:
                    n.filterByMark();
                    break;
                case 5:
                    n.showProductList();
                    break;
                case 6:
                    System.out.println("Ana menüye dönülüyor ..");
                    return;
                default:
                    System.out.println("Hatalı notebook seçim işlemi ... ");
            }
        }

    }

    @Override
    public void showProductList() {
        String template = "%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s";
        System.out.printf(template, "ID", "NAME", "MARK", "STORAGE", "DISPLAYSIZE", "BATTERY", "COLOR", "RAM", "PRICE", "DISCOUNT", "STOCKQUANTITY");
        for (Notebook notebook : notebooksList) {
            System.out.println();
            System.out.printf(template, notebook.getId(), notebook.getName(), notebook.getMark(), notebook.getStorage(), notebook.getDisplaySize(), notebook.getBattery(), notebook.getColor(), notebook.getRam()
                    , notebook.getPrice(), notebook.getDiscount(), notebook.getStockQuantity());

        }
        System.out.println();

    }

    public void showProductList(int id) {       // method overloading-1
        String template = "%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s";
        System.out.printf(template, "ID", "NAME", "MARK", "STORAGE", "DISPLAYSIZE", "BATTERY", "COLOR", "RAM", "PRICE", "DISCOUNT", "STOCKQUANTITY");
        for (Notebook findId : notebooksList) {
            System.out.println();
            if (findId.getId() == id) {
                System.out.printf(template, findId.getId(), findId.getName(), findId.getMark(), findId.getStorage(), findId.getDisplaySize(), findId.getBattery(), findId.getColor(), findId.getRam()
                        , findId.getPrice(), findId.getDiscount(), findId.getStockQuantity());
            }
        }
        System.out.println();
    }

    public void showProductList(String mark) {     // method overloading-2
        String template = "%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s";
        System.out.printf(template, "ID", "NAME", "MARK", "STORAGE", "DISPLAYSIZE", "BATTERY", "COLOR", "RAM", "PRICE", "DISCOUNT", "STOCKQUANTITY");
        for (Notebook findMark : notebooksList) {
            System.out.println();
            if (findMark.getMark().equals(mark)) {
                System.out.printf(template, findMark.getId(), findMark.getName(), findMark.getMark(), findMark.getStorage(), findMark.getDisplaySize(), findMark.getBattery(), findMark.getColor(), findMark.getRam()
                        , findMark.getPrice(), findMark.getDiscount(), findMark.getStockQuantity());
            }
        }
        System.out.println();
    }

    @Override
    public void addProduct() {

        System.out.println("Senin için hazırladığım seçeneklerden birini ekleyebilirsin :)  Seçim yap .. ");
        System.out.println("1- AbraA5 , Monster,  512 , 15.6 , 3000,black , 16 , 32000, 20, 5 \n" +
                "2- MacBookPro , Apple , 512 , 15.6 , 2500 , White , 16 , , 15, 90 \n" +
                "3- ZenBook , Asus, 256, 15.6, 2000, Gray , 32, 45000, 10, 100");
        int iAddNotebookSelection = sc.nextInt();
        switch (iAddNotebookSelection) {
            case 1:
                notebooksList.add(new Notebook(1, "AbraA5", "Monster", 512, 15, 3000, "black", 16, 32000F, 20F, 5));
                break;
            case 2:
                notebooksList.add(new Notebook(2, "MacBookPro", "Apple", 512, 19, 2500, "white", 16, 70000F, 15F, 90));
                break;
            case 3:
                notebooksList.add(new Notebook(3, "Zenbook", "Asus", 256, 15, 2000, "gray", 32, 45000F, 10F, 100));
                break;
            default:
                System.out.println("Hatalı notebook ekleme işlemi ...");
        }
        System.out.println("Notebook ekleme işlemi tamamlandı .");
        System.out.println("----------------------------------");

    }

    @Override
    public void delProduct() {

        System.out.println();
        showProductList();
        System.out.println();
        System.out.println("id giriş yaparak silme işlemi yapabilirim ");
        int iDelNotebook = sc.nextInt();

        if (isNotebookId(iDelNotebook) != null) {
            notebooksList.remove(iDelNotebook);
            System.out.println("Notebook silme işlemi yapıldı ..");
        }
    }

    private Notebook isNotebookId(int id) {
        for (Notebook n : notebooksList) {
            if (n.getId() == id)
                return n;
        }
        return null;
    }

    @Override
    public void filterByProductId() {

        System.out.println();
        showProductList();
        System.out.println();
        System.out.println("Filtrelemek istinen id yi girin ..");
        int iFilterIdNotebook = sc.nextInt();

        if (isNotebookId(iFilterIdNotebook) != null) {
            showProductList(iFilterIdNotebook);
        }
    }

    @Override
    public void filterByMark() {
        System.out.println();
        showProductList();
        System.out.println();
        System.out.println("Filtrelemek istinen markayayı girin ..");
        String sFilterIdNotebook = sc.nextLine();

        showProductList(sFilterIdNotebook);

    }
}
