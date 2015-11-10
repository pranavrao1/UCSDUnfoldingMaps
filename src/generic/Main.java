package generic;

/**
 * Created with IntelliJ IDEA.
 * User: Pranav
 * Date: 11/8/15
 * Time: 6:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        //Integer[] value = [0,41,3,5,90,34];
        //selectionSort(value);
        //for(int i:value){
        //    System.out.print(i+", ");
       //}
    }

    public static void selectionSort(int[] vals){
        int indexMin;

        for(int i=0;i<vals.length-1;i++){
            indexMin=i;

            for(int  j=i+1; j<vals.length; j++){
                if(vals[j]<vals[indexMin]){
                    indexMin=j;
                }
            }
        }
    }
}
