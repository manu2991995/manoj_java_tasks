package Adavance_java_individual_tasks_givenby_praveen;

abstract class AbstPen {
    // abstract class will have both abstract and concrete method

    public abstract void ink ();  // Abstract method only method declaration and its hiding the implementation

    public void basicDetails(){                               // concrete method
        System.out.println("The basic details of a pen");
    }

    public static void main(String[] args) {
        AbstPen blackPen = new BlackPen();  // we cannot create object for abstract class, so create a object for subclass
        blackPen.basicDetails();
        blackPen.ink();

        AbstPen bluePen = new BluePen();
        bluePen.basicDetails();
        bluePen.ink();
    }
}
//subclass 1
class BlackPen extends AbstPen{       //once we extends abstract class, here in extended class force to implementation
    @Override
    public void ink() {
        System.out.println("Black pen contains black ink");
    }
}

//subclass 2
class BluePen extends AbstPen{      //once we extends abstract class, here in extended class force to implementation
    @Override
    public void ink() {
        System.out.println("Blue pen contains blue ink");
    }
}
