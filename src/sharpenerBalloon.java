import java.util.HashMap;

public class sharpenerBalloon {
    public static int sharpner_Balloon(int[] arr){
    int []findArr={1,2,3,4,5,6,7};
    int count=0;
    HashMap<Integer,Integer> map=new HashMap<>();

    for(int num:arr){
        if(contains(findArr,num) && !map.containsKey(num)){
            map.put(num, 1);
        }
        count++;
        if(map.size()==7){
            break;
        }
    }
    return count;
}
    public static boolean contains(int []num,int target){
        for(int i:num){
            if(i==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr= {11,2,4,6,8,10,3,5,7,9};
        System.out.println(sharpner_Balloon(arr));
    }
}
