import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pavle
 */
//დავალება 2. მოცემულია სტრიქონული ტიპის 2 სია, შევქმნათ მესამე სია, სადაც არის მხოლოდ ის ელემენტები, რომლებიც პირველ ან მეორე სიაში გვხვდება. მიღებულ სიაში ელემენტები არ უნდა მეორდებოდეს.
public class Lesson2 {

    public static void main(String[] args) {

        int size = 0;
        List<String> S1 = new ArrayList<>();
        List<String> S2 = new ArrayList<>();
        List<String> S3 = new ArrayList<>();

        S1.add("qe");
        S1.add("asd");
        S1.add("atfsd");

        S2.add("atfsd");
        S2.add("55y");
        S2.add("kanbsdf");
        S2.add("asd");
        if(S1.size() > S2.size())
            S3 = GetUnitList(S1,S2);
        else
            S3 = GetUnitList(S2,S1);

        System.out.println(Arrays.toString(S3.toArray()));
    }
    private static  List<String> GetUnitList(List<String > S1, List<String> S2) {
        List<String> S3 = new ArrayList<>();
        for (int i = 0; i < S1.size(); i++) {
            if(!S3.contains(S1.get(i)))
                S3.add(S1.get(i));
            if(S2.size() > i && !S3.contains(S2.get(i)))
                S3.add(S2.get(i));
        }
        return S3;
    }
    

}
