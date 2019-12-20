public abstract class Man {

    private int id;
    private String name;
    private double weight;
    protected FlayBehaviour myFlay;
    private double speed;
    private static int counter = 0;



    public Man(){
        this.id = this.counter++;
        this.name = "man#"+id;
        this.myFlay = new NoFlay();
    }

    public String run(){
        return this.name + " is run now";
    }

    public void information(){
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name );
        System.out.println("Flay type : " + this.myFlay.flay());


    }





}
