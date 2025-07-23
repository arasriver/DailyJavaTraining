package DailyJavaTraining;

import java.util.ArrayList;

public class ReverseInteger {
    private int number;
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private ArrayList<Integer> show = new ArrayList<Integer>();

    public void setNumber(int number) {
        this.number = number;
        list.add(this.number);
    }

    public void reverseList(){
        for (int i = list.size() - 1; i >= 0 ; i--) {
            int a = list.get(i);
            show.add(a);
        }
        System.out.println(show);
    }
    public ArrayList<Integer> getList() {
        System.out.println(list);
        return list;
    }


//   ***** Example for Main class ****
//    ReverseInteger r = new ReverseInteger();
//        r.setNumber(4);
//        r.setNumber(6);
//        r.setNumber(2);
//        r.setNumber(51);
//        r.getList();
//        r.reverseList();


}
