import java.util.ArrayList;
public class shuffleArrayList{
    public static <E> void shuffleList(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int shuffle = (int) (Math.random() * list.size());
            E aList = list.get(shuffle);
            list.set(shuffle, list.get(i));
            list.set(i, aList);
        }
    }
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(i);
            }
            System.out.println(list);
            shuffleList(list);
            System.out.println(list);
        }
    }

