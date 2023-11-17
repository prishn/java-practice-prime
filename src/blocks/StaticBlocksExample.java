package blocks;

public class StaticBlocksExample {

    static String eName;
    static int eId;

    static {
        eName = "Rajesh";
        eId = 101;
        System.out.println("Class starts");
    }
    public static void main(String[] args) {
        System.out.println("Employee name is : "+eName);
        System.out.println("Employee id is : "+eId);
    }

    static {
        System.out.println("I am in second static block");
    }

}
