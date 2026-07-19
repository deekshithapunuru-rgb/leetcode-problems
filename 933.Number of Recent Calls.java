import java.util.*;

class RecentCounter {
  ArrayList<Integer> list = new ArrayList<>();
  public RecentCounter(){
  }
  public int ping(int t) { 
    list.add(t);
   while (list.get(0) <t-3000){
     list.remove(0);
   }
   return list.size();
  }
}
