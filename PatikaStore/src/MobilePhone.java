import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone extends Product implements Operation {

    private int camera;
    private static ArrayList<MobilePhone> phonesList = new ArrayList<>();
    Boolean isRunningPhoneMenu = true;
    Scanner sc = new Scanner(System.in);

    public MobilePhone(Integer id, String name, String mark, Integer storage, Integer displaySize, Integer battery, String color, Integer ram, Float price, Float discount, Integer stockQuantity) {
        super(id, name, mark, storage, displaySize, battery, color, ram, price, discount, stockQuantity);
    }

    public MobilePhone() {

    }

    @Override
    public void runMenu() {
        while (isRunningPhoneMenu) {
            MobilePhone m = new MobilePhone();
            System.out.println("--CEP TELEFONU YÖNETİM PANELİ--");
            System.out.println("  \n" +
                    "1- Telefon ekle \n" +
                    "2- Telefon silme \n" +
                    "3- id ye göre filtrele \n" +
                    "4- markaya göre filtreleme \n" +
                    "5- Telefon listeleme \n" +
                    "6- Çıkış yap ");
            int iSelectionNotebook = sc.nextInt();
            switch (iSelectionNotebook) {
                case 1:
                    m.addProduct();
                    break;
                case 2:
                    m.delProduct();
                    break;
                case 3:
                    m.filterByProductId();
                    break;
                case 4:
                    m.filterByMark();
                    break;
                case 5:
                    m.showProductList();
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
        for (MobilePhone mobilePhone : phonesList) {
            System.out.println();
            System.out.printf(template, mobilePhone.getId(), mobilePhone.getName(), mobilePhone.getMark(), mobilePhone.getStorage(), mobilePhone.getDisplaySize(), mobilePhone.getBattery(), mobilePhone.getColor(), mobilePhone.getRam()
                    , mobilePhone.getPrice(), mobilePhone.getDiscount(), mobilePhone.getStockQuantity());

        }
        System.out.println();
    }

    public void showProductList(int id) {       // method overloading-1
        String template = "%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s";
        System.out.printf(template, "ID", "NAME", "MARK", "STORAGE", "DISPLAYSIZE", "BATTERY", "COLOR", "RAM", "PRICE", "DISCOUNT", "STOCKQUANTITY");
        for (MobilePhone findId : phonesList) {
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
        for (MobilePhone findMark : phonesList) {
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
        System.out.println("1- Redmi Note 12 Pro , Xiamio,  256 , 7 , 5000,white , 8 , 13000, 20, 5 \n" +
                "2- 12 Mini , Apple , 128 , 6 , 2815 , black , 4 ,28000 , 10, 90 \n" +
                "3- Galaxy A50 , Samsung, 128, 7, 4500, Gray , 12, 15500, 7, 100");
        int iAddNotebookSelection = sc.nextInt();
        switch (iAddNotebookSelection) {
            case 1:
                phonesList.add(new MobilePhone(1, "Redmi Note", "Xiamio", 256, 7, 5000, "white", 8, 13000F, 20F, 5));
                break;
            case 2:
                phonesList.add(new MobilePhone(2, "12 Mini", "Apple", 128, 6, 2815, "black", 4, 28000F, 10F, 90));
                break;
            case 3:
                phonesList.add(new MobilePhone(3, "Galaxy A50", "Samsung", 128, 7, 45000, "gray", 12, 15500F, 7F, 100));
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
        int iDelPhone = sc.nextInt();

        if (isPhoneId(iDelPhone) != null) {
            phonesList.remove(iDelPhone);
            System.out.println("Cep telefonu silme işlemi yapıldı ..");
        }
    }

    private MobilePhone isPhoneId(int id) {
        for (MobilePhone m : phonesList) {
            if (m.getId() == id)
                return m;
        }
        return null;
    }

    @Override
    public void filterByProductId() {
        System.out.println();
        showProductList();
        System.out.println();
        System.out.println("Filtrelemek istinen id yi girin ..");
        int iFilterIdPhone = sc.nextInt();

        if (isPhoneId(iFilterIdPhone) != null) {
            showProductList(iFilterIdPhone);
        }
    }

    @Override
    public void filterByMark() {
        System.out.println();
        showProductList();
        System.out.println();
        System.out.println("Filtrelemek istinen markayayı girin ..");
        String sFilterIdPhone = sc.nextLine();

        showProductList(sFilterIdPhone);

    }
}
