package Collections.LinkedListIterator;
import java.util.*;
public class LinkedListIteratorMain {

    public static LinkedList<String> deleteNode(LinkedList<String> nevekLista, String kezdokarakter){
     ListIterator<String> listIterator = nevekLista.listIterator();
     while (listIterator.hasNext()){
         String node = listIterator.next();
         if(node.startsWith(kezdokarakter)){
             listIterator.remove();
         }
     }
     return  nevekLista;
    }

    public static LinkedList<String> nevekVissza(LinkedList<String> nevekLista){
        LinkedList<String> modositottLista = deleteNode(nevekLista,"F");
        ListIterator<String> listIterator = modositottLista.listIterator();
        LinkedList<String> rendezettLista = new LinkedList<>();

        while (listIterator.hasPrevious()){
            String node = listIterator.previous();
            rendezettLista.add(node);
        }

        return rendezettLista;
    }
    public static void main(String[] args) {
        LinkedList<String> nevekLista = new LinkedList<>();

        nevekLista.add("Ádám");
        nevekLista.add("Edia");
        nevekLista.add("Ödön");
        nevekLista.add("Dániel");
        nevekLista.add("Csilla");
        nevekLista.add("Amira");
        nevekLista.add("Fióna");
        nevekLista.add("Flóra");
        nevekLista.add("Xerxész");


        System.out.println("Az alapértelmezett lista --> \n"+nevekLista);
        System.out.println("\nA megadott karaktert tartalmazó nevek törlése utáni lista --> \n"+ deleteNode(nevekLista,"F"));
        System.out.println("\nA módosított lista tartalma visszafele --> \n"+ nevekVissza(nevekLista));
        System.out.println("\nA lista utolsó eleme --> \n"+ nevekLista.get(nevekLista.size()-1));



    }
}
