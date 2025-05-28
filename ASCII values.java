public class asciiValues{
    public static void main (String[]arg){
        System.out.println("character"+"|"+"ASCII");
        System.out.println("----------------");
        for(char ch='A';ch<='Z';ch++){
            int ASCII =ch;
            System.out.println(  ch +"     |      "+ASCII);
        }
    }
}
