package Anagrams;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagrams {

    private static ArrayList<ArrayList<String>> solve(ArrayList<String> list){
        ArrayList<ArrayList<String>> result;
        HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap<>();

        for(String str: list){
            HashMap<Character,Integer> tempMap = new HashMap<>();
            for(int i = 0;i<str.length();i++){
                if(tempMap.containsKey(str.charAt(i))){
                    int a = tempMap.get(str.charAt(i));
                    tempMap.put(str.charAt(i), ++a);
                }else{
                    tempMap.put(str.charAt(i),1);
                }
            }
            if(map.containsKey(tempMap)){
                map.get(tempMap).add(str);
            }
            else{

                ArrayList<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(tempMap,newList);
            }
        }
        result = new ArrayList<>();
        for(HashMap<Character,Integer> temp : map.keySet()){
            result.add(map.get(temp));
        }
        return result;
    }

    // Drivers Method
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("ogd");
        list.add("god");
        list.add("atc");

        System.out.println(solve(list));
    }
}
