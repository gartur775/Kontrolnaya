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
    static int[] fillList(){
        int[] array = new int[8];
        for(int i = 0, j = 0; i < array.length; i++, j+=3)
            array[i] = j;
        return array;
    }

    //3 задание
    static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        return array;
    }

    public static void main(String []args){
        proverka(5,6);
        fillList();
    }
}