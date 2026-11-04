package JavaDay3.JavaDay5.Task2;

public class test {

    boolean isReverseOf(int[] xs, int[] ys) {
        if( xs == null && ys == null){ // add the comment
            return true;
        }
        if (xs == null || ys == null){
            return false;
        }
        int o = 0;
        boolean reversed = true;
        if ( xs.length != ys.length){
            reversed = false;}
        else {
            for (int e = xs.length - 1; e >= 0; e--) {
                if (xs[e] == ys[o]) {
                    o++;
                }
                else{
                    return false;
                }
            }}
        return reversed;
    }

    int[] reverse(int[] xs){
        if(xs==null){
            return  null;
        }

        int[] newReverse = new int[xs.length];
        int i = xs.length-1;
        for(int e : xs) {
            newReverse[i] = e;
            i--;}
        return newReverse;
    }


    void reverseInPlace(int[] xs){
        if(xs==null){
            return;
        }
        int e=xs.length-1;
        int temp;
        for(int i=0;i<xs.length/2;i++){
            temp = xs[e];
            xs[e] = xs[i];
            xs[i] = temp;
            e--;
        }
    }
    int[] copy(int[] xs){
        int[] ys = new int[xs.length];
        int count = 0;
        for(int e : xs){
            ys[count] = e;
            count++;
        }
        return ys;
    }

    boolean checkReversal(int[] xs) {
        int[] ys = copy(xs);
        reverseInPlace(xs);
        return isReverseOf(xs, ys);
    }
    void main() {
        int[] input = { 1, 2, 3, 4 };
        IO.println("Operation correct for "
                + java.util.Arrays.toString(input) + ": "
                + checkReversal(input));

        int[] array2 = { 5, 6, 7, 8, 9, 10, 11 };
        reverseInPlace(array2);
        IO.println(java.util.Arrays.toString(array2));
        IO.println("Print something");
        IO.println("Print something else");
    }
}
