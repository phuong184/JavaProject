import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by PHUONG NGUYEN on 5/27/2017.
 */
public class BicycleDemo {
    public static void main(String[] args)
    {
//        //create 2 different bicycle objects
//        Bicycle bike1 = new Bicycle();
//        Bicycle bike2 = new Bicycle();
//
//        //invoke methods on those objects
//        bike1.changeCadence(50);
//        bike1.speedUp(10);
//        bike1.changeGear(2);
//        bike1.printStates();
//
//        bike2.changeCadence(50);
//        bike2.speedUp(10);
//        bike2.changeGear(2);
//        bike2.changeCadence(40);
//        bike2.speedUp(10);
//        bike2.changeGear(3);
//        bike2.printStates();

        //Array
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
//        char[] copyTo = new char[7];
//
//        System.arraycopy(copyFrom,2,copyTo,0,7);
//        System.out.println(new String(copyTo));
//
//        String[][] names = {
//                {"Mr. ","Mrs. ", "Ms. "},
//                {"Smith", "John"}
//        };
//
//        //Mr. Smith
//        System.out.println(names[0][0] + names[0][1]);
//        //Mr. John
//        System.out.println(names[0][0] + names[0][2]);

        char[] copyTo  = java.util.Arrays.copyOfRange(copyFrom,2,9);
        System.out.println(copyTo);
    }
}
