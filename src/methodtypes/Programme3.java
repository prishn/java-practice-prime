package methodtypes;

public class Programme3 {

    public int square(int num){
        int result = num * num;
        return result;
    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        int squareOfNumber = obj.square(10);
        System.out.println(squareOfNumber);
        System.out.println(obj.square(20));

    }

}
