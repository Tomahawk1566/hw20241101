import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

Руководство компании решило премировать сотрудников.
Каждый team lead подал список сотрудников для получения премии.
Но получилось так,
 что некоторые сотрудники работают на нескольких проектах и попали в списки несколько раз.
Итак, у вас есть несколько списков сотрудников.
Ваша задача помочь получить один общий список сотрудников, но без повторов.
 */
public class Main {
    public static void main(String[] args) {
        List<String> teamLeadList1 =new ArrayList<>( List.of("Jack", "George", "Luka", "Oleg", "Poul"));
        List<String> teamLeadList2 =new ArrayList<>( List.of("Ann","Nick","Jake","Ira","Kate","Jack"));
        List<String> teamLeadList3 =new ArrayList<>( List.of("Lena","John","Sam","Leonard","George","Ann"));
        Set<String>premiumSet  =new HashSet<>();
       /* premiumSet.addAll(teamLeadList1);
          premiumSet.addAll(teamLeadList2); спорсоб №1
          premiumSet.addAll(teamLeadList3);
       */
        for (String s : teamLeadList1){
            premiumSet.add(s);
        }
        for (String s: teamLeadList2){   // способ №2
            premiumSet.add(s);
        }
        for (String s: teamLeadList3){
            premiumSet.add(s);
        }
        System.out.println(premiumSet);
    }
}