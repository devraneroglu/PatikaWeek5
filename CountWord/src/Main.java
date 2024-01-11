import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String metin = "Java dili, ilk piyasaya sunulduğunda küçük cihazlarda kullanılması için " +
                "düzenlenmiştir. Sonrasında C ve C++ dillerine oranla daha yüksek verime ve güvenliğe sahip " +
                "olmasından kaynaklı olarak çoğu kullanıcı tarafından tercih edilmeye başlanmıştır. Oyun siteleri, " +
                "sohbet programları, canlı TV sitelerine girmek için Java yüklemesi istemektedir. Güvenilirlikten ötürü " +
                "çoğu uygulama Java dilini kullanmaktadır. Ayrıca büyük şirketlerin bilgi işleme sistemlerinin temelinde" +
                " bulunan uygulamalar ve e-iş çözümlemeleri Java dili ile ayrılmaz bir parçadır. Kullanmak istediğiniz çoğu " +
                "uygulamada Java geçerlidir. Bu yüzden bilgisayarlarınızda Java indirmeniz önerilmektedir.";
        String[] wordsArr = metin.split(" ");

        Map<String, Integer> wordMap = new HashMap<>();

        for (String s : wordsArr) {
            if (wordMap.containsKey(s))
                wordMap.put(s, wordMap.get(s) + 1);
            else
                wordMap.put(s, 1);
        }

        int defIntVal = 0;
        String defStrVal = "";
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {

            Integer maxComWordVal = entry.getValue();
            String maxComWord = entry.getKey();

            if (maxComWordVal > defIntVal) {
                defIntVal = maxComWordVal;
                defStrVal = maxComWord;
            }
        }
        System.out.println("The most common word in the paragraph --> " + defStrVal);
    }
}
