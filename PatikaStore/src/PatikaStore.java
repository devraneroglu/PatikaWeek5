import java.util.Map;
import java.util.Scanner;

public class PatikaStore {
    Scanner sc = new Scanner(System.in);
    boolean isRunning = true;

    public void run() {
        while (isRunning) {
            System.out.println("Patika Store ");
            System.out.println("1- Notebook İşlemleri \n" +
                    "2- Cep Telefonu İşlemleri \n" +
                    "3- Markaları Listele \n" +
                    "4-Çıkış");
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.runMenu();
                    break;
                case 2:
                    MobilePhone mobilePhone = new MobilePhone();
                    mobilePhone.runMenu();
                    break;
                case 3:
                    Mark mark = new Mark();
                    mark.printMark();
                    break;
                case 4:
                    System.out.println("Çıkış yapıldı ..");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Hatalı seçim ... ");
            }
        }
    }
}
