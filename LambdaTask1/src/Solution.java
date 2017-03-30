/**
 * Created by DmytroBartoshchuk on 15.03.2017.
 */
public class Solution {
    public static void main(String[] args) {

        Calculator myApp = new Calculator();

        System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, (a,b) -> a + b));
        System.out.println("20 10 = " + myApp.operateBinary(20, 10, (a, b) -> a - b));
    }
}
