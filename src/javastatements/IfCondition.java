package javastatements;

public class IfCondition {

    public static void main(String[] args) {
        isEligibleForVote();
    }

    public static void isEligibleForVote(){
        int age = 18;

        if(age==18){
            System.out.println("Eligible for vote");
        }

        System.out.println("Hello");

    }
}
