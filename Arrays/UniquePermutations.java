package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class UniquePermutations {
    static void helper(int idx, int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> lst, ArrayList<Integer> arr, boolean[] vis){
        if(idx==n){
            ans.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0; i<arr.size(); i++){
            if(vis[i]==false){
                if(i>0){
                    if(arr.get(i-1)!=arr.get(i) || vis[i-1]==true){
                        lst.add(arr.get(i));
                        vis[i]=true;
                        helper(idx+1,n,ans,lst,arr,vis);
                        vis[i]=false;
                        lst.remove(lst.size()-1);
                    }
                }else{
                    lst.add(arr.get(i));
                    vis[i]=true;
                    helper(idx+1,n,ans,lst,arr,vis);
                    vis[i]=false;
                    lst.remove(lst.size()-1);
                }
            }
        }
    }
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> lst = new ArrayList<>();
        boolean[] vis = new boolean[n];
        helper(0,n,ans,lst,arr,vis);
        return ans;
    }
}
