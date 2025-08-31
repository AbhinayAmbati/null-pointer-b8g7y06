import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> returnList = new ArrayList<>();

        for(int i=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(order[i] == friends[j]){
                    returnList.add(order[i]);
                }
            }
        }
        int[] res = new int[returnList.size()];

        for(int i=0;i<returnList.size();i++){
            res[i] = returnList.get(i);
        }

        return res;
    }
}