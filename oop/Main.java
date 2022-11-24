package oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Base> list = new ArrayList<>();
        list.add(new Monk());
        list.add(new Peasant());
        list.add(new Robber());
        list.add(new Sniper());
        list.add(new Spearman());
        list.add(new Wizard());
        list.add(new Xbowman());

        Monk monk00 = new Monk();

        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
        System.out.println(monk00.getPlayerID());

        Bang50 banda = new Bang50(50);// создать разношёрстную банду из number членов
        
        banda.getBang().forEach(System.out::println);

        listHero(banda.getBang(), "Monk");// вывод в консоль только элементы конкретного className класса
    }
    
    static void listHero(ArrayList<Base> banda, String className){
        int n = banda.size();
        for (int i = 0; i < n; i++ ){
            
            if (banda.get(i).getClass().getSimpleName().equals(className))
                System.out.println(banda.get(i));
        }
    }
}