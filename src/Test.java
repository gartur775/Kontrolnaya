import java.util.Arrays;

public class Test {

    //1 задание
    static boolean proverka(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    //2 задание
    static int[] fillMassive(){
        int[] scnArray = new int[8];
        for (int i = 0, j = 0; i < scnArray.length; i++, j += 3)
            scnArray[i] = j;
        return scnArray;
    }

    //3 задание
    static int[] anotherMassive(){
        int[] fullNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < fullNum.length; i++){
            if(fullNum[i] < 6){
                fullNum[i] *=2;
            }
        }
        return fullNum;
    }

    public static void main (String []args){
        System.out.println(proverka(5,6));
        System.out.println(Arrays.toString(fillMassive()));
        System.out.println(Arrays.toString(anotherMassive()));
    }
}
