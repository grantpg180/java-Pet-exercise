
public class Pet {
    public static void main(String[] args){
        Pet pet1 = new Pet();
        pet1.setName("Bojak");
        pet1.setAge(12);
        pet1.setLocation("Charlotte, NC");
        pet1.setType("Dog");
        System.out.print(pet1.getName());

        Pet pet2 = new Pet();
        pet2.setName("Geeks");
        pet2.setAge(2);
        pet2.setLocation("Charlotte, NC");
        pet2.setType("Fish");
        System.out.println(pet2.getName());
    }



    private String name, location, type;
    private int age;

    Pet(){
        this.name="Spot";
        this.age=10;
        this.location="Charlotte, NC";
        this.type="Dog";
    }
    Pet(String name, String location, String type, int age){
        this.name=name;
        this.age=age;
        this.location=location;
        this.type=type;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getLocation(){
        return location;
    }
    public String getType(){
        return type;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public void setType(String type){
        this.type=type;
    }
}
