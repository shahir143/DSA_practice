import java.util.HashMap;

public class sandyPlank {
    public static int sandy_planks(String plank){
        int count=0;
        StringBuilder st=new StringBuilder();
        for(int i=0;i<plank.length()-1;i++){
            if(plank.charAt(i)!=plank.charAt(i+1)){
                st.append(plank.charAt(i));
            }
        }

        plank=st.toString();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:plank.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
            if (map.get(c)>count){
                count=map.get(c);
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        String plank= "WWBWB";
        System.out.println(sandy_planks(plank));
    }
}
