abstract class Mobile {
    //Both concrete method and abstract method

    public abstract void camera(); // Abstract method

    public void basicDetails(){
        System.out.println("This is basic details of mobile");
    }

    public static void main(String[] args) {
        Mobile iphone = new iPhone();
        iphone.camera();
        iphone.basicDetails();


    }
}

class iPhone extends Mobile{

    @Override
    public void camera() {
        System.out.println("This is a iphone camera which will be 12 MP rear camera");
    }
}




