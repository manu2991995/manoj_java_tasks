package Adavance_java_individual_tasks_givenby_praveen;

public class Addition {
    public int MAX = 10;
    private int MIN = 10;

    public void add(int a,int b){
        int sum = a + b;
        System.out.println("The Sum is :::"+sum);
    }

    private void newAddition(int a,int b){
        int sum = a + b;
        System.out.println("The Sum is :::"+sum+ " MIN::"+MIN);
    }

    protected void updatedAdditionMethod(int a,int b){
        int sum = a + b;
        System.out.println("The Sum is ::: "+sum+ " MIN::"+MIN);
    }

    public static void main(String[] args) {
        //Demo of Adavance_java_individual_tasks_givenby_praveen.Addition class
        Addition addition = new Addition();
        addition.add(10,20);
        //Since its private we can access the method in the same class
        addition.newAddition(10,20);
        addition.updatedAdditionMethod(10,20);
    }
}

