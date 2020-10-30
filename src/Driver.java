public class Driver {
    public static void main(String[] args){
        StringComparison stringComparison = new StringComparison();
        //stringComparison.concatString('A', 10);

        long start = System.nanoTime();
        System.out.println("ConcatString = " + stringComparison.concatString('A', 10));
        System.out.println("ConcatString = " + (System.nanoTime() - start) + " ns");

//        start = System.nanoTime();
//        System.out.println("ConcatStringBuilder = " + stringComparison.concatStringBuilder('A', 10));
//        System.out.println("ConcatStringBuilder = " + (System.nanoTime() - start) + " ns");
    }
}
