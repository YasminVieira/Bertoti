package Singleton;

public class GFG {

    private static GFG instance;

    private GFG() {}

    public static GFG getInstance()
    {
        if (instance == null) {
            instance = new GFG();
        }

        return instance;
    }

    public void getGFG(){
        System.out.println("Now you have instantiated a GFG.");
    }

}