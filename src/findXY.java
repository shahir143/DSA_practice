public class findXY {
    static long findXandY(long x, long y) {
        long resultx = (long) Math.floor((double) x / 4);
        long resulty = (long) Math.floor((double) y / 4);
        if(resultx>resulty){
            return resultx;
        }else{
            return resulty;
        }
        
    }
   public static void main(String[] args) {
    long x=100000;
    long y=162353;
    System.out.println(findXandY(x, y));
    x=42587;
    y=8923897;
    System.out.println(findXandY(x, y));
   } 
}
